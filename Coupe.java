public class Coupe extends Autoturism {

  @Override
  public String nume() {
    return "Coupe";
  }

  @Override
  public int nrUsi() {
    return 2;
  }

  @Override
  public void setNrUsi(int nrUsi) {}

  @Override
  public boolean decapotabila() {
    return false;
  }
}
