package HW1;

import java.util.ArrayList;

public class Categories {
    String categoryName;
    ArrayList<Goods> setOfGoods;


    public Categories(String categoryName) {
        this.categoryName = categoryName;
        this.setOfGoods = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList<Goods> getSetOfGoods() {
        return setOfGoods;
    }

    void addGoods(Goods goods){
        setOfGoods.add(goods);
    }
}
