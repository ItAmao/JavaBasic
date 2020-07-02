import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("张无忌","赵敏");
        hashMap.put("杨过","小龙女");
        hashMap.put("郭靖","黄蓉");
        hashMap.put("令狐冲","任盈盈");

        for (int i = 0; i < hashMap.size(); i++) {
            String s = hashMap.get(i);
            System.out.println(s);
        }
    }
}
