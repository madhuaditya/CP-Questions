import java.util.Scanner;

public class E_KleverPermutation {
    static class Info {
        int jump ; int rem;
        Info(int jump, int rem){
            this.jump = jump;
            this.rem= rem;
        }
    }
    static Info numberJump(int n , int k ){
        int ans =0;
        int t =1;
        while (t+k<=n){
            ans++;
            t+=k;
        }
       return new Info(ans, n-t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int flag =1;
        int m =0;
       Info info = numberJump(n,k);
       int rem = info.rem;
       int jump = info.jump;
       int z = m;
        for(int i =0 ; i<k ; i++ )
        {
            if(flag ==1){
                for(int j =i; j<n; j+=k){
                    arr[j]= ++m;

                }
            }
            else{
                for(int j =i; j<n; j+=k){
                    arr[j]= m--;
                }
                m+=1;
            }
            if(flag==1){
                if(rem-- >0){
                    m+= jump+1;
                }
                else{
                    m+= jump;
                }
                z = m;
                flag=0;
            }
            else {
                m = z;
                rem--;
                flag = 1;
            }


        }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
    }
}
