package modell;

import java.time.LocalDate;
import java.util.Date;

public class Festmeny extends KiallitasiTargy{
    private String fajlEleresiUt;
    
    public Festmeny(String keszito, String cim) {
        super(keszito, cim);
    }

    public Festmeny( String keszito, String cim, String fajlEleresiUt) {
        super(keszito, cim);
        this.fajlEleresiUt = fajlEleresiUt;
    }

    public Festmeny(String keszito, String cim, String fajlEleresiUt, LocalDate letrehozasiDatum) {
        super(keszito, cim, letrehozasiDatum);
        this.fajlEleresiUt = fajlEleresiUt;
    }

    public Festmeny(String keszito, String cim, LocalDate letrehozasiDatum) {
        super(keszito, cim, letrehozasiDatum);
    }

    @Override
    public int compareTo(KiallitasiTargy o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
