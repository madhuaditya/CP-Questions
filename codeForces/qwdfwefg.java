import java.util.*;
public class qwdfwefg {
    public static class Info implements Comparable<Info>{
        int val;
        int idx;
        Info(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
        public int compareTo(Info info){
            return this.val-info.val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
            int arr[]=new int[n];
            Info arr2[]=new Info[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr2[i]=new Info(i,arr[i]);
            }

        }
    }
}
