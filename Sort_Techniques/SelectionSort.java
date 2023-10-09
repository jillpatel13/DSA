import java.util.*;
public class SelectionSort{
    static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;++i){
            int min=i;
            for(int j=i+1;j<arr.length;++j){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        selection_sort(arr);
    }
}