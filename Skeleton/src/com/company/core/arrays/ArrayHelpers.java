package Skeleton.src.com.company.core.arrays;

@SuppressWarnings({"ManualArrayCopy", "ExplicitArrayFilling"})
public class ArrayHelpers {

    /**
     * Adds `element` to the end of `source`.
     *
     * @param source  The array to add to
     * @param element The element to add
     * @return A new array, the original array with `element` at the end
     * @author Nikolay Voynov
     */
    public static int[] add(int[] source, int element) {
        int increasedLength = source.length + 1;
        int[] newArr = new int[increasedLength];

        copy(source, newArr, increasedLength);
        newArr[increasedLength - 1] = element;

        return newArr;
    }

    /**
     * Adds `element` at the start of `source`.
     *
     * @param source  The array to add to
     * @param element The element to add
     * @return A new array, the original array with `element` at head position
     * @author Nikolay Voynov
     */
    public static int[] addFirst(int[] source, int element) {
        int increasedLength = source.length + 1;
        int[] newArr = new int[increasedLength];

        copyFrom(source, 0, newArr, 1, source.length);
        newArr[0] = element;

        return newArr;
    }

    /**
     * Adds all `elements` to the end of `source`.
     *
     * @param source  The array to add to
     * @param elements The elements to add
     * @return A new array, the original array with all `elements` at the end
     * @author Nikolay Voynov
     */
    public static int[] addAll(int[] source, int... elements) {
        int increasedLength = source.length + elements.length;

        int[] newArr = new int[increasedLength];

        copy(source, newArr, source.length);
        int index = 0;
        for (int i = source.length; i < newArr.length; i++) {
            newArr[i] = elements[index];
            index++;
        }

        return newArr;
    }

    /**
     * Checks if `source` contains `element`.
     *
     * @param source  The array to check in
     * @param element The elements to check for
     * @return `true` if `source` contains `element`, otherwise, `false`
     * @author Nikolay Voynov
     */
    public static boolean contains(int[] source, int element) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == element) {
                return true;
            }
        }

        return false;
    }

    /**
     * Copies `count` elements from `sourceArray` into `destinationArray`
     *
     * @param sourceArray      The array to copy from
     * @param destinationArray The array to copy to
     * @param count            The number of elements to copy
     * @return `void`
     * @author Nikolay Voynov
     */
    public static void copy(int[] sourceArray, int[] destinationArray, int count) {
        int minLengthCopyArr = Math.min(sourceArray.length, count);

        for (int i = 0; i < minLengthCopyArr; i++) {
            destinationArray[i] = sourceArray[i];
        }
    }

    public static void copyFrom(int[] sourceArray, int sourceStartIndex,
                                int[] destinationArray, int destStartIndex, int count) {

    }
    // Emiliyan Geshkov

    public static void fill(int[] source, int element) {

    }
    // Emiliyan Geshkov

    public static int firstIndexOf(int[] source, int target) {
        return 0;
    }
    // Emiliyan Geshkov

    public static int[] insert(int[] source, int index, int element) {
        return new int[1];
    }
    // Emiliyan Geshkov

    public static boolean isValidIndex(int[] source, int index) {
        return false;
    }
    // Emiliyan Geshkov

    public static int lastIndexOf(int[] source, int target) {
        return 0;
    }
    // Ismail Emin

    public static int[] removeAllOccurrences(int[] source, int element) {
        return new int[1];
    }

    // Ismail Emin
    public static void reverse(int[] arrayToReverse) {
    }
    // Ismail Emin

    public static int[] section(int[] source, int startIndex, int endIndex) {
        return new int[1];
    }
    // Ismail Emin

}
