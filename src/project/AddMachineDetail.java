package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddMachineDetail extends javax.swing.JFrame {


    public AddMachineDetail() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        machineId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        starttime = new javax.swing.JTextField();
        stoptime = new javax.swing.JTextField();
        numstitches = new javax.swing.JTextField();
        runtime = new javax.swing.JTextField();
        speed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        line_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ENTER MACHINE DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 240, 20));

        machineId.setBorder(null);
        getContentPane().add(machineId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 99, 21));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Machine Id : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, 21));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Start Time : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 21));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Number of Stitches : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Stop Time :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 140, 21));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Run Time : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 140, 21));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Speed : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 140, 22));

        starttime.setText("hh:mm:ss");
        starttime.setBorder(null);
        getContentPane().add(starttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 99, 21));

        stoptime.setText("hh:mm:ss");
        stoptime.setBorder(null);
        stoptime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoptimeActionPerformed(evt);
            }
        });
        getContentPane().add(stoptime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 99, 21));

        numstitches.setBorder(null);
        getContentPane().add(numstitches, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 99, 21));

        runtime.setBorder(null);
        runtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runtimeActionPerformed(evt);
            }
        });
        getContentPane().add(runtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 99, 21));

        speed.setBorder(null);
        speed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedActionPerformed(evt);
            }
        });
        getContentPane().add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 100, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 76, 28));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 23, 62, 27));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Line Id :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 140, 19));

        line_id.setBorder(null);
        getContentPane().add(line_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 99, 22));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image1.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, -210, 890, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stoptimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoptimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stoptimeActionPerformed

    private void runtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runtimeActionPerformed

    private void speedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String machine_id = machineId.getText();
        String stitches = numstitches.getText();
        String run_time = runtime.getText();
        String spd = speed.getText();
        String start_time = starttime.getText();
        String stop_time = stoptime.getText();
        String lineID = line_id.getText();
        
        Connection conn = Database.getConnection();
        
        try{

            String query = "insert into machine (machine_id, "
                    + "start_time,stitches, stop_time, run_time, speed,date_entered )"
                     + " values (?, ?, ?, ?,?,?,CURDATE());";
            String query2 = "insert into line_assign (line_id,machine_id) values (?,?)";
            
            String query3 = "select * from line_assign where line_id = ? and machine_id = ?";

            conn.setAutoCommit(false);
            
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, machine_id);
            preparedStmt.setString(2, start_time);
            preparedStmt.setString(3, stitches);
            preparedStmt.setString(4, stop_time);
            preparedStmt.setString(5, run_time);
            preparedStmt.setString(6, spd);
            
            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
            preparedStmt2.setString(1, lineID );
            preparedStmt2.setString(2, machine_id);
            
            PreparedStatement prep = conn.prepareStatement(query3);
            prep.setString(1, lineID);
            prep.setString(2, machine_id);
            
            ResultSet rs = null;
        
            Statement st = conn.createStatement( rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = prep.executeQuery();
            rs.last();
            int num_rows  = rs.getRow();
            
            if(num_rows == 0 ){
                preparedStmt.execute();
                preparedStmt2.execute();
                
            }else{
                preparedStmt.execute();
            }
            
            conn.commit();
            conn.close();
            
            JOptionPane.showMessageDialog(null, "Successfully data entered!!!");
            AddMachineDetail ad = new AddMachineDetail();
            this.setVisible(false);
            ad.setVisible(true);
            
          }
          catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
            try {
                conn.rollback();
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            menu menu = new menu();
            this.setVisible(false);
            menu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField line_id;
    private javax.swing.JTextField machineId;
    private javax.swing.JTextField numstitches;
    private javax.swing.JTextField runtime;
    private javax.swing.JTextField speed;
    private javax.swing.JTextField starttime;
    private javax.swing.JTextField stoptime;
    // End of variables declaration//GEN-END:variables
}
