/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsystem.Ventanas;

import eventsystem.Ventanas.JInternas.EventosAddInvitados;
import eventsystem.Ventanas.JInternas.EventosCrear;
import eventsystem.Ventanas.JInternas.EventosConsultar;
import eventsystem.Ventanas.JInternas.GruposAddmiembro;
import eventsystem.Ventanas.JInternas.GruposConsultar;
import eventsystem.Ventanas.JInternas.GruposCrear;
import eventsystem.Ventanas.JInternas.MiembrosCrear;
import eventsystem.Ventanas.JInternas.MiembrosConsultar;
import eventsystem.Ventanas.JInternas.EventosVerListaInvi;
import eventsystem.Ventanas.JInternas.GruposVerListaMiemGrup;
import java.awt.Dimension;

/**
 *
 * @author YoelTorres
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );

        jMenu2.setText("Eventos");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Crear evento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Añadir al evento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Consultar / Eliminar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setText("Lista de miembros por evento");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Miembros");

        jMenuItem2.setText("Crear miembro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Consultar / Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Grupos");

        jMenuItem8.setText("Crear grupo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem7.setText("Añadir al grupo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem10.setText("Consultar / Eliminar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem9.setText("Lista de miembros por grupo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            
        
            EventosCrear VEN = new EventosCrear();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,25);
            VEN.show();
            
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
            
            
        
           
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        EventosConsultar VEN = new EventosConsultar();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         MiembrosCrear VEN = new MiembrosCrear();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        GruposCrear VEN = new GruposCrear();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        MiembrosConsultar VEN = new MiembrosConsultar();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         EventosAddInvitados VEN = new EventosAddInvitados();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,20);
            VEN.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        EventosVerListaInvi VEN = new EventosVerListaInvi();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

         GruposConsultar VEN = new GruposConsultar();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        GruposAddmiembro VEN = new GruposAddmiembro();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,20);
            VEN.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        GruposVerListaMiemGrup VEN = new GruposVerListaMiemGrup();
           
            //Agregar y centralizar la ventana creada
            jDesktopPane1.add(VEN);
            Dimension tamanioPadre = jDesktopPane1.getSize();
            Dimension tamanioHijo = VEN.getSize();
            VEN.setLocation((tamanioPadre.width - tamanioHijo.width)/2,40);
            VEN.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}