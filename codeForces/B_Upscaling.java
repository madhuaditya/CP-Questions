import java.util.Scanner;

public class B_Upscaling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int n = sc.nextInt();
//            int flag =0;

            String str1 = "##";
            String str2 = "..";
            String first = "";
            String second = "";
            int flag = 0;
           for( int i = 0 ; i<n ; i++){
               if( flag%2 ==0){
                   first+= str1;
                   flag++;
               }
               else {
                   first+= str2;
                   flag++;
               }
           }
           flag=0;

            for( int i = 0 ; i<n ; i++){
                if( flag%2 ==0){
                    second+= str2;
                    flag++;
                }
                else {
                    second+= str1;
                    flag++;
                }
            }

            flag =0;
            for ( int i=0; i<n ; i++){
                if(flag%2 == 0){
                    System.out.println(first);
                    System.out.println(first);
                    flag++;
                }
                else {
                    System.out.println(second);
                    System.out.println(second);
                    flag++;
                }
            }

        }
    }
}
