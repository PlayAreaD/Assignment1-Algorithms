import java.util.Scanner;

public class Algo1{
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number;

        do{
        System.out.print("Enter a number to generate the fibonacci sequence: ");
        number = scanner.nextInt();
        scanner.nextLine();
        if(number<=0){
            System.out.println("Enter a valid number please !");
        }
        else{
            int i =0;
            int j =1;
            int k=0;
            do{
                System.out.print(k +" ");
                k=i+j;
                i=j;
                j=k;
            }while (k<=number);  
            System.out.println();      
        }
        }while(true);
    }
}