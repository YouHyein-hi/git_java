import java.util.Scanner;
// 단계별로 풀어보기_for문_7단계:A+B -7
public class no_11021 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num, x, y;

        num = s.nextInt();
        for(int i = 1; i <= num; i++){
            x = s.nextInt();
            y = s.nextInt();
            System.out.println("Case #" + i + ": " + (x+y));
        }
    }
}
