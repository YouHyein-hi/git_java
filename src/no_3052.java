import java.util.Scanner;
// 단계별로 풀어보기_1차원 배열 단계_4단계:나머지
public class no_3052 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int temp, count = 0;
        int n[] = new int[10];

        for(int i = 0; i < n.length; i++){
            n[i] = s.nextInt()  % 42;;
        }
        for(int i = 0; i < n.length; i++){
            temp = 0;
            for(int j = i+1; j < n.length; j++){
                if(n[i] == n[j]) temp++;
            }
            if(temp == 0) count++;
        }
        System.out.print(count);
    }
}