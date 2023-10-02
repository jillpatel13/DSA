import java.util.*;
public class BubbleSort{
    static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubble_sort(arr);
    }
}