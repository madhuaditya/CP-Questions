import java.util.*;

public class D_Rudolf_and_the_Ball_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            // code here
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            char[] chars= new char[n];
            for( int  i =0; i<n; i++){
                arr[i]= sc.nextInt();
                chars[i] = sc.next().charAt(0);
            }

            HashMap<Integer, HashSet<Integer>> level = new HashMap<>(   )   ;
            for( int i = 0; i<n; i++){
                level.put(i, new HashSet<>());
            }
            TreeSet<Integer> list = new TreeSet<>();
            ballPosition(arr, chars, 0 ,x,m, list , level );
            System.out.println(list.size());
            for( int i : list){
                System.out.print(i+" ");
            }
            System.out.println();

        }

    }
    static void ballPosition(int[] arr, char[] chars, int ind ,int curr,int log, TreeSet<Integer> list, HashMap<Integer, HashSet<Integer>> level){
        if(ind==arr.length){
            list.add(curr);
            return;
        }
        int a = arr[ind];
        char b = chars[ind];
        if(b=='?'){
            int abhi = curr;
            int fin = curr-a;
            if(fin>=1){
                curr= fin;
            }else{
                curr =log+fin;
            }
            if(!level.get(ind).contains(curr)) {
                level.get(ind).add(curr);
                ballPosition(arr, chars, ind + 1, curr, log, list, level);
            }

            fin = abhi+a;
            if(fin<=log){
                curr = fin;
            }else{

                curr = fin-log;
            }

            if(!level.get(ind).contains(curr)) {
                level.get(ind).add(curr);
                ballPosition(arr, chars, ind + 1, curr, log, list, level);
            }


        }else if (b=='1'){
            int fin = curr-a;
            if(fin>=1){
                curr= fin;
            }else{
                curr =log+fin;
            }
            if(!level.get(ind).contains(curr)) {
                level.get(ind).add(curr);
                ballPosition(arr, chars, ind + 1, curr, log, list, level);
            }


        }
        else{
            int fin = curr+a;
            if(fin<=log){
                curr = fin;
            }else{

                curr = fin-log;
            }
            if(!level.get(ind).contains(curr)) {
                level.get(ind).add(curr);
                ballPosition(arr, chars, ind + 1, curr, log, list, level);
            }

        }
    }
}
/*
    static int  chance(int[] arr , char[] chars, int ind, int curr, TreeSet<Integer> list, int log,  int[][][] dp){
        if( ind==arr.length){
            list.add(curr);

            return curr;
        }

        int a = arr[ind];
        char b = chars[ind];
        if(b=='?'){
            int abhi = curr;
            int fin = curr-a;
            if(fin>=1){
                curr= fin;
            }else{
                curr =log+fin;
            }
//            if(dp[abhi][curr][1]!=0) {
//                list.add(dp[abhi][curr][1]); return curr;
//            }
//            dp[abhi][curr][1]=
            chance(arr, chars, ind+1,curr,list, log, dp);
//            dp[abhi][curr][1]= curr ;
            fin = abhi+a;
            if(fin<=log){
                curr = fin;
            }else{

                curr = fin-log;
            }
//            if(dp[abhi][curr][0]!=0) { list.add(dp[abhi][curr][0]); return curr;}
//            dp[abhi][curr][0] =
            chance(arr, chars, ind+1, curr, list,log,dp);

        }
        else if (b=='1'){
            int abhi = curr;
            int fin = curr-a;
            if(fin>=1){
                curr= fin;
            }else{
                curr =log+fin;
            }
//            if(dp[abhi][curr][1]!=0) {
//                list.add(dp[abhi][curr][1]); return curr;
//            }
//            dp[abhi][curr][1]=
            chance(arr, chars, ind+1,curr,list, log,dp);


        }
        else{
            int abhi= curr;
            int fin = curr+a;
            if(fin<=log){
               curr = fin;
            }else{

                curr = fin-log;
            }
//            if(dp[abhi][curr][0]!=0) { list.add(dp[abhi][curr][0]); return dp[abhi][curr][0];}
//            dp[abhi][curr][0]=dp[abhi][curr][0]=
//                    chance(arr, chars, ind+1, curr, list,log,dp);

        }
        return -1;
    }

//        int[][][] dp = new int[n][n][2];
//            TreeSet<Integer> list = new TreeSet<>();
//             chance(arr, chars,0,x,list,n,dp);
//            System.out.println(list.size());
//            for(Integer i: list){
//                System.out.print(i+" ");
//            }
//            System.out.println();
 */
