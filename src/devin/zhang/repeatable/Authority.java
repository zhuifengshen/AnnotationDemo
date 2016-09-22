package devin.zhang.repeatable;

import java.lang.annotation.Repeatable;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 11:11
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */
@Repeatable(Authorities.class)
public @interface Authority {
    String role();
}
