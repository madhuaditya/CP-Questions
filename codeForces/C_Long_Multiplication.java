    import java.util.Scanner;

    public class C_Long_Multiplication {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- >0){
            // code here
            String str1= sc.next();
         String str2 = sc.next();
         StringBuilder sb1 = new StringBuilder("");
         StringBuilder sb2 = new StringBuilder("");

         int n = str1.length();
         for( int i =0; i<n ; i++){
             char ch1 = str1.charAt(i);
             char ch2 = str2.charAt(i);
             char f1 =(char)Math.min(ch1, ch2);
             char f2 =(char) Math.max(ch1, ch2);
             if(sb1.compareTo(sb2)>=0){
                 sb1.append(f1);
                 sb2.append(f2);
             }else {
                 sb2.append(f1);
                 sb1.append(f2);
             }

         }
                System.out.println(sb2);
                System.out.println(sb1);


            }

        }
    }
