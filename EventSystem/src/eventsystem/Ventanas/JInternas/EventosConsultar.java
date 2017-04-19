
package eventsystem.Ventanas.JInternas;

import eventsystem.Ventanas.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EventosConsultar extends EventosCrear {

    static ResultSet res;
    
    public void CargarEventos(){
        
        DefaultTableModel Modelo = (DefaultTableModel) table.getModel();
        Modelo.setRowCount(0);
        
        res = Herramientas.Utilidades.Consulta("Select * from Eventos where CodUsuario='" + Login.GetCodUsuario() + "'");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                Modelo.addRow(v);
                table.setModel(Modelo);
            }
        }catch (Exception e){
        }
    }
   
    public EventosConsultar() {
        initComponents();
        CargarEventos();
        TxtBuscar.grabFocus();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        BtnRefrescar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnNotificar = new javax.swing.JButton();

        setTitle("Consultar Eventos");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Mensaje", "Fecha envio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Buscar por descripción:");

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnRefrescar.setText("Refrescar");
        BtnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefrescarActionPerformed(evt);
            }
        });

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnNotificar.setText("Notificar");
        BtnNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnNotificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnRefrescar)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnNotificar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRefrescarActionPerformed
        CargarEventos();
        TxtBuscar.setText("");
        TxtBuscar.grabFocus();
    }//GEN-LAST:event_BtnRefrescarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
         
       if(!TxtBuscar.getText().isEmpty()){
           
      
        DefaultTableModel Modelo = (DefaultTableModel) table.getModel();
        Modelo.setRowCount(0);
        
        res = Herramientas.Utilidades.Consulta("Select * from Eventos where CodUsuario='" + Login.GetCodUsuario() + "' and Descripcion LIKE '%" + TxtBuscar.getText() + "%'");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                Modelo.addRow(v);
                table.setModel(Modelo);
            }
        }catch (Exception e){
        }
        
         }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
      
        if(table.getRowCount() != 0 && table.getSelectedRow() != -1){
        
          if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar este evento?",
                "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
              
         
        String Codigo =String.valueOf(table.getValueAt(table.getSelectedRow(),0));
        try {
            Herramientas.Procedimientos.EliminarEvento(Codigo,Login.GetCodUsuario());
            JOptionPane.showMessageDialog(null,"Se ha eliminado el evento");
        } catch (SQLException ex) {
            Logger.getLogger(EventosConsultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CargarEventos();
        
         }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnNotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotificarActionPerformed
       if(table.getRowCount() != 0 && table.getSelectedRow() != -1){
        
          if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea notificar este evento antes de tiempo?",
                "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
              
         
        String Codigo =String.valueOf(table.getValueAt(table.getSelectedRow(),0));
        try {
            Herramientas.Procedimientos.NotificarEvento(Codigo,Login.GetCodUsuario());
            JOptionPane.showMessageDialog(null,"Se ha enviado la notificación del evento");
        } catch (SQLException ex) {
            Logger.getLogger(EventosConsultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CargarEventos();
        
         }
        }
    }//GEN-LAST:event_BtnNotificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnNotificar;
    private javax.swing.JButton BtnRefrescar;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
