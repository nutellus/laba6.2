package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для проверки работы InvokeProcessor.
 * Проверяются поиск аннотированного метода, отсутствие исключений
 * и изменение состояния объекта.
 */
class InvokeProcessorTest {

    /**
     * Вспомогательный класс для тестирования.
     * Метод test() помечен @Invoke и должен выполняться.
     */
    static class Sample {
        int count = 0;

        @Invoke
        void test() {
            count++;
        }

        void skip() {
            count += 10;
        }
    }

    Sample obj;

    /**
     * Создаёт новый объект перед каждым тестом.
     */
    @BeforeEach
    void init() {
        obj = new Sample();
    }

    /**
     * Проверяет, что среди методов найден ровно один,
     * помеченный аннотацией @Invoke.
     */
    @Test
    void find() {
        long found = Arrays.stream(Sample.class.getDeclaredMethods())
                .filter(m -> m.isAnnotationPresent(Invoke.class))
                .count();

        assertEquals(1, found);
    }

    /**
     * Проверяет, что выполнение обработчика не вызывает исключений.
     */
    @Test
    void noException() {
        assertDoesNotThrow(() -> InvokeProcessor.process(obj));
    }

    /**
     * Проверяет, что метод с @Invoke действительно выполняется
     * и влияет на состояние объекта.
     */
    @Test
    void changed() {
        InvokeProcessor.process(obj);
        assertEquals(1, obj.count);
    }
}
