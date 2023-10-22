package SingletonVideoAula;

public class SingletonEager {
    //Singleton "apressado"
    private static SingletonEager instancia = new SingletonEager();

    private  SingletonEager(){
        super();
    }
    public  static  SingletonEager getInstance(){
        return  instancia;
        }
}
