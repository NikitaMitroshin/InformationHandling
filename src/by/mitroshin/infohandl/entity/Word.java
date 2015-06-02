package by.mitroshin.infohandl.entity;

import java.util.ArrayList;

/**
 * Created by HP M6 on 01.06.2015.
 */
public class Word implements Component {

    private ArrayList<Component> signs;

    public Word(){
        signs = new ArrayList<Component>();
    }

    @Override
    public void add(Component c) {
        signs.add((Sign) c);
    }

    @Override
    public void remove(Component c) {
        signs.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return signs.get(index);
    }

    @Override
    public void print() {
        for (Component sign :  signs){
            sign.print();
        }
    }
}
