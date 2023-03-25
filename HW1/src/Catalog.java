import java.util.HashMap;

public class Catalog {
    public Category[] categories;

    public Catalog() {
    }

    public Catalog(Category[] categories) {

        this.categories = categories;
    }

    /**
     * Показываем изначальный каталог продуктов
     * @param categories
     */
    public void showProduct(Category[] categories) {
        System.out.println("Каталог продуктов:");
        int count = 1;
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].products.length; j++) {
                System.out.println((count++) + ". " + categories[i].products[j].name + " - "
                        + categories[i].products[j].price + " ₽ (" + categories[i].products[j].rating + "★)");
            }
        }
    }

    public HashMap<Integer, Product> allProduct(Category[] categories) {
        HashMap<Integer, Product> allProducts = new HashMap<>();
        int count = 1;
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].products.length; j++) {
                allProducts.put(count++, categories[i].products[j]);
            }
        }
        return allProducts;
    }
}