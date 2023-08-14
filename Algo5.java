import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        do{
            System.out.println();
            System.out.print("Enter a text to reverse: ");
            input= scanner.nextLine().strip();
        }while(input.isBlank());

        char[] chars =input.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length/2; i++) {
            char letter = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i]= letter; 
        }
        System.out.print("Reversed text: ");
        for (int j = 0; j < chars.length; j++) {
            System.out.print(chars[j]+" ");    
        }
        System.out.println();

    }
    
}
