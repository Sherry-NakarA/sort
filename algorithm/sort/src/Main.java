import base.strategy.BaseSortStrategy;
import impl.algorithm.insert.InsertSort;
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
 *  BaseSortStrategy strategy = new ImplSortStrategy(new InsertSort());                                               *
 *====================================================================================================================*/

        BaseSortStrategy strategy = new ImplSortStrategy(new InsertSort()); // 传入排序实现类来执行其排序方法

/**********************************************************************************************************************
 *                                           print result format                                                      *
 *--------------------------------------------------------------------------------------------------------------------*
 *  use function -- strategy.runSort()                                                                                *
 *====================================================================================================================*/

        strategy.runSort(sourceArray);                                      // sort
        System.out.println(Arrays.toString(sourceArray));                   // show sorted array
        strategy.runSort(sourceArray, true);                        // reverse sort
        System.out.println(Arrays.toString(sourceArray));                  // show sorted array

    }
}
