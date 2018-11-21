/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneUygulaması;

import java.util.List;
import java.util.Vector;
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
public class iadeEkran extends javax.swing.JFrame {

    /**
     * Creates new form iadeEkran
     */
    
        DefaultTableModel iadeTable = new DefaultTableModel(0, 0);
        String[] baslik={"BARKOD NO","Kitap Adı","Son Teslim Tarihi"};
        
        MainMenu anaEkran;
        OduncMain oduncMain;
    public iadeEkran(MainMenu main, OduncMain omain) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        anaEkran=main;
        oduncMain=omain;
        
        iadeTable.setColumnIdentifiers(baslik);
        jTable1.setModel(iadeTable);
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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_kisiListele = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton1.setText("Anasayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton2.setText("Ödünç İşlemleri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jButton3.setText("Ödünçteki Kitapların Tümünü Listele");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ara");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel1.setText("Barkod No:");

        lbl_kisiListele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_kisiListele.setForeground(new java.awt.Color(153, 0, 0));
        lbl_kisiListele.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_kisiListele.setText("İADE AL");

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("KİTABI İADE AL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_kisiListele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(398, 398, 398))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(50, 50, 50)
                .addComponent(lbl_kisiListele)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel1)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton5)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        listeTemizle();
        listele();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listeTemizle();
//        for (Kitap kitap : Kitap.kitaplar) {
//            if (jTextField1.getText().equals(kitap.barkodNo)) {
//                Vector data = new Vector();
//                data.add(kitap.barkodNo);
//                data.add(kitap.adi);
//                data.add(kitap.teslimTarihi);
//                iadeTable.addRow(data);
//            }
//        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow()>=0) {
        String barkodNo= iadeTable.getValueAt(jTable1.getSelectedRow(), 0).toString();
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
    EntityManager em = emf.createEntityManager();
    
    Query q = em.createQuery("SELECT k FROM KiTaplar k");
    List<KiTaplar> kitaplar = q.getResultList();
    
        for (KiTaplar k : kitaplar) {
            if (k.getBarkodno()==Integer.parseInt(barkodNo)) {
                   k.setOdunctemi(false);
                   k.setTeslim(null);
                   k.setTeslim(null);
                   JOptionPane.showMessageDialog(null, "Kitap İade Alındı", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
                   listeTemizle();
                   break;
        }
              else{
            JOptionPane.showMessageDialog(null, "Önce Bir Kitap Seçmelisiniz", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
        }
//        for (Kitap kitap : Kitap.kitaplar) {
//            if (kitap.barkodNo.equals(barkodNo)) {
//                kitap.oduncteMi=false;
//                kitap.teslimTarihi=null;
//                kitap.alınısTarihi=null;
//                JOptionPane.showMessageDialog(null, "Kitap İade Alındı", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
//                listeTemizle();
//                break;
//            }
//        }
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Önce Bir Kitap Seçmelisiniz", "BİLGİ", JOptionPane.INFORMATION_MESSAGE);
//        }
        }       
        }  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        anaEkran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        oduncMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(iadeEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iadeEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iadeEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iadeEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
               // new iadeEkran().setVisible(true);
         //   }
       // });
    }

    
    void listeTemizle(){
        if (jTable1.getRowCount() > 0) {
            int don = jTable1.getRowCount() - 1;
            for (int i = don; i >= 0; i--) {
                iadeTable.removeRow(i);
            }
            }
    }
    
    void listele(){
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("asdPU");
    EntityManager em = emf.createEntityManager();
    
    Query q = em.createQuery("SELECT k FROM KiTaplar k");
    List<KiTaplar> kitaplar = q.getResultList();
    
        for (KiTaplar k : kitaplar) {
            if (k.getOdunctemi()==true) {
                   Vector data = new Vector();
                   data.add(k.getBarkodno());
                   data.add(k.getAdi());
                   data.add(k.getTeslim());
                   iadeTable.addRow(data);
            }
        }
//        for (Kitap kitap : Kitap.kitaplar) {
//            if (kitap.oduncteMi==true) {
//                Vector data = new Vector();
//                data.add(kitap.barkodNo);
//                data.add(kitap.adi);
//                data.add(kitap.teslimTarihi);
//                iadeTable.addRow(data);
//            }
//        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_kisiListele;
    // End of variables declaration//GEN-END:variables
}
