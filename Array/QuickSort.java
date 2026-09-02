import java.util.Arrays;
public class Solution{
public int[] quick_sort(int arr[]){

    //Base case
    if(arr.length<=1){
        return arr;
    }
int pivote = arr[arr.length-1];
int leftarray[]= new int[arr.length-1];
int rightarray[]= new int[arr.length-1];
int leftIndex =0;
int rightIndex=0;
//run loop over array
for(int i=0;i<arr.length-1;i++){
//check condition if arr[i]<pivote the store in left array other wise in right
if(arr[i]<pivote){
    leftarray[leftIndex]= arr[i];
    leftIndex++;
}else{
    rightarray[rightIndex]=arr[i];
    rightIndex++;
}
}

// Create arrays with actual sizes
        leftarray = Arrays.copyOf(leftarray, leftIndex);
        rightarray = Arrays.copyOf(rightarray, rightIndex);
//sort the two array by calling recerssively
int [] leftSort = quick_sort(leftarray);
int [] rightSort = quick_sort(rightarray);

// store result and return
int result[] = new int[arr.length];
int index=0;
for(int j :leftSort){
    result[index++]=j;
}
result[index++] = pivote;
//right
for(int j :rightSort){
    result[index++]=j;
}
   //return array
   return result;
}
// public void sort(int arr[]){
//     int low = 0;
//     int high = arr.length-1;
//     int ans[] = quick_sort(arr,low,high);
// }
    public static void main(String args[]){
        Solution sc = new Solution();
        int arr[] = {7, 2, 9, 4, 1, 5};
        int result[] = sc.quick_sort(arr);
        System.out.println(Arrays.toString(result));
    }
}