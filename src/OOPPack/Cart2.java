package OOPPack;

import java.util.ArrayList;

public class Cart2 {

    protected ArrayList<String> items;// it is private to all classes except for inherited classes
    static int max =10;

    public Cart2(){
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




}
