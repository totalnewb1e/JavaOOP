package HW1;

import java.util.ArrayList;

public class Store {
    ArrayList<Categories> assortment;

    public Store() {
        this.assortment = new ArrayList<>();
    }

    void addCategories(Categories categories){
        assortment.add(categories);
    }

    void showAssortment(){
        for (Categories categories : assortment){
            System.out.println(categories.getCategoryName());
            ArrayList<Goods> goods = categories.getSetOfGoods();
            for (Goods goodsName : goods){
                System.out.println("* " + goodsName.getGoodsName() + " is " + goodsName.getPrice() +
                        " rated by customers: " + goodsName.getRating());
            }
        }
    }
}
