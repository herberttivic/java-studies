package numbers;

import java.util.Arrays;

public class Numbers {
    public static int globalValue = 3;
    public static void main(String[] args){

        int[] numbers = new int[]{3,4,5};

        changeOddValues(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void changeOddValues(int[] numbers){
        for(int i =0; i < numbers.length ; i++){
            if(numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }
        }
    }
}
