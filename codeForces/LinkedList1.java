
import java.math.BigInteger;
import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    class LinkedList1
    {
        Node head;  // head of lisl
        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node)
        {
            if (head == null)
            {
                head = node;
            }
            else
            {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = node;
            }
        }
        /* Function to print linked list */
        void printList()
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            String s = sc.nextLine();
            while(t>0)
            {
                int n = sc.nextInt();
                String s1 = sc.nextLine();
                LinkedList1 llist = new LinkedList1();

                if (n > 0)
                {
                    int a1=sc.nextInt();
                    Node head= new Node(a1);
                    llist.addToTheLast(head);
                }
                for (int i = 1; i < n; i++)
                {
                    int a = sc.nextInt();
                    llist.addToTheLast(new Node(a));
                }
//                System.out.println(new Solution().DecimalValue(llist.head));
                t--;
            }
        }
    }


// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */

    class Solution
    {
        public Node reverse(Node head){
            Node curr=head,pre=null,nex;
            while(curr!=null){
                nex=curr.next;
                curr.next=pre;
                pre=curr;
                curr=nex;
            }
            return pre;
        }
//        static long  mod=(long)Math.pow(10,9)+7;
//        long DecimalValue(Node head)
//        {
//
//
//
//
//            double count = -1 ;
//
//            Node curr = head ;
//            while(curr.next!= null)
//            { count++;
//                curr = curr.next ;
//            }
//            if(count ==-1)
//                return 0;

//            double ans = 0d;
//            Node dumm = head ;
//            while (dumm != null){
//                ans += (dumm.data*Math.pow(2, count))%mod;
//                dumm = dumm.next ;
//                count--;
//
//            }
//
//
//            return (long) ans%mod;
//            Node dumm = head ;
//
//            BigInteger base = BigInteger.valueOf(2);
//            BigInteger exponent = BigInteger.valueOf(count);
//            BigInteger modulo = BigInteger.valueOf(1000000007);
//
//            BigInteger result =BigInteger.valueOf(1000000007);
//            while (dumm != null){
//
//
//
//                //     System.out.println(result);
//                //   ans += (dumm.data*Math.pow(2, count))%mod;
//                result += base.modPow(exponent, modulo);
//                dumm = dumm.next ;
//                exponent--;
//
//            }
//
//
//            return (long)(result);
//        }
    }
//            double ans=0;
////            System.out.println(head.data);
//            double count=0;
//            head=reverse(head);
//            while(head!=null){
////                System.out.println(head.data);
//                ans+=(Math.pow(2,count++)*head.data)%mod;
//                head=head.next;
//            }
//            return (long)ans%mod;

