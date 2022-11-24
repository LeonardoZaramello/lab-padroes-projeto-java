package one.digitalinnovation.gof.strategy;

public class AtacarFraco implements Atacar {

  @Override
  public int danoDoAtaque() {
    System.out.println("Atacou Fraco");
    return 5;
  }

}
