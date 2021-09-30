/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PbtAppointedEmpList extends javax.swing.JFrame {

    DefaultTableModel model;
    int fetchgrade;
    ParabitDBC dbc =  new ParabitDBC();
    /**
     * Creates new form PbtAppointedEmpList
     * @param data
     */
    public PbtAppointedEmpList(PbtEmpData data) {
        initComponents();
        appointedEmpLst(data);
    }
    
    public void appointedEmpLst(PbtEmpData data)
    {
        model = (DefaultTableModel) tabappointedemplst.getModel();
        fetchgrade = data.getEmpgrade();
        int sno = 0;
        String qry = "SELECT * FROM `pbtemployeetable` WHERE Grade = " + (fetchgrade + 1) + " and Status = 1";
        model.setRowCount(0);
        try {
            dbc.rs1=dbc.stm.executeQuery(qry);
            while(dbc.rs1.next())
            {
                sno = sno+1;
                String ceid = dbc.rs1.getString("CEID");
                String name = dbc.rs1.getString("EmpName");
                String grade = dbc.rs1.getString("Grade");
                String designation = dbc.rs1.getString("EmpDesig");
                String city = dbc.rs1.getString("AreaCity");
                String district = dbc.rs1.getString("AreaDist");
                String state = dbc.rs1.getString("AreaState");
                Object row[] = {sno, ceid, name, grade, designation, city, district, state};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabappointedemplst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabappointedemplst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo", "CEID", "Name", "Grade", "Designation", "City", "District", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabappointedemplst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabappointedemplst;
    // End of variables declaration//GEN-END:variables
}

