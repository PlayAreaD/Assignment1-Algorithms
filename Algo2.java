import java.util.Arrays;
public class Algo2{
    public static void main(String[] args) {
        int smallest=0;
        int largest;
        int [] numbers = {-5,2,7,10,58,-7,8,23};
        Arrays.sort(numbers);
        smallest= numbers[0];
        largest = numbers[numbers.length-1];
        System.out.println("Smallest number: "+ smallest);
        System.out.println("Largest number: "+ largest);
        
        // for (int i =0; i<numbers.length; i++){
        //     for (int j=0; j<numbers.length; j++){
        //         if (numbers[i]<numbers[j]){
        //             smallest = numbers[i];
        //         }else smallest = numbers[j];
        //     }
        // }
        // System.out.println(smallest);
    }
}