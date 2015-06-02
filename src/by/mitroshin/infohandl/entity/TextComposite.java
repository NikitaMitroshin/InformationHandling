package by.mitroshin.infohandl.entity;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by HP M6 on 30.05.2015.
 */
public class TextComposite implements Component {
    private ArrayList<Component> components;

    public TextComposite(){
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

    public ArrayList<Component> getComponents() {
        return (ArrayList) Collections.unmodifiableCollection(components);
    }

    public void printListing(){
        for(Component component : components){
            if(component instanceof Listing){
                Listing listing = (Listing) component;
                listing.print();
            }
        }
    }
}
