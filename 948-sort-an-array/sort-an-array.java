class Solution {
    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    // create a function with parameter low,high and find mid
    public void mergeSort(int arr[], int low, int high) {
        // base case when will get single element after devide all that elem size will
        // be equal then return [1]>=[2] both size is equal.then return
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
  // here will do the final merge with two separated array [5,2] [3,1]
    public void merge(int arr[], int low, int mid, int high) {
        // here have to create a new array  to store the values
       int temp[]=new int[arr.length];
        int left = low;            // [ low to mid]
        int right = mid + 1;     //[mid+1 to high]
        int idx=low ;             // idx will use for store value in temp
  // after getting 2 diffent sorted array will merge both and compare and sort accordingly
        while (left <= mid && right <= high) {
            // now will compare with both values [2,5] [1,3]
            if (arr[left] <= arr[right]) {
                temp[idx]= arr[left];
                left++;
                idx++;
            } else {
                temp[idx]= arr[right];
                right++;
                idx++;
            }
        }
  // after placed all values if still ele left in the left  just add into array
        while(left<=mid)
        {
            temp[idx]= arr[left];
            idx++;
            left++;
        }
    // after placed all values if still ele left in the right  just add into array
        while(right<=high)
        {
            temp[idx]= arr[right];
            right++;
            idx++;

        }
        // in the final as we used a extra array to sort . now will remove that array and will place  the values into given array.
        // will do iterate the array and placed in to given aarray in sorted 
        for(int i=low;i<=high;i++)
        {
            // temp[low-low] 0 th position 
            arr[i]=temp[i];
        }

    }
}