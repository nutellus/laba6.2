import task1.ExampleMethods;
import task1.InvokeProcessor;

import task2.DefaultProcessor;
import task2.ExampleDefaultClass;

import task3.Person;
import task3.ToStringProcessor;

import task4.ValidateProcessor;
import task4.DemoClass;

import task5.TwoProcessor;
import task5.DemoTwoClass;

import task6.CacheProcessor;
import task6.CachedClass;

import java.util.Scanner;

/**
 * Главный класс программы. Показывает работу всех заданий
 * через простое консольное меню.
 */
public class Main {

    /**
     * Точка входа. Организует меню и обработку выбора пользователя.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=== Меню лабораторной №6 ===");
            System.out.println("1 - Задание 1 (@Invoke)");
            System.out.println("2 - Задание 2 (@Default)");
            System.out.println("3 - Задание 3 (@ToString)");
            System.out.println("4 - Задание 4 (@Validate)");
            System.out.println("5 - Задание 5 (@Two)");
            System.out.println("6 - Задание 6 (@Cache)");
            System.out.println("0 - Выход");
            System.out.print("> ");

            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                case 1:
                    runTask1(sc);
                    break;
                case 2:
                    runTask2();
                    break;
                case 3:
                    runTask3();
                    break;
                case 4:
                    runTask4();
                    break;
                case 5:
                    runTask5();
                    break;
                case 6:
                    runTask6();
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    /**
     * Запуск задания 1: демонстрация аннотации @Invoke.
     */
    private static void runTask1(Scanner sc) {
        System.out.println("=== Задание 1: Аннотация @Invoke ===");
        System.out.println("Введите 1 для запуска обработки аннотированных методов:");
        System.out.print("> ");

        int val = sc.nextInt();

        if (val == 1) {
            ExampleMethods example = new ExampleMethods();
            InvokeProcessor.process(example);
        } else {
            System.out.println("Некорректный ввод.");
        }
    }

    /**
     * Запуск задания 2: демонстрация аннотации @Default.
     */
    private static void runTask2() {
        System.out.println("=== Задание 2: Аннотация @Default ===");
        DefaultProcessor.process(ExampleDefaultClass.class);
    }

    /**
     * Запуск задания 3: демонстрация аннотации @ToString.
     */
    private static void runTask3() {
        System.out.println("=== Задание 3: Аннотация @ToString ===");
        Person p = new Person("Андрей", 20, "Москва");
        String result = ToStringProcessor.buildString(p);
        System.out.println(result);
    }

    /**
     * Запуск задания 4: демонстрация аннотации @Validate.
     */
    private static void runTask4() {
        System.out.println("=== Задание 4: Аннотация @Validate ===");
        ValidateProcessor.process(DemoClass.class);
    }

    /**
     * Запуск задания 5: демонстрация аннотации @Two.
     */
    private static void runTask5() {
        System.out.println("=== Задание 5: Аннотация @Two ===");
        TwoProcessor.process(DemoTwoClass.class);
    }

    /**
     * Запуск задания 6: демонстрация аннотации @Cache.
     */
    private static void runTask6() {
        System.out.println("=== Задание 6: Аннотация @Cache ===");
        CacheProcessor.process(CachedClass.class);
    }
}
