import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */

    private ClientInterface challenger;
    public Game() {
        initComponents();
        initializeOtherClient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdamLanza = new javax.swing.JButton();
        DylanBennet = new javax.swing.JButton();
        CrisHarper = new javax.swing.JButton();
        EricHarris = new javax.swing.JButton();
        JeffWeise = new javax.swing.JButton();
        MarcLepine = new javax.swing.JButton();
        ThomasHamilton = new javax.swing.JButton();
        CharlesWhitman = new javax.swing.JButton();
        RobertSteinhauser = new javax.swing.JButton();
        TimKretschemer = new javax.swing.JButton();
        BaiNingyang = new javax.swing.JButton();
        AndrewKehoe = new javax.swing.JButton();
        NikolasCruz = new javax.swing.JButton();
        WalterSeifert = new javax.swing.JButton();
        WalterSeifert1 = new javax.swing.JButton();
        WalterSeifert2 = new javax.swing.JButton();
        WalterSeifert3 = new javax.swing.JButton();
        WalterSeifert4 = new javax.swing.JButton();
        WalterSeifert5 = new javax.swing.JButton();
        WalterSeifert6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdamLanza.setIcon(new javax.swing.ImageIcon("resources/AdamLanza.jpg")); // NOI18N
        AdamLanza.setText("jButton1");
        AdamLanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdamLanzaActionPerformed(evt);
            }
        });

        DylanBennet.setIcon(new javax.swing.ImageIcon("resources/Dylan_Klebold.JPG")); // NOI18N
        DylanBennet.setText("jButton1");
        DylanBennet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DylanBennetActionPerformed(evt);
            }
        });

        CrisHarper.setIcon(new javax.swing.ImageIcon("resources/Chris_Harper-Mercer.jpg")); // NOI18N
        CrisHarper.setText("jButton1");
        CrisHarper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrisHarperActionPerformed(evt);
            }
        });

        EricHarris.setIcon(new javax.swing.ImageIcon("resources/Eric_Harris.JPG")); // NOI18N
        EricHarris.setText("jButton1");
        EricHarris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EricHarrisActionPerformed(evt);
            }
        });

        JeffWeise.setIcon(new javax.swing.ImageIcon("resources/Jeff_Weise.jpg")); // NOI18N
        JeffWeise.setText("jButton1");
        JeffWeise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JeffWeiseActionPerformed(evt);
            }
        });

        MarcLepine.setIcon(new javax.swing.ImageIcon("resources/MarcLepine.jpg")); // NOI18N
        MarcLepine.setText("jButton1");
        MarcLepine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcLepineActionPerformed(evt);
            }
        });

        ThomasHamilton.setIcon(new javax.swing.ImageIcon("resources/Thomas_Hamilton.jpeg")); // NOI18N
        ThomasHamilton.setText("jButton1");
        ThomasHamilton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThomasHamiltonActionPerformed(evt);
            }
        });

        CharlesWhitman.setIcon(new javax.swing.ImageIcon("resources/Charles_Whitman.jpg")); // NOI18N
        CharlesWhitman.setText("jButton1");
        CharlesWhitman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharlesWhitmanActionPerformed(evt);
            }
        });

        RobertSteinhauser.setIcon(new javax.swing.ImageIcon("resources/RobertSteinhäuser.jpg")); // NOI18N
        RobertSteinhauser.setText("jButton1");
        RobertSteinhauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RobertSteinhauserActionPerformed(evt);
            }
        });

        TimKretschemer.setIcon(new javax.swing.ImageIcon("resources/TimKretschmer.jpg")); // NOI18N
        TimKretschemer.setText("jButton1");
        TimKretschemer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKretschemerActionPerformed(evt);
            }
        });

        BaiNingyang.setIcon(new javax.swing.ImageIcon("resources/Bai_Ningyang.jpg")); // NOI18N
        BaiNingyang.setText("jButton1");
        BaiNingyang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaiNingyangActionPerformed(evt);
            }
        });

        AndrewKehoe.setIcon(new javax.swing.ImageIcon("resources/AndrewKehoe.jpg")); // NOI18N
        AndrewKehoe.setText("jButton1");
        AndrewKehoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndrewKehoeActionPerformed(evt);
            }
        });

        NikolasCruz.setIcon(new javax.swing.ImageIcon("resources/nikolas_cruz.jpg")); // NOI18N
        NikolasCruz.setText("jButton1");
        NikolasCruz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NikolasCruzActionPerformed(evt);
            }
        });

        WalterSeifert.setIcon(new javax.swing.ImageIcon("resources/One_L._Goh.png")); // NOI18N
        WalterSeifert.setText("jButton1");
        WalterSeifert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifertActionPerformed(evt);
            }
        });

        WalterSeifert1.setIcon(new javax.swing.ImageIcon("resources/Patrick_Purdy.jpg")); // NOI18N
        WalterSeifert1.setText("jButton1");
        WalterSeifert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert1ActionPerformed(evt);
            }
        });

        WalterSeifert2.setIcon(new javax.swing.ImageIcon("resources/Mitchell_Scott.jpg")); // NOI18N
        WalterSeifert2.setText("jButton1");
        WalterSeifert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert2ActionPerformed(evt);
            }
        });

        WalterSeifert3.setIcon(new javax.swing.ImageIcon("resources/Mitchell_Golden.jpg")); // NOI18N
        WalterSeifert3.setText("jButton1");
        WalterSeifert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert3ActionPerformed(evt);
            }
        });

        WalterSeifert4.setIcon(new javax.swing.ImageIcon("resources/Tyrone_Mitchell.jpg")); // NOI18N
        WalterSeifert4.setText("jButton1");
        WalterSeifert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert4ActionPerformed(evt);
            }
        });

        WalterSeifert5.setIcon(new javax.swing.ImageIcon("resources/Brenda_Ann.jpg")); // NOI18N
        WalterSeifert5.setText("jButton1");
        WalterSeifert5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert5ActionPerformed(evt);
            }
        });

        WalterSeifert6.setIcon(new javax.swing.ImageIcon("resources/Walter_Seifert.jpg")); // NOI18N
        WalterSeifert6.setText("jButton1");
        WalterSeifert6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalterSeifert6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WalterSeifert, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WalterSeifert1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WalterSeifert2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WalterSeifert3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WalterSeifert4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WalterSeifert5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NikolasCruz, javax.swing.GroupLayout.PREFERRED_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(AndrewKehoe, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JeffWeise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BaiNingyang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CharlesWhitman, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(MarcLepine, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TimKretschemer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CrisHarper, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RobertSteinhauser, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EricHarris, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ThomasHamilton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WalterSeifert6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DylanBennet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AdamLanza, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdamLanza, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DylanBennet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrisHarper, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EricHarris, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CharlesWhitman, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BaiNingyang, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AndrewKehoe, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JeffWeise, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcLepine, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKretschemer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NikolasCruz, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RobertSteinhauser, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThomasHamilton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WalterSeifert6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WalterSeifert, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WalterSeifert1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(WalterSeifert2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(WalterSeifert3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(WalterSeifert4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WalterSeifert5, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdamLanzaActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_AdamLanzaActionPerformed
        try {
            if(1 == this.challenger.getCharacterID()){
                System.out.println("YOU WIN!!!!");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AdamLanzaActionPerformed

    private void DylanBennetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DylanBennetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DylanBennetActionPerformed

    private void CrisHarperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrisHarperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrisHarperActionPerformed

    private void EricHarrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EricHarrisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EricHarrisActionPerformed

    private void JeffWeiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JeffWeiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JeffWeiseActionPerformed

    private void MarcLepineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcLepineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcLepineActionPerformed

    private void ThomasHamiltonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThomasHamiltonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThomasHamiltonActionPerformed

    private void CharlesWhitmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharlesWhitmanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CharlesWhitmanActionPerformed

    private void RobertSteinhauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RobertSteinhauserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RobertSteinhauserActionPerformed

    private void TimKretschemerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKretschemerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKretschemerActionPerformed

    private void BaiNingyangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaiNingyangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaiNingyangActionPerformed

    private void AndrewKehoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndrewKehoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AndrewKehoeActionPerformed

    private void NikolasCruzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NikolasCruzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NikolasCruzActionPerformed

    private void WalterSeifertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifertActionPerformed

    private void WalterSeifert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert1ActionPerformed

    private void WalterSeifert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert2ActionPerformed

    private void WalterSeifert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert3ActionPerformed

    private void WalterSeifert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert4ActionPerformed

    private void WalterSeifert5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert5ActionPerformed

    private void WalterSeifert6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalterSeifert6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalterSeifert6ActionPerformed

    private void initializeOtherClient(){
        try{
            this.challenger = (ClientInterface) Naming.lookup("//" + "localhost" + "/challenger");
        } catch (Exception e){
            System.out.println("Initializing challenger error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.setSecurityManager(new RMISecurityManager());
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdamLanza;
    private javax.swing.JButton AndrewKehoe;
    private javax.swing.JButton BaiNingyang;
    private javax.swing.JButton CharlesWhitman;
    private javax.swing.JButton CrisHarper;
    private javax.swing.JButton DylanBennet;
    private javax.swing.JButton EricHarris;
    private javax.swing.JButton JeffWeise;
    private javax.swing.JButton MarcLepine;
    private javax.swing.JButton NikolasCruz;
    private javax.swing.JButton RobertSteinhauser;
    private javax.swing.JButton ThomasHamilton;
    private javax.swing.JButton TimKretschemer;
    private javax.swing.JButton WalterSeifert;
    private javax.swing.JButton WalterSeifert1;
    private javax.swing.JButton WalterSeifert2;
    private javax.swing.JButton WalterSeifert3;
    private javax.swing.JButton WalterSeifert4;
    private javax.swing.JButton WalterSeifert5;
    private javax.swing.JButton WalterSeifert6;
    // End of variables declaration//GEN-END:variables
}
