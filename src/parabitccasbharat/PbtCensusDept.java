/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

/**
 *
 * @author ASUS
 */
public class PbtCensusDept extends javax.swing.JFrame {

    /**
     * Creates new form PbtCensusDept
     * @param data
     */
    PbtEmpData empdata;
    public PbtCensusDept(PbtEmpData data) {
        empdata = data;
        initComponents();
        switch (data.getEmpgrade()){
            case 1:
                btndoco.setEnabled(false);
                btnco.setEnabled(false);
                btnpco.setEnabled(false);
                break;
            case 2:
                btncc.setEnabled(false);
                btnco.setEnabled(false);
                btnpco.setEnabled(false);
                break;
            case 3:
                btncc.setEnabled(false);
                btnco.setEnabled(false);
                btndoco.setEnabled(false);
                break;
            case 4:
                btncc.setEnabled(false);
                btnpco.setEnabled(false);
                btndoco.setEnabled(false);
                break;
            default:
                System.out.println("Grade not found");
        }
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncc = new javax.swing.JButton();
        btndoco = new javax.swing.JButton();
        btnco = new javax.swing.JButton();
        btnpco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btncc.setText("Census Commissioner");
        btncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnccActionPerformed(evt);
            }
        });

        btndoco.setText("Director Of Census Operation");
        btndoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocoActionPerformed(evt);
            }
        });

        btnco.setText("Census Officer");
        btnco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoActionPerformed(evt);
            }
        });

        btnpco.setText("Principal Census Officer");
        btnpco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpcoActionPerformed(evt);
            }
        });

        jLabel1.setText("Census Departent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnpco, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnco, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndoco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndoco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnccActionPerformed

        PbtDashboard pd = new PbtDashboard(empdata);
        pd.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnccActionPerformed

    private void btndocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocoActionPerformed
        
        PbtDashboard pd = new PbtDashboard(empdata);
        pd.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btndocoActionPerformed

    private void btnpcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpcoActionPerformed
        
        PbtDashboard pd = new PbtDashboard(empdata);
        pd.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnpcoActionPerformed

    private void btncoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoActionPerformed
        
        PbtDashboard pd = new PbtDashboard(empdata);
        pd.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btncoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncc;
    private javax.swing.JButton btnco;
    private javax.swing.JButton btndoco;
    private javax.swing.JButton btnpco;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
