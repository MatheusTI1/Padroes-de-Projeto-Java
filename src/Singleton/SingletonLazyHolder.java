package Singleton;

public class SingletonLazyHolder {
    //Singleton "Lazy Holder"
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public  static SingletonLazyHolder getInstance(){
        return  InstanceHolder.instancia;
        }
}
