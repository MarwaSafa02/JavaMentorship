import java.util.ArrayList;

// (say this while you are creating the class) I am going to create a class that mimics a real-life scenario of shopping carts

// (after you created the class) This class as the name suggests represents a shopping cart.
// This cart will hold our items and we can add or  delete items from here

// (when you write arraylist) we are going to use ArrayList which is a non-primitive data type,
// you can call this a dynamic array
// it provides us a lot of methods that we can use unlike regular arrays
// developers and QAs prefer using ArrayList over arrays for  all the advantages


public class ShoppingCart {
    ArrayList<String> items; // this is an instance variable

    // (create the static variable coming from ClassDemo)
    static int max = 10; // static variable lets say default variable is ten (phase 3)

    public ShoppingCart(){
        items = new ArrayList<>(max);
    }

    // Phase 1
//    you will be writing this initially when you write the class
//    void addItem(String item){
//        items.add(item);
//    }

    // Phase 2
//    void addItem(String item){
//        // let's say we want to make sure the customers can only add 10 items to the cart
//        // we can set something in the method
//        int max = 10; // (say this after you write the bottom code block)this is local because it is inside the method and can only be accessed within that block
//
//        if(items.size() < max) {
//            items.add(item);
//        }else System.out.println("you have exceeded the limit");
//    }

    // Phase 3
    void addItem(String item){
        // we will remove the local variable
        // the statement will evaluate the static variable max
        if(items.size() < max) {
            items.add(item);
        }else System.out.println("you have exceeded the limit");
    }
    void removeItem(String item){
//        System.out.println(max);
// (you will write the commented code when talking about local variable
// and show how it is not resolved because it cannot access the variable max)
        items.remove(item);
    }

    // (create this after talking about static variable)
    static void printMax(){
        System.out.println("Max Items a cart can hold: "+max);
    }

    // (Next you will create a ClassDemo class )
}
