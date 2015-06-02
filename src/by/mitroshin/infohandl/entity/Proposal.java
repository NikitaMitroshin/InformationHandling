package by.mitroshin.infohandl.entity;

import java.util.ArrayList;

/**
 * Created by HP M6 on 02.06.2015.
 */
public class Proposal implements Component {
    private ArrayList<Component> components;

    public Proposal(){
        components = new ArrayList<Component>();
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public void print() {
        for(Component c : components){
            c.print();
        }
    }
}
