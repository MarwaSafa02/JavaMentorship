package OOPPack;

public class BigCart2 extends Cart2{

    @Override
    public void addItem(String item) {
        // we are not checking a ny size we will just add an item regardless
        items.add(item);
        // after this the same method call will behave differently for each inherited class
        // this is polymorphism
    }
}
