import java.util.ArrayList;
import java.util.Scanner;


public class B_ArrayFix {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        while(tc-- >0){
//        // code here
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for( int i =0; i<n; i++) arr[i]= sc.nextInt();
//
//        int posion =-1;
//        for( int i=n-1; i>=0; i--){
//            if(arr[i]/10==0){
//                posion=i;
//                break;
//            }
//        }
//        if(posion==-1){
//            boolean flag = false    ;
//            for( int i =0; i<n-1; i++){
//                if(arr[i]>arr[i+1]){
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("NO");
//            }
//            else {
//                System.out.println("YES");
//            }
//        }else {
//            boolean bl = false;
//            ArrayList <Integer> list= new ArrayList<>();
//            for( int i =0; i<=posion;i++){
//                int a = arr[i]/10;
//                int b = arr[i]%10;
//                if(a == 0){
//                    list.add(b);
//                }
//                else {
//                    list.add(a);
//                    list.add(b);
//                }
//            }
//            for( int i =0; i<list.size()-1; i++){
//                if(list.get(i)>list.get(i+1)){
//                    bl = true ;
//                    break;
//                }
//            }
//            if( bl){
//                System.out.println("NO");
//            }
//            else{
//                boolean let = false;
//                for( int i = posion+1; i<n-1; i++){
//                    if(arr[i]>arr[i+1]){
//                        let = true;
//                        break;
//                    }
//                }
//                if(!let){
//                    System.out.println("yes");
//                }
//                else{
//                    Stack<Integer> st = new Stack<>();
//                    for(  int i=n-1 ;i>=posion; i--){
//                        if(st.isEmpty()){
//                            st.push(arr[i]);
//                            continue;
//                        }
//                        if(arr[i]<= st.peek()){
//                            st.push(arr[i]);
//                        }
//                        else{
//                            st.push(arr[i]%10);
//                            if(arr[i]/10!=0){
//                                st.push(arr[i]/10);
//                            }
//                        }
//                    }
//                    int min = Integer.MIN_VALUE;
//                    boolean check = false;
//                    while (!st.isEmpty()){
//                        if(min>st.peek()){
//                            check=true;
//                            break;
//                        }
//                      min= st.pop();
//                    }
//                    if(check){
//                        System.out.println("NO");
//                    }
//                    else{
//                        System.out.println("YES");
//                    }
//                }
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int ls[]=new int[n];
            int idx=-1;
            for(int i=0;i<n;i++){
                ls[i]=sc.nextInt();
                if(ls[i]/10==0) idx=i;
                if(i>0&&ls[i-1]>ls[i]) idx=i-1;
            }
            for(int j=0;j<=idx;j++){
                int val=ls[j];
                int val1 = val%10;
                val=val/10;
                if(val!=0){
                    arr.add(val);
                }
                arr.add(val1);
            }
            for(int j=idx+1;j<n;j++){
                arr.add(ls[j]);
            }
//            System.out.println(arr);
            String ans="YES";
            for(int i=1;i<arr.size();i++){
                if(arr.get(i-1)>arr.get(i)){
                    ans="NO";
                    break;
                }
            }
            System.out.println(ans);

        
        
        }
    }
}
