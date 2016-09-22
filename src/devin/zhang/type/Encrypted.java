package devin.zhang.type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 14:34
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface Encrypted {
}
