package by.mitroshin.infohandl.entity;

/**
 * Created by HP M6 on 30.05.2015.
 */
public class Sign implements Component {
    private char symbol;

    public Sign(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException(this + "dont have childs and cant do this!!!");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException(this + "dont have childs and cant do this!!!");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException(this + "dont have childs!!!");
    }

    @Override
    public void print() {
        System.out.print(symbol);
    }
}
