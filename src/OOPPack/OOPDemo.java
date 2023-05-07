package OOPPack;

public class OOPDemo {
    public static void main(String[] args) {

        // **ENCAPSULATION WITH ACCESS MODIFIERS**
        // (create this object)
//        Cart1 myCart = new Cart1(); // last cart is the constructor

//        myCart.addItem("bag");  // added items to the cart by using the method
//        myCart.addItem("fruits");

        // lets say if I want to print all the items inside the cart I could do this

//        System.out.println(myCart.items.toString()); // write this and then run before moving on to the numbered points

        //(go to Cart.java) --> (1)

        //(4) (you will see an error in line 12 ) we will get an error here because we are not allowed to access it directly
        //(5) (then comment it out go back to Cart.java ) -->(6)

        //(8) Now if we want to print an array from items we have to do like this:
//        System.out.println(myCart.getItems().toString());
        // This is encapsulation in short
        //----------------------------------------------------

        //**INHERITANCE AND POLYMORPHISM
        // you will see a small demo of inheritance and polymorphism in action(create Cart2 and then create SmallCart2 and create BigCart2)
        // (create each object)

//        SmallCart2 small = new SmallCart2();
//        BigCart2 big = new BigCart2();

        // They are two different classes but they inherit from the same class
        // as a result we can use the same methods

//        small.addItem("groceries");
//
//        big.addItem("furniture");

        // we can print one of them and see they are working

//        System.out.println(small.getItems().toArray());

        // this is inheritance
        // lets have a look at polymorphism
//----------------------------------------------------------

        //** INTERFACE AND ABSTRACTION
        // we will give a small demo for it

//        (4)
        Cart3 movingCart = new Cart3();

        movingCart.move();
        // as you can see the class is maintaining the condition set forth by the interface




    }
}
