public class Limuzina extends Autoturism {

  @Override
  public String nume() {
    return "Limuzina";
  }

  @Override
  public int nrUsi() {
    return 4;
  }

  @Override
  public void setNrUsi(int nrUsi) {}

  @Override
  public boolean decapotabila() {
    return false;
  }
}
