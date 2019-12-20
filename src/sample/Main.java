package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;
import java.io.*;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

//reading from Tedarikci.txt
        String tedarikciler="";
        try{
            FileInputStream tedarikci=new FileInputStream("/home/myradov/Documents/Pending Assignments/OOP/default/Tedarikci.txt");
            int n;
            while((n=tedarikci.available())>0){
                byte[] b=new byte[n];
                int result=tedarikci.read(b);
                if(result==-1) break;
                String s=new String(b);
                tedarikciler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(tedarikciler);

// converting Tedarikci.txt to objects

        ArrayList<Tedarikci> tedarikciObjArrL=new ArrayList<Tedarikci>(0);
        String [] tedArr=tedarikciler.split("\n");
        for(int i=0;i<tedArr.length;i++){       // splittin each item
            String tmp=tedArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            tedarikciObjArrL.add(new Tedarikci(innerr[0],innerr[1],innerr[2]));

        }

        for(int i=0; i<tedarikciObjArrL.size();i++){

//    System.out.println(tedarikciObjArrL.get(i).isim);
            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(tedarikciObjArrL.get(i).get_isim());
            System.out.println(tedarikciObjArrL.get(i).getTedarikci_id());
            System.out.println(tedarikciObjArrL.get(i).getTeslimatSuresi());
            System.out.println();

        }

// reading from Musteri.txt

        String musteriler="";
        try{
            FileInputStream musteri=new FileInputStream("/home/myradov/Documents/Pending Assignments/OOP/default/Musteri.txt");
            int n;
            while((n=musteri.available())>0){
                byte[] b=new byte[n];
                int result=musteri.read(b);
                if(result==-1) break;
                String s=new String(b);
                musteriler+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(musteriler);

// converting Musteri.txt to objects

        ArrayList<Musteri> musteriObjArrL=new ArrayList<Musteri>(0);
        String [] mustArr=musteriler.split("\n");
        for(int i=0;i<mustArr.length;i++){       // splittin each item
            String tmp=mustArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            musteriObjArrL.add(new Musteri(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }

        for(int i=0; i<musteriObjArrL.size();i++){

//    System.out.println(tedarikciObjArrL.get(i).isim);
            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(musteriObjArrL.get(i).getisim());
            System.out.println(musteriObjArrL.get(i).getSoyisim());
            System.out.println(musteriObjArrL.get(i).getSifre());
            System.out.println(musteriObjArrL.get(i).getTc());
            System.out.println(musteriObjArrL.get(i).getTelefon());
            System.out.println(musteriObjArrL.get(i).getEMail());
            System.out.println(musteriObjArrL.get(i).getAdres());
            System.out.println(musteriObjArrL.get(i).getMusteriNo());
            System.out.println(musteriObjArrL.get(i).getOdemeSekli());
            System.out.println();

        }

// reading from Calisan.txt

        String calisanlar="";
        try{
            FileInputStream calisan=new FileInputStream("/home/myradov/Documents/Pending Assignments/OOP/default/Calisan.txt");
            int n;
            while((n=calisan.available())>0){
                byte[] b=new byte[n];
                int result=calisan.read(b);
                if(result==-1) break;
                String s=new String(b);
                calisanlar+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(calisanlar);

// converting Calisan.txt to objects

        ArrayList<Calisan> calisanObjArrL=new ArrayList<Calisan>(0);
        String [] calArr=calisanlar.split("\n");
        for(int i=0;i<calArr.length;i++){       // splittin each item
            String tmp=calArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            calisanObjArrL.add(new Calisan(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }

        for(int i=0; i<calisanObjArrL.size();i++){

//    System.out.println(tedarikciObjArrL.get(i).isim);
            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(calisanObjArrL.get(i).getisim());
            System.out.println(calisanObjArrL.get(i).getSoyisim());
            System.out.println(calisanObjArrL.get(i).getSifre());
            System.out.println(calisanObjArrL.get(i).getTc());
            System.out.println(calisanObjArrL.get(i).getTelefon());
            System.out.println(calisanObjArrL.get(i).getEMail());
            System.out.println(calisanObjArrL.get(i).getAdres());
            System.out.println(calisanObjArrL.get(i).getCalisanNo());
            System.out.println(calisanObjArrL.get(i).getMaas());
            System.out.println();

        }

// reading from Yetkili.txt
        String yetkililer="";
        try{
            FileInputStream yetkili=new FileInputStream("/home/myradov/Documents/Pending Assignments/OOP/default/Yetkili.txt");
            int n;
            while((n=yetkili.available())>0){
                byte[] b=new byte[n];
                int result=yetkili.read(b);
                if(result==-1) break;
                String s=new String(b);
                yetkililer+=s;
            }
        }
        catch(IOException e){System.out.println(e);}
//    System.out.println(yetkililer);

// converting Calisan.txt to objects

        ArrayList<Yetkili> yetkiliObjArrL=new ArrayList<Yetkili>(0);
        String [] yetArr=yetkililer.split("\n");
        for(int i=0;i<yetArr.length;i++){       // splittin each item
            String tmp=yetArr[i];               // 1 kayit alir
            String [] innerr=tmp.split(";");

            yetkiliObjArrL.add(new Yetkili(innerr[0],innerr[1],innerr[2],innerr[3],innerr[4],innerr[5],innerr[6],innerr[7],innerr[8]));

        }

        for(int i=0; i<yetkiliObjArrL.size();i++){

////    System.out.println(tedarikciObjArrL.get(i).isim);
//            //   System.out.println(tedarikciObjArrL.get(i).tedarikciID);
//            // System.out.println(tedarikciObjArrL.get(i).teslimatSuresi);
            System.out.println(yetkiliObjArrL.get(i).getisim());
            System.out.println(yetkiliObjArrL.get(i).getSoyisim());
            System.out.println(yetkiliObjArrL.get(i).getSifre());
            System.out.println(yetkiliObjArrL.get(i).getTc());
            System.out.println(yetkiliObjArrL.get(i).getTelefon());
            System.out.println(yetkiliObjArrL.get(i).getEMail());
            System.out.println(yetkiliObjArrL.get(i).getAdres());
            System.out.println(yetkiliObjArrL.get(i).getCalisanNo());
            System.out.println(yetkiliObjArrL.get(i).getMaas());
            System.out.println();
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("GİRİŞ YAP");
        primaryStage.setScene(new Scene(root, 586, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
