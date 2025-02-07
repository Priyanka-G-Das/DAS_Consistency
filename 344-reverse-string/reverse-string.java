class Solution {
    public void reverseString(char[] s) {
        // using two pointer
        int first = 0;
        int last = s.length - 1;
        Swap(s, first, last);

    }

    public void Swap(char[] arr,int start,int end)
    {
      while (start<end) {
  char temp=arr[start];
  arr[start]=arr[end];
  arr[end]=temp;
  start++;
  end--;
    }
    }
}