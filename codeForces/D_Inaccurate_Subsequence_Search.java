
import java.util.*;

public class D_Inaccurate_Subsequence_Search {

    static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            super();
            this.first = first;
            this.second = second;
        }

        public Pair() {
            this.first=null;
            this.second=null;
        }

        public int hashCode() {
            int hashFirst = first != null ? first.hashCode() : 0;
            int hashSecond = second != null ? second.hashCode() : 0;

            return (hashFirst + hashSecond) * hashSecond + hashFirst;
        }

        public boolean equals(Object other) {
            if (other instanceof Pair) {
                Pair otherPair = (Pair) other;
                return
                        ((  this.first == otherPair.first ||
                                ( this.first != null && otherPair.first != null &&
                                        this.first.equals(otherPair.first))) &&
                                (  this.second == otherPair.second ||
                                        ( this.second != null && otherPair.second != null &&
                                                this.second.equals(otherPair.second))) );
            }

            return false;
        }

        public String toString()
        {
            return "(" + first + ", " + second + ")";
        }

        public A getFirst() {
            return first;
        }

        public void setFirst(A first) {
            this.first = first;
        }

        public B getSecond() {
            return second;
        }

        public void setSecond(B second) {
            this.second = second;
        }
    }
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr= new int[n];
        int[] arr2= new int[m];
       foro(arr,0,n);
       foro(arr2,0,m);
      HashMap<Integer,Pair<Integer,Integer>> map = new HashMap<>();
      for( int i =0; i<m; i++){

          if(map.containsKey(arr2[i])){
              map.get(arr2[i]).setFirst(map.get(arr2[i]).first+1);
          }
          else {
              map.put(arr2[i], new Pair<>(0,0));
              map.get(arr2[i]).setFirst(map.get(arr2[i]).first+1);
          }
      }
//            System.out.println(map);
            int sim = 0;
            int ans =0;
            for( int i =0; i<n-m+1; i++){
                if(i==0){
                    for( int j =0;j<m; j++){
                        if(map.containsKey(arr[j])){
                            if(map.get(arr[j]).first<=map.get(arr[j]).second){
                                map.get(arr[j]).setSecond(map.get(arr[j]).second+1);
                            }
                            else{
                                map.get(arr[j]).setSecond(map.get(arr[j]).second+1);
                                sim++;
                            }
                        }
                    }
//                    if(k<= sim){
//                        ans++;
//                    }
                }

                else {
                    if(map.containsKey(arr[i-1])){
                        if(map.get(arr[i-1]).first<map.get(arr[i-1]).second){
                            map.get(arr[i-1]).setSecond(map.get(arr[i-1]).second-1);
                        }else {
                            map.get(arr[i-1]).setSecond(map.get(arr[i-1]).second-1);
                            sim--;
                        }
                    }
                    if(map.containsKey(arr[i+m-1])){
                        if(map.get(arr[i+m-1]).first<=map.get(arr[i+m-1]).second){
                            map.get(arr[i+m-1]).setSecond(map.get(arr[i+m-1]).second+1);
                        }
                        else{
                            map.get(arr[i+m-1]).setSecond(map.get(arr[i+m-1]).second+1);
                            sim++;
                        }
                    }
                }
                if(k<= sim){
                    ans++;
                }

            }

            System.out.println(ans);


        }
    }
    public  static  void foro(int[] arr, int start , int end){
            for( int i =start ; i<end; i++){
                arr[i] = sc.nextInt();
            }
        }
        public static void  fort(int[][] arr, int row , int col ){
            for( int i =0; i<row; i++){
                for (int j =0 ; j<col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
        }
        public  static int max(int m, int n){
            return Math.max(m, n);
        }
        public static int min(int m , int n){
            return Math.min(m,n);
        }
        public  static long max(long m, long n){
            return Math.max(m, n);
        }
        public static long min(long m , long n){
            return Math.min(m,n);
        }



}
/*
int[] map = new int[1000001];
            for( int i =0; i<m; i++){
                int a = sc.nextInt();
               map[a]+=1;
            }
            int[] freq = new int[1000001];
            int sim = 0;
            int ans =0;
            for( int i =0; i<n-m+1; i++){
                if(i==0){
                 for( int j =0;j<m; j++){
                     if(map[arr[j]]>0){
                         if(freq[arr[j]]>=map[arr[j]]){
                             freq[arr[j]]+=1;
                         }
                         else{
                             freq[arr[j]]+=1;
                             sim++;
                         }
                     }
                 }
                 if(k<= sim){
                     ans++;
                 }
                }

                else {
                    if(map[arr[i-1]]>0){
                        if(freq[arr[i-1]]>map[arr[i-1]]){
                            freq[arr[i-1]]-=1;
                        }else {
                            freq[arr[i-1]]-=1;
                            sim--;
                        }
                    }
                    if(map[arr[i+m-1]]>0){
                        if(freq[arr[i+m-1]]>=map[arr[i+m-1]]){
                            freq[arr[i+m-1]]+=1;

                        }
                        else{
                            freq[arr[i+m-1]]+=1;
                            sim++;
                        }
                    }
                    if(k<=sim)ans++;
                }

            }

            System.out.println(ans);
 */
