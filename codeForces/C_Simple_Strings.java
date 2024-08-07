import java.util.Scanner;

public class C_Simple_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int n = str.length();
//
//        boolean[] chnge= new boolean[n];
//        StringBuilder sb = new StringBuilder("");
//        sb.append(str.charAt(0));
//        int count =1;
//        int ans =0;
//
//        for( int i=1;i<n; i++){
//            if(str.charAt(i-1)== str.charAt(i) && !chnge[i-1]){
//                chnge[i]=true;
//
//                count++;
//                if(i==n-1){
//                    if(str.charAt(i)=='z')
//                        sb.append('x');
//                    else
//
//                      sb.append( ((char)(1+str.charAt(i))));
//                }
//                else{
//                   if(str.charAt(i)== str.charAt(i+1) && str.charAt(i+1)!='z'){
//                      sb.append( ((char)(str.charAt(i)+1) ));
//                   }
////                   else str= str.substring(0,i)+ str.charAt(i)+1 ==str.charAt(i)? str.charAt(i)+2: str.
//                    else {
//                        if(str.charAt(i+1)=='z'){
//                            if(str.charAt(i)!='x')
//                            sb.append( 'x');
//                             else {
//                               sb.append( 'y');
//                            }
//
//                        }
//                        else if(str.charAt(i)=='z'){
//                            if(str.charAt(i+1)=='x'){
//                              sb.append( 'y');
//                            }
//                            else{
//                                sb.append('x');
//                            }
//                        }
//                        else {
//                            if((char)(str.charAt(i)+1) == str.charAt(i+1))
//                             sb.append(((char)(str.charAt(i)+2)) );
//                            else sb.append(  ((char)(str.charAt(i)+1)));
//                        }
//                   }
//                }
//
//            }
//            else {
//                sb.append(str.charAt(i));
//                ans+= count/2;
//                count=1;
//            }
//
//        }
////        System.out.println(ans);
//        System.out.println(sb);
        String s = sc.next();
        StringBuilder ans=  new StringBuilder();
        for(int i=0;i<s.length();){
            int j;
            for(j=i;j<s.length() && s.charAt(i)==s.charAt(j); j++);
            char c = 'a';
            while(c==s.charAt(i) || (j<s.length() && c==s.charAt(j)))c++;
            for(int k=i;k<j;k++){
                if((k-i)%2!=0)ans.append(c);
                else ans.append(s.charAt(k));
            }
            i=j;
        }
        System.out.println(ans);

    }
}
