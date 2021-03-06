/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.personnel;

import DAO.CentreDAO;
import DAO.PeopleDAO;
import DAO.VaccineDAO;
import DAO.VaccineSupplyDAO;
import DAOFileImp.FileCentreDAO;
import DAOFileImp.FilePeopleDAO;
import DAOFileImp.FileVaccineDAO;
import DAOFileImp.FileVaccineSupplyDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Centre;
import model.People;
import model.Vaccine;
import model.VaccineSupply;
import utils.Validator;

/**
 *
 * @author Mohin Paramasivam
 */
public class VaccineSupply_Create extends javax.swing.JFrame {
    PeopleDAO peopleDao = FilePeopleDAO.getInstance();
    VaccineSupplyDAO vsDao = FileVaccineSupplyDAO.getInstance();
    VaccineDAO vDao = FileVaccineDAO.getInstance();
    CentreDAO centreDao = FileCentreDAO.getInstance();

    /**
     * Creates new form Modify_Vaccine_Supply
     */
    public VaccineSupply_Create() {
        initComponents();
        initCheckBoxes();
        initFieldValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbVaccine = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSupplyQuantity = new com.toedter.components.JSpinField();
        jLabel5 = new javax.swing.JLabel();
        txtAvailableQuantity = new com.toedter.components.JSpinField();
        txtBatchNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dpSupplyDate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ckbCitizen = new javax.swing.JCheckBox();
        ckbNonCitizen = new javax.swing.JCheckBox();
        cbbCentre = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New Vaccine Supply");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Vaccination Centre : ");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbbVaccine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbVaccineActionPerformed(evt);
            }
        });

        jLabel4.setText("Vaccine:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setText("Supply Quantity");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setText("Available Quantity");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setText("Supply Date");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setText("Batch No.");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setText("Supplier");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setText("Accessible By:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ckbCitizen.setText("Citizen");

        ckbNonCitizen.setText("Non-citizen");

        cbbCentre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbCentre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCentreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbCitizen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(ckbNonCitizen))
                    .addComponent(dpSupplyDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSupplyQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBatchNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbVaccine, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSupplier)
                    .addComponent(cbbCentre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dpSupplyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSupplyQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAvailableQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ckbCitizen)
                    .addComponent(ckbNonCitizen))
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back to Main Page");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        VaccineSupply_Main hframe = new VaccineSupply_Main();
         hframe.setLocationRelativeTo(this);
        hframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO
        Centre centre = centreDao.all().get(cbbCentre.getSelectedIndex());
        Vaccine vaccine = vDao.all().get(cbbVaccine.getSelectedIndex());
        String batchNo = txtBatchNo.getText();
        LocalDate supplyDate = dpSupplyDate.getDate();
        String supplier = txtSupplier.getText();
        int supplyQuantity = new Integer(txtSupplyQuantity.getValue());
        int availableQuantity = new Integer(txtAvailableQuantity.getValue());
        boolean forCitizen = ckbCitizen.isSelected();
        boolean forNonCitizen = ckbNonCitizen.isSelected();

        StringBuilder strbError = new StringBuilder();

        if(batchNo.isEmpty()){
            strbError.append("Batch No cannot be empty. \n");
        }

        if (vsDao.isDuplicatedBatchNo(batchNo)) {
            strbError.append("Batch No is duplicated. \n");
        }

        if (!(Validator.isDateBeforeNow(supplyDate) || supplyDate.isEqual(LocalDate.now()))) {
            strbError.append("Invalid supply date. \n");
        }

        if (supplier.isEmpty()) {
            strbError.append("Invalid supplier. \n");
        }

        if (supplyQuantity <= 0) {
            strbError.append("Invalid supply quantity. \n");
        }

        if (availableQuantity <= 0) {
            strbError.append("Invalid available quantity. \n");
        }

        if (availableQuantity > supplyQuantity) {
            strbError.append("Supply quantity cannot be smaller than available quantity. \n");
        }

        if (!(forCitizen || forNonCitizen)) {
            strbError.append("Please select at least one accesible people type. \n");
        }

        if (strbError.length() == 0) {
            List<People.PeopleType> acccesiblePeopleTypes = new ArrayList<>();
            if (forNonCitizen) {
                acccesiblePeopleTypes.add(People.PeopleType.NON_CITIZEN);
            }
            if (forCitizen) {
                acccesiblePeopleTypes.add(People.PeopleType.CITIZEN);
            }
            VaccineSupply vsTemp = new VaccineSupply(batchNo, supplyDate, vaccine, supplier, supplyQuantity, availableQuantity, acccesiblePeopleTypes);
            vsDao.create(vsTemp, centre);

            JOptionPane.showMessageDialog(null, "Created successfully!");
            btnBackActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(null, strbError.toString(), "Invalid Input!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbbVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbVaccineActionPerformed

          }//GEN-LAST:event_cbbVaccineActionPerformed

    private void cbbCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCentreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbCentreActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VaccineSupply_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccineSupply_Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccineSupply_Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbbCentre;
    private javax.swing.JComboBox<String> cbbVaccine;
    private javax.swing.JCheckBox ckbCitizen;
    private javax.swing.JCheckBox ckbNonCitizen;
    private com.github.lgooddatepicker.components.DatePicker dpSupplyDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.toedter.components.JSpinField txtAvailableQuantity;
    javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtSupplier;
    private com.toedter.components.JSpinField txtSupplyQuantity;
    // End of variables declaration//GEN-END:variables

    private void initFieldValue() {
        dpSupplyDate.setDateToToday();
        txtAvailableQuantity.setMinimum(1);
    }

    private void initCheckBoxes() {
        List<String> vaccines = new ArrayList<>();
        List<String> centresName = new ArrayList<>();

        for (Vaccine vaccine : vDao.all()) {
            vaccines.add(vaccine.getName());
        }
        for (Centre centre : centreDao.all()) {
            centresName.add(centre.getName());
        }
        cbbVaccine.setModel(new DefaultComboBoxModel(vaccines.toArray()));
        cbbCentre.setModel(new DefaultComboBoxModel(centresName.toArray()));
    }
}
