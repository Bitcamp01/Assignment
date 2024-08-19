package baekJoon;

import java.io.*;
import java.util.Arrays;

public class _2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt=Integer.parseInt(br.readLine());
        int[] input=new int[cnt];
        for (int i=0;i<cnt;i++){
            input[i]=Integer.parseInt(br.readLine());
        }
        StringBuilder sb=new StringBuilder();
        int[] output=selectionSort(input);
        Arrays.stream(output).forEach(x->sb.append(x).append("\n"));
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
    public static int[] selectionSort(int[] input){
        int[] output=input.clone();
        for (int i=0;i<input.length-1;i++){
            int idx=i;
            for (int j=i+1;j<input.length;j++){
                if (output[idx]>output[j]){
                    idx=j;
                }
            }
            int tmp=output[i];
            output[i]=output[idx];
            output[idx]=tmp;
        }
        return output;
    }
    public static int[] insertionSort(int[] input){
        int[] output=input.clone();
        for (int i=1;i<input.length-1;i++){
            for (int j=i-1;j>=0;j--){
                if (output[j]>output[i]){

                }
            }
        }
        return output;
    }

}
