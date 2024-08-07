import java.util.Scanner;
import java.util.Stack;

public class D_FindtheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- >0){
            int n= sc.nextInt();
            int[] arr = new int[n];
            for( int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();

            }
            int[] resutl = new int[n];
            Stack<Integer> st = new Stack<>();
            for(int i =n-1; i>=0; i--){
                if(st.isEmpty()){
                    st.push(i+1);
                    resutl[i]= i+1;
                    continue;
                }
                while (!st.isEmpty()&& arr[i]==arr[st.peek()-1]) st.pop();
                if(st.isEmpty()){

                    resutl[i]= i+1;
                }
                else{

                    resutl[i]= st.peek();
                }
                st.push(i+1);
            }
            int q = sc.nextInt();
            while (q-- > 0){

                int a = sc.nextInt();
                int b = sc.nextInt();
//                for(int i = b-1; i>=a-1; i--){
//                    if(st.isEmpty()){
//                        st.push(i);
//                    }
//                    else if(arr[st.peek()]!=arr[i]){
//                        st.push(i);
//                    }
//                    if(st.size()==2){
//                        break;
//                    }
//                }
//                if(st.size()==2){
//                    System.out.println((st.pop()+1)+" " + (st.pop()+1));
//                }
//                else{
//                    System.out.println(-1 +" " +-1);
//                }
                if(a==b){
                    System.out.println(-1+" " + -1);
                    continue;
                }
                if((resutl[a-1]==a)){
                    System.out.println(-1+" "+ -1);
                }
                else if(resutl[a-1]<=b){
                    System.out.println(a + " " +resutl[a-1]);
                }
                else  System.out.println(-1+" " + -1);

            }
            System.out.println();
        }
    }
}
