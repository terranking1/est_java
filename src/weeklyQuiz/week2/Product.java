package weeklyQuiz.week2;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //비즈니스 로직
    public int calculatePrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + calculatePrice() + "원, 재고: " + stock + "개";
    }
}
