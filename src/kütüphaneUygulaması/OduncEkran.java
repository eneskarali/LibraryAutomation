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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enesk
 */
public class OduncEkran extends javax.swing.JFrame {

    /**
     * Creates new form OduncEkran
     */
    DefaultTableModel kisiTablo = new DefaultTableModel(0, 0);
    String[] baslik = {"Adı ve Soyadı", "E-Posta", "Telefon No"};

    DefaultTableModel kitapTablo = new DefaultTableModel(0, 0);
    String[] baslik2 = {"Barkod NO", "Kitap Adı", "Yazar Adı Soyadı"};

    int oduncKitap;
    MainMenu anaEkran;
    OduncMain OduncMainEkran;

    boolean oduncVer = true;

    public OduncEkran(MainMenu main, OduncMain omain) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        kisiTablo.setColumnIdentifiers(baslik);
        table_kisi.setModel(kisiTablo);

        kitapTablo.setColumnIdentifiers(baslik2);
        table_kitap.setModel(kitapTablo);

        anaEkran = main;
        OduncMainEkran=omain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        button_mainMenu = new javax.swing.JButton();
        lbl_kitapListele = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_kisi = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_barkodNo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        button_kisiListele = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_kisiAra = new javax.swing.JTextField();
        button_kisiAra = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_kitap = new javax.swing.JTable();
        button_kitapListele = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_kitapAra = new javax.swing.JTextField();
        button_kitapAra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_kisiListele = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("Anasayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel7.setText("Yazar Soyadı:");

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("Kitap Adı:");

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel3.setText("Yazar Adı:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_mainMenu.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        button_mainMenu.setText("Anasayfa");
        button_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mainMenuActionPerformed(evt);
            }
        });

        lbl_kitapListele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_kitapListele.setForeground(new java.awt.Color(153, 0, 0));
        lbl_kitapListele.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_kitapListele.setText("KİTAPLARI LİSTELE / ARA");

        table_kisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_kisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_kisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_kisi);

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel6.setText("Kitap Barkod Numarası:");

        jButton3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton3.setText("Seçili Kişiye Ödünç Ver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        button_kisiListele.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        button_kisiListele.setText("Kişileri Listele");
        button_kisiListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kisiListeleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel11.setText("Ad, Soyad veya Tel No:");

        button_kisiAra.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        button_kisiAra.setText("Ara");
        button_kisiAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kisiAraActionPerformed(evt);
            }
        });

        table_kitap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_kitap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_kitapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_kitap);

        button_kitapListele.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        button_kitapListele.setText("Kitapları Listele");
        button_kitapListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kitapListeleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel12.setText("Kitap Veya Yazar Adı:");

        txt_kitapAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kitapAraActionPerformed(evt);
            }
        });

        button_kitapAra.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        button_kitapAra.setText("Ara");
        button_kitapAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kitapAraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Barkod Numarasını Öğrenmek için");

        jLabel13.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 51));
        jLabel13.setText("Bir Kitap Aratın veya Tümünü");

        jLabel14.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 51));
        jLabel14.setText("Listeleyerek Birini Seçin");

        lbl_kisiListele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_kisiListele.setForeground(new java.awt.Color(153, 0, 0));
        lbl_kisiListele.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_kisiListele.setText("KİŞİLERİ LİSTELE / ARA");

        jButton2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton2.setText("Ödünç İşlemleri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kitapListele, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(button_kisiListele, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_kisiAra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_kisiAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_barkodNo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_kitapListele, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_kitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_kitapAra, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel14)))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_kisiListele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_mainMenu)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(lbl_kisiListele)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_kisiListele)
                            .addComponent(jLabel11)
                            .addComponent(txt_kisiAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_kisiAra))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_barkodNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lbl_kitapListele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_kitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_kitapAra))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_kitapListele)
                        .addComponent(jLabel12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mainMenuActionPerformed
        // TODO add your handling code here:
        anaEkran.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_button_mainMenuActionPerformed

    private void txt_kitapAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kitapAraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kitapAraActionPerformed

    private void button_kisiListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kisiListeleActionPerformed
        // TODO add your handling code here:

kisiListeTemizle();
EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU"); 
        EntityManager em = emf.createEntityManager(); 
 
        Query q = em.createQuery("SELECT k FROM Kisiler k"); 
        List<Kisiler> kisiler = q.getResultList();
       
        for(Kisiler k : kisiler) { 
            Vector data = new Vector();
            data.add(k.getAdi()+" "+k.getSoyadi());
            data.add(k.getPosta());
            data.add(k.getTelefon());
            kisiTablo.addRow(data);
        }
        em.close();
        emf.close();
    }//GEN-LAST:event_button_kisiListeleActionPerformed

    private void button_kitapListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kitapListeleActionPerformed
        // TODO add your handling code here:

