package recursion_dp;

public class TripleStep {

    /*
    A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.

     */

    /*
    Time: O(3^n)
    Space: O(n)
     */

    public int TripleStep(int n) {
        int[] res = new int[]{0};
        tripStepHelper(n, 0, res);
        return res[0];
    }

    private void tripStepHelper(int n, int cur, int[] res) {
        if (cur >= n) {
            res[0]++;
            return;
        }
        for (int i = 1; i <= 3; i++) {
            tripStepHelper(n, cur + i, res);
        }
    }

    /*
    DP Solution:
    Recursion是不知道下一步问题的答案，所以尝试所有下一步的可能
    dp是assume知道了当前步骤的答案，是通过前几步推导出来的，dp[i] 表示到i时做多可能的步数，
    当前步数 dp[i] = dp[i-3]+dp[i-2]+dp[i-1]
    所以当寻找前三个答案的时候，如果找到，!=-1直接返回

    Time: O(n)
    Space: O(n)
     */
    private int tripStepHelper2(int n, int[] arr) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (arr[n] != -1) return arr[n];
        for (int i = 1; i <= 3; i++) {
            arr[n] += tripStepHelper2(n - i, arr);
        }
        return arr[n];
    }

}
