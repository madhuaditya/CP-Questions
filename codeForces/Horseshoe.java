import java.util.HashSet;
import java.util.Scanner;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int arr[] = new int[4];
        int a =0;
        for (int i =0 ; i<4; i++)
        {
            arr[i]= sc.nextInt();

        }
        HashSet<Integer> bl = new HashSet<>();
        for(int i =0 ; i<4; i++){
            if(!bl.contains(arr[i])){
               bl.add(arr[i]);
                for (int j =i+1; j<4; j++){
                 if(arr[i]== arr[j])
                     a++;
                }
            }

        }
        System.out.println(a);

    }
}
