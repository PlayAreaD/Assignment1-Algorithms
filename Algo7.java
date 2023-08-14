public class Algo7 {
    public static void main(String[] args) {

        String input ="hala madrid y nada mas";
        char[] sentence =input.toCharArray();

        char[] words =new char[sentence.length];

        for (int i = 0; i < sentence.length; i++) {
            words[i]= sentence[i];
            if (sentence[i]== ' '){
                for (int j = 0; j < words.length; j++) {
                    System.out.print(words[j] + words.length);
                }

                continue;
            }

            
        }
        System.out.println();

        
    }
    
}
