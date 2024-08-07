import java.util.Scanner;

public class C_Left_and_Right_Houses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        String str = sc.next();
        int one =0;
        int zero =0;
        for( int i =0; i<n; i++){
            if(str.charAt(i )== '0') zero++;
            else one++;

        }
        if(one==n|| zero==n){
             if(one== n) {
                 System.out.println(0);
                 continue;
             }
            else {
                 System.out.println(n);
             }
            continue;
        }
        int arrZ[] = new int[n];
        int[] arrO = new  int[n];
        for( int i =0; i<n; i++){
            if(i ==0){
                if(str.charAt(i)=='0'){
                    arrZ[i]+=1;
                }else {
                    arrO[i]+= 1;
                }
            }
            else {
                if (str.charAt(i)=='0'){
                    arrZ[i] = arrZ[i-1]+1;
                    arrO[i]= arrO[i-1];
                }else {
                    arrZ[i] = arrZ[i-1];
                    arrO[i]= arrO[i-1]+1;
                }
            }
        }
        int ans = 0;
        boolean bl = false;
        int min = Integer.MIN_VALUE;
        if((one)>=  (int ) Math.ceil((double)(n)/2)){
//            bl = true;
            min =0;
        }
        for( int i =0; i<(n)/2; i++){
            if(i== n-1){
                continue;
            }
            if(arrZ[i] >= (int ) Math.ceil((double) (i+1)/2) && (one-arrO[i])>=  (int ) Math.ceil((double)(n-i-1)/2) ){
                if(Math.abs((n+1)/2 - (i+1)) <= (Math.abs((n+1)/2 - ans)) ){

                    ans = i+1;
                }
            }
        }

            for( int i =(n)/2; i<n; i++){
                if(i== n-1){
                    if(arrZ[i]>= Math.ceil((double) (i+1)/2)){
                        if(Math.abs((n+1)/2 - (i+1)) <= (Math.abs((n+1)/2 - ans)) ){
//                        if(( Math.abs((n+1)/2 - ans)>= Math.abs((n+1)/2 - min))){
                            if(( Math.abs((n+1)/2 - ans) == Math.abs((n+1)/2 - (i+1)))){
                                ans = Math.min(ans, i+1);
                            }
                            else  ans = i+1 ;
//                        }
//                        ans = i+1;
                            break;
                        }
                    }
                    continue;
                }
                if(arrZ[i] >= (int ) Math.ceil((double) (i+1)/2) && (one-arrO[i])>=  (int ) Math.ceil((double)(n-i-1)/2) ){
                    if(Math.abs((n+1)/2 - (i+1)) <= (Math.abs((n+1)/2 - ans)) ){
//                        if(( Math.abs((n+1)/2 - ans)>= Math.abs((n+1)/2 - min))){
                            if(( Math.abs((n+1)/2 - ans) == Math.abs((n+1)/2 - (i+1)))){
                                ans = Math.min(ans, i+1);
                            }
                            else  ans = i+1 ;
//                        }
//                        ans = i+1;
                        break;
                    }

            }
        }
        if(( Math.abs((n+1)/2 - ans)>= Math.abs((n+1)/2 - min))){
            if(( Math.abs((n+1)/2 - ans) == Math.abs((n+1)/2 - min))){
                ans = Math.min(ans, min);
               }
               else  ans = min ;
            }

            System.out.println(ans);
        }
    }
}
