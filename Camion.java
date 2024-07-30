public class Camion implements Vehicul {
  @Override
  public String nume() {
    return "Camion";
  }

  @Override
  public int nrRotilor() {
    return 6;
  }

  @Override
  public String categorieNecesara() {
    return "C+E";
  }

  @Override
  public int capacitateCilindrica() {
    return 6000;
  }

  @Override
  public void setCapacitateCilindrica(int capacitateCilindrica) {}

  @Override
  public String carburant() {
    return "motorina";
  }
}
