package impl.algorithm.insert;

import base.algorithm.BaseArraySort;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : InsertSort                                                    *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/24 07:00                                                *
 *                                                                                                                    *
 *                                        Last Update : July 24 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description                                                                                                  *
 *      The implementation of insert sorting algorithm                                                                *
 *                                                                                                                    *
 *====================================================================================================================*/
public class InsertSort implements BaseArraySort {

//    类似与扑克牌排法, 维护一个已排序部分, 新拿到一个数组元素, 从后向前在已排序部分寻找合适的位置将元素插入
    @Override
    public void sort(int[] sourceArray) throws ArrayIndexOutOfBoundsException {

        int len = sourceArray.length;                   // 数组长度
        int target;                                     // 要插入的元素
        int p;                                          // 要插入元素的下标
        int swapIndex;                                  // index of target item less than original item

        for (int i = 1; i < len; i++) {                 // 默认 i = 0 处的数组为已排序数组

            swapIndex = 0;                              // 每次开始比较前将插入的位置初始化为 0
            p = i;                                      // 要插入元素的下标为 i

            target = sourceArray[i];                    // 记录拿到的数组元素

            for (int j = i - 1; j >= 0; j--) {          // 从后向前, 比较 target 与数组当前位置的元素
                if (target >= sourceArray[j]) {
                    swapIndex = j + 1;                  // 找到比 target 小的数组元素, 准备将 target 插入至该元素后
                    break;
                }
            }

            while (p > swapIndex) {
                sourceArray[p] = sourceArray[p - 1];    // 后移所有比 target 大的元素, 再将 target 插入到下标为 swapIndex 处
                p--;
            }
            sourceArray[swapIndex] = target;            // 将 target 插入到目标位置
        }
    }
}
