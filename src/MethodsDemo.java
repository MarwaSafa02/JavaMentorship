public class MethodsDemo {

    public static void main(String[] args) {
        String[] listOfColors = {"green","yellow", "orange"};
        printStringArray(listOfColors);
//        String firstElement = getFirstElement(listOfColors);
//
//        System.out.println(firstElement);
//
//    demo code as used in the paper
//
//        System.out.println(getFirstElement(listOfColors));

        //printHelloWorld();
    }

    // (When you come from ClassDemo remove the static keyword from the method below and read the error from method declaration)
    public static void printStringArray(String[] anyList) {
        for (int i = 0; i < anyList.length; i++) {
            System.out.println(anyList[i]);
        }
    }
    public static String getFirstElement(String[] anyList){
        return anyList[0];
    }

    public static int squared(int x){
        return x*x;
    }

    public static  void printHelloWorld(){
        System.out.println("hello world");
    }

    //(Next create ShoppingCart class )
}
