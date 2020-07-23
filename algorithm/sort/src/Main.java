import base.algorithm.BaseArraySort;
import impl.selection.SelectionSort;
import impl.strategy.ImplSortStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        sort algorithm test data
        int[] sourceArray = new int[]{5, 4, 6, 7, 8, 4, 234, 53, 234, 66, 765, 756, 64, 234};

        System.out.println(Arrays.toString(sourceArray));
/**********************************************************************************************************************
 *                                           declaration format                                                       *
 *--------------------------------------------------------------------------------------------------------------------*
 *  BaseArraySort bobbleSort = new BobbleSort(); // new base sort algorithm's implementation algorithm                *
 *  ImplSortStrategy strategy = new ImplSortStrategy(bobbleSort); // new strategy to run sort strategy                *
 *====================================================================================================================*/

        BaseArraySort selectionSort = new SelectionSort();
        ImplSortStrategy strategy = new ImplSortStrategy(selectionSort);

/**********************************************************************************************************************
 *                                          result format                                                             *
 *--------------------------------------------------------------------------------------------------------------------*
 *  use function -- strategy.runSort()                                                                                *
 *====================================================================================================================*/

        strategy.runSort(sourceArray);                                  // reverse sort
        System.out.println(Arrays.toString(sourceArray));               // show sorted array

    }
}
