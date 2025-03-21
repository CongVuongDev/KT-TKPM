package observer;

public class Main2 {
    public static void main(String[] args) {
        // Tạo đối tượng cổ phiếu và nhà đầu tư
        Stock stock = new Stock("AAPL", 150.0f);
        Investor investor1 = new Investor("Người đầu tư A");
        Investor investor2 = new Investor("Người đầu tư B");

        // Đăng ký các nhà đầu tư
        stock.attach(investor1);
        stock.attach(investor2);

        // Thay đổi giá cổ phiếu
        stock.setPrice(155.0f);  // Thông báo cho tất cả nhà đầu tư

        // Hủy đăng ký
        stock.detach(investor1);
        stock.setPrice(160.0f);  // Chỉ thông báo cho nhà đầu tư B
    }
}
