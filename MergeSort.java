import java.util.*;
public class MergeSort{
    static void merge(int arr[],int low,int mid,int high){
        
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;

        //sorting
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                ++left;
            }else{
                temp.add(arr[right]);
                ++right;
            }
        }
        
        //if left half is still left
        while(left<=mid){
            temp.add(arr[left]);
            ++left;
        }

        //if right half is still left
        while(right<=high){
            temp.add(arr[right]);
            ++right;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
    static void merge_sort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(high+low)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
        
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        merge_sort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}