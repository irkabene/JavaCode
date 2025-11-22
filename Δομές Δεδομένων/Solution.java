//First Assignment/ Data Stractures

//2nd exercise
public class Solution {
    public int mySqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int left = 1;
        int right = n;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= n / mid) {  // Equivalent to mid * mid <= n but avoids overflow
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         
        Solution sol = new Solution();
        System.out.println(sol.mySqrt(8));  // Output: 2
        System.out.println(sol.mySqrt(16)); // Output: 4
    }
}
