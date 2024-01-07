public class countpairs{
public static void main(String[]args){
    int k=6;
    int[]arr={1,5,7,-1,5};
    getpairs(arr, k);
}
public static void getpairs(int[]arr,int k){
    int count=0;
    for(int i = 0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if((arr[i]+arr[j])==k){
                count ++;
                System.out.println("count of pairs is %d"+count);
            }
        }
      
    }
    
}
}
