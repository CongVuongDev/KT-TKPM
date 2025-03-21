package composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component{
    public List<Component> lists;
    @Override
    public void excute() {

    }

    public Container() {
        this.lists = new ArrayList<Component>();
    }

    public void add(Component component) {
        this.lists.add(component);

    }
}
