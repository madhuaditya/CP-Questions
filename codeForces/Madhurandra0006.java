import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Madhurandra0006 {
    static class  Student implements Comparable<Student> {
        int rank; String name;
        public Student(String name, int rank){
            this.rank= rank;
            this.name=name;
        }

        @Override
        public int compareTo(Student s){
            if(this.rank== s.rank){
                return this.name.compareTo(s.name);
            }
            return this.rank- s.rank;
        }
    }

    // min heap
    static class Heap{
        public    ArrayList<Integer> list = new ArrayList<>();
        public  void insert(int data){
            list.add(data);
            int n = list.size()-1;
            int p = (n-1)/2;
            while (n!= 0&& list.get(p)>list.get(n)){
                int temp = list.get(p);
                list.set(p, data);
                list.set(n, temp);
                n =p;
                p= (n-1)/2;
            }
        }
        public int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(0);
        }
        private void heapfy(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int max =i;

            if(left<list.size()&&list.get(max)<list.get(left))
                max= left;
            if(right<list.size()&&list.get(max)<list.get(right))
                max= right;
            if(max!= i){
                int temp = list.get(i);
                list.set(i, list.get(max));
                list.set(max, temp);
                heapfy(max);
            }
        }
        public int delete(){
            int n = list.size();
            if(n ==0){
                return -1;
            }
            if(n == 1|| n ==2){
                return list.remove(0);
            }
            int data = list.get(0);
            list.set(0, list.get(n-1));
            list.set(n-1, data);
            list.remove(n-1);
            heapfy(0);
            return  data;
        }
        // in max heap we can change some inEuility it will convert into max heap...?
        public void heapSort(){
            int n = list.size();
            for(int i =n/2;i>=0; i--){// convert into max heap;
                sortFun(i,n);
            }
            // sort and store in ascending order
            int start =0; int end = n;
            while (start<end){
                int temp = list.get(0);
                list.set(0, list.get(end-1));
                list.set(end-1, temp);
                 sortFun(start,--end);
            }

        }
        private void sortFun(int start, int end){
            int left = 2*start+1;
            int right = 2*start+2;
            int max = start;
            if(left<end&&list.get(max)<list.get(left))
                max= left;
            if(right<end&&list.get(max)<list.get(right))
                max= right;
            if(max!= start){
                int temp = list.get(start);
                list.set(start, list.get(max));
                list.set(max, temp);
                sortFun(max,end);
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int x ;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pair p){
            return (this.x*this.x+this.y*this.y)-(p.x*p.x+p.y*p.y);
        }
    }

    static class Soldier implements Comparable<Soldier>{
        int count ;
        int ind;
        public Soldier(int count, int ind){
            this.count = count;
            this.ind  = ind ;
        }
        public int compareTo(Soldier s){
            if (this.count == s.count){
                return this.ind-s.ind;
            }
            return this.count-s.count;
        }

    }
    static void weakestSolder(int[][] arr, int m, int n, int k){
   PriorityQueue<Soldier> pq= new PriorityQueue<>();
   for(int i =0; i<m;i++){
       int count = 0;
       for(int j =0; j<n;j++){
           if(arr[i][j]==1){
               count++;
           }
       }
       pq.add(new Soldier(count,i));
   }
   for(int i =0; i<k;i++){
       System.out.println("Row Number is "+pq.poll().ind);
   }
    }

//    static class NearSort implements Comparable<NearSort> {
//        int data; int  min; int max;
//        public NearSort  (int data, int min, int max){
//            this.min = min;
//            this.data= data;
//            this.max=max;
//        }
//        @Override
//        public int compareTo(NearSort n){
//            return
//        }
//    }

    public static void main(String[] args) {
//        PriorityQueue<Student> pq = new PriorityQueue<>();
//        pq.add(1);
//        pq.add(2);
//        pq.add(3);
//        pq.add(4);
//        while (!pq.isEmpty()){
//            System.out.println(pq.remove());
//        }
//        pq.add(new Student("ramu", 100  ));
//        pq.add(new Student("akshat", 100));
//        pq.add(new Student("kallu", 400));
//        pq.add(new Student("ghanshya" ,3));
//        while (!pq.isEmpty()){
//            System.out.println(pq.peek().name + " " + pq.peek().rank);
//            pq.remove();
//        }
//   Heap hp = new Heap();
//        hp.insert(1);
//        hp.insert(2);
//        hp.insert(4);
//        hp.insert(5);
//        hp.insert(3);
//        System.out.println(hp.list);
//        hp.heapSort();
//        System.out.println(hp.list);
//        System.out.println(hp.delete());
//        System.out.println(hp.list);
//          PriorityQueue<Pair> p = new PriorityQueue<>();
//           int[][] arr = {{3,3},{5,-1},{-2,4}};
//           for(int i =0; i<arr.length;i++){
//               p.add(new Pair(arr[i][0], arr[i][1]));
//           }
//           for(int i =0;i<2;i++) {
//               System.out.println(p.peek().x + " " + p.poll().y);
//           }

        int[][] soldier = {{1,0,0,0},
                           {1,1,1,1},
                           {1,0,0,0},
                           {1,0,0,0}};
        weakestSolder(soldier, 4,4,2);

    }
}
