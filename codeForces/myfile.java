import java.util.*;

public class myfile {
    static long fun_pow(int n,int val){
        long ans=0;
        while(n%val==0){
            ans++;
            n/=val;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            // code here
            int a = sc.nextInt(),b=sc.nextInt(),l=sc.nextInt();
            long ans=0;
            long val1=fun_pow(l,a);
            long val2=fun_pow(l,b);
            long ans2=0;
            for(int i=1;i<=l;i++){
                if(l%i!=0) continue;
                for(int j=0;j<=val1;j++){
                    long fin1=(long)Math.pow(a,j);
                    if(l==i*fin1) ans2++;
                    for(int k=0;k<=val2;k++){
                        long fin2=(long)Math.pow(b,k);
                        if(l==(i*fin1*fin2)) ans++;

                    }
                }
            }
            if(a==b) System.out.println(ans2);
            else System.out.println(ans);
        }
    }
}
