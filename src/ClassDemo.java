//(say this when you are creating this class) we are creating this class to demonstrate how we can work with ShoppingCart class

public class ClassDemo {
    public static void main(String[] args) {

        // we are going to create an instance of a shopping cart class
        // let's say we went to target and we name it targetCart
        ShoppingCart targetCart = new ShoppingCart();
        // here ShoppingCart is the class and targetCart is the object of the class

        // (add some objects to targetCart)
        targetCart.addItem("makeup-product");
        targetCart.addItem("cleaning-product");

        // we will create another ShoppingCart object that demonstrates a walmart cart
        ShoppingCart walmartCart = new ShoppingCart();

        //(add some products to walmart cart)
        walmartCart.addItem("groceries");

        // Now we know that the max size for a cart is ten, that
        // is hardcoded in the addItem method but there is a better way to do it.
        // Let's say we want the same max items for all shopping carts and it can be changed across the board
        // This is where we create a static variable
        //(Go back to ShoppingCart class) add a static variable called max
        // here max will belong  to the class ShoppingCart it will not be belonging to either targetCart or walmartCart

        System.out.println(ShoppingCart.max);
        // as you can see we can access it directly from the class

        // Now I am going to talk briefly about static method
        // (Go to Shopping Cart class and create printMax static method)

        // The methods we mentioned at the top like addItem, removeItem are instance methods
        // however printMax is a static method which belongs to the class

        ShoppingCart.printMax();
        // here is this method is accessed in the class level whereas the other methods we talked about
        // (then point to walmart.addItem("groceries")) this is an instance method

        //Important thing to remember is you cannot access a non-stic method from a static method in the same class
        // (Go to MethodsDemo)







    }
}
