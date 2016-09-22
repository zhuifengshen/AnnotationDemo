package devin.zhang.custom;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 15:43
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */
@MyAnnotation(
        value = "info",
        name = "myname",
        age = 99,
        isStudent = false,
        alias = {"name1", "name2"},
        favoriteColor = MyAnnotation.Color.RED
)
public class MyClass {
    //使用MyAnnotation注解，该类生成的javadoc文档包含注解信息如下：
    /*
    @MyAnnotation(value = "info", name = "myname", age = 99, isStudent = false, alias = {"name1","name2"}, favoriteColor = Color.RED)
    public class MyClass
    extends Object
     */
}
