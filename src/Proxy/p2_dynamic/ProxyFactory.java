package Proxy.p2_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    // initial target
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        // 1. loader :
        // 2. interfaces: target object interface
        // 3. InvocationHandler: event handler
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("JDK proxy");
                // using reflect method call object method
                Object invoke = method.invoke(target, objects);
                return invoke;
            }
        });
    }
}
