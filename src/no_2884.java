import java.util.Scanner;
// 단계별로 풀어보기_if문_5단계:알람 시계
public class no_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = 0;
        int minute = 0;

        hour = s.nextInt();
        minute = s.nextInt();

        minute = minute - 45;
        if(minute < 0){
            minute = 60 + minute;
            hour = hour - 1;
            if(hour < 0){
                hour = 23;
            }
        }

        System.out.print(hour + " " + minute);
    }
}
