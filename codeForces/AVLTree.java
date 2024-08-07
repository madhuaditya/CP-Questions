import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AVLTree {
    static class Node {
        int height ;
        int data;
        Node left ;
        Node right;
        public Node(int data )
        {
            this.data= data ;
            this.height = 1;
            this.left= null;
            this.right = null;

        }
    }
    static class AVL{
        // utility  function for calculating height
        int height(Node root){
            if (root== null)
                return 0;
            int lh = height(root.left);
            int rh   = height(root.right);
            return Math.max(lh, rh)+1;
        }
        // get max value by given two value;
        int max(int a , int b){
            return a>b? a:b;
        }

        // rotate left left
        Node llRotation(Node a){
            if (a== null)
                return a;
            Node b = a.right;
            Node t= b.left;
            // rotate
            b.left= a;
            a.right = t;
            // cal height
            a.height= max(height(a.left), height(a.right))+1;
            b.height= max(height(b.left), height(b.right))+1;

            return b;
        }
        Node rrRotation (Node a){
            if (a== null)
                return a;
            Node b = a.left;
            Node t= b.right;
            // rotate
            b.right= a;
            a.left = t;
            // cal height
            a.height= max(height(a.left), height(a.right))+1;
            b.height= max(height(b.left), height(b.right))+1;
            return b;
        }
        // calculate balance factor

        int getBalance(Node root){
            if(root== null){
                return 0;
            }
            int l = height(root.left);
            int r = height(root.right);
            return l-r;
        }
        Node insert(Node root, int data){
            if(root == null)
                return new Node(data);
             if(data>root.data)
                 root.right = insert(root.right,data    );
             else if (data<root.data)
                 root.left = insert(root.left, data );
             else {
                 return root;
             }
             root.height = max(height(root.right), height(root.left))+1;
             int bal = getBalance(root);

             if (bal>1 && data<root.left.data)
                 return rrRotation(root);
             if (bal<-1 && data>root.right.data)
                 return llRotation(root);
             if (bal>1 && data>root.left.data){
                 root.left= llRotation(root.left);
             return rrRotation(root);}
             if(bal<-1&& data<root.right.data){
                 root.right = rrRotation(root.right);
             return llRotation(root);
             }
             return root;
        }
         void preorder(Node root){
            if (root== null)
                return;

            preorder(root.left);
             System.out.print(root.data+" ");
            preorder(root.right);
        }
         void levelOrder(Node root)
        {
            if (root== null){
                System.out.println("null");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node node = q.remove();
                if(node == null){
                    System.out.println();
                    if(q.isEmpty())
                        break;else q.add(null);
                }
                else{
                    System.out.print(node.data+" " );
                    if(node.left!= null)
                        q.add(node.left);
                    if(node.right!= null)
                        q.add(node.right);
                }
            }
        }
        Node inoderSuccessor(Node root ){
            if(root == null)
                return null;
            Node temp = root;
            while (temp.left!=null){
                temp = temp.left;
            }
            return temp;
        }
        Node deleteAVL(Node root , int data){
            if (root == null)
            return null;
            if(root.data == data){
                // for leaf Node
                if(root.left==null&& root.right == null)
                    return null;
                // one child Node

                if (root.left==null)
                    return root.right;
                if (root.right== null)
                    return root.left;
                // two child Node
                Node temp = inoderSuccessor(root.right);
                root.data= temp.data;
                // delete inorder successor
                root.right= deleteAVL(root.right, temp.data);
                return root;
            }
           else if(data<root.data)
               root.left= deleteAVL(root.left, data);
           else
               root.right= deleteAVL(root.right, data);
           if (root==null)return root;
            root.height= max(height(root.left), height(root.right))+1;
            int bal = getBalance(root);

            if (bal>1 &&  getBalance(root.left) >= 0)
                return rrRotation(root);
            if (bal<-1 && getBalance(root.right) <= 0)
                return llRotation(root);
            if (bal>1 && getBalance(root.left) < 0){
                root.left= llRotation(root.left);
                return rrRotation(root);}
            if(bal<-1&& getBalance(root.right) > 0){
                root.right = rrRotation(root.right);
                return llRotation(root);
            }
                return root;
        }
        public boolean isBST(Node root , Node min , Node max){ // a, 83
            if (root== null)
                return true;
            if (min!=null&& root.data<= min.data)
                return false;
            else if (max!= null && root.data>= max.data)
                return false;

            return isBST(root.left, min, root)&& isBST(root.right, root, max);}
    }
    public static void main(String[] args) {
        AVL t = new AVL();
        int[] arr = {54, 44, 86, 43, 46, 78, 88, 50, 61, 83, 89};
        int[] del = {46, 86, 61, 89, 78, 54, 83, 88};
        Node root = null;
        for (int el : arr) {
            root = t.insert(root, el);
        }
        System.out.println(t.isBST(root, null, null));
        t.preorder(root);
        System.out.println();
        t.levelOrder(root);
        System.out.println();
        for (int ele : del) {
            root = t.deleteAVL(root, ele);
        }

        t.preorder(root);
        System.out.println();
        t.levelOrder(root);
    }

    public static class FollowingtheString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-- > 0)
            {
                int n = sc.nextInt();
                HashMap<Integer , HashMap<Character , Integer>>map = new HashMap<>();
                char ch = 'a';
                StringBuilder sb = new StringBuilder("");
                while(n-- > 0){
                    int a = sc.nextInt();
                    if(a==0){
                        sb.append(ch);
                        ch++;

                    }
                }
            }
        }
    }
}
