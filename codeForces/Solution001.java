import java.util.HashMap;
import java.util.Map;

class Solution001 {
    public static boolean subarraySum(int[] nums, int k) {
        int running = 0;
        int total = 0;
        
        Map<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            running += nums[i];
            int targetSum = running - k;
            
            if (sumFrequency.containsKey(targetSum)) {
//                total += sumFrequency.get(targetSum);
                return true;
            }
            
            sumFrequency.put(running, sumFrequency.getOrDefault(running, 0) + 1);
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1};
        System.out.println(subarraySum(arr, 9));
    }
}