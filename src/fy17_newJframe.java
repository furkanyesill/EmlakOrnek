
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Furkan
 */
public class fy17_newJframe extends javax.swing.JFrame {

    /**
     * Creates new form fy17_newJframe
     */
    public fy17_newJframe() {
        initComponents();
        fy17_myModel =new DefaultListModel();
        fy17_jList1.setModel(fy17_myModel);
    }

    DefaultListModel fy17_myModel;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fy17_jComboBox1 = new javax.swing.JComboBox<>();
        fy17_jRadioButton1 = new javax.swing.JRadioButton();
        fy17_jRadioButton2 = new javax.swing.JRadioButton();
        fy17_jRadioButton3 = new javax.swing.JRadioButton();
        fy17_jCheckBox1 = new javax.swing.JCheckBox();
        fy17_jCheckBox2 = new javax.swing.JCheckBox();
        fy17_jCheckBox4 = new javax.swing.JCheckBox();
        fy17_jCheckBox5 = new javax.swing.JCheckBox();
        fy17_jButton1 = new javax.swing.JButton();
        fy17_jButton2 = new javax.swing.JButton();
        fy17_jButton3 = new javax.swing.JButton();
        fy17_jLabel1 = new javax.swing.JLabel();
        fy17_jLabel2 = new javax.swing.JLabel();
        fy17_jLabel3 = new javax.swing.JLabel();
        fy17_jLabel4 = new javax.swing.JLabel();
        fy17_jButton4 = new javax.swing.JButton();
        fy17_jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fy17_jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fy17_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daire", "Müstakil Ev", "Villa", "Çiftlik Evi", "Yalı", "Yazlık", "Prefabrik Ev", "Kooperatif" }));
        fy17_jComboBox1.setToolTipText("");
        fy17_jComboBox1.setName(""); // NOI18N

        buttonGroup1.add(fy17_jRadioButton1);
        fy17_jRadioButton1.setText("Sahibinden");
        fy17_jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(fy17_jRadioButton2);
        fy17_jRadioButton2.setText("Emlak Ofisinden");

