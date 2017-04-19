
package eventsystem.Ventanas.JInternas;

import static eventsystem.Ventanas.JInternas.EventosVerListaInvi.res;
import eventsystem.Ventanas.Login;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EventosAddInvitados extends javax.swing.JInternalFrame {

     DefaultListModel ListaM = new DefaultListModel();
     DefaultListModel ListaG = new DefaultListModel();
     DefaultListModel ListaE = new DefaultListModel();
     DefaultListModel ListaOM = new DefaultListModel(); //Es una lista oculta para guardar los id de las personas
     DefaultListModel ListaOG = new DefaultListModel(); //Es una lista oculta para guardar los id de los grupos
    Vector<String> OcultosMiembros,OcultosGrupos;
    
    Boolean GrupoUsado=false; //Variable para verificar si algun grupo fue asignado para notificar
    
    
    public EventosAddInvitados() {
        initComponents();
          initComponents();
        ListaMiembros.setModel(ListaM);
        ListaGrupos.setModel(ListaG);
        ListaEnvios.setModel(ListaE);
        OcultosMiembros = new Vector<String>(); //Este vector guardar todos los id seleccionados de los miembros-
        OcultosGrupos = new Vector<String>(); //Este vector guardar todos los id seleccionados de los grupos

        
        CargarEventos();
        limpiar();
    }
    
    
    
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

    
     public void limpiar(){
          
         LblEvento.setText("");
         GrupoUsado=false;
         ListaEnvios.setBackground(Color.decode("#FFFFFF"));
      
        
        try{
            
         CargarPalabras();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaGrupos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaEnvios = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaMiembros = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LblEvento = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ListaGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaGruposMouseClicked(evt);
            }
        });
        ListaGrupos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaGruposValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(ListaGrupos);

        jScrollPane4.setViewportView(ListaEnvios);

        ListaMiembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMiembrosMouseClicked(evt);
            }
        });
        ListaMiembros.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaMiembrosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListaMiembros);

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Lista de grupos");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Lista de miembros");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Lista de invitados:");

        jButton5.setText("Añadir al evento");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jButton4.setText("Seleccionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Selecciona el evento:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Evento"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton3.setText("Limpiar todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Evento seleccionado:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        LblEvento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LblEvento.setForeground(new java.awt.Color(255, 255, 255));
        LblEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(411, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void CargarPalabras(){
         
        try{
            
               ListaE.removeAllElements();
            ListaM.removeAllElements();
            ListaG.removeAllElements();
            
            ListaOM.removeAllElements();
            ListaOG.removeAllElements();
            OcultosMiembros.clear();
            OcultosGrupos.clear();
           GrupoUsado=false;
         
                   ResultSet res =  Herramientas.Utilidades.Consulta("Select * from Miembros where CodUsuario='"+Login.GetCodUsuario()+"'");
                        while(res.next()){
                           
                            ListaM.addElement(res.getString("Nombre")+" "+res.getString("Apellido"));
                           ListaOM.addElement(res.getString("CodMiembro"));
                        }
                        
//                        
                        
                        res =  Herramientas.Utilidades.Consulta("Select * from Grupos where CodUsuario='"+Login.GetCodUsuario()+"'");
                        while(res.next()){
//                            
                            ListaG.addElement(res.getString("Nombre"));
                             ListaOG.addElement(res.getString("CodGrupo"));
                          
                        }
                        
                    


        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al conectar con la BD "+e.getMessage());
        }
    }
    
    private void ListaGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaGruposMouseClicked

    }//GEN-LAST:event_ListaGruposMouseClicked

    private void ListaGruposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaGruposValueChanged

    }//GEN-LAST:event_ListaGruposValueChanged

    private void ListaMiembrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMiembrosMouseClicked

    }//GEN-LAST:event_ListaMiembrosMouseClicked

    private void ListaMiembrosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaMiembrosValueChanged

    }//GEN-LAST:event_ListaMiembrosValueChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            
         

            limpiar();
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            int c = ListaGrupos.getSelectedIndex();

            String elemento = (String) ListaGrupos.getSelectedValue();
            ListaE.addElement(elemento);

            OcultosGrupos.add(ListaOG.getElementAt(c).toString());
             ListaEnvios.setBackground(Color.decode("#819FF7"));

            ListaOG.remove(c);

            ListaG.remove(c);
            GrupoUsado = true;

        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            int c = ListaMiembros.getSelectedIndex();

            String elemento = (String) ListaMiembros.getSelectedValue();
            ListaE.addElement(elemento);

            OcultosMiembros.add(ListaOM.getElementAt(c).toString());
            ListaEnvios.setBackground(Color.decode("#819FF7"));

            ListaOM.remove(c);
            ListaM.remove(c);

        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        if(LblEvento.getText() != ""){
            
        
        if(ListaEnvios.getModel().getSize() > 0 ){
        
          if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea añadir esta lista al evento?",
                "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             
              try{
              
            //Para sacar a todos los miembros de los grupos y asignarlo al vector de los miembros
                if (GrupoUsado == true) {


                    for (String CodigoGrupo : OcultosGrupos) {

                        ResultSet res = Herramientas.Utilidades.Consulta("Select CodMiembro from GruposVsMiembros where CodGrupo='" + CodigoGrupo + "'");
                        while (res.next()) {

                            //Si ya lo contienen en la lista de miembros, pues simplemente no lo agrega, esto es para evitar que se envie mas de una vez el mensaje
                            if (!OcultosMiembros.contains(res.getString("CodMiembro"))) {
                                OcultosMiembros.add(res.getString("CodMiembro"));
                            }

                        }

                    }

                }
                
                //--- Fin de sacar miembros de los grupos
                
                try{
                    
                   
                   
                    String CodEvento = LblEvento.getText();

                    for (String CodigoMiembro : OcultosMiembros) {
                        Herramientas.Procedimientos.InsertarEventosVsMiembros(CodEvento, CodigoMiembro);

                    }

               
                }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
                }
                
            
                
                
                JOptionPane.showMessageDialog(null,"Se ha añadido correctamente.","Aviso",JOptionPane.INFORMATION_MESSAGE);
                   limpiar();
                   
                   }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al conectar con la BD "+e.getMessage());
            }
        

        
         }
        }
        
        }else{
             JOptionPane.showMessageDialog(null,"Debe seleccionar un evento primero.","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          if(table.getRowCount() != 0 && table.getSelectedRow() != -1){
        
        String Codigo =String.valueOf(table.getValueAt(table.getSelectedRow(),0));
        
        LblEvento.setText(Codigo);
        
         
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblEvento;
    private javax.swing.JList<String> ListaEnvios;
    private javax.swing.JList<String> ListaGrupos;
    private javax.swing.JList<String> ListaMiembros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
