package recursion_dp;

public class TripleStep {

    /*
    A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.
     */

    public int TripleStep(int n) {
        int res = 0;
        tripStepHelper(n, 0, res);
        return res;
    }

    private void tripStepHelper(int n, int cur, int res) {
        if (cur >= n) {
            res++;
            return;
        }
        for (int i = 1; i <= 3; i++) {
            tripStepHelper(n, cur + i, res);
        }
    }

    private int tripStepHelper2(int n, int cur, int res, int[] arr) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (arr[cur] != -1) return arr[cur];
        for (int i = 1; i <= 3; i++) {
            arr[cur] += tripStepHelper2(n, cur + i, res, arr);
        }
        return arr[cur];
    }

}
