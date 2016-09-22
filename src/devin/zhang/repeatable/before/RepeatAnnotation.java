package devin.zhang.repeatable.before;

/**
 * Created with IntelliJ IDEA.
 * User: Devin     Date: 2016/9/22 11:37
 * More wonderful content please pay attention to -> http://zhangchuzhao.site
 */

public class RepeatAnnotation {
    @Authorities({@Authority(role = "admin"), @Authority(role = "manager")})
    public void role(){
    }
}
