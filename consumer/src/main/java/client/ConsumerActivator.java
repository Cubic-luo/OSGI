package client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ConsumerActivator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        Speak.say();
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("I am bundle consumer,byebye!");
    }
}
