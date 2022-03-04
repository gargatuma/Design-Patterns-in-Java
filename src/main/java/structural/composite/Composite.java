package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> list = new ArrayList<>();

    @Override
    public int getPrice() {
        return list.stream().mapToInt(Component::getPrice).sum();
    }

    public void add(Component component) {
        this.list.add(component);
    }

    public List<Component> getChildren() {
        return this.list;
    }
}
