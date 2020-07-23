package impl.selection;

import base.algorithm.BaseArraySort;
import util.Utils;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : BaseArraySort                                                 *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/22 14:24                                                *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description                                                                                                  *
 *      The implementation of the selecting sorting algorithm                                                         *
 *                                                                                                                    *
 *====================================================================================================================*/
public class SelectionSort implements BaseArraySort {

    @Override
    public void sort(int[] sourceArray) {

        // 每次记录首个剩余元素和下标, 向后遍历找到更小的元素及下标并与记录元素和下标交换, 直到找完将两个元素交换, 将最小元素交换到首位
        int len = sourceArray.length;
        int index, target;

        for (int i = 0; i < len; i++) {

            index = i;
            target = sourceArray[i];                                    // 选择每次遍历的起始元素并记录

            for (int j = i; j < len; j++) {
                if (target > sourceArray[j]) {                          // 找到比target更小的目的
                    target = sourceArray[j];                            // 交换
                    index = j;
                }
            }                                                           // 找到最小元素
            Utils.swap(sourceArray, i, index);                          // 将最小元素与起始元素交换位置
        }
    }
}