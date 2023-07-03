package HW1;

import java.util.ArrayList;

public class Basket {
    ArrayList<Goods> customerPurchase;

    public Basket() {
        this.customerPurchase = new ArrayList<>();
    }
    public ArrayList<Goods> getCustomerPurchase() {
        return customerPurchase;
    }
    void addGoods(Goods goods){
    customerPurchase.add(goods);
    }
    void removeGoods(Goods goods){
    customerPurchase.remove(goods);
    }
}
