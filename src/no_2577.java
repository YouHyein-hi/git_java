import java.util.Scanner;
// 단계별로 풀어보기_1차원 배열 단계_2단계:최댓값
public class no_2577 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, c, mul;
        int num[] = new int[10];

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        mul = a * b * c;

        while(mul > 0){
            num[mul % 10]++;
            mul /= 10;
        }

        for(int i =  0; i < num.length; i++){
            System.out.println(num[i]);
        }

    }
}