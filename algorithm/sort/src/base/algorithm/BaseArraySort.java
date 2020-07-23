package base.algorithm;

/**********************************************************************************************************************
 *                                                                                                                    *
 *                                       Project Name : algorithm sort                                                *
 *                                                                                                                    *
 *                                          File Name : BaseSortStrategy                                              *
 *                                                                                                                    *
 *                                         Programmer : NakarA                                                        *
 *                                                                                                                    *
 *                                         Start Date : 20/07/22 9:34                                                 *
 *                                                                                                                    *
 *                                        Last Update : July 22 2020 [NakarA]                                         *
 *                                                                                                                    *
 *--------------------------------------------------------------------------------------------------------------------*
 *                                                                                                                    *
 * Class Description :                                                                                                *
 *      sort method strategy interface, all sort strategy must implement this interface and achieve runSort()         *
 *                                                                                                                    *
 *====================================================================================================================*/
public interface BaseArraySort {

    void sort(int[] sourceArray);

}
