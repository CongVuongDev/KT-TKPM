package observer;
public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println(name + " nhận được thông báo: Giá cổ phiếu thay đổi thành " + price);
    }
}

