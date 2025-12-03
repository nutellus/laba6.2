package task2;

/**
 * Обработчик аннотации @Default. Получает из класса
 * указанный тип по умолчанию и выводит его имя.
 */
public class DefaultProcessor {

    /**
     * Проверяет наличие аннотации @Default у класса
     * и выводит тип, указанный в аннотации.
     *
     * @param cls класс, который нужно обработать
     */
    public static void process(Class<?> cls) {

        if (cls.isAnnotationPresent(Default.class)) {
            Default annotation = cls.getAnnotation(Default.class);
            Class<?> defaultClass = annotation.value();
            System.out.println("Класс по умолчанию: " + defaultClass.getName());
        } else {
        }
    }
}
