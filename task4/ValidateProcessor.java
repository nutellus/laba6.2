package task4;

/**
 * Обработчик аннотации @Validate.
 * Выводит классы, указанные в аннотации.
 */
public class ValidateProcessor {

    /**
     * Проверяет наличие @Validate у класса
     * и выводит список типов из аннотации.
     *
     * cls класс, который нужно обработать
     */
    public static void process(Class<?> cls) {

        if (cls.isAnnotationPresent(Validate.class)) {
            Validate annotation = cls.getAnnotation(Validate.class);

            Class<?>[] classes = annotation.value();

            System.out.println("Классы, указанные в @Validate:");
            for (Class<?> c : classes) {
                System.out.println(c.getName());
            }
        } else {
            System.out.println("Аннотация @Validate не найдена.");
        }
    }
}

