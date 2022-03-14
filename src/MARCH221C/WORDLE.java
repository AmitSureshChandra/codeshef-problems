package MARCH221C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WORDLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<String> ans = new ArrayList<>();
        while(t-- > 0){

            StringBuilder sb = new StringBuilder();
            String s = sc.next();
            String s2 = sc.next();

            for(int i=0; i<5;i++){
                if(s.charAt(i) == s2.charAt(i)){
                    sb.append("G");
                }else{
                    sb.append("B");
                }
            }

            ans.add(sb.toString());

        }

        for(String s: ans){
            System.out.println(s);
        }

    }

}
