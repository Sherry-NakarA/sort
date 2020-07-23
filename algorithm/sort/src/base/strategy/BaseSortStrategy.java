package base.strategy;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : BaseSortStrategy                                              *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/22 9:50                                                 *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description :                                                                                                *
 *      sort method strategy interface, all sort strategy must implement this interface and achieve runSort()         *
 *                                                                                                                    *
 *====================================================================================================================*/
public interface BaseSortStrategy {

    void runSort(int[] sourceArray);

    void runSort(int[] sourceArray, boolean reverse);

}
