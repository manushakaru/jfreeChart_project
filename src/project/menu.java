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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        efficency.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        efficency.setText("Overall equipment efficiency");
        efficency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efficencyActionPerformed(evt);
            }
        });

        productivity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productivity.setText("machine productivity");
        productivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productivityActionPerformed(evt);
            }
        });

        utilization.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        utilization.setText("machine utilization");
        utilization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilizationActionPerformed(evt);
            }
        });

        line_efficiency.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        line_efficiency.setText("line efficiency");
        line_efficiency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line_efficiencyActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add machine details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(efficency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(utilization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(line_efficiency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(back)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(efficency)
                .addGap(18, 18, 18)
                .addComponent(productivity)
                .addGap(18, 18, 18)
                .addComponent(utilization)
                .addGap(18, 18, 18)
                .addComponent(line_efficiency)
                .addContainerGap(46, Short.MAX_VALUE))
        );

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
    private javax.swing.JButton line_efficiency;
    private javax.swing.JButton productivity;
    private javax.swing.JButton utilization;
    // End of variables declaration//GEN-END:variables
}
