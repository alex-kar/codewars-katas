package snailSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SnailSortTest {

    @Test
    public void snailSort0Test() {
        int[] expectedResult1 = new int[0];
        int[] expectedResult2 = new int[0];
        int[] expectedResult3 = {1,2,3,6,9,8,7,4,5};
        int[] expectedResult4 = {1,2,3,4,5,6,12,18,24,30,36,35,34,33,32,31,25,19,13,7,8,9,10,11,17,23,29,28,27,26,20,14,15,16,22,21};
        int[] expectedResult5 = {1,2,3,9,4,1,4,3,2,1,7,4,5,6,9,8};

        int[][] testData1 = new int[0][0];
        int[][] testData2 = new int[1][0];
        int[][] testData3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] testData4 = {
                {1,  2,  3,   4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}};
        int[][] testData5 = {
                {1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};

        Assert.assertEquals(Arrays.toString(expectedResult1), Arrays.toString(new SnailSort().snail(testData1)));
        Assert.assertEquals(Arrays.toString(expectedResult2), Arrays.toString(new SnailSort().snail(testData2)));
        Assert.assertEquals(Arrays.toString(expectedResult3), Arrays.toString(new SnailSort().snail(testData3)));
        Assert.assertEquals(Arrays.toString(expectedResult4), Arrays.toString(new SnailSort().snail(testData4)));
        Assert.assertEquals(Arrays.toString(expectedResult5), Arrays.toString(new SnailSort().snail(testData5)));
    }



}
