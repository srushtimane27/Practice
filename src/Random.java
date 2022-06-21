public class Random {
    public static void main(String[] args) {
        int i = 0;
        int min = 1;
        int max = 5;
        int range = max - min + 1;

        while(i<=5){
            int randomValues = (int) (Math.random()*range)+min;
            System.out.println(randomValues);
            i++;
        }



}


