import java.util.Arrays;
import java.util.Scanner;

public class A_JellyfishandGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i =0; i<n ; i++){
            arr1[i] = sc.nextInt();
        }
            for (int i = 0; i<m; i++){
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            long ans =0;
            if(k<=2){
                if(k==1){
                    for(int i =1; i<n; i++){
                        ans+= arr1[i];
                    }
                    ans+= Math.max(arr1[0],arr2[m-1]);
                    System.out.println(ans);

                }
                else{
                    if(arr1[0]<arr2[m-1]){
                        int temp =arr1[0];
                        arr1[0]= arr2[m-1];
                        arr2[m-1]= temp;
                        Arrays.sort(arr1);
                        Arrays.sort(arr2);
                    }
                    if(arr2[0]<arr1[n-1]){
                        int temp =arr2[0];
                        arr2[0]= arr1[n-1];
                        arr1[n-1]=temp;
                        Arrays.sort(arr1);
                        Arrays.sort(arr2);
                    }
                    for(int i =0; i<n; i++){
                        ans+= arr1[i];
                    }
                    System.out.println(ans);
                }

            }
            else {
                if(arr1[0]<arr2[m-1]){
                    int temp =arr1[0];
                    arr1[0]= arr2[m-1];
                    arr2[m-1]= temp;
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                }
                if(arr2[0]<arr1[n-1]){
                    int temp =arr2[0];
                    arr2[0]= arr1[n-1];
                    arr1[n-1]=temp;
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
                }
                k-=2;

                if(k%2==0){

                    for(int i =0; i<n; i++){
                        ans+= arr1[i];
                    }
                    System.out.println(ans);
                }
                else{
                    for(int i =1; i<n; i++){
                        ans+= arr1[i];
                    }
                    if(arr1[0]<arr2[m-1]){
                        ans+=arr2[m-1];
                    }else ans+=arr1[0];
                    System.out.println(ans);
                }
            }



        }

    }
}
