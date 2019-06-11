
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amit bhardwaj
 */
public class Mainframe extends javax.swing.JFrame {
    int flag,score1=0,score2=0,sno;
    String name1,name2;
    int Resumecheck=0;
          
    /**
     * Creates new form frame1
     */
    public Mainframe() 
    {
     initComponents();
   setSize(1200,600);
        setLocationRelativeTo(null);
        
    }

    public Mainframe(String tp,String s,int t)
    {
       
        initComponents();
        flag=0;
        player1name.setText(tp);
        player2name.setText(s);
        name1=tp;
        name2=s;
        setSize(1380,750);
        setLocationRelativeTo(null);
        
    }
    
    public Mainframe(int x)
    {
        initComponents();
        flag=0;
        Resumecheck=x;
        setSize(1380,750);
        setLocationRelativeTo(null);
        
              try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/tictactoe","root","admin");
           String q="select * from records";
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(q);
           while(rs.next())
           {
               sno=rs.getInt(1);
               name1=rs.getString("nplayer1");
               name2=rs.getString("nplayer2");
               score1=rs.getInt(4);
               score2=rs.getInt(5);
               
               
           }
                  game_score();
       }
      catch(Exception p)
       {
        JOptionPane.showMessageDialog(null,"DATABASE NOT FOUND ERROR");
       }
 
