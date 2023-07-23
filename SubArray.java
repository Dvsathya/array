import java.io.*;
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int s=0,count=0;
        for(int i=0;i<arr.length;s=0,i++) { 
            for ( int j=i;j<arr.length;j++) {
                s+=arr[j];
                if(s<0){
                    count++;
                    
                }
                 
            }
        }
        System.out.println(count);
    
    }
}

