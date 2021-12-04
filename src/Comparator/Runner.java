package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Runner {
  public static void main(String[] args) {

    List<Laptop> laps = new ArrayList<>();
//Her laver vi 3 forskellige objekter og tilføjer dem til Listen

    laps.add(new Laptop("Dell",16,800));
    laps.add(new Laptop("Apple",8,2000));
    laps.add(new Laptop("Acer",12,700));

    //Her laver vi en Comparator med Datatypen Laptop, hvor den skal sorter ud fra pris.

    Comparator<Laptop> sortPrice = new Comparator<Laptop>() { // Her Laver vi en Comparator som vi kalder for sortPrice
      public int compare(Laptop l1, Laptop l2){ // Vi laver en compare metode med to objekter som paramtre af den samme datatype
      if (l1.getPrice() > l2.getPrice()) //Her sammenligner vi
        return 1;
      else
        return -1;
      }
    };

    Collections.sort(laps, sortPrice); // Her bruger vi Collections.sort, hvor vi først angive listen, og derefter angiver den måde den skal sorteres på

    System.out.println("Printer Sortering med pris Lav til høj\n");
    for (Laptop l : laps) {
      System.out.println(l);
    }
    System.out.println("\n");



    Comparator<Laptop> sortRam = new Comparator<Laptop>(){ // Her Laver vi en Comparator som vi kalder for sortRam
      public int compare(Laptop l1, Laptop l2){ // Vi laver en compare metode med to objekter som paramtre af den samme datatype
       if (l1.getRam() < l2.getRam()) //Her sammenligner vi
         return 1;
       else
         return -1;
      }
    };
    Collections.sort(laps, sortRam);// Her bruger vi Collections.sort, hvor vi først angive listen, og derefter angiver den måde den skal sorteres på
    // Hvor i dette tilfælde skal den ikke sorter efter pris men sorter efter ram størrelse.
    System.out.println("Printer sortering med Ram Høj til Lav\n");
    for (Laptop l : laps) {
      System.out.println(l);
    }
  }
}
