package one.digitalinnovation.gof.strategy;

public class AtacarForte implements Atacar {

  @Override
  public int danoDoAtaque() {
    System.out.println("Atacou Forte");
    return 20;

  }

}
