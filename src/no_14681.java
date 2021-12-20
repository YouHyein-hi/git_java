import java.util.Scanner;
// 단계별로 풀어보기_if문_4단계:사분면 고르기
public class no_14681 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x , y;

        x = s.nextInt();
        y = s.nextInt();

        if(x > 0 && y > 0) System.out.print("1");
        else if(x < 0 && y > 0) System.out.print("2");
        else if(x < 0 && y < 0) System.out.print("3");
        else if(x > 0 && y < 0) System.out.print("4");
    }
}
