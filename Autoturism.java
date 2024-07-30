public abstract class Autoturism implements Vehicul {

  private int capacitateCilindrica;

  @Override
  public String nume() {
    return "Autoturism";
  }

  @Override
  public int nrRotilor() {
    return 4;
  }

  @Override
  public String categorieNecesara() {
    return "B";
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
    return "benzina/motorina";
  }

  public abstract int nrUsi();

  public abstract void setNrUsi(int nrUsi);

  public abstract boolean decapotabila();
}
