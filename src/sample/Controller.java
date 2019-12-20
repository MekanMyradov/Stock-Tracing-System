package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    //********************************mmain giris ekran
    @FXML
    TextField email;
    @FXML
    PasswordField sifre;
    @FXML
    Button btngiris;
    @FXML
    Button btnkayit;

    public void girisyap(ActionEvent actionEvent){
        System.out.println("girisyap");//calisan müsteri ya da yönetici ekrana geçiş yapılacak


    }
    public void kayitolagit(ActionEvent actionEvent) throws IOException {
        System.out.println("kayit");
        (new Kayitol()).start(new Stage());
    }
    //********************************************kayıt ol ekranı*****************
    @FXML
    private TextField ad;

    @FXML
    private TextField adres;

    @FXML
    private Button btnkayitol;

    @FXML
    private TextField eMail;

    @FXML
    private TextField sifre1;

    @FXML
    private TextField sifre2;

    @FXML
    private TextField soyad;

    @FXML
    private TextField tcNo;

    @FXML
    private TextField telNo;

    @FXML
    private Label sonuc;

    public void kayit(ActionEvent actionEvent){
        System.out.println("asfsfasdasdasdasdadasd");
    }

    //****************************************calisan ARAYUZ**********************************************
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField UrunKaydiFiyat;

    @FXML
    private TextField UrunKaydiStokAdedi;

    @FXML
    private TextField UrunKaydiTedarikciId;

    @FXML
    private Tab Yetkili_CalisanHesapOlusturma;

    @FXML
    private TextField add;

    @FXML
    private TextField adress;

    @FXML
    private Text barkodId;

    @FXML
    private Button btnCalisanKayitOlustur;

    @FXML
    private Button btnYetkiliUrunKayit;

    @FXML
    private Text calisanNo;

    @FXML
    private TextField calisann;

    @FXML
    private TextField eMaill;

    @FXML
    private Text fiyat;

    @FXML
    private TextField sifree1;

    @FXML
    private TextField sifree2;

    @FXML
    private TextField soyadd;

    @FXML
    private TextField tcNoo;

    @FXML
    private TextField telNoo;

    @FXML
    private TextField urunKaydiBarkodNumarasi;

    @FXML
    private TextField urunKaydiUrunAdi;

    @FXML
    private ListView<?> yetkiliSiparisKontrol;

    @FXML
    private Tab yetkiliSiparisTakip;

    @FXML
    private TableColumn<?, ?> yetkiliUrunBarkodNo;

    @FXML
    private TableColumn<?, ?> yetkiliUrunFiyat;

    @FXML
    private Tab yetkiliUrunKaydi;

    @FXML
    private TableColumn<?, ?> yetkiliUrunStok;

    @FXML
    private Tab yetkiliUrunTakip;

    @FXML
    private TableColumn<?, ?> yetkiliUrunTedarikciId;

    @FXML
    private TableColumn<?, ?> yetkiliUrunUrunAdi;

//*************************************************************************************************************
}
