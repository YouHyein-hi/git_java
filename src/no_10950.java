import java.util.Scanner;
// 단계별로 풀어보기_for문_2단계:A+B -3
public class no_10950 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num, x, y;

        num = s.nextInt();
        for(int i = 0; i < num; i++){
            x = s.nextInt();
            y = s.nextInt();
            System.out.println(x+y);
        }
    }
}
