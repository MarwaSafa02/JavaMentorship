// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import DemoPackage.ThreeDemo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

// Phase 1: Primitive types and Arrays  after going from Slide 1-14
//        int myNum = 21;
//
//        System.out.println(myNum);

//        String text = "hello";
//
//        System.out.println(text);

//        int[] listOfNum = {1,2, 3,4 };

//        int [] listOfNum = new int[4];
//
//        listOfNum[0]= 1;
//        listOfNum[3]=3;

//        int length = listOfNum.length;//4 which is the length
//
//        System.out.println("Length of the array: "+ length);

//        int firstElement = listOfNum[0];
//        System.out.println("First element: "+ firstElement);
//
//        int lastIndex = length -1;
//
//        System.out.println("Last element: "+ listOfNum[lastIndex]);

//        System.out.println(listOfNum[4]); this is an error

//        listOfNum[0]= 10;

// You can change or modify the values inside an array , but you cannot change the length of the array because it is static.

//        String[] listOfItems = {"orange", "bar", "banana"};
//
//        System.out.println(listOfItems[0]);
//        System.out.println(listOfItems[1]);
//        System.out.println(listOfItems[2]);

//        String[] grocery = {"cookies", "milk"};
//        String[] cleaning = {"mop", "bleach"};
//        String[] hardware = {"brush", "hammer", "broom"};
//
//        String[][] cart = {grocery, cleaning, hardware};
//        String[][] cart = {{"cookies", "milk"}, {"mop", "bleach"}};


//        String lastCleaningItem = cart[1][1];

// Phase2: From slide 15, operators, control statements  and methods

// = is assignment operator
//        int x = 9;
//        int y = 12;

        // these are arithmatic operators

        // + for addition
        // - for subtraction
        // * for multiplication
        // / for division without modulus
        // % for modulus

//        int z = x+y;
//        System.out.println("x+y= "+z);

//        int m = 5%2;
//        System.out.println("remainder is: "+m);

// relational operators
      // they compare left and right value and based on that they yield boolean result
      // == compares to see whether left and right matches. then it will yield true else false
      // != compares to see whether left and right should not match then it will be true else false
      // > compares to see if left value is greater than the right then it will be true else false
        // < compares to see if left value is less than the right then it will be true else false
        // >= compares to see if left value is greater or equal than the right then it will be true else false
        // <= compares to see if left value is less or equal then the right then it will be true else false
// logical operators
        // &&, ||, !
    // they combine two different boolean results and yield one boolean result
        // &&--
        // true && true = true
        // false && false = false
        // true && false or false && true = false
        // ||--
        // true || true = true
        // true || false or false || true = true
        // false || false = false

//        boolean yes = true;
//        boolean no = !yes;

        //increment and decrement ++, --
// if they are used to the left then the variable will be reassigned first before using
// if it is used to the right the variables will be reassigned after they are used.

//        int i =1;
// ++i incrementing by +1 before
// i++ incrementing by +1 after

//        System.out.println(i++);
//        System.out.println(i);

//        int j =2;
// --j decrement by -1 before
// j-- decrementing by -1 after

//        System.out.println(j--);
//        System.out.println(j);



// if statements:
//        int num = 4;
//            if(num%2 == 0){
//        System.out.println("Even");
//    }

// if-else statements:

//    int num = 5;
//    int num = 6;
//
//    if(num%2 == 0){
//        System.out.println("Even");
//    }
//    else System.out.println("Odd");

// if-else if

//    int x =7;
//    int y =9;

    // 1st way
//    if(x%2 ==0 && y%2 == 0){
//        System.out.println("Both are even");
//    } else if(x%2 ==1 || y%2 == 1){
//        System.out.println("even and odd");
//    } else if(x%2 ==1 && y%2 == 1){
//        System.out.println("Both are odd");
//    }

        // 2nd way
//        if(x%2 ==0 && y%2 == 0){
//            System.out.println("Both are even");
//        }else if(x%2 ==1 && y%2 == 1){
//            System.out.println("Both are odd");
//        }else {
//            System.out.println("even and odd");
//        }

    //switch statements:

//    String fruit = "";
//
//    switch(fruit){
//        case "banana":
//            System.out.println("yellow");
//            break;
//        case "apple":
//            System.out.println("red");
//            break;
//        default:
//            System.out.println("other");
//            break;
//    }


        //for loop section

//        String[] fruitBasket = {"apple", "orange", "watermelon", "banana", "strawberry"};

//        System.out.println(fruitBasket[0]);
//        System.out.println(fruitBasket[1]);
//        System.out.println(fruitBasket[2]);
//        System.out.println(fruitBasket[3]);
//        System.out.println(fruitBasket[4]);

        //ascending order
//       for(int i =0; i < fruitBasket.length; i++){
//           System.out.println(fruitBasket[i]);
//       }

        // descending order
//               for(int i = fruitBasket.length-1; i >= 0; i--){
//           System.out.println(fruitBasket[i]);
//       }

// while loop section
//
//int i =2;
//
//while (i<20){
//    System.out.println(i);
//    i= i*2;
//}

// do-while loops section
//  int i =5;

//  while(i<=4){
//      System.out.println(i);
//      i++;
//  }

//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=4);

        //do-while loop will execute the code block first then check the boolean expression hence it will execute at least once

        //on the other hand while loop will check the boolean expression first and then execute the block of code hence the code might never get executed


// DEMO: Variables static, instance, local
//        TwoDemo td1 = new TwoDemo();
//        TwoDemo td2 = new TwoDemo();


//        td1.insVar=8;
//        System.out.println(td1.insVar);
//
//        td2.insVar=9;
//        System.out.println(td2.insVar);

//        td1.statVar =5;
//        System.out.println(TwoDemo.statVar);

//        td1.doSomething();


// DEMO: Java primitive data type and wrapper class
//        int num1 = 10;
//
//        Integer num1w = num1;
//
//        String str= "12";
//
//        int num2 = Integer.parseInt(str);
//
//        System.out.println(num2*2);


// DEMO: Non-Primitive data types

    }


}


