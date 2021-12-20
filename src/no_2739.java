import java.util.Scanner;
// 단계별로 풀어보기_for문_1단계:구구단
public class no_2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();
        for(int i = 1; i < 10; i++)
            System.out.println(num + " * " + i + " = " + num*i);
    }
}
