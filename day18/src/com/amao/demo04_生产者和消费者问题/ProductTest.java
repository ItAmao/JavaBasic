package com.amao.demo04_生产者和消费者问题;

/**
 *  线程通信的应用 生产者/消费者问题
 *
 *  生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
 *  取走产品，店员一次只能持有固定数量的产品(比如:20)，
 *  如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通 知生产者继续生产;如果店中没有产品了，
 *  店员会告诉消费者等一下，如 果店中有产品了再通知消费者来取走产品。
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 17:13
 */


class Clerk {

    private int productCount = 0;

    //生产产品
    public synchronized void produceProduct() {
        if (productCount < 20) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");

            notify();
        } else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    //消费产品
    public synchronized void consumeProduct() {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;

            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {//生产者
    private Clerk clerk;//声明Clerk类型的变量

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 开始生产产品......");
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Customer implements Runnable { //消费者
    private Clerk clerk;//声明Clerk类型的变量

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 开始消费产品......");
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread p1 = new Thread(new Producer(clerk), "生产者1");
        Thread c1 = new Thread(new Customer(clerk), "消费者1");

        p1.start();
        c1.start();

    }
}
