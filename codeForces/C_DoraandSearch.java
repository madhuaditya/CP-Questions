import java.util.Scanner;

public class C_DoraandSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0;i<n; i++){
            arr[i]= sc.nextInt();
        }
        if(n<4){
            System.out.println(-1);
            continue;
        }
           int min =1;
        int max = n;
        int start =0;
        int end = n-1;
        boolean bl = false;
        while(start<end){
             if(arr[start]!=min && arr[start]!=max && arr[end]!=min && arr[end]!= max){
                 System.out.println((start+1) +" " + (end+1));
                 bl = true;
                 break;
             }
            if((arr[start]==min && arr[end]== max)||(arr[end]==min&&arr[start]==max)){
                start++;end--;
                min++;max--;
            }else if((arr[start]==min || arr[start]== max)){
                if(arr[start]== min){
                    start++;
                    min++;
                }
                else{
                    max--;
                    start++;
                }
            }else if ((arr[end]==min || arr[end]==max)){
                if(arr[end]== min){
                    min++;
                    end--;
                }
                else {
                    max--;
                    end--;
                }
            }

        }
            if(!bl){
                System.out.println(-1);
            }
        
        }
    }
}


/*
 Stack<Integer> s= new Stack<>();
        int[] nextSmall= new int[n];


        for( int i =n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]>arr[i]) s.pop();
            if(s.isEmpty()){
                nextSmall[i]= i;
            }
            else nextSmall[i]= s.peek();
            s.push(i);
        }
        int[] nextBig = new int[n];
        s= new Stack<>();
            for( int i =n-1; i>=0; i--){
                while(!s.isEmpty() && arr[s.peek()]<arr[i]) s.pop();
                if(s.isEmpty()){
                    nextBig[i]= i;
                }
                else nextBig[i]= s.peek();
                s.push(i);
            }
            s= new Stack<>();
            int[] prevSmall = new int[n];
            for( int i =0; i<n ; i++){
                while(!s.isEmpty() && arr[s.peek()]>arr[i]) s.pop();
                if(s.isEmpty()){
                    prevSmall[i] = i;
                }
                else prevSmall[i] = s.peek();
                s.push(i);
            }
        int[] prevBig = new int[n];
            s= new Stack<>();
            for( int i =0; i<n ; i++){
                while(!s.isEmpty() && arr[s.peek()]< arr[i]) s.pop();
                if(s.isEmpty()){
                    prevBig[i] = i;
                }
                else prevBig[i] = s.peek();
                s.push(i);
            }
            int start = -1;
            for(int i=0; i<n ;i++){
                if(nextSmall[i]!=nextBig[i] && nextSmall[i]!=i&& nextBig[i]!=i){
                    start=i;
                    break;
                }
            }
            int end = -1;
            for(int i=n-1; i>=0 ;i--){
                if(prevSmall[i]!=prevBig[i] && prevSmall[i]!=i&& prevBig[i]!=i){
                    end=i;
                    break;
                }
            }
            if(end==-1 || start==-1){
                System.out.println(-1);
            }
            else{
                if(end-start+1<4){
                    System.out.println(-1);
                }else if(nextSmall[start]>end||nextBig[start]>end){
                    System.out.println(-1);
                }
                else if (nextBig[end]<start|| prevSmall[end]<start){
                    System.out.println(-1);
                }

                else System.out.println((start+1) +" " +(end+1));
            }
 */