import java.util.*;
public class CheckSortedArray{
    static boolean check(int nums[]){
        int f=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                f++;
        }
        if(f==0)
            return true;
        if(f>1)
            return false;
        else if(nums[0]>=nums[nums.length-1])
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean res=check(arr);
        if(res)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}