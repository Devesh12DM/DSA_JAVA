import  java.util.*;

public class array {

    public static int getLarges(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i=0; i <numbers.length; i++){
            if(numbers[i]> largest){
                largest= numbers[i];
            }
        }return largest;
        for (int i=0; i <numbers.length; i++){
            if(numbers[i]<smallest){
                smallest= numbers[i];
            }
        }return smallest;
    }
    public static void main(String[] args){
        int numbers[] = {6,5,1,3,4,6,8,9,};

        System.out.println("the largest number from the array is: " + getLarges(numbers));
    }


}
