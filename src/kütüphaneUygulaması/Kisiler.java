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
@Table(name = "KISILER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kisiler.findAll", query = "SELECT k FROM Kisiler k"),
    @NamedQuery(name = "Kisiler.findByAdi", query = "SELECT k FROM Kisiler k WHERE k.adi = :adi"),
    @NamedQuery(name = "Kisiler.findBySoyadi", query = "SELECT k FROM Kisiler k WHERE k.soyadi = :soyadi"),
    @NamedQuery(name = "Kisiler.findByTelefon", query = "SELECT k FROM Kisiler k WHERE k.telefon = :telefon"),
    @NamedQuery(name = "Kisiler.findByPosta", query = "SELECT k FROM Kisiler k WHERE k.posta = :posta")})
public class Kisiler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "TELEFON")
    private String telefon;
    @Id
    @Basic(optional = false)
    @Column(name = "POSTA")
    private String posta;

    public Kisiler() {
    }

    public Kisiler(String posta) {
        this.posta = posta;
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

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posta != null ? posta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kisiler)) {
            return false;
        }
        Kisiler other = (Kisiler) object;
        if ((this.posta == null && other.posta != null) || (this.posta != null && !this.posta.equals(other.posta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "k\u00fct\u00fcphaneUygulamas\u0131.Kisiler[ posta=" + posta + " ]";
    }
    
}
