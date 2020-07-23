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
        baseArraySort.sort(sourceArray);
    }

    @Override
    public void runSort(int[] sourceArray, boolean reverse) {
        if (reverse) {
            runSort(sourceArray);
            Utils.reverse(sourceArray);
        }
    }
}
