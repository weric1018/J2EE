package wl.std.j2ee.bean.observer;

/**
 * Created by ynet_test on 2018/4/13.
 */
public class ObserverListenerImp implements  ObserverListenerInterface {


    @Override
    public void update(String message) {
        System.out.println("收到消息:"+message);
    }
}
