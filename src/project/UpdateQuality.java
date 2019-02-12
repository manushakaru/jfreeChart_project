
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateQuality extends javax.swing.JFrame {


    private String[] machines;
    String itemselected;
    Connection con = Database.getConnection();
    public UpdateQuality() {
        setComboBox();
        initComponents();
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(machines));
        itemselected = (String) combo.getItemAt(0);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totpro = new javax.swing.JTextField();
        goodpro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("machine_id :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("total_product :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("good_product :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Enter Quality Details");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        totpro.setBorder(null);
        getContentPane().add(totpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 120, 20));

        goodpro.setBorder(null);
        getContentPane().add(goodpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/image1.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-580, -190, 1160, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String totp = totpro.getText();
        String goodp = goodpro.getText();
        
        try {
            String query = "select * from quality  where machine_id = ?;";
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1, itemselected);
            
            ResultSet rs = null;
            Statement st = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = prep.executeQuery();
            
            rs.last();
            int num_rows  = rs.getRow();
            if(num_rows == 0 ){
                String query2 = "insert into quality (machine_id,total_product,good_product) values (?,?,?)";
                con.setAutoCommit(false);            
                PreparedStatement preparedStmt2 = con.prepareStatement(query2);
                preparedStmt2.setString(1, itemselected);
                preparedStmt2.setString(2, totp);
                preparedStmt2.setString(3, goodp);
                preparedStmt2.execute();
                con.commit();
                
            }else{
                String query1 = "update quality  set total_product = ? , good_product = ? WHERE machine_id = ? ;";
                PreparedStatement preparedStmt1 = con.prepareStatement(query1);
                preparedStmt1.setString(1, totp);
                preparedStmt1.setString(2, goodp);
                preparedStmt1.setString(3, itemselected);
                preparedStmt1.executeUpdate();
                
                
            } 
            JOptionPane.showMessageDialog(null, "Successfully data entered!!!");
            UpdateQuality ad = new UpdateQuality();
            this.setVisible(false);
            ad.setVisible(true);
            
            con.close();
            
        } catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
            try {
                con.rollback();
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu mn = new menu();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setComboBox(){
        String sql = "select distinct machine_id from line_assign where deleted = 0";
        ResultSet rs = Database.getData(sql);
        
        try {
            
            rs.last();
        
            machines = new String[rs.getRow()];
            rs.beforeFirst();
            
            int i=0;
            while(rs.next()){
                machines[i] = rs.getString("machine_id");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        itemselected = (String)combo.getSelectedItem( );
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JTextField goodpro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField totpro;
    // End of variables declaration//GEN-END:variables
}
