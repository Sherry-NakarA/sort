import base.strategy.BaseSortStrategy;
import impl.algorithm.insert.InsertSort;
import impl.algorithm.quick.QuickSort;
import impl.strategy.ImplSortStrategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        sort algorithm test data
        int[] sourceArray = new int[]{205, 234, 53, 277, 66, 765, 756, 64, 238};

        System.out.println("源数组: " + Arrays.toString(sourceArray));

        BaseSortStrategy strategy = new ImplSortStrategy(new QuickSort()); // 传入排序实现类来执行其排序方法

        strategy.runSort(sourceArray);                                      // sort
        System.out.println("由小到大排序的结果: " + Arrays.toString(sourceArray));                   // show sorted array
        strategy.runSort(sourceArray, true);                        // reverse sort
        System.out.println("由大到小排序的结果: " + Arrays.toString(sourceArray));                  // show sorted array
    }
}
