class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       // will do in reverse order
       // find the total size which is m+n-1
       int k=m+n-1;
       int i=m-1;
       int j=n-1;
       while(i>=0 && j>=0)
       {
        if(nums1[i]>=nums2[j])
        {
        nums1[k]=nums1[i];
        k--;
        i--;
        }else
        {
            nums1[k]=nums2[j];
            k--;
            j--;
        }
       }
       // this loop will track for remaining left elemtnet and will put into the arr
       while(j>=0)
       {
          nums1[k]=nums2[j];
          k--;
          j--;
       }
       


     
    }
}