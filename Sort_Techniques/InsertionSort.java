import java.util.*;
public class InsertionSort{
    static void insertion_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j+1]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        insertion_sort(arr);
    }
}