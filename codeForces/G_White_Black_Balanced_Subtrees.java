import java.util.ArrayList;
import java.util.HashMap;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class G_White_Black_Balanced_Subtrees {
    static class Node {
        int ind ;
        char color ;
        Node left ;
        Node right ;
        Node (int ind , char col){
            this.ind= ind;
            this.color=col;
            this.right=null;
            this.left= null;
        }
    }
    static class Info {
        int black ; int white;int count ;
        Info (int blacl , int white, int count){
            this.black= blacl;
            this.white = white;
            this.count=count;
        }
    }
    static void creat(Node node , int inx ,int j , char col){
        if (node==null)
            return;
        if(inx == node.ind){
            if(node.left==null){
                node.left= new Node(j,col);
            }
            else {
                node.right= new Node(j,col);

            }
            return;
        }
        creat(node.left,inx,j,col);
        creat(node.right,inx,j,col);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
//        int n = sc.nextInt();
////        int[] arr = new int[n-1];
////        for( int i =0; i<n-1; i++) arr[i] =sc.nextInt();
////        String str = sc.next();
////        Node node = new Node(1,str.charAt(0));
////        int j =2;
////        for( int i =0; i<n-1; i++){
////            creat(node , arr[i],j++, str.charAt(i+1));
////        }
////            System.out.println(subtree(node).count);
//            HashMap<Integer, ArrayList<Integer>> map =new HashMap<>();
//            for( int i =0;i<n-1; i++){
//                int a = sc.nextInt();
//                if( map.containsKey(a)){
//                    map.get(a).add(i+2);
//                }
//                else {
//                    map.put(a, new ArrayList<>());
//                    map.get(a).add(i+2);
//                }
//            }
//            String string = sc.next();
////            System.out.println(map);
//            Info info = subtree(map,string, 1);
//            if(string.charAt(0)=='B'){
//                info.black+=1;
//            }
//            else {
//                info.white+=1;
//                        }
//            if(info.white==info.black)
//                System.out.println(info.count+1);
//            else System.out.println(info.count);
            int n=sc.nextInt();
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                tree.add(temp);
            }

            for(int i=1;i<n;i++)
            {int u=i;
                int v=sc.nextInt()-1;
                tree.get(u).add(v);
                tree.get(v).add(u);
            }
            int whites[] = new int[n];
            int child[] = new int[n];
            String str=sc.next();
            System.out.println( DFS(tree,-1,0,child,whites,str)+" ");
        }
    }
    static Info  subtree(HashMap<Integer, ArrayList<Integer>> map,String str , int root){
        if(!map.containsKey(root)){
           if(str.charAt(root-1)=='W')
               return new Info(0,1,0);
           else return new Info(1,0,0);
        }
//        Info left = subtree(node.left) ;
//        Info right = subtree(node.right) ;
//        int black =0;
//        int whit =0;
//        int count =0;
//        if(node.color == 'B'){
//            black = left.black+ right.black+1;
//            whit = left.white+ right.white;
//            count= left.count+ right.count;
//
//        }
//        else {
//            whit = left.white+right.white+1;
//            black= left.black+right.black;
//            count= left.count+ right.count;
//        }
//        if(black==whit){
//            count+=1;
//        }
//        return new Info(black,whit,count);
     int black =0;
        int white =0;
        int count =0;
        for( int i : map.get(root)){
            Info child = subtree(map,str, i);
//            if(str.charAt(i-1)=='W'){
//                white+= child.white+1;
//                black+= child.black;
//                count+= child.count;
//
//            }
//            else {
                white+= child.white;
                black+= child.black;
                count+= child.count;
                if(map.get(root).size()>1)
                if(str.charAt(root-1)=='W'){
                    if(child.white+1 == child.black) count++;
                }
                else {
                    if(child.black+1==child.white) count++;
                }
//            }
        }
        if(str.charAt(root-1)=='W'){
            white+=1;
        }
        else black+=1;

        if(black == white){
            count+=1;
        }
        return new Info(black,white,count);

    }
    public static int DFS(ArrayList<ArrayList<Integer>> tree,int parent,int cur,int child[],int whites[],String str)
    {
        child[cur]=1;
        if(str.charAt(cur)=='W')whites[cur]++;
        int ans=0;
        for(Integer i: tree.get(cur))
        {
            if(i==parent)continue;
            ans+= DFS(tree,cur,i,child,whites,str);
            child[cur]+=child[i];
            whites[cur]+=whites[i];

        }
        if(whites[cur]*2==child[cur])ans++;

        return ans;



    }

}
