package HW1;

public class Customer {
    String login;
    String password;
    Basket basket;

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }
}
