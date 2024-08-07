import java.util.*;

public class B_Move_and_Turn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        if(n ==1){
            System.out.println(4);
            return;
        }
        if(n==2){
            System.out.println(4);
            return;
        }
        long ans = 0;
        if(n%2==1){
            int col =1;
            int point = 2;
            for( int i =3; i<=n ; i++){
                if(i%2==1){
                    col++;
                    point++;
                }
            }
            ans= (long) col * point *2;

        }
        else {
            int col = 2;
            int point =2;
            for ( int i =4; i<=n; i++){
                if(i%2==0){
                    col++;
                    point++;
                }
            }
            ans =(long ) col*point;
        }
            System.out.println(ans);

        }
    }


}
/*
 HashSet<ArrayList<Integer>> list = new HashSet<>();

          pair(n,0,0,0 ,list, -1 , new HashMap<Integer, HashSet<ArrayList<Integer>>>());
//            for( Pair pair:list){
//                System.out.println(pair.x+" " + pair.y);
//            }
            System.out.println(list.size());
 static class  Pair{
        int x ;
        int y;
        Pair(int x , int y){
            this.x = x;
            this.y =y ;
        }
    }
 public static void pair(int n , int start , int x , int y, HashSet<ArrayList<Integer>> list , int track,HashMap<Integer, HashSet<ArrayList<Integer>>> level){
        if(!level.containsKey(start))
            level.put(start, new HashSet<>());


        if(start==n){
            ArrayList <Integer> ls = new ArrayList<>();
            ls.add(x);
            ls.add(y);
            list.add(ls);
            return;
        }


        if(track==-1){
         pair(n,start+1,x+1,y,list,1,level);
         pair(n,start+1,x-1,y,list,1,level);
         pair(n,start+1, x,y+1,list,0,level);
         pair(n,start+1, x,y-1,list,0,level);
        }
        else if(track==0){
            ArrayList<Integer> ls1 = new ArrayList<>();
            ArrayList<Integer> ls2 = new ArrayList<>();
            ls1.add(x+1);
            ls1.add(y);
            ls1.add(1);
            ls2.add(x-1);
            ls2.add(y);
            ls2.add(1);
            if(!level.get(start).contains(ls1)){
                level.get(start).add(ls1);
                pair(n,start+1,x+1,y,list,1,level);
            }
            if(!level.get(start).contains(ls2)){
                level.get(start).add(ls2);
                pair(n,start+1,x-1,y,list,1,level);
            }

        }
        else {
            ArrayList<Integer> ls1 = new ArrayList<>();
            ArrayList<Integer> ls2 = new ArrayList<>();
            ls1.add(x);
            ls1.add(y+1);
            ls1.add(0);
            ls2.add(x);
            ls2.add(y-1);
            ls2.add(0);
            if(!level.get(start).contains(ls1)){
                level.get(start).add(ls1);
                pair(n, start+1,x,y+1,list,0,level);
            }
            if(!level.get(start).contains(ls2)){
                level.get(start).add(ls2);
                pair(n, start+1,x,y-1,list,0,level);
            }

        }

    }
 */