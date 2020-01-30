package Proxy.p3_Cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private Object target;


    public ProxyFactory(Object target) {
        this.target = target;
    }


    // return target Proxy Object
    public Object getProxyInstance() {
        // create a tool class
        Enhancer enhancer = new Enhancer();
        // setting super class
        enhancer.setSuperclass(target.getClass());
        // setting callback function
        enhancer.setCallback(this);
        // create subclass(proxy object)
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy start");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib proxy end");
        return invoke;
    }
}
