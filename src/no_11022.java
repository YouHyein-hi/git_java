import java.util.Scanner;
// 단계별로 풀어보기_for문_9단계:A+B -8
public class no_11022 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num, x, y;

        num = s.nextInt();
        for(int i = 1; i <= num; i++){
            x = s.nextInt();
            y = s.nextInt();
            System.out.println("Case #" + i + ": " + x + " + " + y + " = " + (x+y));
        }
    }
}