package modell;

import java.util.Date;

public class Festmeny extends KiallitasiTargy{
    private String fajlEleresiUt;
    
    public Festmeny(String keszito, String cim) {
        super(keszito, cim);
    }

    public Festmeny(String fajlEleresiUt, String keszito, String cim) {
        super(keszito, cim);
        this.fajlEleresiUt = fajlEleresiUt;
    }

    public Festmeny(String fajlEleresiUt, String keszito, String cim, Date letrehozasiDatum) {
        super(keszito, cim, letrehozasiDatum);
        this.fajlEleresiUt = fajlEleresiUt;
    }
    
    
}
