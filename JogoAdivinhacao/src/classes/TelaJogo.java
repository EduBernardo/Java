/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
       
        lblRes.setText("<html>Estou pensando em um numero entre <strong>1-5</strong>. Consegue Advinhar?</html>");
        
        File inicio = new File ("C:\\Users\\User\\Documents\\projetos_pessoais\\Java\\JogoAdivinhacao\\src\\imagens\\akipen.png");
        ImageIcon linicio = new ImageIcon(inicio.getPath());
           lblIma.setIcon(linicio);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btbPalp = new javax.swing.JButton();
        lblIma = new javax.swing.JLabel();
        txtVal = new javax.swing.JSpinner();
        lblRes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Valor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        btbPalp.setText("Palpite");
        btbPalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbPalpActionPerformed(evt);
            }
        });
        getContentPane().add(btbPalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 50));

        lblIma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genius.jpg"))); // NOI18N
        getContentPane().add(lblIma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 94, -1));

        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRes.setText("Frase");
        getContentPane().add(lblRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/think.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbPalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbPalpActionPerformed
        // TODO add your handling code here:
        int numalea = (int)(1+Math.random()*(6-1));
        
        int valor = (Integer.parseInt(txtVal.getValue().toString()));
        //MANEIRA MAIS COMPLETA, UTILIZANDO OBJETOS STRINGS
        String f1="Acertou Mizeravi!";
        String f2 ="Errou, o numero era "+numalea;
        String res = (numalea == valor)?f1:f2;
        lblRes.setText(res);
        
        //MANEIRA MAIS DIRETA, INDO DIRETO NO OPERADOR TENARIO
        //lblRes.setText((numalea==valor)?"Acertou Mizeravi!":"Errou, o numero era "+numalea);//UMA MANEIRA MAIS DIRETA DE SE FAZER
        
        //ALTERAR OS ICONS
        File errou = new File ("C:\\Users\\User\\Documents\\projetos_pessoais\\Java\\JogoAdivinhacao\\src\\imagens\\genius.jpg");
        File acertou = new File ("C:\\Users\\User\\Documents\\projetos_pessoais\\Java\\JogoAdivinhacao\\src\\imagens\\geniusac.png");
        
       String comp = lblRes.getText();
       
       if (comp==f1 );
       {
           ImageIcon lacertou = new ImageIcon(acertou.getPath());
           lblIma.setIcon(lacertou);
       }
       if (comp==f2 );
       {
           ImageIcon lerrou = new ImageIcon(errou.getPath());
           lblIma.setIcon(lerrou);
       } 
        
    }//GEN-LAST:event_btbPalpActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbPalp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblIma;
    private javax.swing.JLabel lblRes;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}