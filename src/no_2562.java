import java.util.Scanner;
// 단계별로 풀어보기_1차원 배열 단계_2단계:최댓값
public class no_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[9];
        int count = 0, n;

        for(int i = 0; i < num.length; i++){
            num[i] = s.nextInt();
        }
        n = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > n){
                n = num[i];
                count = i;
            }
        }
        count += 1;
        System.out.println(n);
        System.out.print(count);

    }
}

