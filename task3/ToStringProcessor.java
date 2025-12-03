package task3;

import java.lang.reflect.Field;

/**
 * Обработчик аннотации @ToString.
 * Формирует строковое представление объекта
 * с учётом отмеченных полей.
 */
public class ToStringProcessor {

    /**
     * Создаёт строку с полями, помеченными @ToString.
     * Если аннотация стоит на классе — выводятся только разрешённые поля.
     *
     * obj объект, который нужно преобразовать в строку
     * @return строковое представление объекта
     */
    public static String buildString(Object obj) {
        Class<?> cls = obj.getClass();

        if (!cls.isAnnotationPresent(ToString.class)) {
            return obj.toString();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName()).append(" { ");

        for (Field field : cls.getDeclaredFields()) {

            if (field.isAnnotationPresent(ToString.class)) {
                ToString ann = field.getAnnotation(ToString.class);

                if (ann.value() == Mode.YES) {
                    try {
                        field.setAccessible(true);
                        Object value = field.get(obj);
                        sb.append(field.getName()).append("=").append(value).append(" ");
                    } catch (Exception ignored) {}
                }
            }
        }

        sb.append("}");
        return sb.toString();
    }
}

