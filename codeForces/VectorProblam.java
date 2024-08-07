import java.util.Scanner;

public class VectorProblam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =0;
        int y =0;
        int z=0;

        for(int i =0; i <n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            x= x+ a;
            y=y+b;
            z=z+c;
        }

        if(x==0&&y==0&z==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
