public class nextPermutation {
    public static int[] NextPermutation(int[] nums){
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0,n-1);
            return nums;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[idx]<nums[i]){
                swap(nums,idx,i);
                break;
            }
        }
        reverse(nums, idx+1, n-1);
        return nums;
    }
    public static int[] reverse(int[] nums,int x,int y){
        while(x<y){
            int temp = nums[x];
            nums[x]=nums[y];
            nums[y] = temp;
            x++;
            y--;
        }
        return nums;
    }
    
    public static int[] swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int[] array = NextPermutation(nums);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
