import java.util.Scanner;
// 단계별로 풀어보기_for문_11단계:X보다 작은 수
public class no_10871 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, x;

        n = s.nextInt();
        x = s.nextInt();

        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = s.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(num[i] < x) System.out.print(num[i] + " ");
        }

    }
}
