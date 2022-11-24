package one.digitalinnovation.gof.strategy;

public class AtacarNormal implements Atacar {

  @Override
  public int danoDoAtaque() {
    System.out.println("Atacou Normal");
    return 10;
  }

}
