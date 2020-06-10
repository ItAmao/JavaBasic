package com.amao.demo11_接口作为方法参数和返回值;

public class Test {
    public static void main(String[] args) {
        //使用匿名内部类使用接口
        Game game = new Game() {
            @Override
            public void play() {
                System.out.println("阿毛打游戏");
            }
        };
        playGame(game);
        System.out.println("----------------------");
        //调用接口作为方法的返回值
        Game game1 = getGame();
        game1.play();
    }

    /**
     * 接口作为方法的返回值
     */
    public static Game getGame() {
        //创建对象实现接口
        Game game = new Game() {
            @Override
            public void play() {
                System.out.println("小毛打游戏");
            }
        };
        //返回使用接口的匿名内部类对象
        return game;
    }

    /**
     * 接口作为方法的参数
     */
    public static void playGame(Game game) {
        System.out.println("接口作为方法的参数");
        game.play();
    }
}
