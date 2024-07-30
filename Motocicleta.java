public class Motocicleta implements Vehicul {

  private int capacitateCilindrica;

  @Override
  public String nume() {
    return "Motocicleta";
  }

  @Override
  public int nrRotilor() {
    return 2;
  }

  @Override
  public String categorieNecesara() {
    return "A";
  }

  @Override
  public int capacitateCilindrica() {
    return capacitateCilindrica;
  }

  @Override
  public void setCapacitateCilindrica(int capacitateCilindrica) {
    this.capacitateCilindrica = capacitateCilindrica;
  }

  @Override
  public String carburant() {
    return "benzina";
  }
}
