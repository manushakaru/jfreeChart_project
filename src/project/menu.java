package project;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showmachine = new javax.swing.JButton();
        productivity = new javax.swing.JButton();
        utilization = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        line_efficiency1 = new javax.swing.JButton();
        remove1 = new javax.swing.JButton();
        remove2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showmachine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showmachine.setForeground(new java.awt.Color(51, 51, 255));
        showmachine.setText("Show Machine Details");
        showmachine.setBorder(null);
        showmachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmachineActionPerformed(evt);
            }
        });
        getContentPane().add(showmachine, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 240, 30));

        productivity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productivity.setForeground(new java.awt.Color(51, 51, 255));
        productivity.setText("machine productivity");
        productivity.setBorder(null);
        productivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productivityActionPerformed(evt);
            }
        });
        getContentPane().add(productivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 30));

        utilization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        utilization.setForeground(new java.awt.Color(51, 51, 255));
        utilization.setText("machine utilization");
        utilization.setBorder(null);
        utilization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilizationActionPerformed(evt);
            }
        });
        getContentPane().add(utilization, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Add machine details");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 240, 30));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 80, 40));

        line_efficiency1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        line_efficiency1.setForeground(new java.awt.Color(51, 51, 255));
        line_efficiency1.setText("line efficiency");
        line_efficiency1.setBorder(null);
        line_efficiency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line_efficiency1ActionPerformed(evt);
            }
        });
        getContentPane().add(line_efficiency1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 240, 30));

        remove1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove1.setForeground(new java.awt.Color(51, 51, 255));
        remove1.setText("Remove machine");
        remove1.setBorder(null);
        remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove1ActionPerformed(evt);
            }
        });
        getContentPane().add(remove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 30));

        remove2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove2.setForeground(new java.awt.Color(51, 51, 255));
        remove2.setText("Enter Machine Quality");
        remove2.setBorder(null);
        remove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove2ActionPerformed(evt);
            }
        });
        getContentPane().add(remove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image3.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void showmachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmachineActionPerformed
        Machinedetail mc = new Machinedetail();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_showmachineActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void line_efficiency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line_efficiency1ActionPerformed
        Line_efficiency ln = new Line_efficiency();
        ln.setDefaultCloseOperation(WIDTH);
        ln.setVisible(true);
        
    }//GEN-LAST:event_line_efficiency1ActionPerformed

    private void remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove1ActionPerformed
       RemoveMachine rm = new RemoveMachine();
       rm.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_remove1ActionPerformed

    private void remove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove2ActionPerformed
        UpdateQuality uq = new UpdateQuality();
        uq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_remove2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton line_efficiency1;
    private javax.swing.JButton productivity;
    private javax.swing.JButton remove1;
    private javax.swing.JButton remove2;
    private javax.swing.JButton showmachine;
    private javax.swing.JButton utilization;
    // End of variables declaration//GEN-END:variables
}
