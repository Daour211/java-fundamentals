package com.company;

public class Main {

    public static void main(String[] args) {

        int n = 4;
       roll(n);

       System.out.println(containsDuplicates());

       int[] arr = {1, 2, 3, 4, 6, 7};
       calAverage(arr);

       lowestAvg();

            }
    }

    public static boolean containsDuplicates() {
        int[] arr = {5, 2, 3};
        boolean val = true ;
        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    continue;
                }

                if (check == arr[j]) {
                    val = true;
                    break;
                } else {
                    val = false;
                }
            }
        }
        return val;
    }

    public static void calAverage(int[] arr) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;

        System.out.println("The average is " + avg);
    }

    public static void lowestAvg() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double avg1 = 0,
                avg2=0, avg3=0, avg4 = 0;
        int[] arr;
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            arr = weeklyMonthTemperatures[i];
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j];
            }
            if(i== 0){
                avg1= sum/arr.length;
            }else if(i==1){
                avg2= sum/arr.length;
            }else if(i==2){
                avg3= sum/arr.length;
            }else if(i==3){
                avg4= sum/arr.length;
            }

        }
        System.out.println(avg1);
        System.out.println(avg2);
        System.out.println(avg3);
        System.out.println(avg4);

        ArrayList<Double> averageList=new ArrayList<Double>();
        averageList.add(avg1);
        averageList.add(avg2);
        averageList.add(avg3);
        averageList.add(avg4);
        double intial = avg1;
        for (int i=1; i<averageList.size();i++){
            if(averageList.get(i) <intial){
                intial = averageList.get(i);

            }
        }

        System.out.println("The lowest avg = "+intial);


    }