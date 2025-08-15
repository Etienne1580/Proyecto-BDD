package proyecto.bdd;

import javax.swing.DefaultListModel;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class FColaborador extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FColaborador.class.getName());

    public FColaborador() {
        initComponents();
        conectarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        Departamentos = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Colaboradores");

        jLabel1.setText("Colaboradores");

        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLista);

        jLabel2.setText("Nombre");

        jLabel3.setText("Usuario");

        jLabel4.setText("Departamento");

        jLabel5.setText("Clave");

        Departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txtUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(Departamentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClave))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.getPadre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        nombre = txtNombre.getText();
        usuario = txtUsuario.getText();
        clave = txtClave.getText();

        maria.setSql("delete from colaboradores where nombreColaborador = '" + nombre + "' and usuarioColaborador = '" + usuario + "' and claveColaborador = '" + clave + "';");
        maria.ejecutarSQL();

        txtNombre.setText("");
        txtUsuario.setText("");
        txtClave.setText("");

        txtNombre.requestFocus();

        conectarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        posLista = jLista.getSelectedValue();

        nombre = txtNombre.getText();
        usuario = txtUsuario.getText();
        clave = txtClave.getText();
        departamento = CbModelo.getSelectedItem().toString();

        String idDpto = departamentoToId(departamento);

        maria.setSql("update colaboradores set nombreColaborador = '" + nombre + "', usuarioColaborador = '" + usuario + "', claveColaborador = '" + clave + "', idDepartamentoColaborador = '" + idDpto + "' where nombreColaborador = '" + posLista + "';");
        maria.ejecutarSQL();

        System.out.println("update colaboradores set nombreColaborador = '" + nombre + "', usuarioColaborador = '" + usuario + "', claveColaborador = '" + clave + "' where nombreColaborador = '" + posLista + "';");

        txtNombre.setText("");
        txtNombre.requestFocus();

        conectarDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nombre = txtNombre.getText();
        usuario = txtUsuario.getText();
        clave = txtClave.getText();
        departamento = CbModelo.getSelectedItem().toString();

        idDpto = departamentoToId(departamento);

        maria.setSql("insert into colaboradores(nombreColaborador,usuarioColaborador,claveColaborador,idDepartamentoColaborador) values('" + nombre + "','" + usuario + "','" + clave + "','" + idDpto + "');");
        maria.ejecutarSQL();

        txtNombre.setText("");
        txtUsuario.setText("");
        txtClave.setText("");

        txtNombre.requestFocus();

        conectarDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaValueChanged
        String pos = jLista.getSelectedValue();

        maria.setSql("Select * from colaboradores where nombreColaborador = '" + pos + "'");
        maria.ejecutarSQLSelect();

        leerColaboradores();

        txtNombre.setText(pos);
        txtUsuario.setText(usuario);
        txtClave.setText(clave);
        int idDpto = Integer.parseInt(departamento);
        idDpto = idDpto - 1;

        Departamentos.setSelectedIndex(idDpto);

        System.out.println(maria.getSql());
    }//GEN-LAST:event_jListaValueChanged

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FColaborador().setVisible(true));
    }

    void conectarDatos() {
        modelo = new DefaultListModel();
        jLista.setModel(modelo);

        CbModelo = new DefaultComboBoxModel();
        Departamentos.setModel(CbModelo);

        maria = new MariaDB();

        maria.setSql("select * from colaboradores");

        maria.ejecutarSQLSelect();

        try {
            while (maria.getRs().next()) {
                modelo.addElement(maria.getRs().getString("nombreColaborador"));
            }

        } catch (SQLException e) {
            System.out.println("Error:..." + e.getMessage());
        }

        maria.setSql("select * from departamentos");
        maria.ejecutarSQLSelect();

        try {
            while (maria.getRs().next()) {
                CbModelo.addElement(maria.getRs().getString("nombreDepartamento"));
            }

        } catch (SQLException e) {
            System.out.println("Error:..." + e.getMessage());
        }

    }

    public String departamentoToId(String dpto) {
        String idDpto = "";
        maria.setSql("select idDepartamento from departamentos where nombreDepartamento = '" + dpto + "'");
        maria.ejecutarSQLSelect();
        System.out.println(maria.getSql());

        try {
            while (maria.getRs().next()) {
                idDpto = maria.getRs().getString("idDepartamento");
                System.out.println("idDpto: " + idDpto);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return idDpto;
    }

    void leerColaboradores() {
        try {
            while (maria.getRs().next()) {
                nombre = maria.getRs().getString("nombreColaborador");
                departamento = maria.getRs().getString("idDepartamentoColaborador");
                usuario = maria.getRs().getString("usuarioColaborador");
                clave = maria.getRs().getString("claveColaborador");

            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public FTickets getPadre() {
        return padre;
    }

    public void setPadre(FTickets padre) {
        this.padre = padre;
    }

    String nombre;
    String usuario;
    String clave;
    String departamento;
    String posLista;
    String idDpto;

    DefaultListModel modelo;
    MariaDB maria;
    DefaultComboBoxModel CbModelo;

    FTickets padre;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Departamentos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
