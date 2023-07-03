package HW1;

public class Goods {
    String goodsName;
    Double price;
    Float rating;

    public Goods(String goodsName, Double price, Float rating) {
        this.goodsName = goodsName;
        this.price = price;
        this.rating = rating;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public Float getRating() {
        return rating;
    }
}
