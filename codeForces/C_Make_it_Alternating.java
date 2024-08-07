import java.util.Scanner;

public class C_Make_it_Alternating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            long mod = 998244353;
        char[] arr = sc.next().toCharArray();
        int n = arr.length;
        boolean[] check = new boolean[n ];
        char ch = arr[0]    ;
        check[0]= true;
        for(int i =1; i<n; i++){
            if(arr[i]!=ch){
                check[i] = true;
                ch = arr[i];
            }
        }
        int count =0;
        long ans = 1;
        int value =0;
        for(int i =0; i<n;i++){
            if(check[i]){
                if(count==0){

                }
                else{
                    count+=1;
                    ans = (ans%mod * (count) )%mod;
                    count=0;
                }
            }
            else {
                count++;
                value++;
            }
        }
            if(count==0){

            }
            else{
                count+=1;
                ans = (ans%mod * (count) )%mod;

            }
            ans = (ans %mod * fact(value)%mod)%mod;

            System.out.print(value +" ");
            if(ans==0) System.out.println(1);
            else System.out.println(ans);
        
        }
    }
    static long fact(long n)
    {
        if (n <= 1)
            return 1;
        return (n * fact(n - 1))%998244353;
    }

//    static long nPr(long n, long r)
//    {
//        return fact(n) / fact(n - r);
//    }
}
