import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class B_Box_Fitting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] arr= new int[n];
        int count=0;
        for( int i =0; i<n; i++) arr[i]= sc.nextInt();
//        int[] area = new int[n];
//            Arrays.sort(arr);
//            for( int i =n-1;i>=0; i--){
//                int a = arr[i];
//                for( int j =0; j<n; j++){
//                    if(area[j]+a<=w){
//                        area[j] += a;
//                        break;
//                    }
//                }
//            }
//            int count =0;
//            for( int i =0; i<n; i++){
//                if(area[i] ==0)
//                    break;
//                count++;
//            }
            TreeMap<Integer,Integer> tree = new TreeMap<>(Collections.reverseOrder());
            for( int i =0; i<n; i++){
                tree.put(arr[i], tree.getOrDefault(arr[i],0)+1);
            }
            while(tree.size()>0){
                count++;
                int len = w;
                TreeMap<Integer ,Integer> tr = new TreeMap<>(tree);
                for( int i: tr.keySet()){
                    int frq = tr.get(i);
                    int t = len/i;
                    if(frq>= t){
                        tree.put(i,tree.get(i)-t);
                    }
                    else {
                        t = tree.get(i);
                       tree.put(i,0);
                    }
                    if(tree.get(i)==0) tree.remove(i);
                    if(tree.isEmpty()) break;
                    len-= i*t;
                    if(len==0)
                        break;
                }
            }

            System.out.println(count);

        }
    }
}
