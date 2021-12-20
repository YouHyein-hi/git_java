import java.util.Scanner;
// 단계별로 풀어보기_for문_6단계:기찍 N
public class no_2742 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        n = s.nextInt();
        for(int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}