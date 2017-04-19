
package eventsystem.Ventanas;
import Herramientas.Utilidades;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.HashSet;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnIniciar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        TxtContra = new javax.swing.JPasswordField();
        TxtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LblRegistrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña:");

        BtnIniciar.setText("Iniciar");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        BtnCerrar.setText("Salir");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        TxtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Usuario:");

        LblRegistrarse.setText("Registrarse");
        LblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblRegistrarseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblRegistrarse))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    static private int CodigoUsu;
    
    
    public static int GetCodUsuario(){
        return CodigoUsu;
    }
    
    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
      String usuario="",pass="";
         
      
      if(TxtUsuario.getText().equals("") || TxtContra.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe de rellenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
            TxtUsuario.grabFocus();
        }else{
        
        
        
        
        try{
         
                   ResultSet res =  Herramientas.Utilidades.Consulta("Select CodUsuario,Usuario,Password from Usuarios where Usuario='"+TxtUsuario.getText()+"'"+" AND "+ "Password='"+TxtContra.getText()+"'");
                        while(res.next()){
                            usuario = res.getString("Usuario");
                            pass = res.getString("Password");
                            CodigoUsu= res.getInt("CodUsuario");
                        }


        
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al conectar con la BD "+e.getMessage());
        }
        
       
         
        
        if(TxtUsuario.getText().equals(usuario) && TxtContra.getText().equals(pass) ){
         
          
          this.hide();
          Principal ventanaPri = new Principal();
          ventanaPri.show();
          
      }else{
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión, contraseña o usuario incorrecto!.."+"  "+usuario+"  "+pass,"ERROR",JOptionPane.ERROR_MESSAGE);
            TxtUsuario.setText("");
            TxtContra.setText("");
             TxtUsuario.grabFocus();
        }

}
    
     
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
       
        if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?",
                "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void TxtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraActionPerformed

    private void LblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblRegistrarseMouseClicked
        Usuarios usu = new Usuarios(this,true);
        usu.setVisible(true);
        
    }//GEN-LAST:event_LblRegistrarseMouseClicked

    private void LblRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblRegistrarseMouseEntered
        LblRegistrarse.setForeground(Color.RED);
    }//GEN-LAST:event_LblRegistrarseMouseEntered

    private void LblRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblRegistrarseMouseExited
        LblRegistrarse.setForeground(Color.black);
    }//GEN-LAST:event_LblRegistrarseMouseExited

    public static void main(String args[]) {
      

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JLabel LblRegistrarse;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
