import java.util.ArrayList;
import java.util.Scanner;

public class F_Yet_Another_Problem_About {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        long count=0;
        for( int i =0; i<n; i++){
            int a = sc.nextInt();
           if(a<i+1) {
                list1.add(a);
                list2.add(i + 1);
            }
        }

        for( int i =0 ; i< list1.size(); i++){
            int t= binary(list2,list1.get(i), i);
            if(t>=0)
                count+=t+1;
        }
            System.out.println(count);


        }
    }
    static  int binary(ArrayList<Integer> list , int a ,int end){
        int s = 0;
        int e = end;
        int ans =-1;
        while (s<= e){
            int mid = s+(e-s)/2;
            if(mid==end && list.get(mid)<a){
                ans = mid;
                break;
            }

            if(mid<list.size()-1 && list.get(mid+1)>=a&&list.get(mid)<a) {
                ans = mid ;
                break;
            }
            if(list.get(mid)<a){
                s = mid+1;
            }
            else
                e = mid-1;
        }
        return ans;
    }
}
