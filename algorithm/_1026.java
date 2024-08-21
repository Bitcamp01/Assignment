package baekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        int[] arr1=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        Arrays.sort(arr,Comparator.reverseOrder());
        Arrays.sort(arr1);
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i]*arr1[i];
        }
        System.out.println(sum);
    }
}
