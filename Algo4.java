public class Algo4 {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50};
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i]= nums[nums.length-1-i];
            nums[nums.length-1-i] = num;
            if (i==2){
                break;
            }  
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]+" ");     
        }
        System.out.println();
    }
}
