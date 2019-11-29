/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class International extends javax.swing.JFrame {
    ModelAlbum barang;
    ModelPenjualan2 penjualan = new ModelPenjualan2();
   
    /**
     * Creates new form UIPenjualan
     */
    public International() {
        initComponents();
        fillComboBarang();
        tblBarang.setModel(penjualan.getTabel());
        
    }
    
    private void fillComboBarang(){
        ModelAlbum barang1 = new Genre1("Album1", "Adele", 304000);
        ModelAlbum barang2 = new Genre1("Album2", "Ariana Grande", 45000);
        ModelAlbum barang3 = new Genre1("Album3", "Bruno Mars", 65000);
        ModelAlbum barang4 = new Genre1("Album4", "Selena Gomez", 59000);
        ModelAlbum barang5 = new Genre2("Album5","Avenged Sevenfold",250000);
        ModelAlbum barang6 = new Genre2("Album6","Paramore",78000);
        ModelAlbum barang7 = new Genre2("Album7","Big Bang",48000);
        ModelAlbum barang8 = new Genre2("Album8","Westlife",35000);
          
        cboBarang.addItem(barang1);
        cboBarang.addItem(barang2);
        cboBarang.addItem(barang3);
        cboBarang.addItem(barang4);
        cboBarang.addItem(barang5);
        cboBarang.addItem(barang6);
        cboBarang.addItem(barang7);
        cboBarang.addItem(barang8);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboBarang = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSatuan = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        chkPPN = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        lblPPN = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        beli = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbldiskon = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("ALBUM INTERNASIONAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel2.setText("Album");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        cboBarang.setNextFocusableComponent(txtQuantity);
        cboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarangActionPerformed(evt);
            }
        });
        getContentPane().add(cboBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 150, -1));

        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 496, -1, -1));

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        lblHarga.setText("00");
        getContentPane().add(lblHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 97, -1));

        jLabel5.setText("Rp.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        lblSatuan.setText("jLabel6");
        getContentPane().add(lblSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 496, -1, -1));

        txtQuantity.setNextFocusableComponent(btnSimpan);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 491, 74, -1));

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 535, 545, 153));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        jLabel6.setText("Subtotal :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        jLabel7.setText("Rp.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        lblSubtotal.setText("00");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, 97, -1));

        chkPPN.setText("PPN :");
        chkPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPPNActionPerformed(evt);
            }
        });
        getContentPane().add(chkPPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));

        jLabel8.setText("Rp.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 20, 30));

        lblPPN.setText("00");
        getContentPane().add(lblPPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 97, -1));

        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, -1, -1));

        jLabel10.setText("Rp.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        lblTotal.setText("00");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 620, 97, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adele_-_21.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 92, 83));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ariana.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 97, 83));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bruno-mars-plakat.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 95, 84));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gomez.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 87, 84));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avenged.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 92, 86));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Paramore.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 97, 85));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bigbang.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 95, 86));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/westlife.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 87, 86));

        jLabel19.setText("Album1");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel20.setText("Album2");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel21.setText("Album3");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, 20));

        jLabel22.setText("Album4");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel23.setText("Album8");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jLabel24.setText("Album7");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jLabel25.setText("Album6");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel26.setText("Album5");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 100, 40));

        beli.setText("BUY");
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });
        getContentPane().add(beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 710, 90, 40));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 276, -1, -1));

        jButton3.setText("LIHAT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jButton4.setText("LIHAT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jButton5.setText("LIHAT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jButton6.setText("LIHAT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jButton7.setText("LIHAT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jButton8.setText("LIHAT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jButton9.setText("LIHAT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        jButton10.setText("LIHAT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel29.setText("Uang Kembalian");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, -1, -1));

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 680, 115, -1));

        jLabel28.setText("Uang yang dibayar");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, -1, -1));

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        getContentPane().add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 115, -1));

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 153, 255));
        jLabel30.setText("PROMO : DISKON 50%!");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 230, -1));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 880, 60, 30));

        jLabel32.setText("Diskon :");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, 30));

        jLabel33.setText("Rp.");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        lbldiskon.setText("00");
        getContentPane().add(lbldiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 60, -1));

        jLabel34.setForeground(new java.awt.Color(0, 153, 204));
        jLabel34.setText("GENRE 1");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel35.setForeground(new java.awt.Color(255, 102, 51));
        jLabel35.setText("GENRE 2");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            btnSimpan.requestFocus();
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void cboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarangActionPerformed
        barang = (ModelAlbum)cboBarang.getSelectedItem();
        lblHarga.setText(NumberFormat.getNumberInstance().format(barang.getHarga()));
        lblSatuan.setText(barang.getSatuan());
        //lbldiskon.setText(NumberFormat.getNumberInstance().format(barang.getDiskon()));
    }//GEN-LAST:event_cboBarangActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String[] data = new String[7];
        double harga, jumlah=0;
        int qty=0;
        
        data[0]=barang.getNamaBarang();
        
        harga=barang.getHarga();
        data[1]=String.valueOf(barang.getHarga());
        
        qty=Integer.parseInt(txtQuantity.getText());
        data[2]=txtQuantity.getText();
        
        data[3]=barang.getSatuan();
        
        jumlah=harga*qty;
        data[4]=String.valueOf(jumlah);
        
        penjualan.getTabel().addRow(data);
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
        lbldiskon.setText(NumberFormat.getNumberInstance().format(penjualan.countDiskon()));
        cboBarang.requestFocus();
     
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPPNActionPerformed
        if (chkPPN.isSelected())
            lblPPN.setText(NumberFormat.getNumberInstance().format(penjualan.countPPN()));
        
        else{
            lblPPN.setText("0");
            penjualan.setPpn(0);
        }
        
        lblTotal.setText(NumberFormat.getNumberInstance().format(penjualan.countTotal()-penjualan.countDiskon()));
    }//GEN-LAST:event_chkPPNActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        penjualan.getTabel().removeRow(tblBarang.getSelectedRow());
        lblSubtotal.setText(NumberFormat.getNumberInstance().format(penjualan.countSubtotal()));
        chkPPNActionPerformed(null);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        home a= new home();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        int kembalianjumlah=(int) (Integer.parseInt(bayar.getText())-(penjualan.countTotal()-penjualan.countDiskon()));
        kembalian.setText(""+kembalianjumlah);
        
        if(kembalianjumlah>0){   
             JOptionPane.showMessageDialog(null,"Terimakasih sudah belanja");
             bayar.setText("");
             kembalian.setText("");
             lblHarga.setText("");
             txtQuantity.setText("");
             lblPPN.setText("0");
             tblBarang.setModel(new DefaultTableModel(null,new String[]{"Barang","Harga","QTY","Satuan","Jumlah"}));
        }else{
            bayar.setText("");
            kembalian.setText("");
            JOptionPane.showMessageDialog(null,"Maaf uang anda tidak cukup");
        }
        
    }//GEN-LAST:event_beliActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         JOptionPane.showMessageDialog(null,"List Musik:\n1.Lagu1\n2.Lagu2\n3.Lagu3\n4.Lagu4\n5.Lagu5\n6.Lagu6\n7.Lagu7");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembalianActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      login a=new login();
      a.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBarangMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(International.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(International.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(International.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(International.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new International().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JButton beli;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox cboBarang;
    private javax.swing.JCheckBox chkPPN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kembalian;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblPPN;
    private javax.swing.JLabel lblSatuan;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbldiskon;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}