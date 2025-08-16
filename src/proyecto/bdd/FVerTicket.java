package proyecto.bdd;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FVerTicket extends javax.swing.JFrame {

    public FVerTicket() {
        initComponents();
        
        maria = new MariaDB();
        modelo = new DefaultTableModel();
        Tabla.setModel(modelo);
        this.id = "";
        String id = getId();

        String titulos[] = {"ID", "Asunto", "Descripción", "Fecha Alta", "Fecha Límite", "Departamento", "Colab. de Alta", "Prioridad",  "Actividad"};
        modelo.setColumnIdentifiers(titulos);
        
        usuarioIngresado = new String[5];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ver Ticket");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Asunto", "Descripción", "Fecha Alta", "Fecha Límite", "Departamento", "Colaborador", "Prioridad", "Actividad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("Ver Ticket Actual");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnActualizar))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.getPadre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String sql = "select T.idTicket, T.asuntoTicket, T.descripcionTicket, T.fechaAltaTicket, T.fechaLimiteTicket, D.nombreDepartamento, C.nombreColaborador, T.prioridadTicket, T.activoTicket from tickets T, departamentos D, colaboradores C where T.idTicket = " + id + " and T.idDepartamentoTicket = D.idDepartamento and T.idColaboradorAltaTicket = C.idColaborador";
        maria.setSql(sql);
        maria.ejecutarSQLSelect();
        
        System.out.println(sql);
        limpiarTabla();
        
        try {
            while(maria.getRs().next()) {
                String idTicket = maria.getRs().getString("T.idTicket");
                String Asunto = maria.getRs().getString("T.asuntoTicket");
                String Descripcion = maria.getRs().getString("T.descripcionTicket");
                String FechaAlta = maria.getRs().getString("T.fechaAltaTicket");
                String FechaLimite = maria.getRs().getString("T.fechaLimiteTicket");
                String nombreDepartamento = maria.getRs().getString("D.nombreDepartamento");
                String nombreColaboradorAlta = maria.getRs().getString("C.nombreColaborador");
                String Prioridad = maria.getRs().getString("prioridadTicket");
                String ActivoTicket = maria.getRs().getString("activoTicket");
                
                modelo.addRow(new Object[]{idTicket, Asunto, Descripcion, FechaAlta, FechaLimite, nombreDepartamento, nombreColaboradorAlta, Prioridad, ActivoTicket});
            }
        } catch(SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
            
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String sql = "select T.idTicket, T.asuntoTicket, T.descripcionTicket, T.fechaAltaTicket, T.fechaLimiteTicket, D.nombreDepartamento, C.nombreColaborador, T.prioridadTicket, T.activoTicket from tickets T, departamentos D, colaboradores C where T.idTicket = " + id + " and T.idDepartamentoTicket = D.idDepartamento and T.idColaboradorAltaTicket = C.idColaborador";
        maria.setSql(sql);
        maria.ejecutarSQLSelect();
        
        System.out.println(sql);
        limpiarTabla();
        
        try {
            while(maria.getRs().next()) {
                String idTicket = maria.getRs().getString("T.idTicket");
                String Asunto = maria.getRs().getString("T.asuntoTicket");
                String Descripcion = maria.getRs().getString("T.descripcionTicket");
                String FechaAlta = maria.getRs().getString("T.fechaAltaTicket");
                String FechaLimite = maria.getRs().getString("T.fechaLimiteTicket");
                String nombreDepartamento = maria.getRs().getString("D.nombreDepartamento");
                String nombreColaboradorAlta = maria.getRs().getString("C.nombreColaborador");
                String Prioridad = maria.getRs().getString("prioridadTicket");
                String ActivoTicket = maria.getRs().getString("activoTicket");
                
                modelo.addRow(new Object[]{idTicket, Asunto, Descripcion, FechaAlta, FechaLimite, nombreDepartamento, nombreColaboradorAlta, Prioridad, ActivoTicket});
            }
        } catch(SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
            
        }
    }//GEN-LAST:event_formWindowActivated

    public void desplegarTicket() {
        String sql = "select T.idTicket, T.asuntoTicket, T.descripcionTicket, T.fechaAltaTicket, T.fechaLimiteTicket, D.nombreDepartamento, C.nombreColaborador, T.prioridadTicket, T.activoTicket from tickets T, departamentos D, colaboradores C where T.idTicket = " + id + " and T.idDepartamentoTicket = D.idDepartamento and T.idColaboradorAltaTicket = C.idColaborador";
        maria.setSql(sql);
        maria.ejecutarSQLSelect();
        
        System.out.println(sql);
        limpiarTabla();
        
        try {
            while(maria.getRs().next()) {
                String idTicket = maria.getRs().getString("T.idTicket");
                String Asunto = maria.getRs().getString("T.asuntoTicket");
                String Descripcion = maria.getRs().getString("T.descripcionTicket");
                String FechaAlta = maria.getRs().getString("T.fechaAltaTicket");
                String FechaLimite = maria.getRs().getString("T.fechaLimiteTicket");
                String nombreDepartamento = maria.getRs().getString("D.nombreDepartamento");
                String nombreColaboradorAlta = maria.getRs().getString("C.nombreColaborador");
                String Prioridad = maria.getRs().getString("prioridadTicket");
                String ActivoTicket = maria.getRs().getString("activoTicket");
                
                modelo.addRow(new Object[]{idTicket, Asunto, Descripcion, FechaAlta, FechaLimite, nombreDepartamento, nombreColaboradorAlta, Prioridad, ActivoTicket});
            }
        } catch(SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(FVerTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVerTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVerTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVerTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVerTicket().setVisible(true);
            }
        });
    }
    
    public void limpiarTabla() {
        DefaultTableModel temp = (DefaultTableModel) Tabla.getModel();
        int filas = Tabla.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }
    
    void leerTickets(String sql) {
        maria.setSql(sql);
        maria.ejecutarSQLSelect();
        
        // "ID", "Asunto", "Descripcion", "Fecha Alta", "Fecha Límite",
        // "Departamento", "Colab. de Alta", "Prioridad",  "Actividad"
        
        try {
            limpiarTabla();
            while (maria.getRs().next()) {
                int idTicket = maria.getRs().getInt("idTicket");
                String Asunto = maria.getRs().getString("asuntoTicket");
                String Descripcion = maria.getRs().getString("descripcionTicket");
                String FechaAlta = maria.getRs().getString("fechaAltaTicket");
                String FechaLimite = maria.getRs().getString("fechaLimiteTicket");
                int idDepartamento = maria.getRs().getInt("idDepartamentoTicket");
                //String nombreDepartamento = idToDepartamento(idDepartamento);
                int idColaboradorAlta = maria.getRs().getInt("idColaboradorAltaTicket");
                //String nombreColaboradorAlta = idToColaborador(idColaboradorAlta);
                int Prioridad = maria.getRs().getInt("prioridadTicket");
                int ActivoTicket = maria.getRs().getInt("activoTicket");
                
                System.out.println(idTicket + "\n" + Asunto + "\n" + Descripcion + "\n" + FechaAlta + "\n" + FechaLimite + "\n" + idDepartamento + "\n" + idColaboradorAlta + "\n" + Prioridad + "\n" + ActivoTicket);

                modelo.addRow(new Object[]{idTicket, Asunto, Descripcion, FechaAlta, FechaLimite, idDepartamento, idColaboradorAlta, Prioridad, ActivoTicket});
            }

        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
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
    
    public String idToDepartamento(int idDpto) {
        String nombreDpto = "";
        maria.setSql("select D.nombreDepartamento from departamentos D, tickets T where T.idDepartamentoTicket = " + idDpto + " and T.idDepartamentoTicket = D.idDepartamento limit 1");
        maria.ejecutarSQLSelect();
        System.out.println(maria.getSql());

        try {
            while (maria.getRs().next()) {
                nombreDpto = maria.getRs().getString("nombreDepartamento");
                System.out.println("nombreDpto: " + nombreDpto);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return nombreDpto;
    }
    
    public String idToColaborador(int idColab) {
        String nombreColab = "";
        maria.setSql("select C.nombreColaborador from colaboradores C, tickets T where T.idColaboradorAltaTicket = " + idColab + " and T.idColaboradorAltaTicket = C.idColaborador limit 1");
        maria.ejecutarSQLSelect();
        System.out.println(maria.getSql());

        try {
            while (maria.getRs().next()) {
                nombreColab = maria.getRs().getString("nombreColaborador");
                System.out.println("nombreColab: " + nombreColab);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return nombreColab;
    }
    
    public FTickets getPadre() {
        return padre;
    }
    
    public void setPadre(FTickets padre) {
        this.padre = padre;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String[] getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String[] usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }
    
    FTickets padre;
    DefaultTableModel modelo;
    MariaDB maria;
    String usuarioIngresado[];
    String id;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}