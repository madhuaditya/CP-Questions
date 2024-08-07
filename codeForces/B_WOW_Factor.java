import java.util.Scanner;

public class B_WOW_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while(tc-- >0){
        // code here
        String str = sc.next();
        int n = str.length();
        int[] front = new int [str.length() ];
        int[] backe = new int [str.length() ];

        front[0]=0;
        backe[n-1] =0;
        int count =0;
        for(int i =1 ; i<n ; i++){
            if(str.charAt(i) == 'v' && str.charAt(i-1) == 'v'){
                count++;

            }
            front[i]=count;

        }
        count=0;
            for(int i =n-2 ; i>=0 ; i--){
                if(str.charAt(i) == 'v' && str.charAt(i+1) == 'v'){
                    count++;

                }
                backe[i]=count;
            }
            long ans =0;
            for(int i =0 ;i<n ;i++){
                if(str.charAt(i)=='o'){
                    ans+= (long) front[i]* backe[i];
                }
            }
            System.out.println(ans  );


        }
    }
}
