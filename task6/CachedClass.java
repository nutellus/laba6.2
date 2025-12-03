package task6;

/**
 * Пример класса, использующего аннотацию @Cache.
 * Указаны три области кеширования.
 */
@Cache({"users", "products", "settings"})
public class CachedClass {
}