        buttonGroup1.add(fy17_jRadioButton3);
        fy17_jRadioButton3.setText("İnşaat Firmasından");
        fy17_jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jRadioButton3ActionPerformed(evt);
            }
        });

        fy17_jCheckBox1.setText("Satılık");

        fy17_jCheckBox2.setText("Kiralık");
        fy17_jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jCheckBox2ActionPerformed(evt);
            }
        });

        fy17_jCheckBox4.setText("Günlük Kiralık");
        fy17_jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jCheckBox4ActionPerformed(evt);
            }
        });

        fy17_jCheckBox5.setText("Devren Satılık");
        fy17_jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jCheckBox5ActionPerformed(evt);
            }
        });

        fy17_jButton1.setText("Konut Ekle");
        fy17_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jButton1ActionPerformed(evt);
            }
        });

        fy17_jButton2.setText("Konut Kaldır");
        fy17_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jButton2ActionPerformed(evt);
            }
        });

        fy17_jButton3.setText("Konutları Sıfırla");
        fy17_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jButton3ActionPerformed(evt);
            }
        });

        fy17_jLabel1.setText("Kategori");

        fy17_jLabel2.setText("Konutlar");

        fy17_jLabel3.setText("Konut Tipi");

        fy17_jLabel4.setText("Kimden");

        fy17_jButton4.setText("Kategori Ekle");
        fy17_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fy17_jButton4ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(fy17_jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fy17_jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fy17_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fy17_jLabel1))
                                .addGap(2, 2, 2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fy17_jLabel3)
                                .addComponent(fy17_jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fy17_jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fy17_jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fy17_jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fy17_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fy17_jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(fy17_jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fy17_jRadioButton2)
                                    .addComponent(fy17_jLabel4)
                                    .addComponent(fy17_jRadioButton1)
                                    .addComponent(fy17_jRadioButton3)))
                            .addComponent(fy17_jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fy17_jLabel2))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(fy17_jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fy17_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fy17_jLabel3)
                            .addComponent(fy17_jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fy17_jCheckBox1)
                            .addComponent(fy17_jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fy17_jCheckBox2)
                            .addComponent(fy17_jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fy17_jRadioButton3)
                            .addComponent(fy17_jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fy17_jCheckBox5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fy17_jLabel2)
                            .addComponent(fy17_jButton4)
                            .addComponent(fy17_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fy17_jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fy17_jButton1)
                        .addComponent(fy17_jButton2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fy17_jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fy17_jRadioButton3ActionPerformed

    private void fy17_jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fy17_jCheckBox2ActionPerformed

    private void fy17_jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fy17_jCheckBox5ActionPerformed

    private void fy17_jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fy17_jRadioButton1ActionPerformed

    
    
    private void fy17_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jButton1ActionPerformed
        String fy17_ktgr = fy17_jComboBox1.getSelectedItem().toString();
        String fy17_tip = "";
        String fy17_kimden = "";
        
        if(fy17_jCheckBox1.isSelected())
            fy17_tip += fy17_jCheckBox1.getText() + ", ";
        if(fy17_jCheckBox2.isSelected())
            fy17_tip += fy17_jCheckBox2.getText() + ", ";
        if(fy17_jCheckBox4.isSelected())
            fy17_tip += fy17_jCheckBox4.getText()+ ", ";
        if(fy17_jCheckBox5.isSelected())
            fy17_tip += fy17_jCheckBox5.getText()+ ", ";
            
        if(fy17_jRadioButton1.isSelected())
            fy17_kimden = fy17_jRadioButton1.getText();
        else if(fy17_jRadioButton2.isSelected())
            fy17_kimden = fy17_jRadioButton2.getText();
        else if(fy17_jRadioButton3.isSelected())
            fy17_kimden = fy17_jRadioButton3.getText();
        
        Object fy17_kategori=fy17_jComboBox1.getSelectedItem();
        
        String fy17_result = fy17_ktgr + ", " + fy17_tip + " (" + fy17_kimden + ")";
        
        //DefaultListModel fy17_listVeri = new DefaultListModel();
        fy17_myModel.addElement(fy17_result);
        
        //fy17_jList1.setModel(fy17_listVeri);
    }//GEN-LAST:event_fy17_jButton1ActionPerformed

    private void fy17_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jButton3ActionPerformed
        fy17_myModel.removeAllElements();
    }//GEN-LAST:event_fy17_jButton3ActionPerformed

    private void fy17_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jButton4ActionPerformed
        fy17_myModel.addElement(fy17_jTextField2.getText());
    }//GEN-LAST:event_fy17_jButton4ActionPerformed

    private void fy17_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jButton2ActionPerformed
        fy17_myModel.removeElementAt(fy17_jList1.getSelectedIndex());
    }//GEN-LAST:event_fy17_jButton2ActionPerformed

    private void fy17_jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fy17_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fy17_jCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(fy17_newJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fy17_newJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fy17_newJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fy17_newJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fy17_newJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton fy17_jButton1;
    private javax.swing.JButton fy17_jButton2;
    private javax.swing.JButton fy17_jButton3;
    private javax.swing.JButton fy17_jButton4;
    private javax.swing.JCheckBox fy17_jCheckBox1;
    private javax.swing.JCheckBox fy17_jCheckBox2;
    private javax.swing.JCheckBox fy17_jCheckBox4;
    private javax.swing.JCheckBox fy17_jCheckBox5;
    private javax.swing.JComboBox<String> fy17_jComboBox1;
    private javax.swing.JLabel fy17_jLabel1;
    private javax.swing.JLabel fy17_jLabel2;
    private javax.swing.JLabel fy17_jLabel3;
    private javax.swing.JLabel fy17_jLabel4;
    private javax.swing.JList<String> fy17_jList1;
    private javax.swing.JRadioButton fy17_jRadioButton1;
    private javax.swing.JRadioButton fy17_jRadioButton2;
    private javax.swing.JRadioButton fy17_jRadioButton3;
    private javax.swing.JTextField fy17_jTextField2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
