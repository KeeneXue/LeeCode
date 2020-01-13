package me.xjn;

/**
 * @author Xuejn
 * @version 1.0
 * @className FindLongestCommonPrefixInStringArray
 * @description 编写一个函数来查找字符串中的最长公共前缀
 * @date 2020/1/10 16:35
 **/
public class FindLongestCommonPrefixInStringArray {
    public static void main(String[] args) {
        //ex1: result:"fl"
        String[] stringArray1 = new String[]{"flower", "flow", "flight"};
        //ex2: result:""
        String[] stringArray2 = new String[]{"dog", "racecar", "car"};
        System.out.println(solution(stringArray1));
        System.out.println(solution(stringArray2));
    }

    public static String solution(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return array[0];
        }
        String pre = array[0];
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            if ("".equals(pre) || "".equals(str)  ) {
                return "";
            }
            int index = 0;
            while (index < pre.length() && index < str.length() && str.charAt(index) == pre.charAt(index)) {
                index ++;
            }
            pre = pre.substring(0,index);
        }
        return pre;
    }
}
