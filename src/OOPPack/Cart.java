package OOPPack;

import java.util.ArrayList;

// (Create  a new OOPPack package under src folder)
// (Create OOPDemo Class with psvm)
// (Then create this class)
// We will start demonstrating some OOP
public class Cart {
    ArrayList<String> items;
    static int max = 10;


    void addItem(String item){
        if(items.size() < max) {
            items.add(item);
        }else System.out.println("you have exceeded the limit");
    }
    void removeItem(String item){
        items.remove(item);
    }

    static void printMax(){
        System.out.println("Max Items a cart can hold: "+max);
    }

}
