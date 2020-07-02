package day20.src.com.amao.demo03_IO流;

import java.util.Arrays;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 18:42
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {9, 10, 6, 6, 1, 9, 3, 5, 6, 4};
        deduplication(arr);
    }
    public static void deduplication(int[] num) {
        int[] nums = Arrays.stream(num).distinct().toArray();
        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }


}
