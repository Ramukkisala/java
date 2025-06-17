import java.util.*;
public class tabulation {
    public static void main(String[] args) {
        int n=5;
        int[] Memo=new int[n+1];
        Memo[1]=1;
        for(int i=2;i<Memo.length;i++){
            Memo[i]=Memo[i-1]+Memo[i-2];
        }
        System.out.println(Memo[n]);
    }
}
