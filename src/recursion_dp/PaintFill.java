package recursion_dp;

public class PaintFill {

    /*
    Implement the "paint  ll" function that one might see on many image editing programs. That is, given a screen (represented by a two-dimensional array of colors), a point, and a new color,  ll in the surrounding area until the color changes from the original color.
     */

    //Time: O(n)
    //Space: O(1)

    void paintFill(int[][] screen, int r, int c, int color) {
        if (screen[r][c] == color) return;
    }

    private void paintFillHelper(int[][] screen, int r, int c, int color, int oldColor) {
        if (r <= 0 || r >= screen.length || c <= 0 || c >= screen[0].length) return;
        if (screen[r][c] == oldColor) {
            screen[r][c] = color;
            paintFillHelper(screen, r - 1, c, color, oldColor);
            paintFillHelper(screen, r, c - 1, color, oldColor);
            paintFillHelper(screen, r + 1, c, color, oldColor);
            paintFillHelper(screen, r, c + 1, color, oldColor);
        }
    }


}
