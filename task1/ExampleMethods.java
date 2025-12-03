package task1;

/**
 * Класс с методами для демонстрации работы аннотации @Invoke.
 * Обработчик должен находить и выполнять только те методы,
 * которые отмечены этой аннотацией.
 */
public class ExampleMethods {

    @Invoke
    public void methodA() {
        System.out.println("methodA() выполнен");
    }

    public void methodB() {
        System.out.println("methodB() выполнен");
    }

    @Invoke
    public void methodC() {
        System.out.println("methodC() выполнен");
    }
}
