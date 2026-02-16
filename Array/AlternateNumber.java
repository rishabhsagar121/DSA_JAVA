public class AlternateNumber {
    public static int[] alternateNumber(int[] nums){
        int n= nums.length;
        int postNum = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                postNum++;
            }
        }
        int negNum = n-postNum;
        int[] postArr = new int[postNum];
        int[] negArr = new int[negNum];
        int index=0,index2=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                postArr[index]=nums[i];
                index++;
            }else{
                negArr[index2]=nums[i];
                index2++;
            }
        }
        
        int in=0,ind =0,in2=0;
        for(int i=0;i<n;i++){
            if(postNum>0){
                nums[ind]=postArr[in];
                in++;
                postNum--;
                ind++;
            }
            if(negNum>0){
                nums[ind]=negArr[in2];
                in2++;
                negNum--;
                ind++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,-1,2,-3,4};
        alternateNumber(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
