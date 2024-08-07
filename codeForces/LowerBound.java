import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static int[] firstAndLastPosition(ArrayList<Integer> list, int n, int x) {
        // Write your code here.
        int[] arr = new int[n] ;
        for( int i =0; i< n; i++){
            arr[i] = list.get(i);
        }
        int day =0;
        int  nig = n-1;
        int sec = -1;
        while(day <=nig){

            int eve =  day +(nig-day)/2;
            if(arr[eve]<=x){
                sec = eve;
                day = eve+1;
            }
            else nig = eve-1;
        }

        day =0;
        nig = n-1;
        int fist = n;
        while(day <=nig){

            int eve =  day +(nig-day)/2;
            if(arr[eve]>=x){
                fist = eve;
                nig = eve-1;
            }
            else day = eve+1;
        }



        int res[] = new int[2];

        res[0]= fist==n ? -1:arr[fist];
        res[1]= sec==-1? -1: arr[sec];

        return res;
    }
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int day =0;
        int n  = arr.size();
        int nig = n-1;
        while(day<= nig){
            int eve = day +(nig-day)/2;

            if( eve==0){
                //    if(arr.get(eve)!= arr.get(eve+1)) return arr[0];
                return arr.get(0);

            }
            else   if( eve ==n-1 ){
                return arr.get(n-1);
            }
            else {

                if(arr.get(eve-1)!= arr.get(eve ) && arr.get(eve+1)!= arr.get(eve)){
                    return arr.get(eve);
                }
                else if( arr.get(eve-1)!= arr.get(eve)){
                    int left = nig - eve+1;
                    int right = eve- day;
                    if(left%2!=0){
                        day = eve;
                    }
                    else
                        nig = eve-1;
                }
                else {
                    int left = eve-day+1;
                    int right = nig - eve;
                    if( left %2 !=0){
                        nig = eve;

                    }
                    else day = eve+1;
                }


            }


        }
        return -2;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,4,4,7,8,9,10};
//         int n =10;
//         int ans= lowerBound(arr,n,4);
//        System.out.println(ans);

//        ArrayList<Integer> arr = new ArrayList<>(List.of(1,1,3,4,4));
        int[] arr = {3,3,7,7,10,11,11};
        int ans = singleNonDuplicatet(arr);
        System.out.println(ans );

    }
    public static int singleNonDuplicatet(int[] arr) {
        int day =0;
        int n  = arr.length;
        int nig = n-1;
        if(n == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            //    if(arr.get(eve)!= arr.get(eve+1)) return arr[0];
            return arr[0];

        }
        else   if( arr[n-1]!= arr[n-2] ){
            return arr[n-1];
        }


        while(day<= nig){
            int eve = day +(nig-day)/2;




            if(arr[eve-1]!= arr[eve] && arr[eve+1]!= arr[eve]){
                return arr[eve];
            }
            else if( arr[eve-1]!= arr[eve]){
                int left = nig - eve+1;
                int right = eve- day;
                if(left%2!=0){
                    day = eve;
                }
                else
                    nig = eve-1;
            }
            else {
                int left = eve-day+1;
                int right = nig - eve;
                if( left %2 !=0){
                    nig = eve;

                }
                else day = eve+1;

            }


        }
        return -2;
    }
    public  static  int lowerBound( int[] arr , int n , int x){

        int day =0;
        int  nig = n-1;
        int ans = -1;
        while(day <=nig){

            int eve =  day +(nig-day)/2;
            if(arr[eve]<=x){
                ans = eve;
                day = eve+1;
            }
            else nig = eve-1;
        }
        return ans ;
    }
}
