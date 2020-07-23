package util;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : Utils                                                         *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/22 09:24                                                *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description                                                                                                  *
 *      The tool required to sort the algorithm                                                                       *
 *                                                                                                                    *
 *====================================================================================================================*/
public class Utils {

    /**
     * swap sourceArray's item, one index is leftIndex another is rightIndex
     * @param sourceArray source array
     * @param leftIndex the one index
     * @param rightIndex the other index
     * @throws ArrayIndexOutOfBoundsException when index more than source array's max size will throw exception
     * @author NakarA
     * @since 20/07/22 09:24
     */
    public static void swap (int[] sourceArray, int leftIndex, int rightIndex) throws ArrayIndexOutOfBoundsException {

        int temp = sourceArray[leftIndex];                  // store the numbers which index is leftIndex
        sourceArray[leftIndex] = sourceArray[rightIndex];   // override the leftIndex with the value on the rightIndex
        sourceArray[rightIndex] = temp;                     // give the value on the temp to the rightIndex
    }

    /**
     * reverse source array
     * @param sourceArray An array
     * @author NakarA
     * @since   20/07/22 09:24
     */
    public static void reverse(int[] sourceArray) {

        int len = sourceArray.length;

        for (int i = 0; i < len / 2; i++) {
            swap(sourceArray, i, len - i - 1);
        }

    }
}
