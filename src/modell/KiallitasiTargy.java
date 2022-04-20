package modell;

import java.text.Collator;
import java.time.Clock;
import java.time.YearMonth;
import java.util.Comparator;
import java.util.Date;

class keszitoComparator implements Comparator<KiallitasiTargy> {
    @Override
    public int compare(KiallitasiTargy egyik, KiallitasiTargy masik) {
        Collator col = Collator.getInstance();
        return col.compare(egyik.getKeszito(), masik.getKeszito());
    }
}

class cimComparator implements Comparator<KiallitasiTargy> {
    @Override
    public int compare(KiallitasiTargy egyik, KiallitasiTargy masik) {
        Collator col = Collator.getInstance();
        return col.compare(egyik.getCim(), masik.getCim());
    }
}

public abstract class KiallitasiTargy implements Comparable<KiallitasiTargy>{
    private String keszito, cim;
    private Date letrehozasiDatum;

    public KiallitasiTargy(String keszito, String cim) {
        this(keszito, cim, new Date(0, 0, 0));
    }
    
    public KiallitasiTargy(String keszito, String cim, Date letrehozasiDatum) {
        this.keszito = keszito;
        this.cim = cim;
        this.letrehozasiDatum = letrehozasiDatum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }
    
    public static keszitoComparator KeszitoRendezo() {
        return new keszitoComparator();
    }

    public static cimComparator CimRendezo() {
        return new cimComparator();
    }

    @Override
    public String toString() {
        return "Kiállítási targy{" + "keszito=" + keszito + ", cim=" + cim + ", letrehozasiDatum=" + letrehozasiDatum + '}';
    } 
}
