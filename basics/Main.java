package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Calling the function of the pluralize
        int dogCount = 4;
        System.out.println("I own "+ dogCount +" "+pluralize("dog" ,dogCount) + ".");

        // Calling the function of the pluralize
        int catCount = 1;
        System.out.println("I own "+ catCount +" "+pluralize("cat" ,catCount) + ".");

        // Calling the function of the pluralize
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        // Calling the function of the coin flipping
        System.out.println(flipNHeads(5));

        // Calling the function of the time
         clock();



    }

    // The pluralize function
    public static String pluralize(String name,   int num){
//    System.out.println("I own "+ num +" "+  );
        if(num == 1){
//            return (name);
            name = name;
        }else if(num >1 || num == 0 ){
//            return (name + "s");
            name = name + "s";
        }
        return  name;
    }

    // The coin flipping function
    public static String flipNHeads(int n){
        int min = 0;
        int max = 1;
//        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int count = 0;

        for (int i = 0;i<n ;i++){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(random_int < 0.5){
                System.out.println("tails");
            }else if(random_int >= 0.5){
                System.out.println("heads");
                count ++;
            }


        }
        return ("It took " + n +" flips to flip "+ count + " heads in a row.");

    }
    // Just checking
    // The time function
    public static void clock(){
        while(true){
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            System.out.println(hour + ":" +minute +":"+ second);
        }
    }


}
