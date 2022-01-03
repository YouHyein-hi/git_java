import java.util.Scanner;
// 단계별로 풀어보기_while문_1단계:A+B -5
public class no_10952 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=0, b=0;

        while (true){
            a = s.nextInt();
            b = s.nextInt();
            if(a == 0 && b == 0) break;
            System.out.println(a+b);
        }

    }
}
