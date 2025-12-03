package task1;

import java.lang.reflect.Method;

/**
 * Обработчик аннотации @Invoke. Находит методы,
 * помеченные этой аннотацией, и выполняет их.
 */
public class InvokeProcessor {

    /**
     * Выполняет все методы объекта, которые отмечены @Invoke.
     *
     * @param obj объект, методы которого требуется проверить
     */
    public static void process(Object obj) {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                System.out.println("Вызов метода: " + method.getName());
                try {
                    method.invoke(obj);
                } catch (Exception ignored) {}
            }
        }
    }
}
