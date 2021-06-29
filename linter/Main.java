public class Main {

    public static void main(String[] args) {
       
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
//        getMinMaxTemp(weeklyMonthTemperatures);


    ArrayList<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

//        System.out.println(tally(votes)+ " received the most votes!");


    }

    // function for  getting max and min temp
    public static void getMinMaxTemp(int[][] arr){
        HashSet<Integer> tempData = new HashSet<>();

        for (int i = 0 ; i < arr.length;i++){
            int[] indexOfArr = arr[i];
            for(int j= 0 ; j<indexOfArr.length ; j++){
                tempData.add(arr[i][j]);
            }
        }

        System.out.println(tempData);


        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i : tempData) {
           temp.add(i);
        }

        int min = temp.get(0);
        int max = temp.get(0);

        for (int i = 1 ; i < temp.size();i++) {
            if (temp.get(i) > max) {
                max = temp.get(i);

            } else if (temp.get(i) < min) {
                min = temp.get(i);
            }else{
                System.out.println("Never saw temperature: "+temp.get(i));
            }
        }
        System.out.println("low: "+min);
        System.out.println("High: " +max);

    }

    // function for  getting the winner of votting 
    public static String tally(ArrayList<String> arr){

        int counter1=0;
        int counter2=0;
        int counter3=0;
        for (int i = 0 ; i < arr.size(); i++){
            if(arr.get(i) == "Bush"){
                counter1 ++ ;
            }
            if(arr.get(i)  == "Shrub"){
                counter2 ++ ;
            }
            if(arr.get(i) == "Hedge"){
                counter3 ++ ;
            }
        }

        String winner ="";
        if(counter1 > counter2 && counter1 >counter3){
               winner = "Bush";

        }else if(counter2 > counter1 && counter2 >counter3) {
            winner = "Shrub";

        }else if(counter3 > counter1 && counter3>counter2) {
            winner = "Hedge";

        }
        return  winner;
    }
}