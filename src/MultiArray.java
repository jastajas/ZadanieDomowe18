import java.util.Arrays;
import java.util.Random;

public class MultiArray {

    private int[][] numbersArray;

    public MultiArray(int N, int M) {
        Random rnd = new Random();
        numbersArray = new int[N][M];
        numbersArray = randomize();
        /*int y = 0;
        do {
            for (int i = 0; i < numbersArray[y].length; i++) {
                numbersArray[y][i] = rnd.nextInt(20);
            }
            y++;
        } while (y < numbersArray.length);*/
    }

    public int[][] randomize(){

        Random rnd = new Random();
        int y = 0;
        do {
            for (int i = 0; i < numbersArray[y].length; i++) {
                numbersArray[y][i] = rnd.nextInt(20);
            }
            y++;
        } while (y < numbersArray.length);
        return numbersArray;
    }

    public int findMin() {

        int minValue = numbersArray[0][0];
        int y = 0;

        do {
            for (int i = 0; i < numbersArray[y].length; i++) {
                if (minValue > numbersArray[y][i]) {
                    minValue = numbersArray[y][i];
                }
            }
            y++;
        } while (y < numbersArray.length);
        return minValue;
    }
    public int findMax(){

        int maxValue = numbersArray[0][0];
        int y = 0;

        do{
            for (int i = 0; i < numbersArray[y].length ; i++) {
                if(maxValue < numbersArray[y][i]) {
                    maxValue = numbersArray[y][i];
                }
            }
            y++;
        } while (y < numbersArray.length);
        return maxValue;
    }

    public void print(){

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(Arrays.toString(numbersArray[i]));
        }
    }


}




