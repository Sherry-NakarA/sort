package impl.algorithm.bobble;

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
 *                                         Start Date : 20/07/22 18:10                                                *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description                                                                                                  *
 *      The implementation of the bubbling sorting algorithm                                                          *
 *                                                                                                                    *
 *====================================================================================================================*/
public class BobbleSort implements BaseArraySort {

    @Override
    public void sort(int[] sourceArray) throws ArrayIndexOutOfBoundsException {

        int len = sourceArray.length;

        for (int i = 1; i < len; i++) {                             // 遍历轮数为原数组长度减一

            boolean flag = true;                                    // 已排序标签, 优化排序时间

            for (int j = 0; j < len - i; j++) {                     // 后轮数次的位置已经完成排序, 因此每次只遍历到轮数前
                if (sourceArray[j] > sourceArray[j + 1]) {          // 判断前一项是否大于后一项
                    Utils.swap(sourceArray, j, j + 1);              // 交换前后项
                    flag = false;                                   // 未完成排序标记
                }
            }
            if (flag) break;                                        // 如果本次遍历过程中无任何交换, 则退出并返回结果
        }
    }
}