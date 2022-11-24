package one.digitalinnovation.gof.strategy;


public class RoboDeBriga {

  public Atacar atacar;

  public int vida;

  public RoboDeBriga(int vida) {
    super();
    this.vida = vida;
  }

  public void sortearAtaque(RoboDeBriga roboInimigo) {
    int maxRandom = 10;
    int minRandom = 1;

    int randomNumber = (int) Math.floor(Math.random() * (maxRandom - minRandom + 1) + minRandom);

    if (randomNumber < 3) {
      AtacarFraco ataque = new AtacarFraco();
      roboInimigo.vida -= ataque.danoDoAtaque();
    }

    if (randomNumber >= 3 && randomNumber <= 6) {
      AtacarNormal ataque = new AtacarNormal();
      roboInimigo.vida -= ataque.danoDoAtaque();
    }

    if (randomNumber > 6) {
      AtacarForte ataque = new AtacarForte();
      roboInimigo.vida -= ataque.danoDoAtaque();
    }


  }

  public void atacarInimigo(RoboDeBriga roboInimigo) {
    sortearAtaque(roboInimigo);
    System.out.println("Robo Atacante " + this.vida);
    System.out.println("Robo inimigo " + roboInimigo.vida);
    System.out.println(" ");
  }
}
