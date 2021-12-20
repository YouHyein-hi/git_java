import java.util.Scanner;
// 단계별로 풀어보기_if문_2단계:시험 성적
public class no_9498 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = 0;

        num = s.nextInt();
        if(100 >= num && num >= 90) System.out.print("A");
        else if(90 > num && num >= 80) System.out.print("B");
        else if(80 > num && num >= 70) System.out.print("C");
        else if(70 > num && num >= 60) System.out.print("D");
        else System.out.print("F");

    }
}
