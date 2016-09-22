package devin.zhang.buildIn.override;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/21 15:43
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */
//Orange 类编译不会有任何问题，Peach 类在编译的时候会提示相应的错误；@Override注解只能用于方法，不能用于其他程序元素。
public class Fruit{
    public void displayName(){
        System.out.println("水果的名字是：*****");
    }
}

class Orange extends Fruit{
    @Override
    public void displayName(){
        System.out.println("水果的名字是：桔子");
    }
}

//class Peach extends Fruit{
//    @Override
//    public void displayname(){
//        System.out.println("水果的名字是：桃子");
//    }
//}