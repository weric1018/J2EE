package wl.std.j2ee.bean.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ynet_test on 2018/4/13.
 */
public class ObserverInterfaceImp implements  ObserverInterface {

    private List<ObserverListenerInterface> list  = new ArrayList<ObserverListenerInterface>();

    @Override
    public void addListener(ObserverListenerInterface observerListenerInterface) {
        list.add(observerListenerInterface);
    }

    @Override
    public void removeListener(ObserverListenerInterface observerListenerInterface) {
        list.remove(observerListenerInterface);
    }

    @Override
    public void notify(String message) {
        list.forEach(lists ->lists.update(message));
    }
}
