package by.mitroshin.infohandl.entity;

/**
 * Created by HP M6 on 30.05.2015.
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild (int index);
    void print();
}
