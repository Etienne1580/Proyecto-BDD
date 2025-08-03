package proyecto.bdd;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FBitacora extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FBitacora.class.getName());

    public FBitacora() {
        initComponents();

        maria = new MariaDB();
        modelo = new DefaultTableModel();
        Tabla.setModel(modelo);

        String titulos[] = {"ID", "Descripcion", "Fecha"};
        modelo.setColumnIdentifiers(titulos);

        this.leerBitacoras();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bitacora");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Bitacora");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripccion", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.getPadre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new FBitacora().setVisible(true));
    }

    void leerBitacoras() {
        maria.setSql("select * from bitacoras");
        maria.ejecutarSQLSelect();

        try {

            while (maria.getRs().next()) {
                String id = maria.getRs().getString("idBitacora");
                String descripcion = maria.getRs().getString("descripcionBitacora");
                String fecha = maria.getRs().getString("fechaBitacora");

                modelo.addRow(new Object[]{id, descripcion, fecha});
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

    DefaultTableModel modelo;
    MariaDB maria;

    FTickets padre;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
