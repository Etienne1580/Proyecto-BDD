package proyecto.bdd;

import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FNuevoticket extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FNuevoticket.class.getName());

    public FNuevoticket() {
        initComponents();

        CbModelo = new DefaultComboBoxModel();
        Departamentos.setModel(CbModelo);
        CbModeloPrioridad = new DefaultComboBoxModel();

        maria = new MariaDB();
        usuarioIngresado = new String[5];
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Departamentos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Prioridad = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAsunto = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo ticket");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Departamento");

        Departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Límite");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Prioridad");

        Prioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("aaaa-mm-dd");

        txtAsunto.setColumns(20);
        txtAsunto.setRows(5);
        jScrollPane1.setViewportView(txtAsunto);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Asunto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegresar)
                                .addGap(74, 74, 74))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAgregar))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.getPadre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtDescripcion.getText().length() > 100) {
            JOptionPane.showMessageDialog(this, "Texto muy largo.");
        }

        if (txtFecha.getText().equals("") || txtDescripcion.getText().equals("") || txtAsunto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben llenarse.");
            txtFecha.setText("");
            CbModelo.setSelectedItem("Mantenimiento");
            Prioridad.setSelectedItem("Baja");

        } else {
            //Recolectar info
            descripcionTicket = txtDescripcion.getText();
            asuntoTicket = txtAsunto.getText();
            String fecha = txtFecha.getText();
            String departamento = CbModelo.getSelectedItem().toString();
            String prioridad = Prioridad.getSelectedItem().toString();
            String id = idColaboradorAlta();

            String idDpto = departamentoToId(departamento);
            mandarInfo(descripcionTicket, fecha, idDpto, id, prioridad, asuntoTicket);

            txtFecha.setText("");
            txtDescripcion.setText("");
            txtAsunto.setText("");
            CbModelo.setSelectedItem("Mantenimiento");
            Prioridad.setSelectedItem("Baja");

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new FNuevoticket().setVisible(true));
    }

    public FTickets getPadre() {
        return padre;
    }

    public void setPadre(FTickets padre) {
        this.padre = padre;
    }

    public String[] getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String[] usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public String idColaboradorAlta() {
        usuarioIngresado = getUsuarioIngresado();
        String idColaboradorAlta = this.usuarioIngresado[0];
        //System.out.println("ID de usuario: " + idColaboradorAlta);

        return idColaboradorAlta;
    }

    public int prioridadToNumber(String prioridad) {
        int numPrioridad = 0;

        switch (prioridad) {
            case "Baja":
                numPrioridad = 0;
                break;
            case "Media":
                numPrioridad = 1;
                break;
            case "Alta":
                numPrioridad = 2;
                break;
        }

        return numPrioridad;
    }

    public int activarTicket(String ActivarTicket) {
        int numActivar = 0;

        switch (ActivarTicket) {
            case "Desactivado":
                numActivar = 0;
                break;
            case "Activado":
                numActivar = 1;
                break;

        }

        return numActivar;

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

    public void mandarInfo(String descripcion, String fechaLim, String idDpto, String idColaboradorAlta, String prioridad, String asunto) {
        String fechaAlta = "";

        maria.setSql("select curdate() as date");
        maria.ejecutarSQLSelect();

        int numPrioridad = prioridadToNumber(prioridad);

        try {
            while (maria.getRs().next()) {
                fechaAlta = maria.getRs().getString("date");
                System.out.print("\n" + fechaAlta);
            }
            System.out.println("\nFecha Limite: " + fechaLim + "\nDepartamento: " + idDpto + "\nID de Colaborador: " + idColaboradorAlta + "\nPrioridad: " + prioridad + " (" + numPrioridad + ")");
            System.out.println("Asunto: " + asuntoTicket + "\nDescripcion: " + descripcionTicket);

            maria.setSql("insert into tickets(descripcionTicket, fechaAltaTicket, fechaLimiteTicket, idDepartamentoTicket, idColaboradorAltaTicket, prioridadTicket, asuntoTicket, activoTicket) values('" + descripcion + "', '" + fechaAlta + "', '" + fechaLim + "', " + idDpto + ", " + idColaboradorAlta + ", " + numPrioridad + ", '" + asunto + "', 1)");
            maria.ejecutarSQL();
            System.out.println(maria.getSql());

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    DefaultListModel modelo;
    MariaDB maria;
    DefaultComboBoxModel CbModelo;
    DefaultComboBoxModel CbModeloPrioridad;
    DefaultComboBoxModel CbModeloCbTicket;
    public String usuarioIngresado[];
    public String descripcionTicket;
    public String asuntoTicket;
    public String idColaboradorAlta;

    FTickets padre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Departamentos;
    private javax.swing.JComboBox<String> Prioridad;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAsunto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
