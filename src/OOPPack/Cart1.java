package OOPPack;

import java.util.ArrayList;

// (Create  a new OOPPack package under src folder)
// (Create OOPDemo Class with psvm)
// (Then create this class)
// We will start demonstrating some OOP
public class Cart1 {
    // (write this initially)
    // ArrayList<String> items;// this has a default access modifier

    // (1)(Point to items variable(ArrayList) in line 11) variables or methods with no access modifiers are default in nature
    // which means we can access them within same package
    // (2)(point to line 28) these methods are declared public to access in the package and also
    // outside the package where they will be imported


    // (3)(add private modifier)
    private ArrayList<String> items;// it is only accessible within the classes
    // (Go to OOPDemo) --> (4)
    static int max =10; // the max capacity for the cart // similarly this one too

    public Cart1(){
        // we have to define an initial capacity for the ArrayList, otherwise we will not be able to add or access elements in the constructor
        items = new ArrayList<>(max);
    }

    public void addItem(String item){
        if(items.size() < max) {
            items.add(item);
        }else System.out.println("you have exceeded the limit"); // in case I get asked setter, this is the setter. Because it is adding th item inside the array list.
    }
    public void removeItem(String item){
        items.remove(item);
    }

    public static void printMax(){
        System.out.println("Max Items a cart can hold: "+max);
    }

    //(6) I will create a getter method
    public ArrayList<String> getItems(){
        return items;
    }

    //(7) (go back to OOPDemo) --> (8)




}
