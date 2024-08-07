import javax.swing.event.InternalFrameEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class madhurendra0003 {
    static class  Node {
        int data;
        Node left ;
        Node right;
        public Node   (int data){
            this.data= data;
            this.left= null;
            this.right = null;
        }
    }
//    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
//        // Your code here
//        // Arrays.sort(arr);
//
//        int left = 0;
//        int right = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        int sum = 0;
//        while (left < n+1) {
//            if (sum == s) {
//                list.add(right + 1 );
//                list.add(left );
//                return list;
//            } else if (sum < s) {
//                sum += arr[left++];
//            } else {
//                while (right != left) {
//                    if (sum == s) {
//                        list.add(right + 1 );
//                        list.add(left );
//                        return list;
//                    } else if (sum > s) {
//                        sum -= arr[right++];
//                    } else
//                        break;
//                }
//            }
//        }
//
//        return null;
//        // for(int i =0; i<n ;i++){
//        //     int sum =
//        //     for(int j =i+1;j<n;j++){
//        //         if(arr[i]+arr[j]==s){
//        //             list.add(i)
//        //         }
//        //     }
//        // }
//    }
 public static void  helper(Node root , ArrayList<Integer> list){
    if(root ==null){
        return;
    }
    helper(root.left, list);
    list.add(root.data);
    helper(root.right, list);
    return ;
}
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        ArrayList<Integer>list = new ArrayList<>();
        helper(root, list);
       Node curr =   convertTree( list , 0, list.size()-1);
       root.left = curr.left;
       root.right= curr.right;
       root.data = curr.data;

    }
    public static Node convertTree( ArrayList<Integer>list, int start , int end){
        if(start > end)
            return null;
        Node root = new Node(list.get(end));
       root.data =  (list.get(end));
        int mid=( start+end)/2;
        root.left = convertTree(list, start, mid-1);
        root.right= convertTree(list, mid, end-1);
        return root;
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {

        Node root = new Node(2);
        root.left = new Node(1);
//        root.left.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(5);
        postOrder(root);
        System.out.println();
         convertToMaxHeapUtil(root);
         postOrder(root);
    }
 /*   public static int isPairPresent(Node root, int t)
    {
        // Write your code here
        if(root==null)
            return 0;
        int left = isPairPresent(root.left , t);
        int right = isPairPresent(root.right, t);

        if(root.left!=null|| root.right!=null){
            if(root.left!=null&&root.right!=null){
                if(((root.data+root.right.data==t)&&(root.data+root.left.data!=t))||((root.data+root.left.data==t)&&(root.data+root.right.data!=t)))
                return left+right+1;
            }
          else  if(root.left==null){
                if(root.data+root.right.data==t)
                    return left+right+1;
            }
            else{
                if(root.data+root.left.data==t)
                    return left+right+1;
            }
        }
        return left+right;
    }

    public static ArrayList<Integer> ExtremeNode(Node root)
    {
        //add code here.
        ArrayList<Integer> list = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int i=1;
        while(!q.isEmpty()){
            Node node = q.remove();
            if(i%2!=0){
                if(q.peek()==null&&node!=null){
                    list.add(node.data);
                }
            }

                if(node==null&& q.peek()!=null){
                    list.add(q.peek().data);
                }

            if(node == null){
                if(q.isEmpty())
                    break ;
                else{
                    i++;
                    q.add(null);
                }
            }
            else{
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
        }
        return list;


    }  */
}
