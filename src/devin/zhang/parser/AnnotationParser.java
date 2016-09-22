package devin.zhang.parser;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/21 17:43
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class AnnotationParser {
    public static void main(String[] args) {
        Field[] fields = Apple.class.getDeclaredFields();
        for (Field field : fields) {
            //System.out.println(field.getName().toString());
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("水果的名称：" + fruitName.value());
            }else if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("水果的颜色："+fruitColor.fruitColor());
            }else if (field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                System.out.println("水果供应商编号:" + fruitProvider.id() + " 名称:" + fruitProvider.name() + " 地址:" + fruitProvider.address());
            }
        }
    }
}
