import java.util.Scanner;
// 단계별로 풀어보기_for문_3단계:합
public class no_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, result = 0;

        n = s.nextInt();
        for(int i = 0; i <= n; i++){
            result += i;
        }
        System.out.print(result);
    }
}
