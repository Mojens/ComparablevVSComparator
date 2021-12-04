package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
  public static void main(String[] args) {

    List<Laptop> laps = new ArrayList<>();
//Her laver vi 3 forskellige objekter og tilføjer dem til Listen

    laps.add(new Laptop("Dell",16,800));
    laps.add(new Laptop("Apple",8,2000));
    laps.add(new Laptop("Acer",12,700));

    Collections.sort(laps);

    for (Laptop l:laps) {
      System.out.println(l);

    }

  }
}
