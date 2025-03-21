package composite;

public class Main3 {
    public static void main(String[] args) {
        Container containerUI = new Container();
        Container container = new Container();
        Lable lable2 = new Lable();
        lable2.setName("lable2");
        Button button1 = new Button();
        container.add(button1);
        container.add(lable2);

        Lable lable = new Lable();
        lable.setName("Lable");
        containerUI.add(lable);
        Button button = new Button();
        containerUI.add(button);
        containerUI.add(container);
    }
}
