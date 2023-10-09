import java.util.*;
public class RemoveDuplicates{
    static int remove(int nums[]){
        if (nums.length == 0) {
            return 0;
        }
        int k = 1; // Initialize the count of unique elements to 1
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // Overwrite the next unique element
                k++;
            }
        }
        return k;
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
        int len=remove(arr);
        System.out.println("After removing duplicates: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}