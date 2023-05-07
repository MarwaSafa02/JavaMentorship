package OOPPack;

import java.util.ArrayList;

public class Cart3 implements Movable3 {
// copied and pasted from cart 2
    // Let's say we want our cart to be movable with a scooter
    // all we want to add a method to move
    // now we will create an interface called movable --> (1)
    protected ArrayList<String> items;
    static int max =10;

    public Cart3(){
        items = new ArrayList<>(max);
    }

    public void addItem(String item){
        if(items.size() < max) {
            items.add(item);
        }else System.out.println("you have exceeded the limit");
    }
    public void removeItem(String item){
        items.remove(item);
    }

    public static void printMax(){
        System.out.println("Max Items a cart can hold: "+max);
    }

    public ArrayList<String> getItems(){
        return items;
    }

    //(3) (write implements and create the method)
    public void move(){
        System.out.println("Cart is moving");
    }
    //(Go back to OOPDemo) --> (4)



}
