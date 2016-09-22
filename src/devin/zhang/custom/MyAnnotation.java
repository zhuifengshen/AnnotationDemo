package devin.zhang.custom;

import java.lang.annotation.*;

/**
 *自定义注解MyAnnotation
 */
@Target(ElementType.TYPE) //目标对象是类型
@Retention(RetentionPolicy.RUNTIME) //保存至运行时
@Documented //生成javadoc文档时，该注解内容一起生成文档
@Inherited //该注解被子类继承
public @interface MyAnnotation {
    public String value() default ""; //当只有一个元素时，建议元素名定义为value(),这样使用时赋值可以省略"value="
    String name() default "devin"; //String
    int age() default 18; //int
    boolean isStudent() default true; //boolean
    String[] alias(); //数组
    enum Color {GREEN, BLUE, RED,} //枚举类型
    Color favoriteColor() default Color.GREEN; //枚举值
}
