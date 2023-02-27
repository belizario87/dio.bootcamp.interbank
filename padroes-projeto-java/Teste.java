import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.*;
import strategy.ComportamentoAgressivo;


public class Teste {
    public static void main(String[] args) {

        //Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy.toString());
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy.toString());

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager.toString());
        eager = SingletonEager.getInstance();
        System.out.println(eager.toString());

        SingletonLazyHolder lazyHolder = SingletonLazyHolder .getInstance();
        System.out.println(lazyHolder.toString());
        lazyHolder = SingletonLazyHolder .getInstance();
        System.out.println(lazyHolder.toString());

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Leonardo", "28960000");




    }

}
