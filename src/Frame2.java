
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amit bhardwaj
 */
public class Frame2 extends javax.swing.JFrame {

  int cpucheck;
    public String na1;
    public String na2;
     int  flag;
    /**
     * Creates new form frame12
     */
    public Frame2() {
        initComponents();
        setSize(1380,750);
        setLocationRelativeTo(null);
        
        
        
        cpucheck=0;
    }

    public Frame2(int x)
    {
    initComponents();
    jTextField1.setText("CPU");
    jTextField1.setEditable(false);
    cpucheck=1;
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        jTextField2 = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE GAME");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("TIC TAC TOE");
        getContentPane().add(label1, java.awt.BorderLayout.PAGE_START);

        panel1.setBackground(new java.awt.Color(255, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label2.setText("ENTER PLAYER 1 ");
        panel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32576, -32553, -1, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label3.setText("ENTER PLAYER 1 ");
        panel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32768, -32768, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label4.setText("ENTER PLAYER 1 ");
        panel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32230, -32558, -1, -1));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label5.setText("ENTER PLAYER 1:-");
        panel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 450, 100));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 330, 50));

        label6.setAlignment(java.awt.Label.RIGHT);
        label6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label6.setText("ENTER PLAYER 2:-");
        panel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 450, 100));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField2.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 333, 330, 50));

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("START");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label7.setText("ENTER PLAYER 1:-");
        panel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 450, 100));

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label8.setText("ENTER PLAYER 1:-");
        panel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 450, 100));

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label9.setText("ENTER PLAYER 1:-");
        panel1.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 450, 100));

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    
    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
     
   
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        na1=jTextField1.getText();
        na2=jTextField2.getText();
      
      
       
        if(na1.isEmpty()==true&&na2.isEmpty()==true)
        {
        JOptionPane.showMessageDialog(null, "both the fields are empty");
      flag=1;
        }
        else if(na1.isEmpty()==true)
        {
            JOptionPane.showMessageDialog(null, "player 1 Name is empty");
      flag=1;
        }
else if(na2.isEmpty()==true)
{
            JOptionPane.showMessageDialog(null, "player 2 Name is empty");
flag=1;

}       
       if(flag==1)
       {
          
         new Frame2().setVisible(true);
         
       }
       else
       new Mainframe(na1,na2,cpucheck).setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
