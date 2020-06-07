import java.util.Random;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号码:");
        String id = sc.next();
        System.out.println(idCard(id));
    }

    public static boolean idCard(String id) {
        if (id.length() != 18) {
            return false;
        }
        if (id.indexOf('0') == 0) {
            return false;
        }
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            if (i == id.length() - 1) {
                if (ch < 48 && ch > 57 && ch != 'X') {
                    return false;
                }
            } else {
                if (ch < 48 || ch > 57) {
                    return false;
                }
            }
        }
        return true;
    }

}