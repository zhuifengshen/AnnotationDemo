package devin.zhang.buildIn.deprecated;

/**
 * Created by Devin on 2016/7/19.
 */
public class AppleConsumer {
    //@SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        AppleService appleService=new AppleService();
        appleService.showTaste();
        appleService.showTaste(2);
    }
}