     player1name.setText(name1);
     player2name.setText(name2);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        player1name = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jscore1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        player2name = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jscore2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE GAME");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC_TAC_TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLAYER 1:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        player1name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        player1name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(player1name, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SCORE");
        jPanel10.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jscore1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jscore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jscore1.setText("0");
        jPanel10.add(jscore1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PLAYER 2:");
        jPanel3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        player2name.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        player2name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(player2name, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SCORE");
        jPanel11.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jscore2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jscore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jscore2.setText("0");
        jPanel11.add(jscore2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton11.setText("BACK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     private void win_chechk()
    {
       
        String b1=jButton1.getText(); 
        String b2=jButton2.getText(); 
        String b3=jButton3.getText(); 
        
        String b4=jButton4.getText(); 
        String b5=jButton5.getText(); 
        String b6=jButton6.getText();
        
        String b7=jButton7.getText(); 
        String b8=jButton8.getText(); 
        String b9=jButton9.getText();
        
        
        
        if(b1.equals("X")&&b2.equals("X")&&b3.equals("X"))
          {
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton1.setBackground(Color.magenta);
                jButton2.setBackground(Color.magenta);
                jButton3.setBackground(Color.magenta);
              
                 score1++;
                 game_score();
         
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
               reset(); }
        
        
        
        
        
        else if(b4.equals("X")&&b5.equals("X")&&b6.equals("X"))
          {
            jButton4.setEnabled(true);jButton5.setEnabled(true);jButton6.setEnabled(true);
                jButton4.setBackground(Color.magenta);
                jButton5.setBackground(Color.magenta);
                jButton6.setBackground(Color.magenta);
              
                 score1++;
         
                 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        
        else if(b7.equals("X")&&b8.equals("X")&&b9.equals("X"))
          {
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
                jButton7.setBackground(Color.magenta);
                jButton8.setBackground(Color.magenta);
                jButton9.setBackground(Color.magenta);
              
                 score1++;

game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        else if(b1.equals("X")&&b4.equals("X")&&b7.equals("X"))
          {
            jButton1.setEnabled(true);
            jButton4.setEnabled(true);
            jButton7.setEnabled(true);
                jButton1.setBackground(Color.magenta);
                jButton4.setBackground(Color.magenta);
                jButton7.setBackground(Color.magenta);
              
                 score1++;
 
 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        else if(b2.equals("X")&&b5.equals("X")&&b8.equals("X"))
          {
            jButton2.setEnabled(true);
            jButton5.setEnabled(true);
            jButton8.setEnabled(true);
                jButton2.setBackground(Color.magenta);
                jButton5.setBackground(Color.magenta);
                jButton8.setBackground(Color.magenta);
              
                 score1++;
 
 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        else if(b3.equals("X")&&b6.equals("X")&&b9.equals("X"))
          {
            jButton3.setEnabled(true);
            jButton6.setEnabled(true);
            jButton9.setEnabled(true);
                jButton3.setBackground(Color.magenta);
                jButton6.setBackground(Color.magenta);
                jButton9.setBackground(Color.magenta);
              
                 score1++;
                 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        else if(b1.equals("X")&&b5.equals("X")&&b9.equals("X"))
          {
            jButton1.setEnabled(true);
            jButton5.setEnabled(true);
            jButton9.setEnabled(true);
                jButton1.setBackground(Color.magenta);
                jButton5.setBackground(Color.magenta);
                jButton9.setBackground(Color.magenta);
              
                 score1++;
                 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
               reset(); }
        
        else if(b3.equals("X")&&b5.equals("X")&&b7.equals("X"))
          {
            jButton3.setEnabled(true);
            jButton5.setEnabled(true);
            jButton7.setEnabled(true);
                jButton3.setBackground(Color.magenta);
                jButton5.setBackground(Color.magenta);
                jButton7.setBackground(Color.magenta);
              
                 score1++;
                 game_score();
                 JOptionPane.showMessageDialog(null,"Player 1 wins the Game!!!");
                reset();}
        
        
        
        else    if(b1.equals("O")&&b2.equals("O")&&b3.equals("O"))
          {
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
                jButton1.setBackground(Color.RED);
                jButton2.setBackground(Color.RED);
                jButton3.setBackground(Color.RED);
              
                 score2++;
           game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
                
          reset();}
        
        
        
        
        
        else  if(b4.equals("O")&&b5.equals("O")&&b6.equals("O"))
          {
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            
                jButton4.setBackground(Color.RED);
                jButton5.setBackground(Color.RED);
                jButton6.setBackground(Color.RED);
              
                 score2++;
              game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
                reset();}
        
        
        else if(b7.equals("O")&&b8.equals("O")&&b9.equals("O"))
          {
            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
                jButton7.setBackground(Color.RED);
                jButton8.setBackground(Color.RED);
                jButton9.setBackground(Color.RED);
              
                 score2++;
             game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
                reset();}
        
        else if(b1.equals("O")&&b4.equals("O")&&b7.equals("O"))
          {
            jButton1.setEnabled(true);
            jButton4.setEnabled(true);
            jButton7.setEnabled(true);
                jButton1.setBackground(Color.RED);
                jButton4.setBackground(Color.RED);
                jButton7.setBackground(Color.RED);
              
                 score2++;
             game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
                reset();}
        
        else  if(b2.equals("O")&&b5.equals("O")&&b8.equals("O"))
          {
            jButton2.setEnabled(true);
            jButton5.setEnabled(true);
            jButton8.setEnabled(true);
                jButton2.setBackground(Color.RED);
                jButton5.setBackground(Color.RED);
                jButton8.setBackground(Color.RED);
              
                 score2++;
                 game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
                reset();
          }
        
        else if(b3.equals("O")&&b6.equals("O")&&b9.equals("O"))
          {
            jButton3.setEnabled(true);
            jButton6.setEnabled(true);
            jButton9.setEnabled(true);
                jButton3.setBackground(Color.RED);
                jButton6.setBackground(Color.RED);
                jButton9.setBackground(Color.RED);
              
                 score2++;
               game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
          reset();      }
        
        else  if(b1.equals("O")&&b5.equals("O")&&b9.equals("O"))
          {
            jButton1.setEnabled(true);
            jButton5.setEnabled(true);
            jButton9.setEnabled(true);
                jButton1.setBackground(Color.RED);
                jButton5.setBackground(Color.RED);
                jButton9.setBackground(Color.RED);
              
                 score2++;
               game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
        reset();
          }
        
        else if(b3.equals("O")&&b5.equals("O")&&b7.equals("O"))
          {
            jButton3.setEnabled(true);
            jButton5.setEnabled(true);
            jButton7.setEnabled(true);
                jButton3.setBackground(Color.RED);
                jButton5.setBackground(Color.RED);
                jButton7.setBackground(Color.RED);
              
                 score2++;
               game_score();
                 JOptionPane.showMessageDialog(null,"Player 2 wins the Game!!!");
reset();
          }
        
        else if((b1.equals("X")||b1.equals("O"))&&(b2.equals("X")||b2.equals("O"))&&(b3.equals("X")||b3.equals("O"))&&(b4.equals("X")||b4.equals("O"))&&(b5.equals("X")||b5.equals("O"))&&(b6.equals("X")||b6.equals("O"))&&(b7.equals("X")||b7.equals("O"))&&(b8.equals("X")||b8.equals("O"))&&(b9.equals("X")||b9.equals("O")))      
        {
        
        JOptionPane.showMessageDialog(null,"match draws");
         reset();
        
        }
    }
    private void game_score()
    {
    jscore1.setText(String.valueOf(score1));
    jscore2.setText(String.valueOf(score2));
    }
    
         void reset()
    {
   
    flag=0;
              jButton1.setText("");
          jButton1.setBackground(Color.LIGHT_GRAY);
           jButton2.setText("");
          jButton2.setBackground(Color.LIGHT_GRAY);
           jButton3.setText("");
          jButton3.setBackground(Color.LIGHT_GRAY);
           jButton4.setText("");
          jButton4.setBackground(Color.LIGHT_GRAY);
           jButton5.setText("");
          jButton5.setBackground(Color.LIGHT_GRAY);
           jButton6.setText("");
          jButton6.setBackground(Color.LIGHT_GRAY);
           jButton7.setText("");
          jButton7.setBackground(Color.LIGHT_GRAY);
           jButton8.setText("");
          jButton8.setBackground(Color.LIGHT_GRAY);
           jButton9.setText("");
          jButton9.setBackground(Color.LIGHT_GRAY);
          jButton1.setEnabled(true);
          jButton2.setEnabled(true);
          jButton3.setEnabled(true);
          jButton4.setEnabled(true);
          jButton5.setEnabled(true);
          jButton6.setEnabled(true);
          jButton7.setEnabled(true);
         jButton8.setEnabled(true);
         jButton9.setEnabled(true);
    }

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(flag%2==0)
        {
            jButton3.setText("X");jButton3.setForeground(Color.blue);
            jButton3.setEnabled(false);
            flag++;
        }
        else
        {
            jButton3.setText("O");jButton3.setForeground(Color.green);
             jButton3.setEnabled(false);
            flag++;
        }

if(flag>3)
{
    win_chechk();
    game_score();
}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
            
         if(flag%2==0)
        {
            jButton1.setText("X");jButton1.setForeground(Color.blue);
            jButton1.setEnabled(false);
            flag++;
        }
        else
        {
            jButton1.setText("O");jButton1.setForeground(Color.green);
             jButton1.setEnabled(false);
            flag++;
        }
if(flag>3)
{
    win_chechk();
    game_score();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(flag%2==0)
        {
            jButton2.setText("X");jButton2.setForeground(Color.blue);
            jButton2.setEnabled(false);
            flag++;
        }
        else
        {
            jButton2.setText("O");jButton2.setForeground(Color.green);
             jButton2.setEnabled(false);
            flag++;

        }
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(flag%2==0)
        {
            jButton4.setText("X");jButton4.setForeground(Color.blue);
            jButton4.setEnabled(false);
            flag++;
        }
        else
        {
            jButton4.setText("O");jButton4.setForeground(Color.green);
             jButton4.setEnabled(false);
            flag++;
        } 
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(flag%2==0)
        {
            jButton5.setText("X");jButton5.setForeground(Color.blue);
            jButton5.setEnabled(false);
            flag++;
        }
        else
        {
            jButton5.setText("O");jButton5.setForeground(Color.green);
             jButton5.setEnabled(false);
            flag++;
        }
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
if(flag%2==0)
        {
            jButton6.setText("X");jButton6.setForeground(Color.blue);
            jButton6.setEnabled(false);
            flag++;
        }
        else
        {
            jButton6.setText("O");jButton6.setForeground(Color.green);
             jButton6.setEnabled(false);
            flag++;
        }
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
if(flag%2==0)
        {
            jButton7.setText("X");jButton7.setForeground(Color.blue);
            jButton7.setEnabled(false);
            flag++;
        }
        else
        {
            jButton7.setText("O");jButton7.setForeground(Color.green);
             jButton7.setEnabled(false);
            flag++;
        } 
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if(flag%2==0)
        {
            jButton8.setText("X");jButton8.setForeground(Color.blue);
            jButton8.setEnabled(false);
            flag++;
        }
        else
        {
            jButton8.setText("O");jButton8.setForeground(Color.green);
             jButton8.setEnabled(false);
            flag++;
        }
       if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
if(flag%2==0)
        {
            jButton9.setText("X");jButton9.setForeground(Color.blue);
            jButton9.setEnabled(false);
            flag++;
        }
        else
        {
            jButton9.setText("O");jButton9.setForeground(Color.green);
             jButton9.setEnabled(false);
            flag++;
        } 
if(flag>3)
{
    win_chechk();
    game_score();
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       reset();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        

        
        
        if(Resumecheck==0)
        {
        
        try
       {
             
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/tictactoe","root","admin");
           String q="select max(sno) from records";
       
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(q);
           while(rs.next())
           { 
              sno=rs.getInt(1);
           }
          sno++;
         
                String q1="insert into records values("+sno+",'"+name1+"','"+name2+"',"+score1+","+score2+");";
   
        
        
         
         st.executeUpdate(q1);
       

           
      
  }
      catch(Exception p)
       {
        JOptionPane.showMessageDialog(null,"DATABASE NOT FOUND ERROR");
       }
        
        
        }//closing of if
        
        if(Resumecheck==1)
        {
             try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/tictactoe","root","admin");
           String q="select max(sno) from records";
           Statement st=con.createStatement();
        
          
           
        String q1="update records set score1="+score1 +" where sno="+sno;
        String q2="update records set score2="+score2+" where sno="+sno;
     
         
         st.executeUpdate(q1);
       
        st.executeUpdate(q2);
       }
      catch(Exception p)
       {
        JOptionPane.showMessageDialog(null,"DATABASE NOT FOUND ERROR");
       }
        
    
        
        
        }
        
        
        Frame1 obj=new Frame1();
        obj.show();
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    jButton1.setBackground(Color.yellow);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      jButton1.setBackground(Color.LIGHT_GRAY);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
            jButton4.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
      jButton4.setBackground(Color.LIGHT_GRAY);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
jButton7.setBackground(Color.YELLOW);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
jButton7.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
jButton2.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
jButton2.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
jButton5.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
jButton5.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
jButton8.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
jButton8.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
jButton3.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
jButton3.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
jButton6.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
jButton6.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
jButton9.setBackground(Color.yellow);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
jButton9.setBackground(Color.LIGHT_GRAY);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseExited
    
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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jscore1;
    private javax.swing.JLabel jscore2;
    private javax.swing.JLabel player1name;
    private javax.swing.JLabel player2name;
    // End of variables declaration//GEN-END:variables
}
