import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(!next(arr)){
            System.out.println(-1);
            return;
        }

        for(int num : arr){
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }

    private static boolean next(int[] arr){
        int len = arr.length;

        int pivotIdx = len - 1;
        while(pivotIdx > 0 && arr[pivotIdx - 1] > arr[pivotIdx]){
            pivotIdx--;
        }

        if(pivotIdx == 0) return false;

        int swapIdx = len - 1;
        while(arr[swapIdx] < arr[pivotIdx - 1]){
            swapIdx--;
        }

        swap(arr,pivotIdx-1,swapIdx);

        int right = len - 1;
        while(pivotIdx < right){
            swap(arr,pivotIdx++,right--);
        }

        return true;
    }

    private static void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}