package HW1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Check this out: ");
        Store store = new Store();
        Categories category1 = new Categories("Meat");
        category1.addGoods(new Goods("Veal", 14.99, 4.8F));
        category1.addGoods(new Goods("Beef", 12.99, 4.6F));
        category1.addGoods(new Goods("Pork", 9.99, 4.2F));

        Categories category2 = new Categories("Fruits");
        category2.addGoods(new Goods("Apples", 1.99, 4.8F));
        category2.addGoods(new Goods("Peaches", 4.99, 4.2F));
        category2.addGoods(new Goods("Pears", 2.99, 3.9F));

        Categories category3 = new Categories("Veges");
        category3.addGoods(new Goods("Tomatoes", 4.99, 4.8F));
        category3.addGoods(new Goods("Cabbages", 1.99, 4.2F));
        category3.addGoods(new Goods("Cucumbers", 0.99, 4.9F));

        store.addCategories(category1);
        store.addCategories(category2);
        store.addCategories(category3);

        store.showAssortment();

        Customer customer1 = new Customer("Nick", "pass123");
        Customer customer2 = new Customer("Wendy", "pass321");
        Customer customer3 = new Customer("Carl", "pass123321");

        customer1.getBasket().addGoods(category1.getSetOfGoods().get(2));
        customer2.getBasket().addGoods(category2.getSetOfGoods().get(1));
        customer3.getBasket().addGoods(category3.getSetOfGoods().get(0));

        category1.getSetOfGoods().remove(2);
        category2.getSetOfGoods().remove(1);
        category3.getSetOfGoods().remove(0);

        System.out.println(customer1.getLogin() + " - purchases: ");
        ArrayList<Goods> customer1Purchases = customer1.getBasket().customerPurchase;
        for (Goods goods : customer1Purchases) {
            System.out.println("* " + goods.getGoodsName() + " cost " + goods.getPrice() + " product rating is "
                    + goods.getRating());
        }
        System.out.println(customer2.getLogin() + " - purchases: ");
        ArrayList<Goods> customer2Purchases = customer2.getBasket().customerPurchase;
        for (Goods goods : customer2Purchases) {
            System.out.println("* " + goods.getGoodsName() + " cost " + goods.getPrice() + " product rating is "
                    + goods.getRating());
        }
        System.out.println(customer3.getLogin() + " - purchases: ");
        ArrayList<Goods> customer3Purchases = customer3.getBasket().customerPurchase;
        for (Goods goods : customer3Purchases) {
            System.out.println("* " + goods.getGoodsName() + " cost " + goods.getPrice() + " product rating is "
                    + goods.getRating());
        }
        System.out.println("________________________________________");
        System.out.println("Stores assortment after customers visit: ");
        store.showAssortment();
    }
}
