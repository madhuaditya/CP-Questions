import java.util.Arrays;
import java.util.Scanner;

public class C_MatchingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i =0; i<n ; i++){
            arr1[i]= sc.nextInt();
        }
            for(int i =0; i<n ; i++){
                arr2[i]= sc.nextInt();
            }
        if(k>=minCount(arr1, arr2)&& k<= maxCount(arr1,arr2)){

        }
        else {
            System.out.println("NO");
        }

        }

    }
    static int minCount(int[] arr1, int[] arr2){
        int ans =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int up =0;
        int down=0;
        while (down<arr2.length)
        {
            if(arr1[up]>arr2[down]){
                up++;
                down++;
                ans++;
            }else down++;

        }
        return ans;

    }
    static int maxCount(int[] arr1, int[] arr2){
        int ans =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int down =0;
        int up=0;
        while (down<arr1.length)
        {
            if(arr2[up]>arr1[down]){
                up++;
                down++;
                ans++;
            }else down++;

        }
        return ans;
    }
}
