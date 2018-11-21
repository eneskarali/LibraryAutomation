/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author enesk
 */
@Entity
@Table(name = "K\u0130TAPLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KiTaplar.findAll", query = "SELECT k FROM KiTaplar k"),
    @NamedQuery(name = "KiTaplar.findByBarkodno", query = "SELECT k FROM KiTaplar k WHERE k.barkodno = :barkodno"),
    @NamedQuery(name = "KiTaplar.findByAdi", query = "SELECT k FROM KiTaplar k WHERE k.adi = :adi"),
    @NamedQuery(name = "KiTaplar.findByYazaradi", query = "SELECT k FROM KiTaplar k WHERE k.yazaradi = :yazaradi"),
    @NamedQuery(name = "KiTaplar.findByYazarsoyadi", query = "SELECT k FROM KiTaplar k WHERE k.yazarsoyadi = :yazarsoyadi"),
    @NamedQuery(name = "KiTaplar.findBySayfasayisi", query = "SELECT k FROM KiTaplar k WHERE k.sayfasayisi = :sayfasayisi"),
    @NamedQuery(name = "KiTaplar.findByAlinis", query = "SELECT k FROM KiTaplar k WHERE k.alinis = :alinis"),
    @NamedQuery(name = "KiTaplar.findByTeslim", query = "SELECT k FROM KiTaplar k WHERE k.teslim = :teslim"),
    @NamedQuery(name = "KiTaplar.findByAlinisd", query = "SELECT k FROM KiTaplar k WHERE k.alinisd = :alinisd"),
    @NamedQuery(name = "KiTaplar.findByTeslimd", query = "SELECT k FROM KiTaplar k WHERE k.teslimd = :teslimd")})
public class KiTaplar implements Serializable {

    @Column(name = "ODUNCTEMI")
    private Boolean odunctemi;
    @Column(name = "KIMDE")
    private String kimde;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BARKODNO")
    private Integer barkodno;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "YAZARADI")
    private String yazaradi;
    @Column(name = "YAZARSOYADI")
    private String yazarsoyadi;
    @Column(name = "SAYFASAYISI")
    private Integer sayfasayisi;
    @Column(name = "ALINIS")
    private String alinis;
    @Column(name = "TESLIM")
    private String teslim;
    @Column(name = "ALINISD")
    @Temporal(TemporalType.DATE)
    private Date alinisd;
    @Column(name = "TESLIMD")
    @Temporal(TemporalType.DATE)
    private Date teslimd;

    public KiTaplar() {
    }

    public KiTaplar(Integer barkodno) {
        this.barkodno = barkodno;
    }

    public Integer getBarkodno() {
        return barkodno;
    }

    public void setBarkodno(Integer barkodno) {
        this.barkodno = barkodno;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazaradi() {
        return yazaradi;
    }

    public void setYazaradi(String yazaradi) {
        this.yazaradi = yazaradi;
    }

    public String getYazarsoyadi() {
        return yazarsoyadi;
    }

    public void setYazarsoyadi(String yazarsoyadi) {
        this.yazarsoyadi = yazarsoyadi;
    }

    public Integer getSayfasayisi() {
        return sayfasayisi;
    }

    public void setSayfasayisi(Integer sayfasayisi) {
        this.sayfasayisi = sayfasayisi;
    }

    public String getAlinis() {
        return alinis;
    }

    public void setAlinis(String alinis) {
        this.alinis = alinis;
    }

    public String getTeslim() {
        return teslim;
    }

    public void setTeslim(String teslim) {
        this.teslim = teslim;
    }

    public Date getAlinisd() {
        return alinisd;
    }

    public void setAlinisd(Date alinisd) {
        this.alinisd = alinisd;
    }

    public Date getTeslimd() {
        return teslimd;
    }

    public void setTeslimd(Date teslimd) {
        this.teslimd = teslimd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (barkodno != null ? barkodno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KiTaplar)) {
            return false;
        }
        KiTaplar other = (KiTaplar) object;
        if ((this.barkodno == null && other.barkodno != null) || (this.barkodno != null && !this.barkodno.equals(other.barkodno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "k\u00fct\u00fcphaneUygulamas\u0131.KiTaplar[ barkodno=" + barkodno + " ]";
    }

    public Boolean getOdunctemi() {
        return odunctemi;
    }

    public void setOdunctemi(Boolean odunctemi) {
        this.odunctemi = odunctemi;
    }

    public String getKimde() {
        return kimde;
    }

    public void setKimde(String kimde) {
        this.kimde = kimde;
    }
    
}
