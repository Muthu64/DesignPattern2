package demo.pattern.Singleton;

public class MainClass
{
    //Create object only once and reuse it wherever required
    public static void main( String[] args )
    {
        Singleton singleton = Singleton.getSingleton();
        singleton.doSomething();
    }
}
