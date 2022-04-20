package main;

import java.time.LocalDate;
import java.time.Month;
import modell.Festmeny;
import modell.Galeria;
import modell.KiallitasiTargy;

public class Program {
    public static void main(String[] args) {
        Galeria galeria=new Galeria();
        galeria.festmenytFelvesz(new Festmeny("Leonardo da Vinci", "Mona Lisa"));
        galeria.festmenytFelvesz(new Festmeny("Leonardo da Vinci", "Mona Lisa", LocalDate.of(1505, 12, 12)));
        galeria.festmenytFelvesz(new Festmeny("Leonardo da Vinci", "Mona Lisa", LocalDate.of(2022, 12, 12)));
        galeria.festmenytFelvesz(new Festmeny("Leonardo da Vinci", "Mona Lisa", "kepek.txt")); 
        galeria.festmenytFelvesz(new Festmeny("Leonardo da Vinci", "Mona Lisa", "kepek.txt", LocalDate.of(1505, 12, 12)));
           
    }
}
