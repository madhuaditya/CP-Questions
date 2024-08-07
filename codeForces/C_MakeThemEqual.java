import java.util.*;

public class C_MakeThemEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
            char ch = sc.next().charAt(0);
//            boolean[] bl = new boolean[n];
            char[] chars = sc.next().toCharArray();

//            boolean prime[] = new boolean[n + 1];
//            for (int i = 0; i <= n; i++)
//                prime[i] = true;
//            ArrayList<Integer> list = new ArrayList<>();
//            int count =0;
//            for(int p =2; p*p<= n ; p++){
//                if(prime[p]== true){
//
//                    for (int i = p * p; i <= n; i += p)
//                        prime[i] = false;
//                }
//            }
//            HashMap<Integer, Character> map = new HashMap<>();
//            for( int i =0; i<n; i++){
//                if(chars[i]!=ch){
//                    map.put(i+1, chars[i]);
//                }
//            }
            int count =0;
            ArrayList<Integer> list = new ArrayList<>();
             if(chars[n-1]==ch) {
                 for (int i = 0; i < n - 1; i++) {
                     if (chars[i] != ch) {
                         count++;
                         break;
                     }
                 }
                 System.out.println(count);
                 if(count==0){
                     System.out.println();
                 }else System.out.println(n);
             }
             else {
//                 if(chars[n-1]!=ch) {
//                     for (int i = 2; i < n; i++) {
//                         if (n % i != 0) {
//                             count++;
//                             list.add(i);
//                             break;
//                         }
//                     }
//                 }
//                 System.out.println(count);
//                 if(count==0){
//                     System.out.println();
//                 }
//                 else{
//                     for( int i: list){
//                         System.out.print(i+" ");
//                     }
//                     System.out.println();
//                 }
                 boolean bl = false;
                 for (int i = 2; i < n; i++) {
                     boolean flag = true;
                     for (int j = i - 1; j < n; j += i) {
                         if (chars[j] != ch) {
                             flag = false;
                             break;
                         }
                     }
                     if (flag) {
                         System.out.println(1);
                         System.out.println(i);
                         bl = true;
                         break;
                     }
                 }
                 if (bl) continue;
                 int z = 0;
                 for (int i = 2; i < n; i++) {
                     if (n % i != 0) {
                         z = i;
                         break;
                     }
                 }

                 System.out.println(2);
                 System.out.println(n + " " + z);

             }
             }


//            ArrayList<Integer> list= new ArrayList<>();
//
//            for(int i =2 ; i<=n; i++){
//                if(map.isEmpty()){
//                    break;
//                }
//                boolean flag = false;
//                ArrayList<Integer> ls = new ArrayList<>( map.keySet());
//                for(int ele : ls){
//                    if(ele%i!=0){
//                       flag= true;
//
//                        map.remove(ele);
//                    }
//
//                    if(map.isEmpty())
//                        break;
//                }
//                if(flag){
//                    count++;
//                    list.add(i);
//                }
//            }
//            System.out.println(count);
//            if(list.isEmpty()){
//                System.out.println();
//            }
//            else{
//                for (int ele : list){
//                    System.out.print(ele +" ");
//                }
//                System.out.println();
//            }


        }


    }
