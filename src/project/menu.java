package project;

import org.jfree.ui.RefineryUtilities;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        efficency = new javax.swing.JButton();
        productivity = new javax.swing.JButton();
        utilization = new javax.swing.JButton();
        line_efficiency = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        efficency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        efficency.setForeground(new java.awt.Color(51, 51, 255));
        efficency.setText("Overall equipment efficiency");
        efficency.setBorder(null);
        efficency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efficencyActionPerformed(evt);
            }
        });
        getContentPane().add(efficency, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 177, 240, 30));

        productivity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productivity.setForeground(new java.awt.Color(51, 51, 255));
        productivity.setText("machine productivity");
        productivity.setBorder(null);
        productivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productivityActionPerformed(evt);
            }
        });
        getContentPane().add(productivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 217, 240, 30));

        utilization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        utilization.setForeground(new java.awt.Color(51, 51, 255));
        utilization.setText("machine utilization");
        utilization.setBorder(null);
        utilization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilizationActionPerformed(evt);
            }
        });
        getContentPane().add(utilization, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 257, 240, 30));

        line_efficiency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        line_efficiency.setForeground(new java.awt.Color(51, 51, 255));
        line_efficiency.setText("line efficiency");
        line_efficiency.setBorder(null);
        line_efficiency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line_efficiencyActionPerformed(evt);
            }
        });
        getContentPane().add(line_efficiency, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 297, 240, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Add machine details");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 137, 240, 30));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("BACK");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 63, 28));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image3.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efficencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efficencyActionPerformed

        Overall_equipment_efficiency chart = new Overall_equipment_efficiency();
        chart.setDefaultCloseOperation(WIDTH);
        chart.setVisible(true);
    }//GEN-LAST:event_efficencyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            AddMachineDetail ad = new AddMachineDetail();
            this.setVisible(false);
            ad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productivityActionPerformed
        Machine_productivity prod = new Machine_productivity();
        prod.setDefaultCloseOperation(WIDTH);
        prod.setVisible(true);
    }//GEN-LAST:event_productivityActionPerformed

    private void utilizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilizationActionPerformed
        Machine_utilization uti = new Machine_utilization();
        uti.setDefaultCloseOperation(WIDTH);
        uti.setVisible(true);
    }//GEN-LAST:event_utilizationActionPerformed

    private void line_efficiencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line_efficiencyActionPerformed
        Line_efficiency line_effi = new Line_efficiency();
        line_effi.setDefaultCloseOperation(WIDTH);
        line_effi.setVisible(true);
    }//GEN-LAST:event_line_efficiencyActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton efficency;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton line_efficiency;
    private javax.swing.JButton productivity;
    private javax.swing.JButton utilization;
    // End of variables declaration//GEN-END:variables
}
