import tortora.gof.facade.Facade;
import tortora.gof.singleton.SingletonEager;
import tortora.gof.singleton.SingletonLazy;
import tortora.gof.singleton.SingletonLazyHolder;
import tortora.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy " + lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy2 " + lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("Eager " + eager);
        eager = SingletonEager.getInstancia();
        System.out.println("Eager2 " + eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println("Holder " + holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println("Holder2 " + holder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Tortora", "30350140");

    }
}