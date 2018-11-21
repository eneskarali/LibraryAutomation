/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enesk
 */
public class Personel {

    static ArrayList<Personel> personeller = new ArrayList();

    String adi, soyAdi, kAdi, ePosta, mevki, telNo;
    private String sifre;
    boolean DogruGiris = false;
    
    static int personelNo=-1;
    
    Connection con;
    PreparedStatement sta;
    ResultSet rs;

    Personel(String kullanıcıAdi, String adi, String soyAdi, String ePosta, String sifre, String mevki, String telNo) {
        personelNo++;
        this.kAdi=kullanıcıAdi;
        this.adi = adi;
        this.soyAdi = soyAdi;
        this.ePosta = ePosta;
        this.sifre = sifre;
        this.mevki=mevki;
        this.telNo=telNo;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Kütüphane", "admin", "admin");
            sta= con.prepareStatement("INSERT INTO PERSONEL(ADI, SOYADI,TELEFON, KADI, SİFRE, MEVKI,POSTA) VALUES(?,?,?,?,?,?,?) ");
            sta.setString(1, adi);
            sta.setString(2, soyAdi);
            sta.setString(3, telNo);
            sta.setString(4, kullanıcıAdi);
            sta.setString(5, sifre);
            sta.setString(6, mevki);
            sta.setString(7, ePosta);
            sta.executeUpdate();
            sta.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        personeller.add(this);
    }

    String getSifre(Personel personel) {
        return personel.sifre;
    }
    
    void setSifre(Personel personel,String yeniSifre){
        personel.sifre=yeniSifre;
    }

}
