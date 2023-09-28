import java.util.*;
public class ThreeSum2pointer {
    
    public static void threeSum( int nums[])
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0;i<n-2;i++){

            if(i == 0 || ( i > 0 && nums[i]!= nums[i-1])){
                int target = -nums[i];

                int left = i + 1;
                int right = n-1;
                while (left < right){
                    int sum = nums [left] + nums [right];
                    if(sum == target){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                         ans.add(temp);

                        while( left < right && nums[left] == nums[left + 1]){
                            left++;
                        }

                        while( left < right && nums[right] == nums[right - 1]){
                            right++;
                        }

                        left++;
                        right--;
                    }else if( sum<target)
                    left++;
                    else right--;
                }
            }

        }
        System.out.println(ans);
    
    
    }
        
        public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    
}
