import java.util.Scanner;

public class A_SpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        String str1 = "AAA";
        String str2= "BBB";
        StringBuilder sb= new StringBuilder("");
        if(n%2!=0){
            System.out.println("NO");
            continue;
        }
        int flag= 0;
        for( int i =0; i<n/2; i++){
            if(flag==0){
                sb.append(str1);
                flag=1;
            }
            else if(flag==1){
                sb.append(str2);
                flag=0;
            }
        }

            System.out.println("YES");
            System.out.println(sb);
        
        
        }
    }
}
