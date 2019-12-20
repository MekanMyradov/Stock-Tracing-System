package  sample;
import sample.soyutMM;

import java.io.*;
public class Tedarikci extends soyutMM {
private String isim;
private String teslimatSuresi;

public Tedarikci(String isim, String s, String teslimatSuresi){
    this.isim=isim;
    this.tedarikci_id=s;
    this.teslimatSuresi=teslimatSuresi;

}
    @Override
    public String getTedarikci_id(){
        return tedarikci_id;
    }

public String get_isim(){
        return isim;
    }

    public String getTeslimatSuresi(){
        return teslimatSuresi;
    }

}
