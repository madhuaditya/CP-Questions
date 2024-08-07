import java.util.Scanner;

public class B_StoneAgeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        long sum =0;
        for( int i =0; i<n; i++){
            arr[i]= sc.nextInt();
            sum+= arr[i];

        }
        boolean bl = false;
        int sameV = Integer.MAX_VALUE;
        int counter =0;
       int check[][] = new int[n][2];
        while( q-->0){
            int t = sc.nextInt();
            if(t==1){
                int ind = sc.nextInt();
                int x= sc.nextInt();
                if(check[ind-1][0]==counter){
                    if(check[ind-1][1]==0){
                        if(bl){
                            sum= sum-sameV+x;
                            arr[ind-1]=x;
                        }
                        else{
                            sum = sum-arr[ind-1]+x;
                            arr[ind-1]=x;
                        }
                        check[ind-1][1]=1;
                    }
                    else {
                        sum= sum-arr[ind-1]+x;
                        arr[ind-1]=x;

                    }
                }else {
                    check[ind-1][0]=counter;
                    check[ind-1][1]=0;
                    if(check[ind-1][1]==0){
                        if(bl){
                            sum= sum-sameV+x;
                            arr[ind-1]=x;
                        }
                        else{
                            sum = sum-arr[ind-1]+x;
                            arr[ind-1]=x;
                        }
                        check[ind-1][1]=1;
                    }
                }

//                else if(check[ind-1]&&bl){
//                    sum=sum-arr[ind-1]+x;
//                    arr[ind-1]=x;
//                }
//                else{
//                    sum= sum-arr[ind-1]+x;
//                    arr[ind-1]= x;
//                }
            }
            else {
                int x = sc.nextInt();
                sum= ((long) n) *((long) (x));
                bl = true;
                sameV = x;
               counter++;
            }
            System.out.println(sum);
        }



        }
    }
}
