import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /**
         * Категории продуктов
         */
        Category grocery = new Category("Бакалея",
                new Product[]{new Product("Рис", 119.99, 4.9),
                        new Product("Гречка", 83.99, 4.5),
                        new Product("Перловка", 69.99, 4.1),
                        new Product("Макароны", 74.99, 4.7),
                        new Product("Овсянка", 81.99, 4.8)});
        Category milk = new Category("Молочная продукция",
                new Product[]{new Product("Молоко", 89.99, 4.6),
                        new Product("Творог", 74.99, 4.4),
                        new Product("Йогурт", 149.99, 4.7),
                        new Product("Сыр", 219.99, 4.8),
                        new Product("Кефир", 95.99, 4.4)});
        Category fruit = new Category("Фрукты",
                new Product[]{new Product("Яблоки", 99.99, 4.6),
                        new Product("Бананы", 129.99, 3.9),
                        new Product("Ананас", 299.99, 4.5),
                        new Product("Лимоны", 109.99, 5.0),
                        new Product("Мандарины", 189.99, 4.6)});
        /**
         * Пользователи
         */
        User user1 = new User("Сергей", "1234", new Basket(new Product[]{grocery.products[0], milk.products[0] ,fruit.products[0]}));
        User user2 = new User("Маша", "4321", new Basket(new Product[]{grocery.products[1], milk.products[1] ,fruit.products[1]}));

        Category[] categories = new Category[]{grocery, milk, fruit};
        Catalog catalog = new Catalog(categories);
        catalog.showProduct(categories);
        HashMap<Integer, Product> all = catalog.allProduct(categories);
        user1.basket.shopping(all);
    }
}