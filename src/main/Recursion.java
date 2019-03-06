package main;

public class Recursion {
     static void countDown(int number){
        System.out.println(number);
        --number;
        countDown(number);
    }

    public static void main(String[] args) {
       countDown(4);

    }
}
