package baekJoon;

import java.io.*;
import java.util.Arrays;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input=br.readLine();
        String[] inputs=input.split(" ");
        int x=Integer.parseInt(inputs[0]);
        int y=Integer.parseInt(inputs[1]);
        int[] arr=new int[y-x+1];
        int sqrt= (int) Math.sqrt(y);
        for (int i=2;i<=sqrt;i++){
            for (int j=2;i*j<=y;j++){
                if (i*j>=x){
                    arr[(i*j)-x]=1;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                if (x+i != 1){
                    sb.append(x+i).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
