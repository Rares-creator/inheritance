import java.util.ArrayList;
import java.util.List;

public class Main_Vehicul {

  public static void main(String[] args) {
    Vehicul limuzina = new Limuzina();
    limuzina.setCapacitateCilindrica(2000);

    Autoturism cabrio = new Cabrio();
    cabrio.setCapacitateCilindrica(2000);
    cabrio.setNrUsi(2);

    Vehicul coupe = new Coupe();
    coupe.setCapacitateCilindrica(2000);

    Motocicleta motocicleta = new Motocicleta();
    motocicleta.setCapacitateCilindrica(750);

    Camion camion = new Camion();

    List<Vehicul> listaVehicule = new ArrayList<>();
    listaVehicule.add(limuzina);
    listaVehicule.add(cabrio);
    listaVehicule.add(coupe);
    listaVehicule.add(motocicleta);
    listaVehicule.add(camion);

    int i = 1;
    for (Vehicul vehicul : listaVehicule) {
      System.out.println("\nVehicul " + i + " este: " + vehicul.nume());
      System.out.println("Nr. rotilor: " + vehicul.nrRotilor());
      System.out.println("Categorie necesara: " + vehicul.categorieNecesara());
      System.out.println("Capacitate cilindrica: " + vehicul.capacitateCilindrica());
      System.out.println("Carburant: " + vehicul.carburant());
      if (vehicul instanceof Autoturism) {
        Autoturism autoturism = (Autoturism) vehicul;
        System.out.println("Nr. usi: " + autoturism.nrUsi());
        System.out.println("Decapotabila: " + autoturism.decapotabila());
      }
      ++i;
    }

    Vehicul motooo = new Motocicleta();
    if (motooo instanceof Autoturism) {
      System.out.println("\n\nam intrat in if ul asta");
    }
  }
}
