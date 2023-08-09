package Test;

public class MaxCount {

    public static void majorityNumber(int arr[], int n){
        int MaxCountt=0;
        int idx=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0; j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        if(count>MaxCountt){
        MaxCountt=count;
        idx=i;
        }
        }
        if(MaxCountt>n/2){
            System.out.println(arr[idx]);
            System.out.println("Maxcount="+MaxCountt);
        }
        else{
            System.out.println("no majority element");
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,3,3,3,3,4,5,3,2,3,3,3,3,3,4,5,1,5,4,3};
        int n= arr.length;
        majorityNumber(arr, n);
    }
}
