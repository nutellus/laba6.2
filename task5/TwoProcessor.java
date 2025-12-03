package task5;

/**
 * Обработчик аннотации @Two.
 * Считывает значения параметров аннотации и выводит их.
 */
public class TwoProcessor {

    /**
     * Проверяет наличие @Two у класса и выводит
     * строковый и числовой параметры аннотации.
     *
     * @param cls класс, который нужно обработать
     */
    public static void process(Class<?> cls) {

        if (cls.isAnnotationPresent(Two.class)) {

            Two annotation = cls.getAnnotation(Two.class);

            System.out.println("Значение first: " + annotation.first());
            System.out.println("Значение second: " + annotation.second());

        } else {
            System.out.println("Аннотация @Two не найдена.");
        }
    }
}
