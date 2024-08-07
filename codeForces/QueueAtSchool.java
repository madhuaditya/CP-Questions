import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int sec = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
//        if()
      char[] chs = str.toCharArray();
       /*
        for ( int i = len-1; i>=0; i--) {

            if (chs[i] == 'B') {
                int ptr = i;
                for (int j = 0; j < sec; j++){
                    if(ptr == len-1 || chs[ptr+1]== 'B')
                        break;
                    else {
                        chs[ptr + 1] = 'B';
                        chs[ptr] = 'G';
                        ptr++;
                    }
                }
            }
        }

     */
        for(int i =0; i< sec;i++){
            for (int j = 0;j< len-1 ; ){
                if (chs[j] == 'B' && chs[j+1]== 'G') {
                    chs[j ]= 'G';
                    chs[j+1]= 'B';
                    j = j+2;
                }
                else
                    j++;
            }
        }
        for (char ch: chs
             ) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