kitapListeTemizle();

EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT k FROM KiTaplar k");
        List<KiTaplar> kitaplar = q.getResultList();
        
        for (KiTaplar k : kitaplar) {
              Vector data = new Vector();
            data.add(k.getBarkodno().toString());
            data.add(k.getAdi());
            data.add(k.getYazaradi() + " " + k.getYazarsoyadi());
            kitapTablo.addRow(data);
        }
        em.close();
        emf.close();

//        for (Kitap kitap : Kitap.kitaplar) {
//            Vector data = new Vector();
//            if (kitap.oduncteMi == true) {
//                data.add(" "+kitap.teslimTarihi+" e kadar Ödünçte");
//                oduncVer = false;
//            } else {
//                data.add(kitap.barkodNo);
//            }
//            data.add(kitap.adi);
//            data.add(kitap.yazarAdi + " " + kitap.yazarSoyadi);
//            kitapTablo.addRow(data);
//        }
    }//GEN-LAST:event_button_kitapListeleActionPerformed

    private void button_kisiAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kisiAraActionPerformed
        // TODO add your handling code here:
kisiListeTemizle();
EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU"); 
        EntityManager em = emf.createEntityManager(); 
 
        Query q = em.createQuery("SELECT k FROM Kisiler k"); 
        List<Kisiler> kisiler = q.getResultList();
       
        for(Kisiler k : kisiler) {
            if (k.getAdi().equals(txt_kisiAra.getText()) || k.getSoyadi().equals(txt_kisiAra.getText()) || k.getPosta().equals(txt_kisiAra.getText())) {
            Vector data = new Vector();
            data.add(k.getAdi()+" "+k.getSoyadi());
            data.add(k.getPosta());
            data.add(k.getTelefon());
            kisiTablo.addRow(data);
            }
        }
        em.close();
        emf.close();
        for (Kisi kisi : Kisi.kisiler) {
            if (txt_kisiAra.getText().equals(kisi.adi) || txt_kisiAra.getText().equals(kisi.soyAdi) || txt_kisiAra.getText().equals(kisi.telNo)) {
                Vector data = new Vector();
                data.add(kisi.adi+" "+kisi.soyAdi);
                data.add(kisi.ePosta);
                data.add(kisi.telNo);
                kisiTablo.addRow(data);
            }
        }
    }//GEN-LAST:event_button_kisiAraActionPerformed

    private void button_kitapAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kitapAraActionPerformed
        // TODO add your handling code here:

kitapListeTemizle();
String ara = txt_kitapAra.getText();
EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT k FROM KiTaplar k");
        List<KiTaplar> kitaplar = q.getResultList();
        
        for (KiTaplar k : kitaplar) {
            if (k.getAdi().equals(ara) || k.getBarkodno()==Integer.parseInt(ara) || k.getYazaradi().equals(ara) || k.getYazarsoyadi().equals(ara)) {
              Vector data = new Vector();
            data.add(k.getBarkodno().toString());
            data.add(k.getAdi());
            data.add(k.getYazaradi() + " " + k.getYazarsoyadi());
            data.add(k.getSayfasayisi().toString());
            kitapTablo.addRow(data);
        }
        }
        em.close();
        emf.close();

//        for (Kitap kitap : Kitap.kitaplar) {
//            if (txt_kitapAra.getText().equals(kitap.adi) || txt_kitapAra.getText().equals(kitap.yazarAdi) || txt_kitapAra.getText().equals(kitap.yazarSoyadi)) {
//                Vector data = new Vector();
//                data.add(kitap.barkodNo);
//                data.add(kitap.adi);
//                data.add(kitap.yazarAdi + " " + kitap.yazarSoyadi);
//                kitapTablo.addRow(data);
//            }
//        }
    }//GEN-LAST:event_button_kitapAraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
