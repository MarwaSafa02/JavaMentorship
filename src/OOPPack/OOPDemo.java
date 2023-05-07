package OOPPack;

public class OOPDemo {
    public static void main(String[] args) {
        // (create this object)
        Cart cart = new Cart();

        cart.addItem("bag");
        cart.addItem("fruits");

        // lets say if I want to print all the items inside the cart I could do this
        System.out.println(cart.items.toString());
    }
}
