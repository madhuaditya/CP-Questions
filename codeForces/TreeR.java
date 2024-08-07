import java.util.*;
public class TreeR {

        private static class Node{
            int data;
            Node left ;
            Node right;
            private Node (int data){
                this.data= data ;
                this.left = null;
                this.right= null;
            }
        }
        static class BinaryTree{ // a, 65,64, 66
            static int ind =-1;
            public Node formTree(int[] arr){
                ind++;
                if(arr[ind]==-1){
                    return null;
                }
                Node  newNode = new Node(arr[ind]);
                newNode.left = formTree(arr);
                newNode.right = formTree(arr);
                return newNode ;
            }

            public void preOrder(Node root){ // a , 65
                if (root== null)
                    return;
                System.out.print(root.data+" ");
//            preOrder(root.right);
                preOrder(root.left);
                preOrder(root.right);
            }
            public void postOrder(Node root){ // a, 66
                if (root== null){
                    return;
                }
//            postOrder(root.right);
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data +" ");
            }
            public void inOrder(Node root ){ //  a, 66
                if(root== null)
                    return;
                inOrder(root.left);
                System.out.print(root.data+" ");
                inOrder(root.right);
            }
            public void lavalOrder(Node root){
                if(root== null)
                    return;
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);
                while (!q.isEmpty()) {
                    Node node = q.remove();
                    if (node == null) {
                        System.out.println();
                        if (!q.isEmpty())
                            q.add(null);
                        else
                            break;
                    } else {
                        System.out.print(node.data + " ");
                        if (node.left != null)
                            q.add(node.left);
                        if (node.right != null)
                            q.add(node.right);
                    }
                }
            }// a, 67
            public int heightIt(Node root){ // a, 67
                if(root == null)return -1;
                int h =1;
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);
                while (!q.isEmpty()) {
                    Node node = q.remove();
                    if(node== null){
                        if (q.isEmpty())
                            break;
                        else {
                            h++;
                            q.add(null);
                        }
                    }
                    else {
                        if (node.left != null)
                            q.add(node.left);
                        if (node.right != null)
                            q.add(node.right);
                    }
                }
                return h;
            }
            public int heightRe(Node root) { // a, 67
                if (root==null)
                    return 0;
                int lefth = heightRe(root.left);
                int righth = heightRe(root.right);
                return Math.max(lefth, righth)+1;
            }// a, 67
            public int countNode(Node root){
                if(root==null)
                    return 0;
                int leftCount = countNode(root.left);
                int rightCount = countNode(root.right);
                return leftCount+rightCount+1;
            }
            public int diameter(Node root){
                if (root== null){
                    return 0;
                }

                int lmd = diameter(root.left    );
                int rmd = diameter(root.right);
                int di = heightIt(root.right)+heightIt(root.left)+1;
                return Math.max(di, Math.max(lmd,rmd));

            }

            public ArrayList<Integer> preOrderItr(Node root){
                ArrayList<Integer> list = new ArrayList<>(  );
                Stack<Node > s = new Stack<>();
                s.push(root);
                while (!s.isEmpty()){
                    Node node =  s.pop();
                    list.add(node.data);
                    if(node.right!= null)
                        s.push(node.right);
                    if (node.left!= null)
                        s.push(node.left);
                }
                return list;
            }

            public ArrayList<Integer> inOrderItr(Node root){ // a, 69
                if(root==null)
                    return null;
                ArrayList<Integer> list = new ArrayList<>(  );
                Node curr = root;

                Stack<Node> s =new Stack<>();

                while (curr!=null|| s.size()>0){
                    if(curr!= null){
                        s.push(curr);
                        curr= curr.left;
                    }
                    else  {
                        Node node = s.pop();
                        list.add(node.data);
                        curr = node.right;
                    }
                }
//            list.remove(list.size()-1);
                return list;

        /*
            Node cur = root;
        while (cur != null) {
            if (cur.left == null) {
                System.out.print(cur.data + " ");
                cur = cur.right;
            }
            else {
                Node temp = cur.left;
                while (temp.right != null
                       && temp.right != cur)
                    temp = temp.right;

                if (temp.right == null) {
                    temp.right = cur;
                    cur = cur.left;
                }
                else {
                    temp.right = null;
                    System.out.print(cur.data + " ");
                    cur = cur.right;
                }
            }
             */
//            Stack<Node > lefts = new Stack<>();
//            Stack<Node > rights = new Stack<>();
//            lefts.push(root);
//            while (!lefts.isEmpty()|| !rights.isEmpty()){
//                if (!lefts.isEmpty()){
//                    Node node =lefts.pop();
//                    list.add(node.data);
//                    if(node.right!= null)
//                        rights.push(node.right);
//                    if (node.left!= null)
//                        lefts.push(node.left);
//                }
//              else  if (!rights.isEmpty()){
//                    Node node =rights.pop();
//                    list.add(node.data);
//                    if(node.right!= null)
//                        rights.push(node.right);
//                    if (node.left!= null)
//                        lefts.push(node.left);
//                }
//            }
//            return list;

                // morris trevarsal but structure will totaly distroyed

//            while(curr!= null){
//                if(curr.left==null){
//                    list.add(curr.data);
//                    curr= curr.right;
//                }
//                else {
//
//                    Node temp = curr.left;
//                    while(temp.right!=null&&temp.right!=curr){
//                        temp= temp.right;
//                    }
//                    if(temp.right==null){
//                        temp.right= curr;
//                        curr= curr.left;
//                    }
//                    else {
//                        list.add(curr.data);
//                        curr= curr.right;
//                    }
//                }
//            }
//            return list;
            }

            public ArrayList<Integer> postOrderItr(Node root){
                ArrayList<Integer> list = new ArrayList<>();
                Stack<Node> s1 = new Stack<>();

                s1.push(root);
                while(!s1.isEmpty()){

                    Node node= s1.pop();
                    list.add(node.data);
                    if(node.left!= null){
                        s1.push(node.left);
                    }
                    if(node.right!= null){
                        s1.push(node.right);
                    }


                }
                Collections.reverse(list);
                return list;

                // using hashSet...
            }
            static class Pair {
                int height;
                int diameter;
                public Pair(int height, int diameter){
                    this.height= height;
                    this.diameter= diameter;
                }
            }
            public Pair diameterApproach(Node root){
                if (root==null){
                    return new Pair(0,0);
                }
                Pair left = diameterApproach(root.left);
                Pair right = diameterApproach(root.right);
                int dia = Math.max(Math.max(left.diameter, right.diameter), left.height+right.height+1);
                int h = Math.max(left.height, right.height)+1;
                return new Pair(h, dia);
            }

            public  boolean isSubtree(Node root, Node child){ //a, 71

                if(child==null){
                    return true;
                }
                if(root== null){
                    return false;
                }
                if(root.data== child.data){
                    if(checkTree(root, child)) return true;
                }

                return isSubtree(root.left, child)||isSubtree(root.right, child);
            }
            public  boolean checkTree(Node root, Node child){
                if(root==null && child==null) {
                    return true;
                }
                if (root == null || child== null){
                    return false    ;
                } else if (root.data!= child.data) {
                    return false;
                }
                return checkTree(root.left, child.left)&&checkTree(root.right, child.right);

            }
            static class Data{
                Node node ;
                int dis;
                public Data(Node node , int dis){
                    this.node= node;
                    this.dis = dis;
                }
            }
            public ArrayList<Integer> topView(Node root) // a, 72
            {
                // add your code
                ArrayList<Integer> list = new ArrayList<Integer>();
                TreeMap<Integer , Node> map = new TreeMap<>();
                Queue<Data> q = new LinkedList<>();
                q.add(new Data(root, 0));
                while (!q.isEmpty()){
                    Data data = q.remove();
                    if(!map.containsKey(data.dis)){
                        map.put(data.dis, data.node);
                    }
                    if(data.node.left!= null)
                        q.add(new Data(data.node.left, data.dis-1));
                    if(data.node.right!= null)
                        q.add(new Data(data.node.right, data.dis+1));
                }
                for (Integer ele : map.keySet()){
                    list.add(map.get(ele).data);
                }
                return list;
            }

            public void kthLevel(Node root, int level, int k) // a, 73
            {
                if(level==k){
                    System.out.print(root.data+" ");
                    return;
                }
                if(root==null){
                    return;
                }
                kthLevel(root.left, level+1, k);
                kthLevel(root.right, level+1, k);

            }

            int getLevel(Node node, int data)
            {
                // Write your code here
                if(node==null){
                    return 0;
                }
                if(node.data== data)
                    return 1;

                int l = getLevel(node.left, data);
                int r = getLevel(node.right, data);
                if(l!=0|| r!= 0){
                    return Math.max(l, r)+1;
                }
                return 0;
            }
            public Node lca(Node root, Node node1 , Node node2){//a,73
                ArrayList<Node> q1= new ArrayList<>();
                ArrayList<Node> q2= new ArrayList<>();
                pathOf( root, node1,q1);
                pathOf(root, node2,q2);

                if(!q1.isEmpty()&&!q2.isEmpty())
                {
                    int n = Math.min(q1.size(), q2.size());
                    for(int i = 0; i< n;i++)
                    {
                        if(i != n-1){
                            if(q1.get(i+1)!=q2.get(i+1)){
                                return q1.get(i);
                            }
                        }

                    }
                }
                return null;
            }
            public boolean pathOf(Node root, Node data, ArrayList<Node> list){
                if(root== null)
                    return false;

                if (root == data) {
                    list.add(root);
                    return true;
                }
                list.add(root);
                boolean lf = pathOf(root.left, data, list);
                boolean ri = pathOf(root.right, data, list);
                if((lf|| ri)){
                    return true;
                }

                list.remove(list.size()-1);
                return false    ;

            }

            public Node lca(Node root, int n1 , int n2){ // a, 74
                if(root==null|| root.data== n1|| root.data==n2){
                    return root;
                }
                Node left = lca(root.left, n1, n2);
                Node right = lca(root.right, n1, n2);
                if (left==null){
                    return right;
                }
                if (right==null)
                    return left;
                return root;
            }
            public   int findDist(Node root, int node1, int node2) { // a, 74
                // Your code here

                ArrayList<Node> q1= new ArrayList<>();
                ArrayList<Node> q2= new ArrayList<>();
                pathOf( root, node1,q1);
                pathOf(root, node2,q2);
                // lowest ancestor calculate
                int i=0;
                for (; i<  Math.min(q1.size(), q2.size());i++){
                    if(q1.get(i)!=q2.get(i))
                        break;
                }
                i--;

                return (q1.size()-i)+(q2.size()-i);

            }
            public   boolean pathOf(Node root, int data, ArrayList<Node> list){ // a, 74

                if(root== null)
                    return false;

                if (root.data == data) {
                    list.add(root);
                    return true;
                }
                list.add(root);
                boolean lf = pathOf(root.left, data, list);
                boolean ri = pathOf(root.right, data, list);
                if((lf|| ri)){
                    return true;
                }
                list.remove(list.size()-1);
                return false    ;
            }
            public int distance(Node root , int data){
                if(root == null)
                    return -1;
                if(root.data== data)
                    return 0;

                int left = distance(root.left, data);
                int right = distance(root.right, data);
                if(left<0&&right<0){
                    return -1;
                }
                if(left<0)
                    return right+1;
                return left+1;
            }
            public int kthAncestor(Node root , Stack<Node> s, int k , int node){// a ,76
                if(root == null){
                    return -1;
                }
                if(root.data== node ){
                    return 0;
                }
                int left = kthAncestor(root.left, s, k , node);
                int right = kthAncestor(root.right, s, k , node);
                if(left<0&& right< 0){
                    return -1;
                }
                if(left<0){
                    if(right+1==k)
                        s.push(root);
                    return right+1;
                }

                if(left+1==k){
                    s.push(root);
                }
                return left+1;
            }

            public int sum (Node root){
                if(root==null)
                    return 0;
                int leftSum = sum(root.left);
                int rightSum = sum(root.right);
                int data = root.data;
                root.data = leftSum+rightSum;
                return  data+ leftSum+ rightSum;
            }
        }

        public static void main(String[] args) {
            BinaryTree b = new BinaryTree();
////        int[] arr = {1 , 2,4 ,-1, -1, 5,-1, -1, 3, 6, -1, -1, 7, -1, -1};
////        Node root = b.formTree(arr);
////        System.out.println( root.data);
////        b.preOrder(root);
////        System.out.println();
////        b.postOrder(root);
////        System.out.println();
////        b.inOrder(root);
////        System.out.println();
////        b.lavalOrder(root);
////        System.out.println();
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
//        root.left.left.right = new Node(8);
            root.right = new Node(3);
            root.right.left = new Node(6);
            root.right.right= new Node(7);
            System.out.println(b.sum(root));
            b.lavalOrder(root);
        }
    }
/*

          Node root   = new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.right.left= new Node(4);

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.left.left = new Node(7);
        root.right = new Node(3);


         Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right= new Node(7);
 */


