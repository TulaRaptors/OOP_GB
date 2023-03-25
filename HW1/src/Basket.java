import java.util.*;

public class Basket {
    Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    /**
     * Формируем список товаров, исключая перенесенные в корзину
     * @param products
     */
    public void showBasket(HashMap<Integer, Product> products) {
        System.out.println("Список товаров:");
        Set<Integer> keys = products.keySet();
        for (Integer k : keys) {
            System.out.println(k + ". " + products.get(k).name + " - " + products.get(k).price + " ₽");
        }
    }

    /**
     * Выводим список покупок
     * @param buy
     */
    public void showPurchases(LinkedList<Product> buy) {
        double totalCost = 0;
        System.out.println("Ваша корзина:");
        for (int i = 0; i < buy.size(); i++) {
            System.out.println((i + 1) + ". " + buy.get(i).name);
            totalCost += buy.get(i).price;
        }
        System.out.printf("Итого к оплате: %.2f ₽", totalCost);
    }

    public LinkedList<Product> shopping(HashMap<Integer, Product> products) {
        LinkedList<Product> buy = new LinkedList<Product>();
        int product = -1;
        Scanner in = new Scanner(System.in);
        while (product != 0) {
            System.out.println("Введите номер товара для покупки, по окончанию покупок введите '0': ");
            product = in.nextInt();
            if (product == 0) {
                showPurchases(buy);
                break;
            }
            buy.add(products.get(product));
            products.remove(product);
            showBasket(products);
        }
        return buy;
    }
}
