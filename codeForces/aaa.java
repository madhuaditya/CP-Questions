public class aaa {
    public static void main(String[] args) {
//        HashMap<Integer, ArrayList<Integer>> map= new HashMap<>(    );
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        for (int ele : list){
//            System.out.println(ele);
//        }
//        long x = Long.MAX_VALUE;
//        for(int i = 63; i>=0; i--){
//            if((x&(1l<<i))!=0) System.out.print("1");
//            else System.out.print("0");}

        long startTime = System.nanoTime();
       int tc= 100;
       while (tc--> 0){
           int n = 200000;
           for(int i=0; i<n ; i++){
               for (int j =1; j<n; j++){
//                   for(int k=0; k<n ; k++){
//                       for (int k =1; k<n; k*=2){
//                           int a= 2*2;
//                       }
//                   }
                   int a= 2*2;
               }
           }

       }

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("xxx", 5));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);


    }
}
