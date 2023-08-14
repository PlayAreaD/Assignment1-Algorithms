import java.util.Arrays;
public class Algo8 {
    public static void main(String[] args) {
        int[] numA ={5,7,-2,3,4,6,-8};
        int[] numB ={7,8,-8,2,1,-9,6};
        int[] numC = new int[7];

        //numA and numB
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i]==numB[j]){
                    numC[i]=numA[i];
                } 
            }
        }
        for (int j = 0; j < numC.length; j++) {
            if (numC[j]==0){
                continue;
            }
            System.out.print(numC[j]+" ");
        }
        System.out.println();

        //numA or numB
        int[] numD =new int[14];
        for (int i = 0; i <= 6; i++) {
            numD[i]=numA[i];
        }
        for (int i = 7; i <= 13; i++) {
            numD[i]=numB[i-7];
        }
        Arrays.sort(numD);

        for (int i = 0; i < numD.length; i++) {
            System.out.print(numD[i]+" ");
        }
        System.out.println();

        //  numA/numB    number of elements that belongs to A but not to B
        int[] numE =new int[7];
        
        for (int i = 0; i < numA.length; i++) {   
            for (int j = 0; j < numB.length;) {
                if (numA[i]==numB[j]){
                    break;
                }
            }
            }
            for (int j = 0; j < numE.length; j++) {
                if (numE[j]==0){
                    continue;
                }
                System.out.print(numE[j]+" ");
        }
        System.out.println();


        // // numB/numA    number of elements that belongs to B but not to A
        // int[] numF =new int[7];
        // for (int i = 0; i < numB.length; i++) {
        //     for (int j = 0; j < numA.length; j++) {
        //         if (numB[i]==numA[j]){
        //             break;
        //         }numF[i]=numB[i];
                
                
        //     }   
        //     }
        //     for (int j = 0; j < numF.length; j++) {
        //         if (numF[j]==0){
        //             continue;
        //         }
        //         System.out.print(numF[j]+" ");
        // }
        // System.out.println();




















    }
    
}
