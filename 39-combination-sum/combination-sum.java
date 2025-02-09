class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res= new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        backtracking(res,current,0,target,candidates);
        return res;
    }
   public void backtracking(List<List<Integer>>res,List<Integer> current, int index,int target,int[] nums)
   {
    // base case
    if(target==0)
    {
        res.add(new ArrayList(current));
    }
    if(target<0){
    return;
    }
    for( int i=index;i<nums.length;i++)
    {
        current.add(nums[i]);
        backtracking(res,current,i,target-nums[i],nums);
        current.remove(current.size()-1);
    }
   }
}