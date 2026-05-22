


class Solution {
    public int search(int[] arr, int target) {
       int n = arr.length;
      int st =0;
      int end = n-1;
      
      while(st<=end){
        int mid = st + (end - st)/2;
        if(arr[mid] == target){
            return mid;
            
        }
        else if(arr[mid] <= arr[end]){    // right part is sorted
            if(arr[mid] <=target && arr[end] >= target){      //reality check rhat present or not
                   st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        else if(arr[mid] >= arr[st]){     //left part is sorted
            if(arr[mid] >= target && arr[st] <= target){                              //HAR EK JAGAH LESS THAN = JARUR DO JI
               end = mid -1;
            }
            else{
                st = mid +1;
            }
        }
      }
      return -1;

    }
}




























