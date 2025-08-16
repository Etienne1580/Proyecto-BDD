package proyecto.bdd;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public final class FTickets extends javax.swing.JFrame {

    public FTickets() {
        initComponents();

        maria = new MariaDB();
        modelo = new DefaultTableModel();
        Tabla.setModel(modelo);

        String titulos[] = {"ID", "Asunto", "Fecha Alta", "Activo Ticket"};
        modelo.setColumnIdentifiers(titulos);

        this.leerTickets("select * from tickets where activoTicket != 7");

        usuarioIngresado = new String[5];
        
        System.out.print(getFecha() + "\n");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnColaborador = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        btnBitacora = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuarioIngresado = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnVerTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tickets");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Asunto", "Fecha Limite", "Activo Ticket"
            }
        ));
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnColaborador.setText("Colaborador");
        btnColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaboradorActionPerformed(evt);
            }
        });

        btnDepartamentos.setText("Departamentos");
        btnDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartamentosActionPerformed(evt);
            }
        });

        btnBitacora.setText("Bitacora");
        btnBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBitacoraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Fecha");

        txtUsuarioIngresado.setText("Usuario: Etienne");

        jlFecha.setText("15 Jul 2025");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVerTicket.setText("Ver Ticket");
        btnVerTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(304, 304, 304))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnColaborador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBitacora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUsuarioIngresado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlFecha)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar)
                .addGap(12, 12, 12)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerTicket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBitacora, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnFinalizar)
                    .addComponent(btnActualizar)
                    .addComponent(btnVerTicket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioIngresado)
                    .addComponent(jlFecha))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaboradorActionPerformed
        FColaborador Colaborador = new FColaborador();
        Colaborador.setPadre(this);
        Colaborador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnColaboradorActionPerformed

    private void btnDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartamentosActionPerformed
        FDepartamento Departamento = new FDepartamento();
        Departamento.setPadre(this);
        Departamento.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDepartamentosActionPerformed

    private void btnBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBitacoraActionPerformed
        FBitacora Bitacora = new FBitacora();
        Bitacora.setPadre(this);
        Bitacora.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBitacoraActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        FNuevoticket Nuevoticket = new FNuevoticket();
        Nuevoticket.setPadre(this);
        Nuevoticket.setVisible(true);
        this.setVisible(false);
        Nuevoticket.setUsuarioIngresado(usuarioIngresado);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.txtUsuarioIngresado.setText(this.usuarioIngresado[1]);
        this.jlFecha.setText(getFecha());
    }//GEN-LAST:event_formWindowActivated

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Fecha = txtFecha.getText();
        String consulta = "select * from tickets where fechaAltaTicket >= '" + Fecha + "' order by idTicket and activoTicket != 7";

        System.out.println(consulta);
        this.leerTickets(consulta);

        txtFecha.setText("");

        txtFecha.requestFocus();


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        this.leerTickets("select * from  tickets where activoTicket != 7");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVerTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTicketActionPerformed
        int row = Tabla.getSelectedRow();
        String idItem = Tabla.getValueAt(row, 0).toString();
        System.out.println("idTicket: " + idItem);
        
        FVerTicket VerTicket = new FVerTicket();
        VerTicket.setPadre(this);
        VerTicket.setId(idItem);
        VerTicket.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnVerTicketActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int row = Tabla.getSelectedRow();
        String idItem = Tabla.getValueAt(row, 0).toString();
        System.out.println("idTicket a finalizar: " + idItem);
        String fecha = getFecha();
        String idUsuarioCompletado = this.usuarioIngresado[0];
        
        String sql = "update tickets set activoTicket = 7, idColaboradorCompletadoTicket = " + idUsuarioCompletado + ", fechaCompletadoTicket = '" + fecha + "' where idTicket = " + idItem;
        System.out.println(sql);
        
        maria.setSql(sql);
        maria.ejecutarSQL();
        
        JOptionPane.showMessageDialog(this, "¡Felicidades, has completado tu tarea!");
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    public void limpiartabla() {
        DefaultTableModel temp = (DefaultTableModel) Tabla.getModel();
        int filas = Tabla.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }

    void leerTickets(String sql) {
        maria.setSql(sql);
        maria.ejecutarSQLSelect();

        try {
            limpiartabla();
            while (maria.getRs().next()) {
                String id = maria.getRs().getString("idTicket");
                String Asunto = maria.getRs().getString("asuntoTicket");
                String FechaAlta = maria.getRs().getString("fechaAltaTicket");
                int ActivoTicket = maria.getRs().getInt("activoTicket");

                modelo.addRow(new Object[]{id, Asunto, FechaAlta, ActivoTicket});
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public String getFecha() {
        maria.setSql("select curdate() as date");
        maria.ejecutarSQLSelect();
        String fechaAlta = "";

        try {
            while (maria.getRs().next()) {
                fechaAlta = maria.getRs().getString("date");
                
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return fechaAlta;
    }

    /*private void BuscarFecha() {
        maria.setSql("select * from tickets");
        maria.ejecutarSQLSelect();

        try {
            while (maria.getRs().next()) {
                CbModelo.addElement(maria.getRs().getString("fechaAltaTicket"));
            }

        } catch (SQLException e) {
            System.out.println("Error:..." + e.getMessage());
        }

    }*/
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new FTickets().setVisible(true));
    }

    public String[] getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String[] usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    //DefaultListModel modelo;
    DefaultComboBoxModel CbModelo;
    DefaultTableModel modelo;
    DefaultTableModel temp;
    MariaDB maria;

    String Fecha;

    private String usuarioIngresado[];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBitacora;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnColaborador;
    private javax.swing.JButton btnDepartamentos;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JLabel txtUsuarioIngresado;
    // End of variables declaration//GEN-END:variables
}
