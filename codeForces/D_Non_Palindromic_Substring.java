import java.util.Scanner;

public class D_Non_Palindromic_Substring {
    static boolean isTwoAlter(String s, int start , int end)
    {
        for (int i = start; i <= end-2; i++)
        {
            if (s.charAt(i) != s.charAt(i + 2))
            {
                return false;
            }
        }

        return true;
    }
    public static boolean isPalindrome(String str)
    {
       StringBuffer rev = new StringBuffer("");
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        if (str.contentEquals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static boolean isPalindrome(int i, int j,
                                       String A)
    {
        // comparing the two pointers
        if (i >= j) {
            return true;
        }

        // comparing the characters on those pointers
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }

        // checking everything again recursively
        return isPalindrome(i + 1, j - 1, A);
    }
    static  boolean isNonPalen(String str , int start , int end , int k ){
        if( k == end- start+1){
            if(isPalindrome(start,end,str)){
                return  false;
            }
            else return true;
        }

        if(k% 2 ==0){
            char ch = str.charAt(start);
            for( int i = start ; i<=end; i++ ){
                if (str.charAt(i)!= ch){
                    return true;
                }
            }
        }
        else {
            if(!isTwoAlter(str,start, end)){
                return true;
            }
            else return false;
        }
        return  false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();

        while (q-- >0){
            long sum =0;
            int start = sc.nextInt();
            int end = sc.nextInt();
            start-=1; ///  index hai ye ;
            end-=1;
            int t = end - start+1;
            for( int i = 2 ; i<=t ; i++){
                if( isNonPalen(str , start, end , i)){
                    sum+= i;
                }

            }


            System.out.println(sum);
        }
        
        
        }
    }
}
/*
6
7 13
qfqfqfq
5 6
2 7
4 7
2 5
4 7
2 7
1 2
3 4
3 6
2 4
6 7
5 6
5 7
15 1
ttttttttttttttt
13 15
2 1
eu
1 2
3 2
ppa
2 3
2 3
4 1
llll
1 3
7 3
mlolwlw
4 5
5 6
5 6
 */