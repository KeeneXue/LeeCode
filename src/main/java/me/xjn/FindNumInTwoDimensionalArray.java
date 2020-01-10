package me.xjn;

/**
 * @author Xuejn
 * @version 1.0
 * @className FindNumInTwoDimensionalArray
 * @description 在一个二位数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从左到右递增的顺序排序。
 * 完成一个函数，输入这样的二维数组和一个整数。判断数组中是否包含该整数。
 * @date 2020/1/9 16:29
 **/
public class FindNumInTwoDimensionalArray {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[0] = new int[]{1,   4,  7, 11, 15};
        array[1] = new int[]{2,   5,  8, 12, 19};
        array[2] = new int[]{3,   6,  9, 16, 22};
        array[3] = new int[]{10, 13, 14, 17, 24};
        array[4] = new int[]{18, 21, 23, 26, 30};
        System.out.println(solution(array,20));
    }

    public static boolean solution(int[][] array,int target){

        if(array == null || array.length == 0 ||
                array[0] == null || array[0].length == 0 ){
            return false;
        }
        //m 行数，n 列数
        int m = array.length,n = array[0].length;
        //设置开始时元素位置，在这里设置的右上角的元素
        int i = 0,j = n - 1;

        while (i < m && j >= 0) {
            if (target > array[i][j]){
                i++;
            } else if (target < array[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
