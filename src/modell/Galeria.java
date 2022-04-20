package modell;

import java.util.ArrayList;

public class Galeria {
    ArrayList<KiallitasiTargy> kiallitasiTargyak;

    public Galeria(ArrayList<KiallitasiTargy> kiallitasiTargyak) {
        this.kiallitasiTargyak = new ArrayList<>();
    }

    public Galeria() {
        this.kiallitasiTargyak = new ArrayList<>();
    }
    
    
    
    public void kiallitasiTargyatFelvesz(KiallitasiTargy targy){
        kiallitasiTargyak.add(targy);
    }
    
    public void festmenytFelvesz(Festmeny festmeny){
        kiallitasiTargyak.add(festmeny);
    }

    @Override
    public String toString() {
        return "Galeria{" + "Targyak=" + kiallitasiTargyak + '}';
    }
}
