class Solution {
    /*
     * 1st position
     * nums[i] >= target
     * f f f f t t t t
     * find 1st occ of true
     * 
     * last position
     * nums[i] <= target
     * t t t t f f f f
     * find last occ of true
     */
    // T.C - O(logN), S.C - O(1)
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int ans1 = -1;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check1(nums, mid, target)) {
                ans1 = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }

        }

        if (ans1 == -1 || nums[ans1] != target)
            return new int[] { -1, -1 };

        int ans2 = -1;
        int low2 = 0;
        int high2 = nums.length - 1;
        while (low2 <= high2) {
            int mid = low2 + (high2 - low2) / 2;
            if (check2(nums, mid, target)) {
                ans2 = mid;
                low2 = mid + 1;

            } else {

                high2 = mid - 1;
            }

        }
        return new int[] { ans1, ans2 };

    }

    // this function just to return the index value of targetrujjuu
    public boolean check1(int nums[], int mid, int target) {
        return nums[mid] >= target;

    }

    public boolean check2(int nums[], int mid, int target) {
        return nums[mid] <= target;

    }
}