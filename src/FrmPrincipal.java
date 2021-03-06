
import java.awt.event.KeyEvent;
import javax.swing.UIManager;

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        panelUmbral = new javax.swing.JPanel();
        lblUmbral = new javax.swing.JLabel();
        txtUmbral = new javax.swing.JTextField();
        btnEstablecer = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        lblAyuda = new javax.swing.JLabel();
        lblValores = new javax.swing.JLabel();
        lblVector = new javax.swing.JLabel();
        separator2 = new javax.swing.JSeparator();
        panelResultado = new javax.swing.JPanel();
        scrollValores = new javax.swing.JScrollPane();
        txtValores = new javax.swing.JTextArea();
        checkOrdenar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Valores menores que un umbral");
        setResizable(false);

        panelUmbral.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 10));

        lblUmbral.setText("Umbral");

        txtUmbral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUmbralKeyPressed(evt);
            }
        });

        btnEstablecer.setText("Establecer");
        btnEstablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstablecerMouseClicked(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(206, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblError.setText("    ");

        separator1.setForeground(new java.awt.Color(185, 185, 185));

        lblAyuda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAyuda.setIcon(UIManager.getIcon("OptionPane.informationIcon"));
        lblAyuda.setToolTipText("Ayuda");
        lblAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAyudaMouseClicked(evt);
            }
        });

        lblValores.setText("Valores menores que el umbral");

        lblVector.setText("Mostrar vector");
        lblVector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVectorMouseClicked(evt);
            }
        });

        separator2.setForeground(new java.awt.Color(185, 185, 185));

        javax.swing.GroupLayout panelUmbralLayout = new javax.swing.GroupLayout(panelUmbral);
        panelUmbral.setLayout(panelUmbralLayout);
        panelUmbralLayout.setHorizontalGroup(
            panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUmbralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUmbralLayout.createSequentialGroup()
                        .addGroup(panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValores)
                            .addComponent(lblUmbral))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelUmbralLayout.createSequentialGroup()
                        .addComponent(txtUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEstablecer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                    .addGroup(panelUmbralLayout.createSequentialGroup()
                        .addComponent(separator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelUmbralLayout.setVerticalGroup(
            panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUmbralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUmbral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUmbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstablecer)
                    .addComponent(lblError))
                .addGroup(panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUmbralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUmbralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUmbralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVector, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblValores))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUmbralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelUmbral, java.awt.BorderLayout.PAGE_START);

        panelResultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 10, 10));

        txtValores.setEditable(false);
        txtValores.setColumns(20);
        txtValores.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtValores.setLineWrap(true);
        txtValores.setRows(5);
        txtValores.setWrapStyleWord(true);
        scrollValores.setViewportView(txtValores);

        checkOrdenar.setText("Orden ascendente");
        checkOrdenar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkOrdenarItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollValores, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addComponent(checkOrdenar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(scrollValores, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelResultado, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyudaMouseClicked
        DialAyuda dialAyuda = new DialAyuda(this, true);

        dialAyuda.setLocationRelativeTo(null);
        dialAyuda.setVisible(true);
    }//GEN-LAST:event_lblAyudaMouseClicked

    private void btnEstablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstablecerMouseClicked
        mostrarResultado();
    }//GEN-LAST:event_btnEstablecerMouseClicked

    private void txtUmbralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUmbralKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEstablecerMouseClicked(null);
        }
    }//GEN-LAST:event_txtUmbralKeyPressed

    private void lblVectorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVectorMouseClicked
        DialVectorOriginal dialVectorOriginal = new DialVectorOriginal(this, true);

        dialVectorOriginal.setLocationRelativeTo(null);
        dialVectorOriginal.setVisible(true);
    }//GEN-LAST:event_lblVectorMouseClicked

    private void checkOrdenarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkOrdenarItemStateChanged
        mostrarResultado();
    }//GEN-LAST:event_checkOrdenarItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstablecer;
    private javax.swing.JCheckBox checkOrdenar;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblUmbral;
    private javax.swing.JLabel lblValores;
    private javax.swing.JLabel lblVector;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JPanel panelUmbral;
    private javax.swing.JScrollPane scrollValores;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTextField txtUmbral;
    private javax.swing.JTextArea txtValores;
    // End of variables declaration//GEN-END:variables

    private void mostrarResultado() {
        txtValores.setText("");
        
        if (isNumeric(txtUmbral.getText())) {
            if (App.getVector().contiene(Float.parseFloat(txtUmbral.getText()))) {
                imprimirResultado();
                lblError.setText("");
            } else {
                lblError.setText("Umbral no contenido en el vector.");                
            }
        } else {
            lblError.setText("Por favor, introduzca un número real.");
        }
    }

    private boolean isNumeric(String input) {
        return input.matches("[-+]?\\d+(\\.\\d+)?");
    }

    private void imprimirResultado() {
        Vector vector = App.getVector();
        OperacionesVector.buscaMenores(vector, Float.parseFloat(txtUmbral.getText()));

        if (checkOrdenar.isSelected()) {
            txtValores.setText(vector.mostrarMenoresAscen());
        } else {
            txtValores.setText(vector.mostrarMenoresDescen());
        }
    }

}
