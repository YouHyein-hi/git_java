import java.util.Arrays;
import java.util.Scanner;
// 단계별로 풀어보기_1차원 배열 단계_5단계:평균
public class no_1546 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m, n;
        double result = 0;
        n = s.nextInt();
        int num[] = new int[n];
        double div[] = new double[n];

        for(int i = 0; i < num.length; i++){
            num[i] = s.nextInt();
        }
        Arrays.sort(num);
        m = num[n-1];

        for(int i = 0; i < num.length; i++){
            div[i] = (double)num[i] / (double)m * 100;
        }
        for(int i = 0; i < num.length; i++){
            result += div[i];
        }
        result /= n;
        System.out.print(result);
    }
}