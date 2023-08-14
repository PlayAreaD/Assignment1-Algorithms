import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        do{
            System.out.println();
            System.out.print("Enter a sentence to reverse: ");
            input= scanner.nextLine().strip();
        }while(input.isBlank());
        String[] sentence =input.toLowerCase().split(" ");

        for (int i = sentence.length -1; i>=0; i--) {
            System.out.print(sentence[i]+" ");
        }
        System.out.println();
    }
}
