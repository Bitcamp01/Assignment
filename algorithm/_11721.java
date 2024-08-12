package baekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        List<String> inputs=new ArrayList<String>();
        int i=0;
        for (i=0;i<(input.length()/10);i++){
            inputs.add(input.substring(i*10,i*10+10));
        }
        inputs.add(input.substring(i*10,input.length()));
        inputs.forEach(System.out::println);
    }
}
