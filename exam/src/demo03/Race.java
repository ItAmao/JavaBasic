package demo03;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 20:27
 */
//多线程龟兔赛跑问题，乌龟和兔子比赛跑200米的距离，
//名叫兔子的线程每执行一次兔子就向前跑5米，每跑50米休息10毫秒，
//名叫乌龟的线程每执行一次乌龟就向前跑1米，乌龟会一直跑不休息
//用多线程实现求出最后的胜利者是谁
public class Race implements Runnable {
    //winner:只有一个胜利者
    private static String winner;
    int lengthr = 200;//lengthr为兔子需要跑的长度
    int lengtht = 200;//lengtht为乌龟需要跑的长度

    // 重写run方法，编写奔跑操作
    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().getName().equals("兔子")) {
                int disr = 5;
                lengthr = lengthr - disr;
                System.out.println(Thread.currentThread().getName() + "距离终点还有" + lengthr + "米");
                if (lengthr % 50 == 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //调用gameOver方法判断比赛是否结束
                boolean flag = gameOver(lengthr);
                if (flag) {
                    break;
                }
            }
            if (Thread.currentThread().getName().equals("乌龟")) {
                int dist = 1;
                lengtht = lengtht - dist;
                System.out.println(Thread.currentThread().getName() + "距离终点还有" + lengtht + "米");
                boolean flag = gameOver(lengtht);
                if (flag) {
                    break;
                }
            }
        }
    }

    //判断比赛是否结束
    private boolean gameOver(int lenght) {
        if (winner != null) { //如果存在胜利者
            return true;
        }
        if (lenght == 0) {  //判断如果跑到了比赛结束
            winner = Thread.currentThread().getName();
            System.out.println("比赛结束");
            System.out.println("胜利者----->" + winner);
            return true;
        }
        return false;
    }
}

class testWanXing2 {
    public static void main(String[] args) {
        Race race = new Race(); //创建一个比赛
        //要求创建两个线程名字分别为：兔子、乌龟。并启动线程，请补全此处代码：
        Thread t1 = new Thread(race, "兔子");
        Thread t2 = new Thread(race, "乌龟");
        t1.start();
        t2.start();
    }
}