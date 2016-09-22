package devin.zhang.buildIn.deprecated;

/**
 * Created by Devin on 2016/7/19.
 */
public class AppleService {
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }

    /**
     * @deprecated 该方法已经过期，不推荐使用
     */
    @Deprecated
    public void showTaste(){
        System.out.println("水果的苹果的口感是：脆甜");
    }

    public void showTaste(int typeId){
        if(typeId==1){
            System.out.println("水果的苹果的口感是：酸涩");
        }
        else if(typeId==2){
            System.out.println("水果的苹果的口感是：绵甜");
        }
        else{
            System.out.println("水果的苹果的口感是：脆甜");
        }
    }
}
