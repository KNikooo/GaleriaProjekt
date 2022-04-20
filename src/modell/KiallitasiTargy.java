package modell;

import java.time.LocalTime;
import java.util.Date;

public abstract class KiallitasiTargy {
    private String keszito, cim;
    private Date letrehozasiDatum;

    public KiallitasiTargy(String keszito, String cim) {
        //this(keszito, cim, );
        this.keszito = keszito;
        this.cim = cim;
    }
    
    

    public KiallitasiTargy(String keszito, String cim, Date letrehozasiDatum) {
        this.keszito = keszito;
        this.cim = cim;
        this.letrehozasiDatum = letrehozasiDatum;
    }
}
