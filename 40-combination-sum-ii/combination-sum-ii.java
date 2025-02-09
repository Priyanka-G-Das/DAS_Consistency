class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
       Arrays.sort(candidates);
        backtracking(res, current, candidates, target, 0);
        return res;
    }

    public void backtracking(List<List<Integer>> res, List<Integer> current, int[] nums, int target, int index) {
        if (target == 0) {
            res.add(new ArrayList(current));
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            // as its asked for unique values will check how to get unique values
            if(i>index && nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            backtracking(res, current,nums, target - nums[i],i+1);
            current.remove(current.size() - 1);
        }
    }

}