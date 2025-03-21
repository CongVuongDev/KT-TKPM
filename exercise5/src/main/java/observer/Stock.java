package observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private float price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    // Thêm observer vào danh sách
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Gỡ bỏ observer khỏi danh sách
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Thông báo cho tất cả observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    // Thay đổi giá cổ phiếu và thông báo cho observers
    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public String getSymbol() {
        return symbol;
    }
}
