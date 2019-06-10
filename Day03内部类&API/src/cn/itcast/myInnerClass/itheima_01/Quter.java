package cn.itcast.myInnerClass.itheima_01;

public class Quter {
    private int num = 10;

    public class Inner {

        public void show() {
            System.out.println(num);
        }

    }

    public void method() {
//        show();

        Inner i = new Inner();
        i.show();
    }
}
