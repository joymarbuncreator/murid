package murid;

import java.sql.Connection; //membuat class Connection dan mengimpornya dari package java.sql 
import java.sql.DriverManager; //memanggil driver JDBC ke memori, dan dapat juga digunakan untuk membuka koneksi ke sumber data.
import java.sql.ResultSet;  //mempresentasikan sebuah hasil dari database yang dihasilkan dari statemen SQL SELECT.
import java.sql.SQLException;  //suatu class exception yang membungkus kesalahan (error) pengaksesan database.
import java.sql.Statement;  //mempresentasikan suatu perintah SQL, dan dapat digunakan untuk menerima objek ResultSet.
import java.util.logging.Level;  //jembatan penghubung antara aplikasi dan target lokasi logging
import java.util.logging.Logger; //mencatat segala informasi yang diperlukan berupa debuging ataupun error message, sehingga saat maintenance 
import javax.swing.JOptionPane; //menyediakan jendela dialog
import javax.swing.table.DefaultTableModel; //membuat model atau isinya tabel

public class murid extends javax.swing.JFrame { 

    DefaultTableModel model; //membuat tabel model
    public murid() { //menyatakan bahwa kelas dapat diakses oleh kelas lain dimanapun
        initComponents(); //memanggil fungsi konek()
        String [] judul  ={"NAMA","TGL LAHIR","ALAMAT","TELEPON"};
        model = new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tgl_lahir = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telepon = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                  DATA MURID BARU SMAN 1 MEDAN");

        jLabel2.setText("NAMA");

        jLabel3.setText("TGL LAHIR");

        jLabel4.setText("ALAMAT");

        jLabel5.setText("TELEPON");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "TGL LAHIR", "ALAMAT", "TELEPON"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama)
                                    .addComponent(tgl_lahir)
                                    .addComponent(alamat)
                                    .addComponent(telepon, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(128, 128, 128)))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btntambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btnhapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)
                        .addGap(148, 148, 148))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnreset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/murid","root",""); // koneksi ke database
            cn.createStatement().executeUpdate("update data set tgl_lahir ='"+tgl_lahir.getText()+"',alamat='"+alamat.getText()+"',telepon='"+telepon.getText()+"'where nama='"+nama.getText()+"'"); // // memasukkan data yang telah di edit sesuai dengan perintah nya kedalam database
            tampilkan(); // fungi untuk menampilkan
            tampilkan();
        } catch (SQLException ex) {
            Logger.getLogger(murid.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();

    }//GEN-LAST:event_btneditActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
         try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/murid","root",""); // mengkoneksikan data yang ditambah ke dalama database
            cn.createStatement().executeUpdate("insert into data values  "+"('"+nama.getText()+"','"+tgl_lahir.getText()+"','"+alamat.getText()+"','"+telepon.getText()+"')"); // memasukkan data yang telah di input sesuai dengan perintah nya kedalam database
            tampilkan(); // fungi untuk menampilkan
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Ada data yang belum diisi !!"); // feedback berupa method jika ada data yang belum diisi
        }
        reset();

    }//GEN-LAST:event_btntambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        
        if(i>-1){
            nama.setText(model.getValueAt(i,0).toString());
            tgl_lahir.setText(model.getValueAt(i,1).toString());
            alamat.setText(model.getValueAt(i,2).toString());
            telepon.setText(model.getValueAt(i,3).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
         try {
            // TODO add your handling code here:
//perintah untuk button hapus
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/murid","root",""); // mengkoneksikan ke database
            cn.createStatement().executeUpdate("delete from data where nama ='"+nama.getText()+"'"); 
            tampilkan(); // perintah tampil
        } catch (SQLException ex) {
            Logger.getLogger(murid.class.getName()).log(Level.SEVERE, null, ex);
        }
        reset();

    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        //perintah untuk button reset
        reset();

    }//GEN-LAST:event_btnresetActionPerformed
private void reset(){
    nama.setText(""); // setText disini berfungsi untuk menampilkan teks yang berada di file nama
    tgl_lahir.setText(""); // menampilkan hasil inputan tanggal lahir
    alamat.setText(""); // menampilkan hasil inputan alamat
    telepon.setText(""); // menampilkan hasil inputan telepon
}

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
            java.util.logging.Logger.getLogger(murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(murid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new murid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField tgl_lahir;
    // End of variables declaration//GEN-END:variables

     private void tampilkan() { // perintah untuk menampilkan dokumen
        int row = tabel.getRowCount();
        for(int a= 0; a<row;a++){
            model.removeRow(0);
        }
        try {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/murid","root",""); //membuka koneksi kesumber data
           ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM data"); //hasil koneksi
           while(rs.next()){
               String data []={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
               model.addRow(data);
           }
        } catch (SQLException ex) { //statement try..catch untuk mengurangi error
            Logger.getLogger(murid.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

