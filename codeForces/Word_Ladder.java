import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Word_Ladder {

    public  static int levels (){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet= new HashSet<>();
        String str[] = {"hot","dot","dog","lot","log","cog"};

        for( String st :str){
            hashSet.add(st);
        }
        String from = sc.next();
        String to = sc.next();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(from,1));
        while (!q.isEmpty()){
             Pair pair =q.remove();
             if(pair.str.equals(to)){
                 return  pair.lavel;
             }
             for( int i =0 ; i<pair.str.length(); i++ ){
                 for( int j =0 ; j<26; j++){
                     String curr = pair.str.substring(0,i)+ (char)(j+'a')+ pair.str.substring(i+1);
                     if(hashSet.contains(curr)){
                         q.add(new Pair(curr, pair.lavel+1));
                         hashSet.remove(curr);
                     }
                 }
             }

        }
        return 0;
    }
    public static void main(String[] args) {

    int a = levels();
        System.out.println(a);

    }
    static class Pair{
        String str ;
        int lavel ;
        Pair(String str , int level){
            this.str = str;
            this.lavel= level;
        }
    }
}
