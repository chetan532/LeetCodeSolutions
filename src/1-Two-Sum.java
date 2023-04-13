import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {

        int[] array = {3,2,4};
        int[] array1 = twoSum(array,6);

        System.out.println(Arrays.toString(array1));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map  = new HashMap();
       
       //Fill HM
       for(int i=0;i<nums.length;i++){
           map.put(nums[i],i);
       }
           
           
       //Searching
        for(int i=0;i<nums.length;i++){ //2 7 11 15  target = 4
           int num = nums[i]; 
           int rem = target - num; 
           if(map.containsKey(rem)){
               int index = map.get(rem);
               if(index==i)continue;
               return new int[]{i,index}; 
           }  
       }
       
       return new int[]{};
   }
}