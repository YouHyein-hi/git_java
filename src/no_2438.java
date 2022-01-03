import java.util.Scanner;
// 단계별로 풀어보기_for문_9단계:별 찍기 -1
public class no_2438 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = -1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
