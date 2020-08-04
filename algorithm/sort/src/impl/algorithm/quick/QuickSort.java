package impl.algorithm.quick;

import base.algorithm.BaseArraySort;
import util.Utils;

/**
 * 快速排序
 *
 * @author NakarA
 * @since 19:34 30/07/2020
 */
public class QuickSort implements BaseArraySort {

    @Override
    public void sort (int[] sourceArray) {

        int length = sourceArray.length;

        if (length <= 0) {
            return;
        }
        quickSort(sourceArray, 0, length);
    }

    /**
     * 快速排序的递归调用
     *
     * @param sourceArray 待排序的子数组
     * @param left 待排序部分左指针
     * @param right 待排序部分右指针
     */
    public void quickSort (int[] sourceArray, int left, int right) {

        if (left >= right) {                                            // 若源数组为一位或更少时, 无需排序
            return;
        }

        int partition = partition(sourceArray, left, right);            // 调用 partition() 方法返回分割点
        quickSort(sourceArray, left, partition - 1);                        // 对分割点左侧进行排序
        quickSort(sourceArray, partition + 1, right);                        // 对分割点右侧进行排序
    }

    /**
     * 选择一个分割点, 将源数组分为左边元素都比分割点小右边元素都比分割点大的两部分
     * <p>
     * 选择 205 作为分割点
     * 从最右侧开始找到比 205 小的下标, 从左侧开始找到比 205 大的下标
     * <p>
     * 205, <b>234</b>, 53, 234, 66, 765, 756, <b>64</b>, 238
     * <p>
     * 205, |64|, 53, 234, 66, 765, 756, |234|, 238  // 交换234, 64
     * <p>
     * 205, 64, 53, <b>234</b>, <b>66</b>, 765, 756, 234, 238
     * <p>
     * 205, 64, 53, |66|, |234|, 765, 756, 234, 238
     *
     * @param sourceArray 源数组
     * @param left 左指针
     * @param right 右指针
     *
     * @return 分割点下标
     */
    public int partition (int[] sourceArray, int left, int right) {

        int target = sourceArray[left];                                 // 此处可选择下标为 left 的数作为分割点
        int targetIndex = left;                                         // 记录分割点的下标

        while (left < right) {                                          // 当左右指针相遇时停止扫描
            while (left < right && sourceArray[--right] > target) ;     // 右侧指针先移动到最右边第一位, 比较该处数字与 target
            while (left < right && sourceArray[++left] < target) ;      // 找到右侧交换位置后, 左侧同理
            Utils.swap(sourceArray, left, right);                       // 交换该位置上的数
        }

        /* 由于此处选择的分割数处于最左侧, 因此我们需要先从右侧开始扫描, 因此当扫描到最后指针相遇时, 相遇处的数比分割点小*/
        Utils.swap(sourceArray, targetIndex, left);                     // 因此最终我们需要交换分割点与相遇处的数
        return left;
    }
}
