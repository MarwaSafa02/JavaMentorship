package DemoPackage;

public class Methods {

    public static void main(String[] args) {
        String[] listOfColors = {"green","yellow", "orange"};
//        printStringArray(listOfColors);
        String firstElement = getFirstElement(listOfColors);
        System.out.println(firstElement);
        


        System.out.println(getFirstElement(listOfColors));

        //printHelloWorld();
    }
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
}
