

public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int max=Integer.MIN_VALUE;
        int idx=0;
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        System.out.println("idx iss    "+idx);
        int j=0;
        for(int i=idx+1;i<n;i++){
            System.out.println("1st iter    "+nums[i]+"    ");
            arr[j++]=nums[i];
        }
        for(int i=0;i<=idx;i++){
            System.out.println(nums[i]);
            arr[j++]=nums[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i] && arr[0]!=arr[arr.length-1])
                return false;

        }
        return true;

    }
}

