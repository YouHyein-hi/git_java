import java.util.Scanner;
// 단계별로 풀어보기_while문_3단계:더하기 사이클
public class no_1110 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, num, left, right;
        int count = 0;

        n = s.nextInt();
        num = n;

        while(true){
            left = n / 10;
            right = n % 10;
            n = (right * 10) + ((left + right) % 10);
            count++;
            if(n == num){
                break;
            }
        }
        System.out.print(count);
    }
}