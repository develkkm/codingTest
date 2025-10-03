import java.io.*;
import java.util.*;

class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] tmp;
    static int k = 0;
    static int cnt = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        tmp = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr,0,n-1);

        System.out.println(result);
    }

    private static void mergeSort(int[] arr, int left, int right){
        if(left >= right) return;
        if(cnt >= k) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                tmp[idx++] = arr[l++];
            }
            else{
                tmp[idx++] = arr[r++];
            }
        }

        if(l>mid){
            while(r <= right){
                tmp[idx++] = arr[r++];
            }
        }
        else{
            while(l <= mid){
                tmp[idx++] = arr[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = tmp[i];
            cnt++;
            if(cnt == k) result =arr[i];
        }
    }
}