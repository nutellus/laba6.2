package task3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Аннотация для настройки вывода объекта в строку.
 * Может применяться к классу или отдельным полям.
 * По умолчанию поле включается в вывод.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface ToString {
    Mode value() default Mode.YES;
}
