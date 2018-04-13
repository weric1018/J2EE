package wl.std.j2ee.bean.observer;

/**
 * Created by ynet_test on 2018/4/13.
 */
public interface ObserverInterface {

    public void addListener(ObserverListenerInterface observerListenerInterface);

    public void removeListener(ObserverListenerInterface observerListenerInterface);

    public void notify(String message);



}
