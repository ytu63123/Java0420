/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.ocp.lab18.game;

import javax.swing.ImageIcon;

/**
 *
 * @author teacher
 */
public class FightingJFrame extends javax.swing.JFrame {
    private static String path = "src\\main\\java\\com\\myjava\\ocp\\lab18\\game\\fighting_images\\";
    private static ImageIcon[] icons = {
        new ImageIcon(path + "ready_0.png"),
        new ImageIcon(path + "ready_1.png"),
        new ImageIcon(path + "ready_2.png"),
        new ImageIcon(path + "ready_3.png"),
        new ImageIcon(path + "ready_4.png"),
        new ImageIcon(path + "ready_5.png"),
    };
    private static ImageIcon[] icons2 = {
        new ImageIcon(path + "fight_0.png"),
        new ImageIcon(path + "fight_1.png"),
        new ImageIcon(path + "fight_2.png"),
        new ImageIcon(path + "fight_3.png"),
        new ImageIcon(path + "fight_4.png"),
        new ImageIcon(path + "fight_5.png"),
    };
    private Ready ready = new Ready();
    public FightingJFrame() {
        initComponents();
        ready.start();
    }
    
    class Ready extends Thread {
        boolean isReady = true;
        @Override
        public void run() {
            for (int i=0;true;i++) {
                if(isReady)
                    actor.setIcon(icons[i % icons.length]);
                else
                    actor.setIcon(icons2[i % icons2.length]);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                if(i == Integer.MAX_VALUE) i = 0;
            }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorMouseClicked
        if(evt.getClickCount() == 1) {
            ready.isReady = !ready.isReady;
        }
    }//GEN-LAST:event_actorMouseClicked

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
            java.util.logging.Logger.getLogger(FightingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actor;
    // End of variables declaration//GEN-END:variables
}
