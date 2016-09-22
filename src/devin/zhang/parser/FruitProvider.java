package devin.zhang.parser;

import java.lang.annotation.*;

/**
 * 水果供应商注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     * @return
     */
    public int id() default -1;

    /**
     * 供应商名称
     * @return
     */
    public String name() default " ";

    /**
     * 供应商地址
     * @return
     */
    public String address() default " ";
}
