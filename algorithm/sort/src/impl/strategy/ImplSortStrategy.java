package impl.strategy;

import base.algorithm.BaseArraySort;
import base.strategy.BaseSortStrategy;
import util.Utils;

public class ImplSortStrategy implements BaseSortStrategy {

    public BaseArraySort baseArraySort;

    public ImplSortStrategy(BaseArraySort baseArraySort) {
        this.baseArraySort = baseArraySort;
    }

    @Override
    public void runSort(int[] sourceArray) {
        try{
            baseArraySort.sort(sourceArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array outbound exceptions This problem may come from the sorting algorithm used.");
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
