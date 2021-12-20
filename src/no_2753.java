import java.util.Scanner;
// 단계별로 풀어보기_if문_3단계:윤년
public class no_2753 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year;

        year = s.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0))
            System.out.print("1");
        else System.out.print("0");
    }
}
