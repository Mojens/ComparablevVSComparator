package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Runner {
  public static void main(String[] args) {

    ArrayList<Laptop> lapsArrayList = new ArrayList<>(); //ArrayList er en class
//Her laver vi 3 forskellige objekter og tilføjer dem til ArrayListen

    lapsArrayList.add(new Laptop("Dell",16,800));
    lapsArrayList.add(new Laptop("Apple",8,2000));
    lapsArrayList.add(new Laptop("Acer",12,700));

    List<Laptop> lapsList = new ArrayList<>(); //List er en interface
//Her laver vi 3 forskellige objekter og tilføjer dem til Listen

    lapsList.add(new Laptop("Dell",25,2000));
    lapsList.add(new Laptop("Apple",3,1100));
    lapsList.add(new Laptop("Acer",11,400));



    //Her laver vi en Comparator med Datatypen Laptop, hvor den skal sorter ud fra pris.

    Comparator<Laptop> sortPrice = new Comparator<Laptop>() { // Her Laver vi en Comparator som vi kalder for sortPrice
      public int compare(Laptop l1, Laptop l2){ // Vi laver en compare metode med to objekter som paramtre af den samme datatype
      if (l1.getPrice() > l2.getPrice()) //Her sammenligner vi
        return 1;
      else
        return -1;
      }
    };

    Comparator<Laptop> sortRam = new Comparator<Laptop>(){ // Her Laver vi en Comparator som vi kalder for sortRam
      public int compare(Laptop l1, Laptop l2){ // Vi laver en compare metode med to objekter som paramtre af den samme datatype
       if (l1.getRam() < l2.getRam()) //Her sammenligner vi
         return 1;
       else
         return -1;
      }
    };

    System.out.println("\n");

    Collections.sort(lapsArrayList, sortPrice); // Her bruger vi Collections.sort, hvor vi først angive ArrayListen, og derefter angiver den måde den skal sorteres på
    System.out.println("Printer Sortering af ArrayList med pris Lav til høj\n");
    for (Laptop l : lapsArrayList) {
      System.out.println(l);
    }
    System.out.println("\n");

    Collections.sort(lapsArrayList, sortRam);// Her bruger vi Collections.sort, hvor vi først angive ArrayListen, og derefter angiver den måde den skal sorteres på
    // Hvor i dette tilfælde skal den ikke sorter efter pris men sorter efter ram størrelse.
    System.out.println("Printer sortering af ArrayList med Ram Høj til Lav\n");
    for (Laptop l : lapsArrayList) {
      System.out.println(l);
    }
    System.out.println("\n");

    Collections.sort(lapsList, sortPrice); // Her bruger vi Collections.sort, hvor vi først angive Listen, og derefter angiver den måde den skal sorteres på
    System.out.println("Printer Sortering af Listen med pris Lav til høj\n");
    for (Laptop l : lapsList) {
      System.out.println(l);
    }
    System.out.println("\n");

    Collections.sort(lapsList, sortRam);// Her bruger vi Collections.sort, hvor vi først angive Listen, og derefter angiver den måde den skal sorteres på
    // Hvor i dette tilfælde skal den ikke sorter efter pris men sorter efter ram størrelse.
    System.out.println("Printer sortering af Listen med Ram Høj til Lav\n");
    for (Laptop l : lapsList) {
      System.out.println(l);
    }

  }
}
