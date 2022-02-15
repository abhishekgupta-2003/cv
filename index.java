
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KANCHAN-PC
 */
public class Login extends javax.swing.JFrame {

    String email;
    String pass;
    Boolean isValidated = false;
     String total1;

    /**
     * Creates new form Login
     */
    public Login() {
        this.isValidated = false;
        setUndecorated(true);

        initComponents();

        jLabel1.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locksmith.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 370, 32, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 420, 32, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 230, 128, 128);

        jLabel5.setFont(new java.awt.Font("Levenim MT", 1, 36)); // NOI18N
        jLabel5.setText("Admin Login");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 170, 216, 47);

        Email.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(153, 153, 153));
        Email.setText("Email");
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(340, 370, 220, 30);

        password.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Password");
        password.setCaretColor(new java.awt.Color(153, 153, 153));
        password.setEchoChar('\u0000');
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(340, 420, 220, 30);

        jCheckBox1.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(340, 450, 120, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoo-1-removebg-preview-1.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 200, 120);

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel8.setText("Guptas Garage");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 30, 450, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginbutton1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 490, 180, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit1501.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(690, 520, 150, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blurred-minimalism-gradient-wallpaper-preview.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 160, 370, 410);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ba.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 880, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained

        if (Email.getText().equals("Email")) {

            Email.setText("");

        }
        Email.setForeground(Color.BLACK);
//        else if("".equals(Email.getText())){
//                
//        Email.setText("Email");
//        }  

    }//GEN-LAST:event_EmailFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        if (Email.getText().equals("")) {
            Email.setText("Email");
            Email.setForeground(new Color(153, 153, 153));
        }
//        else if(Email.getText().equals("Email")){
//        Email.setText("");
//        }


    }//GEN-LAST:event_EmailFocusLost

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        
//        
          if (password.getText().equals("Password")) {

            password.setText(" ");
           
           password.setForeground(Color.BLACK); 
        }
 
           password.setEchoChar('*');
      
      
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
     
  if (password.getText().equals(" ")) {
            password.setText("Password");
            password.setForeground(new Color(153, 153, 153));
  }
    password.setEchoChar('\u0000');
    }//GEN-LAST:event_passwordFocusLost
//
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
        {
            password.setEchoChar((char)0);
        }else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void log(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log
         email = "abhi";
        pass = "1";

        if(Email.getText().equals("Email") ||password.getPassword().equals("password"))
        {
            JOptionPane.showMessageDialog(this, "Fill All Fields");
        }
        else if (Email.getText().equals(email) && password.getText().equals(pass)) {
            isValidated = true;
            this.setVisible(false);
            new Home().setVisible(true);
        }
        else {

            JOptionPane.showMessageDialog(this, "wrong credentials");
        }
      
    }//GEN-LAST:event_log

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exit

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
