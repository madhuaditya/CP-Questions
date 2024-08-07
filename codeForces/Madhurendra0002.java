import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Madhurendra0002 {
    static class Node{
        int data;
        int gcd;
        Node left ;
        Node right;
        public Node(int data){
            this.data= data;
            this.gcd=0;
            this.left= null;
            this.right=null;
        }
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here
        Node root = null;
        // int n = inorder.length-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        root=  creat(inorder, preorder, 0 , n-1 , 0, n-1, map);
        return root;
    }
    public static Node creat( int[] in , int pre[], int isi, int iei,int psi ,int pei, HashMap<Integer, Integer> map){
        if(isi>iei|| psi>pei){
            return null;
        }
//        int end = iei;
//        int end2 = pei;
        Node curr = new Node (pre[psi]);
        int ind = map.get(pre[psi]);
        int numsleft = ind- isi;
        curr.left = creat( in , pre, isi, ind-1, psi+1,psi+(numsleft),map);
        curr.right = creat( in , pre, ind+1, iei, pei-(numsleft)+1,pei,map);
        return curr ;
    }
    public static void postorder(Node root){
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static Node treeForm(int[] arr , int n){
//        Node curr = null;
        int i =0;
        for(; i<n;i++){
            if(arr[i]==-1)
                break;
        }
      Node  curr = new Node(i);
        HashMap<Integer, Queue<Integer> > map = new HashMap<>();
        for( int j = 0; j<n;j++){
            if(arr[j]==-1)
                continue;
            if(map.containsKey(arr[j])){
                map.get(arr[j]).add(j);
            }
            else {
                Queue<Integer> q= new LinkedList<>();
                q.add(j);
                map.put(arr[j], q);
            }
        }
      curr = hepler(curr, map)
              ;
        return curr;
    }
    public static Node hepler(Node root,HashMap<Integer, Queue<Integer>> map){
        if(root==null){
            return null;
        }
        if(root.left==null){
            if(map.containsKey(root.data)){
                if(!map.get(root.data).isEmpty()){
                    root.left = new Node(map.get(root.data).remove());
                }
            }
        }
         if(root.right==null){
            if(map.containsKey(root.data)){
                if(!map.get(root.data).isEmpty()){
                    root.right = new Node(map.get(root.data).remove());
                }
            }
        }
      hepler(root.left, map);
      hepler(root.right, map);
      return root;
    }
//    public static Node buildTree()
    public static void main(String[] args) {
//        int inorder[] ={4,2,5,1,6,3,7};
//        int preorder[] ={1, 2, 4,5,3,6,7};
//        Node root = buildTree(inorder, preorder, 7);

       int parent[] = {1, 5, 5, 2, 2, -1, 3};
     Node root=  treeForm(parent, parent.length);
        postorder(root);
    }
}
