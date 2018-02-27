package bit_manipulation;

public class DrawLine {

    /*
    A monochrome screen is stored as a single array of bytes, allowing eight consecutive pixels to be stored in one byte. The screen has width w, where w is divisible by 8 (that is, no byte will be split across rows). The height of the screen, of course, can be derived from the length of the array and the width. Implement a function that draws a horizontal line from (xl, y) to (x2, y).
SOLUTION
return ( ((x & 0xaaaaaaaa) >>> 1) I ((x & 0x55555555) << 1) );
The method signature should look something like:
drawLine(byte[] screen, int width, int xl, int x2, int y)
     */

    //TODO: Solution

}
