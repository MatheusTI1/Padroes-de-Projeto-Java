package Singleton;

public class SingletonLazy {
    //Singleton "preguiçoso"
    private static SingletonLazy instancia;

    private  SingletonLazy(){
        super();
    }
    public  static  SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return  instancia;
    }
}
