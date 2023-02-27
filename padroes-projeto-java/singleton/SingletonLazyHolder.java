package singleton;

public class SingletonLazyHolder {


    private SingletonLazyHolder() {
        super();
    }

    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