if(table_kisi.getSelectedRow()>=0){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
    EntityManager em = emf.createEntityManager();
    
    Query q = em.createQuery("SELECT k FROM KiTaplar k");
    List<KiTaplar> kitaplar = q.getResultList();
    
    for (KiTaplar k : kitaplar) {
        if (Integer.parseInt(txt_barkodNo.getText())==k.getBarkodno()) {
            oduncKitap= k.getBarkodno();
            if (k.getOdunctemi()==false) {
                String secilenMail = table_kisi.getValueAt(table_kisi.getSelectedRow(), 1).toString();
                k.setKimde(secilenMail);
                k.setOdunctemi(true);
                try {
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Kütüphane", "admin", "admin");
                    PreparedStatement pre = con.prepareStatement("INSERT INTO ODUNC (POSTA, BARKOD) VALUES(?,?)");
                    pre.setString(1, secilenMail);
                    pre.setInt(2, oduncKitap);
                    pre.executeUpdate();
                    pre.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OduncEkran.class.getName()).log(Level.SEVERE, null, ex);
                }
                Date alinis = new Date();
                SimpleDateFormat alinisFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                k.setAlinisd(alinis);
                k.setAlinis(alinisFormat.format(alinis));
                
                 long teslimSaniye = ((alinis.getTime() + 1296000000));
                 Date teslim = new Date(teslimSaniye);
                 SimpleDateFormat teslimFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                 k.setTeslimd(teslim);
                 k.setTeslim(teslimFormat.format(teslim));
                 JOptionPane.showMessageDialog(null, "Kitap "+teslimFormat.format(teslim)+" tarihine kadar ödünç verilmiştir.", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
        txt_barkodNo.setText("");
        em.getTransaction().begin();
        em.getTransaction().commit();
        kisiListeTemizle();
        kitapListeTemizle();
                break;
            }
            else{
            JOptionPane.showMessageDialog(null, "Kitap Zaten Farklı Birinde Ödünçte!", "UYARI!", JOptionPane.WARNING_MESSAGE);
        }
            
        }
    }
//            for (Kitap kitap : Kitap.kitaplar) {
//                if (txt_barkodNo.getText().equals(kitap.barkodNo)) {
//                    oduncKitap = kitap;
//                    break;
//                }
//            }
        
//        if(oduncKitap.oduncteMi==false){
//        String secilenMail = table_kisi.getValueAt(table_kisi.getSelectedRow(), 1).toString(); 
//        for (Kisi kisi : Kisi.kisiler) {
//                if (kisi.ePosta.equals(secilenMail)) {
//                kisi.aldıgıKitaplar.add(oduncKitap);
//                oduncKitap.oduncteMi = true;
//                oduncKitap.kitapKimde=kisi;
//                break;
//            }
//            }
//        
//        Date alinis = new Date();
//        SimpleDateFormat alinisFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//        oduncKitap.alınısTarihiD=alinis;
//        oduncKitap.alınısTarihi = alinisFormat.format(alinis);
//
//        long teslimSaniye = ((alinis.getTime() + 1296000000));
//        Date teslim = new Date(teslimSaniye);
//        SimpleDateFormat teslimFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//        oduncKitap.teslimTarihi = teslimFormat.format(teslim);
//        oduncKitap.teslimTarihiD=teslim;
        
//        JOptionPane.showMessageDialog(null, "Kitap "+teslimFormat.format(teslim)+" tarihine kadar ödünç verilmiştir.", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
//        txt_barkodNo.setText("");
//        kisiListeTemizle();
//        kitapListeTemizle();
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Kitap Zaten Farklı Birinde Ödünçte!", "UYARI!", JOptionPane.WARNING_MESSAGE);
//        }
}

else{
    JOptionPane.showMessageDialog(null, "Öncelikle Kişi Listesinden Ödünç Vereceğiniz Kişiyi Seçmelisiniz", "UYARI!", JOptionPane.WARNING_MESSAGE);
}
        
        


    }//GEN-LAST:event_jButton3ActionPerformed

    private void table_kitapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_kitapMouseClicked
        // TODO add your handling code here:
        if (table_kitap.getSelectedRow()>=0) {
        String barkod = table_kitap.getValueAt(table_kitap.getSelectedRow(), 0).toString();
            if (!barkod.substring(0, 1).equals(" ")) {
        txt_barkodNo.setText(barkod);        
            } 
        }
    }//GEN-LAST:event_table_kitapMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OduncMainEkran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_kisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_kisiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_kisiMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OduncEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OduncEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OduncEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OduncEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //public void run() {
        //  new OduncEkran().setVisible(true);
        //}
        //});
    }
    
    void kitapListeTemizle(){
                if (table_kitap.getRowCount() > 0) {
            int don = table_kitap.getRowCount() - 1;
            for (int i = don; i >= 0; i--) {
                kitapTablo.removeRow(i);
            }
        }
    }
    void kisiListeTemizle(){
                if (table_kisi.getRowCount() > 0) {
            int don = table_kisi.getRowCount() - 1;
            for (int i = don; i >= 0; i--) {
                kisiTablo.removeRow(i);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_kisiAra;
    private javax.swing.JButton button_kisiListele;
    private javax.swing.JButton button_kitapAra;
    private javax.swing.JButton button_kitapListele;
    private javax.swing.JButton button_mainMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl_kisiListele;
    private javax.swing.JLabel lbl_kitapListele;
    private javax.swing.JTable table_kisi;
    private javax.swing.JTable table_kitap;
    private javax.swing.JTextField txt_barkodNo;
    private javax.swing.JTextField txt_kisiAra;
    private javax.swing.JTextField txt_kitapAra;
    // End of variables declaration//GEN-END:variables
}
