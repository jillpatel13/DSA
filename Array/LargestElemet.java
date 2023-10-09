import java.util.*;
public class LargestElemet{
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=i;
        }
        System.out.println(max);
    }
}