public class Main {
    public static void main(String[] args) {

        //       System.out.println("Hello world!");

       int totalWorkingHours = 100;
       int wagePerHour = 20;
       int totalSum = 0;

       for (int i=1; i<=100; i++){
           totalSum = totalSum+(i*wagePerHour);
       }
       System.out.println("totalSum= "+ totalSum);          //concatination adding string value with integer value
    }




}