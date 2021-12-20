import java.util.Scanner;
// 단계별로 풀어보기_for문_5단계:N 찍기
public class no_2741 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        n = s.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}