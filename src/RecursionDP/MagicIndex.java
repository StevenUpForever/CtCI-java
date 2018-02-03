package RecursionDP;

public class MagicIndex {

    public int magicIndex(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > i) return -1;
            if (A[i] == i) return i;
        }
        return -1;
    }

}
