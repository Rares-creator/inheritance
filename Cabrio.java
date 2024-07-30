public class Cabrio extends Autoturism {

  private int nrUsi;

  @Override
  public String nume() {
    return "Cabrio";
  }

  @Override
  public int nrUsi() {
    return nrUsi;
  }

  public void setNrUsi(int nrUsi) {
    this.nrUsi = nrUsi;
  }

  @Override
  public boolean decapotabila() {
    return true;
  }
}
