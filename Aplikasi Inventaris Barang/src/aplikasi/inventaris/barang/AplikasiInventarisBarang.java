/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.inventaris.barang;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.AWTException;

/**
 *
 * @author Mujahid
 */
public class AplikasiInventarisBarang extends javax.swing.JFrame {
    

    /**
     * Creates new form AplikasiInventarisBarang
     */
    public AplikasiInventarisBarang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfkodebarang = new javax.swing.JTextField();
        tfnamabarang = new javax.swing.JTextField();
        tfstokbarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbtipebarang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdatabarang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bttambah = new javax.swing.JButton();
        btubah = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventaris Barang");

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data"));

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Tipe Barang");

        jLabel4.setText("Stok Barang");

        cbtipebarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Konsumsi", "Produksi", "Umum" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbtipebarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfnamabarang)
                    .addComponent(tfkodebarang)
                    .addComponent(tfstokbarang))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfkodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbtipebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfstokbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbdatabarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tbdatabarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Tipe", "Stok"
            }
        ));
        jScrollPane1.setViewportView(tbdatabarang);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        bttambah.setText("Tambah");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        btubah.setText("Ubah");
        btubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btubahActionPerformed(evt);
            }
        });

        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bthapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah)
                    .addComponent(btubah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbatal)
                    .addComponent(btsimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btkeluar)
                    .addComponent(bthapus))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
    // mencek jika ada text field kosong atau combo box yang tidak di pilih
    if (tfkodebarang.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: Kode Barang kosong!",
                "Error: isian Kode Barang kosong!", JOptionPane.WARNING_MESSAGE);
        tfkodebarang.requestFocus();
        return;
    } else if (tfnamabarang.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: Nama Barang kosong!",
                "Error: isian Nama Barang kosong!", JOptionPane.WARNING_MESSAGE);
        tfnamabarang.requestFocus();
        return;
    } else if (cbtipebarang.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(null, "Error: Tipe Barang belum di pilih!",
                "Error: Tipe Barang belum di pilih!", JOptionPane.WARNING_MESSAGE);
        try {
            // Menggunakan class robot untuk memindahkan  cursour mouse otomatis ke cbtipebarang jika cbtipebarang belum di pilih
            Robot robot = new Robot();
            robot.mouseMove(cbtipebarang.getLocationOnScreen().x + cbtipebarang.getWidth() / 2, cbtipebarang.getLocationOnScreen().y + cbtipebarang.getHeight() / 2);
        } catch (AWTException e) {
        }
        return;
    } else if (tfstokbarang.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: Stok Barang kosong!",
                "Error: isian Stok Barang kosong!", JOptionPane.WARNING_MESSAGE);
        tfstokbarang.requestFocus();
        return;
    }

    // Mengambil data dari text fields dan combo box
    String kode = tfkodebarang.getText();
    String nama = tfnamabarang.getText();
    String tipe = cbtipebarang.getSelectedItem().toString();
    String stok = tfstokbarang.getText();

    // Menambah data ke dalam tabel
    DefaultTableModel model = (DefaultTableModel) tbdatabarang.getModel();
    Object[] row = {kode, nama, tipe, stok};
    model.addRow(row);

    // Menclear text field dan combo box setelah menambah data ke dalam tabel
    tfkodebarang.setText("");
    tfnamabarang.setText("");
    cbtipebarang.setSelectedIndex(0);
    tfstokbarang.setText("");
            
    }//GEN-LAST:event_bttambahActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // Clear text fields dan combo box
    tfkodebarang.setText("");
    tfnamabarang.setText("");
    cbtipebarang.setSelectedIndex(0);
    tfstokbarang.setText("");
    
    // Clear data yang di select di dalam tabel
    tbdatabarang.clearSelection();
    }//GEN-LAST:event_btbatalActionPerformed

    private void btubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btubahActionPerformed
        // Ambil baris yang dipilih pada tabel
    int selectedRowIndex = tbdatabarang.getSelectedRow();

    // Mencek jika baris belum dipilih di tabel
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Error: Pilih data terlebih dahulu!", "Error: Data belum dipilih!", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Mengambil data dari baris yang dipilih
    String kode = tbdatabarang.getValueAt(selectedRowIndex, 0).toString();
    String nama = tbdatabarang.getValueAt(selectedRowIndex, 1).toString();
    String tipe = tbdatabarang.getValueAt(selectedRowIndex, 2).toString();
    String stok = tbdatabarang.getValueAt(selectedRowIndex, 3).toString();

    // Menampilkan data di dalam text fields and combo box
    tfkodebarang.setText(kode);
    tfnamabarang.setText(nama);
    cbtipebarang.setSelectedItem(tipe);
    tfstokbarang.setText(stok);
    }//GEN-LAST:event_btubahActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
         // Ambil baris yang dipilih pada tabel
    int selectedRow = tbdatabarang.getSelectedRow();

    // Mencek jika baris belum dipilih di tabel
    if (selectedRow == -1) {
         JOptionPane.showMessageDialog(null, "Error: Pilih Data terlebih dahulu!",
                "Error: Pilih Data!", JOptionPane.WARNING_MESSAGE);
        return;
         }

    // Hapus baris pada baris yang dipilih pada tabel
    DefaultTableModel model = (DefaultTableModel) tbdatabarang.getModel();
    model.removeRow(selectedRow);
    }//GEN-LAST:event_bthapusActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
         // Keluar dari aplikasi
    System.exit(0);
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
   // Ambil baris yang dipilih pada tabel
    int selectedRowIndex = tbdatabarang.getSelectedRow();

    // Mencek jika baris belum dipilih di tabel
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(null, "Error: Pilih data terlebih dahulu!",
                "Error: Data belum dipilih!", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Mengambil data dari baris yang dipilih
    String kode = tfkodebarang.getText();
    String nama = tfnamabarang.getText();
    String tipe = cbtipebarang.getSelectedItem().toString();
    String stok = tfstokbarang.getText();

    // Mencek ada field yang kosong
    if (kode.isEmpty() || nama.isEmpty() || tipe.equals("Pilih") || stok.isEmpty()) {
      JOptionPane.showMessageDialog(null, "Error: Field tidak boleh kosong",
                "Error: Data belum dipilih!", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Memperbarui baris yang dipilih di tabel
    DefaultTableModel model = (DefaultTableModel) tbdatabarang.getModel();
    model.setValueAt(kode, selectedRowIndex, 0);
    model.setValueAt(nama, selectedRowIndex, 1);
    model.setValueAt(tipe, selectedRowIndex, 2);
    model.setValueAt(stok, selectedRowIndex, 3);

    // Clear text fields dan combo box setelah memperbarui data pada baris yang dipilih 
    tfkodebarang.setText("");
    tfnamabarang.setText("");
    cbtipebarang.setSelectedIndex(0);
    tfstokbarang.setText("");
    }//GEN-LAST:event_btsimpanActionPerformed
      
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
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiInventarisBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbatal;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton btubah;
    private javax.swing.JComboBox<String> cbtipebarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdatabarang;
    private javax.swing.JTextField tfkodebarang;
    private javax.swing.JTextField tfnamabarang;
    private javax.swing.JTextField tfstokbarang;
    // End of variables declaration//GEN-END:variables
}
