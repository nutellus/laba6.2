package task3;

/**
 * Класс для демонстрации работы аннотации @ToString.
 * Некоторые поля включаются в вывод, а некоторые — нет.
 */
@ToString
public class Person {

    @ToString
    private String name;

    @ToString(Mode.NO)
    private int age;

    @ToString
    private String city;

    /**
     * Конструктор для инициализации полей Person.
     */
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
