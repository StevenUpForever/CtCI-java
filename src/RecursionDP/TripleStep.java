package RecursionDP;

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

}
