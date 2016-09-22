package devin.zhang.repeatable;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 11:08
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class RepeatableAnnotation {
    @Authority(role = "admin")
    @Authority(role = "Manager")
    public void role(){ }
}
