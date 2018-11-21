/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author enesk
 */
public class Kisi {
    
    static ArrayList<Kisi> kisiler = new ArrayList<>();
    
    String adi, soyAdi,telNo,ePosta;
    
    ArrayList<Kitap> aldıgıKitaplar;
    
    Kisi(){
    
}
    
    Kisi(String adi, String soyAdi, String telNo,String ePosta){
        Kisiler newk = new Kisiler();
            newk.setAdi(adi);
            newk.setPosta(ePosta);
            newk.setSoyadi(soyAdi);
            newk.setTelefon(telNo);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin(); 
            em.persist(newk);
            em.getTransaction().commit();
            em.close();
            emf.close();
    }
    
}
