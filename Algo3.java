public class Algo3 {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50};

        int[] reversed = new int[nums.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i]= nums[nums.length-1-i];
        }
        nums = reversed;
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(nums[i]+" ");  
        }System.out.println();
    }

    
}
