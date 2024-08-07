    import java.util.Scanner;

    public class CodeCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            for(int i =0 ; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch== 'H'|| ch=='Q'|| ch=='9'){
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
//            System.out.println((int) '+');
        }
    }
