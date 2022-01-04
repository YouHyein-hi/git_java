import java.util.Scanner;
import java.util.Arrays;
// 단계별로 풀어보기_1차원 배열 단계_1단계:최소, 최대
public class no_10818 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();
        }

        Arrays.sort(num);

        System.out.print(num[0] + " " + num[n-1]);
    }
}