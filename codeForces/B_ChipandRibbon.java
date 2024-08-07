import java.util.Scanner;

public class B_ChipandRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int[] arr= new int[n];
        for( int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] result = new int[n];
        int flag =0;
        if(arr[n-1]==0){
            result[n-1]=0;
        }
        else{
            result[n-1]= arr[n-1]-1;
            flag=1;
        }
        for(int i =n-2;i>=0; i--){
            if(flag==0 && arr[i]==0){
                result[i]=0;
                continue;
            }
            if(arr[i]-arr[i+1]<=0){
                flag=1;
                result[i]=0;
            }
            else{
                if(flag==0)
                    result[i]= arr[i]-1;
                else
                result[i]=  arr[i]-arr[i+1];
                flag=1;
            }
        }
        long ans =0;
        for( int i =0; i<n ; i++){
            ans+= result[i];
        }
            System.out.println(ans);

        }
    }
}
/*
5
5
2 2 2 2 2 // 1
5
1 2 4 0 0 // 3
5
1 1 0 0 0 //0
5
1 0 0 0 0 //0
4
1 2 3 4 // 3
 */