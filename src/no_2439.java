import java.util.Scanner;
// 단계별로 풀어보기_for문_10단계:별 찍기 -2
public class no_2439 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > 0; j--){
                if(i<j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println("");
        }

    }
}
