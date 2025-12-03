package task6;

/**
 * Обработчик аннотации @Cache.
 * Выводит список областей, указанных в аннотации.
 */
public class CacheProcessor {

    /**
     * Проверяет наличие @Cache у класса и выводит
     * все указанные в аннотации области кеширования.
     *
     * @param cls класс, который нужно обработать
     */
    public static void process(Class<?> cls) {

        if (cls.isAnnotationPresent(Cache.class)) {

            Cache annotation = cls.getAnnotation(Cache.class);

            String[] regions = annotation.value();

            if (regions.length == 0) {
                System.out.println("Список кешируемых областей пуст.");
            } else {
                System.out.println("Кешируемые области:");
                for (String r : regions) {
                    System.out.println(r);
                }
            }

        } else {
            System.out.println("Аннотация @Cache не найдена.");
        }
    }
}
