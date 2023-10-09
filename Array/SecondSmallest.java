import java.util.*;
public class SecondSmallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=999999;
        int secsmallest=999999;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            else if(arr[i]<secsmallest && arr[i]!=smallest){
                secsmallest=arr[i];
            }
        }
        System.out.println("Second Smallest Element: "+secsmallest);
    }
}