package impl.strategy;

import base.algorithm.BaseArraySort;
import base.strategy.BaseSortStrategy;
import util.Utils;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : BaseSortStrategy                                              *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/22 13:20                                                *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description                                                                                                  *
 *      The implementation of the BaseSortStrategy interface                                                          *
 *                                                                                                                    *
 *====================================================================================================================*/
public class ImplSortStrategy implements BaseSortStrategy {

    public BaseArraySort baseArraySort;

    public ImplSortStrategy(BaseArraySort baseArraySort) {
        this.baseArraySort = baseArraySort;
    }

    @Override
    public void runSort(int[] sourceArray) {
        try {
            baseArraySort.sort(sourceArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out bound exceptions This problem maybe come from the sorting algorithm used.");
        }
    }

    @Override
    public void runSort(int[] sourceArray, boolean reverse) {
        if (reverse) {
            runSort(sourceArray);
            Utils.reverse(sourceArray);
        }
    }
}
