package com.tugas;
public class Converter extends javax.swing.JFrame {
    float satuan[]={5,4,9,5},hasil,bantuan;
    public Converter() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layarFrom = new javax.swing.JTextField();
        layarTo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        barFrom = new javax.swing.JComboBox<>();
        barTo = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(layarFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 30));
        getContentPane().add(layarTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel1.setText("Ke");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 95, 20, 20));

        barFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Reaomur", "Fahrenheit", "Kelvin" }));
        getContentPane().add(barFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        barTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Reaomur", "Fahrenheit", "Kelvin" }));
        getContentPane().add(barTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, 30));

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        bantuan = Float.parseFloat(layarFrom.getText());
        switch (barFrom.getSelectedIndex()){
            case 2:
                bantuan -= 32;
                break;
            case 3:
                bantuan -= 273;
                break;
            default:break;
        }
        hasil = satuan[barTo.getSelectedIndex()]/satuan[barFrom.getSelectedIndex()]*bantuan;
        switch (barTo.getSelectedIndex()){
            case 2:
                hasil += 32;
                break;
            case 3:
                hasil += 273;
                break;
            default:break;
        }
        layarTo.setText(Float.toString(hasil));
    }//GEN-LAST:event_btnConvertActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> barFrom;
    private javax.swing.JComboBox<String> barTo;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField layarFrom;
    private javax.swing.JTextField layarTo;
    // End of variables declaration//GEN-END:variables
}
