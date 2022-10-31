/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.MedSystem;
import Model.Patient;
import Model.House;
import javax.swing.table.DefaultTableModel;
import Model.City;
import Model.Community;
import Model.Person;
import javax.swing.JOptionPane;
/**
 *
 * @author verma
 */
public class addCommunity extends javax.swing.JPanel {

    /**
     * Creates new form addCommunity
     */
    MedSystem ms;
    public addCommunity(MedSystem ms) {
        initComponents();
        this.ms=ms;
        DisplayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtApt = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtPin = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        varUpdate1 = new javax.swing.JButton();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Address", "Apartment", "State", "Pin", "City", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable3);

        jLabel1.setText("Id:");

        jLabel10.setText("Pin:");

        jLabel11.setText("City:");

        jLabel7.setText("Address:");

        jLabel8.setText("Apartment:");

        jLabel9.setText("State:");

        jLabel13.setText("Community:");

        varUpdate1.setText("UPDATE");
        varUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtApt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(varUpdate1))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varUpdate1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) jTable3.getModel();
        int selectRow=jTable3.getSelectedRow();
        txtId.setText(model.getValueAt(selectRow,0).toString());

        txtAddress.setText(model.getValueAt(selectRow,1).toString());
        txtApt.setText(model.getValueAt(selectRow,2).toString());
        txtState.setText(model.getValueAt(selectRow,3).toString());
        txtPin.setText(model.getValueAt(selectRow,4).toString());
        txtCity.setText(model.getValueAt(selectRow,5).toString());
        txtComm.setText(model.getValueAt(selectRow,6).toString());

    }//GEN-LAST:event_jTable3MouseClicked

    private void varUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varUpdate1ActionPerformed
        // TODO add your handling code here:
        int selectRow=jTable3.getSelectedRow();

        if(selectRow<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) jTable3.getModel();
        if(validateData()){
        Person p=ms.searchUser(Integer.parseInt(txtId.getText()));
        Patient pat=ms.searcPatient(Integer.parseInt(txtId.getText()));
        House h=p.getResidence();
        h.setAddress(txtAddress.getText());
        h.setAptNo(txtApt.getText());
        h.setPin(Integer.parseInt(txtPin.getText()));
        City c=new City(txtCity.getText());
        h.setCity(c);
        Community co=new Community(txtComm.getText());
        h.setCommunity(co);
        p.setResidence(h);
        pat.setResidence(h);
        model.setValueAt(txtAddress.getText(),jTable3.getSelectedRow(),1);
        model.setValueAt(txtApt.getText(),jTable3.getSelectedRow(),2);
        model.setValueAt(txtState.getText(),jTable3.getSelectedRow(),3);
        model.setValueAt(txtPin.getText(),jTable3.getSelectedRow(),4);
        model.setValueAt(txtCity.getText(),jTable3.getSelectedRow(),5);
        model.setValueAt(txtComm.getText(),jTable3.getSelectedRow(),6);
        }
    }//GEN-LAST:event_varUpdate1ActionPerformed

public boolean validateData() {

        

        if (txtState.getText().length() < 2 || !txtState.getText().matches("[a-zA-Z_ ]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper state.");
            return false;
        }

        if (txtCity.getText().length() < 2 || !txtCity.getText().matches("[a-zA-Z_ ]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper City name.");
            return false;
        }

        
        if (txtComm.getText().length() < 2 || !txtComm.getText().matches("[a-zA-Z_ ]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper community.");
            return false;
        }

        

        
        if (!txtPin.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper zip");
            return false;
        }
        if (!txtApt.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper Apt Number");
            return false;
        }

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtApt;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPin;
    private javax.swing.JTextField txtState;
    private javax.swing.JButton varUpdate1;
    // End of variables declaration//GEN-END:variables

    private void DisplayTable() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        for(Patient pat : ms.getPatientList().getPatients())
        {
            House h=pat.getResidence();
            String[] row=new String[10];
            row[0]=String.valueOf(pat.getId());
            row[1]=h.getAddress();
            row[2]=h.getAptNo();
            row[3]=h.getState();
            row[4]=String.valueOf(h.getPin());
            City c=h.getCity();
            row[5]=c.getCityName();
            Community com=h.getCommunity();
            row[6]=com.getCommunity();
            model.addRow(row);
        }
    }
}
