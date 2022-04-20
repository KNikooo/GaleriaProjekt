package modell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Galeria implements Serializable{
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
    
    public void allapotMentes(String fajlNev) {
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(fajlNev))) {
            objKi.writeObject(this);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void allapotBeolvas(String fajlNev) {
        Galeria galeria = new Galeria();
        try (ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fajlNev))) {
            galeria = (Galeria) objBe.readObject();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
