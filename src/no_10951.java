import java.util.Scanner;
// 단계별로 풀어보기_while문_2단계:A+B -4
public class no_10951 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b;

        while(s.hasNextInt()){
                // hasNextInt()란? 이 Scanner의 다음 토큰이 유효한 int 값인 경우에만 true 값을 낸다.
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a+b);
        }
    }
}
