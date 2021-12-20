import java.util.Scanner;
// 단계별로 풀어보기_if문_1단계:두 수 비교하기
public class no_1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b) System.out.print(">");
        else if(a<b) System.out.print("<");
        else if(a==b) System.out.print("==");
    }
}
