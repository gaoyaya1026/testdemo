/**
 * @program: testdemo
 * @description: 测试类
 * @author: GYY
 * @create: 2021-02-23 09:26
 **/
public class test {

    private static int num;
    private static boolean flag;


    public static class MyThread extends Thread {
       @Override
       public void run() {
            while (!flag) {
                Thread.yield();
            }
            System.out.println(num);
           System.out.println("flag="+flag);
           System.out.println("hello world");
       }

    }


    public static void main(String[] args) {

        new MyThread().start();
        num = 40;
        flag = true;
    }
}
