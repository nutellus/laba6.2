package task4;

/**
 * Пример класса, использующего аннотацию @Validate.
 * В аннотации указан список типов, которые требуется обработать.
 */
@Validate({String.class, Integer.class, Double.class})
public class DemoClass {
}
