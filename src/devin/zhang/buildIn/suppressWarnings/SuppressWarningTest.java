package devin.zhang.buildIn.suppressWarnings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 15:37
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */
/*
　　　　1. deprecation：使用了不赞成使用的类或方法时的警告；
　　　　2. unchecked：执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型;
　　　　3. fallthrough：当 Switch 程序块直接通往下一种情况而没有 Break 时的警告;
　　　　4. path：在类路径、源文件路径等中有不存在的路径时的警告;
　　　　5. serial：当在可序列化的类上缺少 serialVersionUID 定义时的警告;
　　　　6. finally：任何 finally 子句不能正常完成时的警告;
        7. unused:代码中的变量或方法没有被使用产生的警告;
        8. rawtypes:使用泛型时没有指定类型的警告；
　　　　9. all：关于以上所有情况的警告。
        10. [更多关键字](http://www.cnblogs.com/fsjohnhuang/p/4040785.html)
 */
public class SuppressWarningTest {
    @SuppressWarnings("unchecked")
    public void addItems2(String item){
        @SuppressWarnings("unused")
        List list = new ArrayList();
        List items = new ArrayList();
        items.add(item);
    }

    @SuppressWarnings({"unchecked","unused"})
    public void addItems1(String item){
        List list = new ArrayList();
        list.add(item);
    }

    @SuppressWarnings("all")
    public void addItems(String item){
        List list = new ArrayList();
        list.add(item);
    }
}
