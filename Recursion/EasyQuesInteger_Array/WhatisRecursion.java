package EasyQuesInteger_Array;

public class WhatisRecursion {
    public static void main(String[] args) {

        print(1);

    }
        public static void print(int n){
        if(n > 5){   // Base Case
            return;
        }
        System.out.println("Hello world"); // Task
        print(n+1); // Recursive Call
    }
//    public static void print(){
//        System.out.println("Hello world");
//        print1();
//    }
//    public static void print1(){
//        System.out.println("Hello world");
//        print2();
//    }
//    public static void print2(){
//        System.out.println("Hello world");
//        print3();
//    }
//    public static void print3(){
//        System.out.println("Hello world");
//        print4();
//    }
//    public static void print4(){
//        System.out.println("Hello world");
//    }


}
