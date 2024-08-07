import java.util.Scanner;

public class B1_Palindrome_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
            int flag=0;
            for( int i =0; i<n; i++){
                if(arr[i]=='0') flag++;
            }
            if(flag%2!=0){
                if(flag==1)
                    System.out.println("BOB");
                else
                 System.out.println("ALICE");
            }
            else{
                System.out.println("BOB");
            }

        }
    }
}

/*
//        int countAlice =0;
//        int countBOB= 0;
        int flag =0;
//        for( int i =0; i<(n+1)/2; i++){
//            if (arr[i] == '0') {
//                if(i==(n-i-1)){
//                    if(flag==0){
//                        countAlice+=1;
//                    }
//                    else{
//                        countBOB+=1;
//                    }
//                    break;
//                }else{
//                    if(flag==0){ flag=1;
//                        countAlice+=2;}
//                    else {
//                        flag=0;
//                        countBOB+=2;
//                    }
//                }
//            }
//        }
//        if(countBOB<countAlice){
//            System.out.println("BOB");
//        }
//        else if(countAlice<countBOB){
//            System.out.println("ALICE");
//        }
//        else System.out.println("DRAW");

 */
