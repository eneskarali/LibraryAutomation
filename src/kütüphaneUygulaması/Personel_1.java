/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author enesk
 */
@Entity
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel_1.findAll", query = "SELECT p FROM Personel_1 p"),
    @NamedQuery(name = "Personel_1.findByKadi", query = "SELECT p FROM Personel_1 p WHERE p.kadi = :kadi"),
    @NamedQuery(name = "Personel_1.findByAdi", query = "SELECT p FROM Personel_1 p WHERE p.adi = :adi"),
    @NamedQuery(name = "Personel_1.findBySoyadi", query = "SELECT p FROM Personel_1 p WHERE p.soyadi = :soyadi"),
    @NamedQuery(name = "Personel_1.findByTelefon", query = "SELECT p FROM Personel_1 p WHERE p.telefon = :telefon"),
    @NamedQuery(name = "Personel_1.findBySiFre", query = "SELECT p FROM Personel_1 p WHERE p.siFre = :siFre"),
    @NamedQuery(name = "Personel_1.findByMevki", query = "SELECT p FROM Personel_1 p WHERE p.mevki = :mevki"),
    @NamedQuery(name = "Personel_1.findByPosta", query = "SELECT p FROM Personel_1 p WHERE p.posta = :posta")})
public class Personel_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KADI")
    private String kadi;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "TELEFON")
    private String telefon;
    @Column(name = "S\u0130FRE")
    private String siFre;
    @Column(name = "MEVKI")
    private String mevki;
    @Column(name = "POSTA")
    private String posta;

    public Personel_1() {
    }

    public Personel_1(String kadi) {
        this.kadi = kadi;
    }

    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getSiFre() {
        return siFre;
    }

    public void setSiFre(String siFre) {
        this.siFre = siFre;
    }

    public String getMevki() {
        return mevki;
    }

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kadi != null ? kadi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel_1)) {
            return false;
        }
        Personel_1 other = (Personel_1) object;
        if ((this.kadi == null && other.kadi != null) || (this.kadi != null && !this.kadi.equals(other.kadi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "k\u00fct\u00fcphaneUygulamas\u0131.Personel_1[ kadi=" + kadi + " ]";
    }
    
}
