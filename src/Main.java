import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < Num; i++) {
            int num = sc.nextInt();

            if(num == 0) {
                sb.append(que.size() == 0 ? 0 : que.poll()).append("\n");
            }
            else {
                que.add(num);
            }
        }

        System.out.print(sb);
    }
}