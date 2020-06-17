import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {
    //创建静态的MAP集合
    public static HashMap<Integer, String> map = new HashMap<Integer, String>();

    public static void main(String[] args) {
        // 斗地主分析的实现过程   花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //研究一下 把这些花色 储存到 MAP集合中  遍历
        int index = 1;
        for (String s : number) {
            for (String color : colors) {
                String card = color + s;
                map.put(index++, card);
            }
        }
        //还差大小王
        map.put(53, "大王");
        map.put(54, "小王");
        // 2.准备一副牌 54个编号
        //System.out.println(map);

        ArrayList<Integer> cardBox = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            cardBox.add(i);
        }
        //System.out.println(cardBox);
        //3. 洗牌
        Collections.shuffle(cardBox);

        //4 发牌
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();
        ArrayList<Integer> p3 = new ArrayList<Integer>();
        ArrayList<Integer> p4 = new ArrayList<Integer>();

        //便利集合
        //System.out.println(cardBox.size());//54
        for (int i = 0; i < cardBox.size() - 3; i++) {
            // 把扑克牌里的54张牌 洗牌之后 不同索引位置的牌拿出来 给数组赋值
            Integer card = cardBox.get(i);
            if (i % 3 == 0) {
                p1.add(card);
            } else if (i % 3 == 1) {
                p2.add(card);
            } else if (i % 3 == 2) {
                p3.add(card);
            }
        }
        // 把最后三张牌 留给底牌
        p4.add(cardBox.get(51));
        p4.add(cardBox.get(52));
        p4.add(cardBox.get(53));

        //5 排序 (对编号进行排序)
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);
        // 根据编号找对应的牌面
        showcard(p1);
        showcard(p2);
        showcard(p3);
        showcard(p4);

    }

    //创建方法 用来遍历打印
    public static void showcard(ArrayList<Integer> ps) {
        Collections.sort(ps);
        for (Integer index : ps) {
            String card = map.get(index);
            System.out.print(card + " ");
        }
        System.out.println();
    }


}
