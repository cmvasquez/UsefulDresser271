import java.util.Arrays;

public class SortingTools {

    /*
     * Write a method that accepts two arrays and returns
     * an array with the elements of both arrays merged in it.
     * Assume that input arrays are sorted (ascending), and
     * ensure that the output array is also sorted.
     *
     * Eg input
     *      a = [5, 1]
     *      b = [3, 7]
     *      c = [3, 5, 7, 10]
     *
     *      Initialize c __3__ ____ ____ ____
     *
     *      if a[0] < b[0]
     *          c[0] = a[0] -- eliminate a[0] from further consideration
     *      else
     *          c[0] = b[0] -- eliminate b[0] from further consideration
     */

    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        // Array cursors (NOT POINTERS)
        int cursorA = 0;
        int cursorB = 0;
        int cursorC = 0;
        // As long as both arrays have elements to consider
        while (cursorA < a.length && cursorB < b.length) {
            if (a[cursorA] < b[cursorB]) {
                c[cursorC++] = a[cursorA++];
                // you can increment the array cursor inside the index
            } else {
                c[cursorC++] = b[cursorB++];
                // you can increment the array cursor inside the index
            }
        }
            // In case array a still has elements
            while (cursorA <a.length) {
                c[cursorC++] = a[cursorA++];
            }
            // In case array b still has elements
            while (cursorB <b.length) {
                c[cursorC++] = b[cursorB++];
            }
        return c;
    } // method merge

    public static void main(String[] args) {
        int[] foo = {0, 2, 4, 6};
        int[] bar = {1, 3, 5, 7};
        int[] test= merge(foo, bar);
        System.out.println(Arrays.toString(test));
    }
}
