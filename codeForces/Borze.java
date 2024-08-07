import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()==0){
            return;
        }
        StringBuilder sb = new StringBuilder("");
        int ptr =0;
        while (ptr != str.length()){
            if(str.charAt(ptr) =='.')
            {
                sb.append(0);
                ptr++;
            }
            else if(str.charAt(ptr)== '-'){
                ptr++;
                if(str.charAt(ptr)=='.'){
                    sb.append(1);
                }
                else{
                    sb.append(2);
                }
                ptr++;
            }
            else ptr++;
        }
        System.out.println(sb.toString());
    }
}
