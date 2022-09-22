import java.util.Arrays;

public class Insertion {
    /*
    j = 3                                   # current position index
    current card value = a[j]               # pull element out of the array
    left of current: i = j-1                # look to the left for a new position
    while a[i] > value of current card      # keep moving left
        a[i+1] = a[1]                       # move a[i] to the right making room
        i = i-1                             # try the previous card
    a[i+1} = value                          # place value at found position
     */
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 0, 2, 4, 2, 6};
        System.out.printf("\nBefore sorting: %s\n", Arrays.toString(a));
        insertionSort(a);
        System.out.printf("\nAfter sorting: %s\n", Arrays.toString(a));
    }

    static void insertionSort(int[] a) {
        for (int j = 1; j < a.length; j++) {
            int value = a[j];               // current card to sort
            int i = j-1;                    // left of j
            while (i > -1 && a[i] > value) {
                a[i+1] = a[i];              // move a[i] one position to the right
                i = i-1;                    // get ready to compare with "next" item in the sorted group
            }
            a[i+1] = value;
        }
    }
}
