/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizadorcarpeta;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;

/**
 *
 * @author PC01
 */
public class SelectorDia extends javax.swing.JFrame {
    static MenuPrincipal menu;

    public SelectorDia(String dia) {
        final int numeroDia;
        switch(dia){
            case "Lunes": numeroDia=0; break;
            case "Martes": numeroDia=1; break;
            case "Miércoles": numeroDia=2; break;
            case "Jueves": numeroDia=3; break;
            case "Viernes": numeroDia=4; break;
            default: numeroDia=18; break;
        }
        initComponents();
        jLabel1.setText(dia);
        setBounds(0,0,600,(menu.listaMaterias.size()/3)*35+135);
        for(int i=0;i<MenuPrincipal.listaMaterias.size()/3+1;i++){ // vertical
            for(int x=0;x<3;x++){ //horizontal
                // Si se va del rango
                if(i*3+x==MenuPrincipal.listaMaterias.size())
                    return;
                // CheckBox materia
                final int pos=i*3+x;
                JCheckBox musica = new JCheckBox(MenuPrincipal.listaMaterias.get(pos));
                musica.setBounds(30*(x+1)+150*x, 50+50*i, 150, 15);
                musica.setOpaque(false);
                add(musica);
                musica.addItemListener((ItemEvent e) -> {
                    if(e.getStateChange()==1) {//activado
                        ArrayList<String> temp = menu.diasMaterias.get(numeroDia);
                        temp.add(MenuPrincipal.listaMaterias.get(pos));
                        menu.diasMaterias.add(numeroDia, temp);
                        menu.diasMaterias.remove(numeroDia+1);
                        System.out.println("se activo el " + MenuPrincipal.listaMaterias.get(pos));
                    } else {
                        for(int z=0;z<menu.diasMaterias.size();z++){
                            if(menu.diasMaterias.get(z).equals(MenuPrincipal.listaMaterias.get(pos))){
                                ArrayList<String> temp = menu.diasMaterias.get(numeroDia);
                                temp.remove(z);
                                menu.diasMaterias.add(numeroDia, temp);
                                menu.diasMaterias.remove(numeroDia+1);
                                return;
                            }
                        }
                        System.out.println("se desactivo el " + MenuPrincipal.listaMaterias.get(pos));
                    }
                });  
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lunes");

        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String dia, MenuPrincipal menuPrin){
        menu=menuPrin;
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
            java.util.logging.Logger.getLogger(SelectorDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectorDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectorDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectorDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectorDia temp = new SelectorDia(dia);
                temp.setLocationRelativeTo(null);
                temp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}