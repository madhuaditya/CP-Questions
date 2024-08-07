import java.util.*;

public class C_Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
        // code here
        int m = sc.nextInt();
             int n = sc.nextInt();

         int[] arr= new int [n];
            for( int i =0; i<n; i++){
        arr[i] = sc.nextInt();

           }
            int count=0;
            int[] bacheLog = new int[n];
            Arrays.sort(arr);
            for( int i = 0 ; i<n-1; i++){
                bacheLog[i] = (arr[i+1] - arr[i]-1);

            }
            bacheLog[n-1]=(m-arr[n-1])+(arr[0]-1);
            Arrays.sort(bacheLog);
           int bache =0;
           int j =n-1;
           while(j>=0){
               if(count*2>=bacheLog[j]){
                   break;
               }
               int z = bacheLog[j]-count*2;
               if(z<=2){
                   count++;
                   bache+=1;
               }
               else{
                   count+=2;
                   bache+=z-1;
               }
               j--;
           }

            System.out.println(m-bache);
        }
    }
}
/*
//            HashMap<Integer,Integer> map = new HashMap();
//            Arrays.fill(infected, -1);
//            while(!q.isEmpty()){
//                boolean flag = true;
//                Queue nq = q;
//                q= new LinkedList<>();
//                while(!nq.isEmpty()){
//                    int z = (int) nq.poll()  ;
//
//                    if(z==1){
//                        if(map.getOrDefault(m,-1)==-1&& flag){
//                            map.put(m,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(z+1,-1)==-1&& flag){
//                            map.put(z+1,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(m,-1)==-1){
//                            map.put(m,0);
//                            q.add(m);
//                        }
//                        if(map.getOrDefault(z+1,-1)==-1){
//                            map.put(z+1,0);
//                            q.add(z+1);
//                        }
//                    }
//                  else  if(z==m){
//                        if(map.getOrDefault(1,-1)==-1&& flag){
//                            map.put(1,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(z-1,-1)==-1&& flag){
//                            map.put(z-1,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(1,-1)==-1){
//                            map.put(1,0);
//                            q.add(0);
//                        }
//                        if(map.getOrDefault(z-1,-1)==-1){
//                            map.put(z-1,0);
//                            q.add(z-1);
//                        }
//                   }
//                   else{
//                        if(map.getOrDefault(z-1,-1)==-1&& flag){
//                            map.put(z-1,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(z+1,-1)==-1&& flag){
//                            map.put(z+1,1);
//                            flag= false;
//                        }
//                        if(map.getOrDefault(z-1,-1)==-1){
//                            map.put(z-1,0);
//                            q.add(z-1);
//                        }
//                        if(map.getOrDefault(z+1,-1)==-1){
//                            map.put(z+1,0);
//                            q.add(z+1);
//                        }
//                    }
//            }
//
//          }
//            int count=0;
//           for(int ele : map.keySet()){
//               if(map.get(ele)==0) count++;
//           }
 */