package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;
import one.digitalinnovation.gof.strategy.RoboDeBriga;

public class Test {

  public static void main(String[] args) {

    // Simulação Briga de Robo

    RoboDeBriga robo1 = new RoboDeBriga(100);
    RoboDeBriga robo2 = new RoboDeBriga(100);

    while (robo1.vida > 0 || robo2.vida > 0) {
      if (robo1.vida > 0)
        robo1.atacarInimigo(robo2);
      else {
        System.out.println("robo1 ganhou " + robo1);
        System.out.println("robo2 perdeu " + robo2);
        break;
      }

      if (robo2.vida > 0)
        robo2.atacarInimigo(robo1);
      else {
        System.out.println("robo2 ganhou " + robo2);
        System.out.println("robo1 perdeu " + robo1);
        break;
      }

    }



    // Singleton

    // SingletonLazy lazy = SingletonLazy.getInstancia();
    // System.out.println(lazy);
    // lazy = SingletonLazy.getInstancia();
    // System.out.println(lazy);
    //
    // SingletonEager eager = SingletonEager.getInstancia();
    // System.out.println(eager);
    // eager = SingletonEager.getInstancia();
    // System.out.println(eager);
    //
    // SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    // System.out.println(lazyHolder);
    // lazyHolder = SingletonLazyHolder.getInstancia();
    // System.out.println(lazyHolder);

    // Strategy

    // Comportamento defensivo = new ComportamentoDefensivo();
    // Comportamento normal = new ComportamentoNormal();
    // Comportamento agressivo = new ComportamentoAgressivo();
    //
    // Robo robo = new Robo();
    // robo.setComportamento(normal);
    // robo.mover();
    // robo.mover();
    // robo.setComportamento(defensivo);
    // robo.mover();
    // robo.setComportamento(agressivo);
    // robo.mover();
    // robo.mover();

    // Facade

    // Facade facade = new Facade();
    // facade.migrarCliente("Venilton", "14801788");
  }

}
