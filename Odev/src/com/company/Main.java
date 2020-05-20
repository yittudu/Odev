package com.company;
import java.util.Arrays;

public class Main {
    /* Ogrenci isimli sınıf olusturun.Bu sınıfta ogrencının ıdsi ve not degeri tutulmalı.100 elemanlı bir dizide id ve not degerleri rastgele
    oluşturarak bu ogrencılerı saklayın ve bu ogrencılerı aldıkları notlara gore azalan sırada yazdıran metodu yazın*/







     
    public static void main(String[] args) {

        Ogrenci tumOgrenciler[] = new Ogrenci[100];
        for (int i = 0; i < 100; i++) {
            int rastgeleID = (int) (Math.random() * 5000);
            int rastgeleNotDegeri = (int) (Math.random() * 100);
            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNotDegeri);
            tumOgrenciler[i] = yeni;


        }
        ogrencileriNotlarınaGoreSirala(tumOgrenciler);

        for(int i=0; i<100;i++){
            tumOgrenciler[i].ogrenciBilgileriniYazdir();;
        }

    }
    private static void ogrencileriNotlarınaGoreSirala(Ogrenci[]tumOgrenciler){
        for(int i=0;i<tumOgrenciler.length-1;i++){
            int oankiEnBuyukSayi=tumOgrenciler[i].getNotDegeri();
            int oankiEnBuyukElemaninIndex=i;
            for(int j=i+1; j<tumOgrenciler.length;j++){
                if(oankiEnBuyukSayi<tumOgrenciler[j].getNotDegeri()){
                    oankiEnBuyukSayi=tumOgrenciler[j].getNotDegeri();
                    oankiEnBuyukElemaninIndex=j;
                }
            }
            if(oankiEnBuyukElemaninIndex!=i){
                tumOgrenciler[oankiEnBuyukElemaninIndex]=tumOgrenciler[i];
                tumOgrenciler[i].setNotDegeri(oankiEnBuyukSayi);
            }
        }
    }
}
class Ogrenci{
   private int id;
   private  int notDegeri;


public Ogrenci(int id, int notDegeri){
    this.id=id;
    this.notDegeri=notDegeri;

}
public int getId(){
    return id;

}
public void setId(int id){
    this.id=id;

}
public int getNotDegeri(){
    return notDegeri;

}
public void setNotDegeri(int notDegeri){
    this.notDegeri=notDegeri;

}
public void ogrenciBilgileriniYazdir(){
    System.out.println("id: "+id+"not:"+notDegeri);
}
}