/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author enesk
 */
public class Kitap {
    
//    static ArrayList<Kitap> kitaplar= new ArrayList<>();
    
    String adi, yazarAdi,yazarSoyadi,barkodNo, sayfaSayisi;
    
    String alınısTarihi,teslimTarihi;
    
    Date alınısTarihiD,teslimTarihiD;
    
    Kisi kitapKimde;
    
    boolean oduncteMi;
    
    Kitap(String barkodNo, String adi, String yazarAd,String yazarSoyad, String sayfaSayisi){
       KiTaplar newk = new KiTaplar();
       newk.setAdi(adi);
       newk.setBarkodno(Integer.parseInt(barkodNo));
       newk.setSayfasayisi(Integer.parseInt(sayfaSayisi));
       newk.setYazaradi(yazarAd);
       newk.setYazarsoyadi(yazarSoyad);
       newk.setOdunctemi(false);
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       em.persist(newk);
       em.getTransaction().commit();
       em.close();
       emf.close();
    }
    
}
