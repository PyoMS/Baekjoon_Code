package n_1912;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 3�� for�� O(n^3)
// prefix sum ��� O(n^2)
// DP�� �̿��� ��� O(n)
public class Main {

    private static int N;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] D = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        D[0] = arr[0];

        for (int k = 1; k < N; k++) {
            D[k] = Math.max(0, D[k-1]) + arr[k];
        }

        Arrays.sort(D);

        bw.write(sb.append(D[N-1]).toString());
        bw.flush();
    }
    
}