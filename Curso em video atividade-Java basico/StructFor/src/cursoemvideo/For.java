/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoemvideo;




/**
 *
 * @author Administrador
 */
public class For extends javax.swing.JFrame {

    /**
     * Creates new form For
     */
    public For() {
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

        sl1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sl2 = new javax.swing.JSlider();
        sl3 = new javax.swing.JSlider();
        inicio = new javax.swing.JLabel();
        fim = new javax.swing.JLabel();
        passo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        list2 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sl1.setMaximum(20);
        sl1.setValue(0);
        sl1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl1StateChanged(evt);
            }
        });
        getContentPane().add(sl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 146, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Início");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Passo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        sl2.setMaximum(20);
        sl2.setToolTipText("");
        sl2.setValue(0);
        sl2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl2StateChanged(evt);
            }
        });
        getContentPane().add(sl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 146, -1));

        sl3.setMaximum(5);
        sl3.setMinimum(1);
        sl3.setValue(1);
        sl3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl3StateChanged(evt);
            }
        });
        getContentPane().add(sl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 146, -1));

        inicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio.setForeground(new java.awt.Color(153, 153, 153));
        inicio.setText("0");
        getContentPane().add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 37, 39, -1));

        fim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fim.setForeground(new java.awt.Color(153, 153, 153));
        fim.setText("0");
        getContentPane().add(fim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 91, 39, -1));

        passo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passo.setForeground(new java.awt.Color(153, 153, 153));
        passo.setText("1");
        getContentPane().add(passo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 155, 39, -1));

        jButton1.setText("Contar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, -1, -1));

        list2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        list2.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(list2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 170, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sl1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl1StateChanged
        // TODO add your handling code here:
        inicio.setText(Integer.toString(sl1.getValue()));
    }//GEN-LAST:event_sl1StateChanged

    private void sl2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl2StateChanged
        // TODO add your handling code here:
        fim.setText(Integer.toString(sl2.getValue()));
    }//GEN-LAST:event_sl2StateChanged

    private void sl3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl3StateChanged
        // TODO add your handling code here:
        passo.setText(Integer.toString(sl3.getValue()));
    }//GEN-LAST:event_sl3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       list2.removeAll();
        int i = sl1.getValue();
        int f = sl2.getValue();
        int p = sl3.getValue();
  

        for (; i <= f; i += p) {
            list2.add(Integer.toString(i));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(For.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(For.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(For.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(For.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new For().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fim;
    private javax.swing.JLabel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.List list2;
    private javax.swing.JLabel passo;
    private javax.swing.JSlider sl1;
    private javax.swing.JSlider sl2;
    private javax.swing.JSlider sl3;
    // End of variables declaration//GEN-END:variables
}