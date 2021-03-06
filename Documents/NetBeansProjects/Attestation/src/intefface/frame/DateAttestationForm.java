/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefface.frame;

import dao.DaoFactory;
import dao.entities.DateAttestation;
import intefface.JournalRateWindow;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nastja
 */
public class DateAttestationForm extends javax.swing.JInternalFrame {
    DaoFactory daoFactory;
    DefaultTableModel model;
    List<DateAttestation> dateAttest;
    /**
     * Creates new form DateAttestationForm
     */
    public DateAttestationForm() {
        initComponents();
        daoFactory = DaoFactory.getInstance(DaoFactory.DaoType.ORACLE);
        tableDateAttest.setRowSelectionAllowed(true);
        tableDateAttest.getSelectionModel().addListSelectionListener(new RowListener());
        model = (DefaultTableModel) tableDateAttest.getModel();
        buttonEdit.setEnabled(false);
        buttonDelete.setEnabled(false);
        
        fillTable();
       // jFormattedTextField3 field3 = new JFormattedTextField(format)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonAddAttestDate = new javax.swing.JButton();
        labelWrongDate = new javax.swing.JLabel();
        formatFinishDate = new javax.swing.JFormattedTextField();
        labelFinishDate = new javax.swing.JLabel();
        formatStartDate = new javax.swing.JFormattedTextField();
        labelStartDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDateAttest = new javax.swing.JTable();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();

        setClosable(true);
        setTitle("Date attestation");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(623, 463));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 470));

        buttonAddAttestDate.setBackground(new java.awt.Color(245, 134, 81));
        buttonAddAttestDate.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonAddAttestDate.setText("Add");
        buttonAddAttestDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddAttestDateActionPerformed(evt);
            }
        });

        try {
            formatFinishDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatFinishDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatFinishDateActionPerformed(evt);
            }
        });

        labelFinishDate.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        labelFinishDate.setText("Finish date");

        try {
            formatStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatStartDateActionPerformed(evt);
            }
        });

        labelStartDate.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        labelStartDate.setText("Start date:");

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        tableDateAttest.setBackground(new java.awt.Color(254, 239, 225));
        tableDateAttest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableDateAttest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Start date", "Finish date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDateAttest);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        buttonEdit.setBackground(new java.awt.Color(245, 134, 81));
        buttonEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(245, 134, 81));
        buttonDelete.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWrongDate, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(formatStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelFinishDate, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(buttonAddAttestDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formatFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddAttestDate)
                    .addComponent(buttonEdit)
                    .addComponent(buttonDelete))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWrongDate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddAttestDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddAttestDateActionPerformed
 
        daoFactory.createDateAttestationDao().create(readField());
        fillTable();

    }//GEN-LAST:event_buttonAddAttestDateActionPerformed

    private void formatFinishDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatFinishDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatFinishDateActionPerformed

    private void formatStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatStartDateActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
       
        if(tableDateAttest.getSelectedRow() != -1){
            daoFactory.createDateAttestationDao().update(dateAttest.get(
                    tableDateAttest.getSelectedRow()), readField() );
        }
        fillTable();
                
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        if(tableDateAttest.getSelectedRow() != -1){
            daoFactory.createDateAttestationDao().delete(dateAttest.get(tableDateAttest.getSelectedRow()));
        }
        fillTable();
    }//GEN-LAST:event_buttonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddAttestDate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JFormattedTextField formatFinishDate;
    private javax.swing.JFormattedTextField formatStartDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFinishDate;
    private javax.swing.JLabel labelStartDate;
    private javax.swing.JLabel labelWrongDate;
    private javax.swing.JTable tableDateAttest;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        clearTable();
        dateAttest = daoFactory.createDateAttestationDao().findAll();
        int i = 1;
        
        for (DateAttestation da : dateAttest) {
            model.addRow(new Object[]{i++, da.getBeginDate(), da.getEndDate()});
        }
        
    }

    private void clearTable() {
        int n = tableDateAttest.getRowCount();
        for (int i = 0; i < n; i++) {
            System.out.println(tableDateAttest.getRowCount());
          model.removeRow(0);       
        }
    }
    
    private DateAttestation readField(){
        String[] dateSplitStart = formatStartDate.getText().split("-");
        System.out.println(Arrays.toString(dateSplitStart));
        Date dateBegin = new Date((Integer.parseInt(dateSplitStart[0]) - 1900),
                (Integer.parseInt(dateSplitStart[1]) - 1), Integer.parseInt(dateSplitStart[2]));
       String[] dateSplitEnd = formatFinishDate.getText().split("-");
        System.out.println(Arrays.toString(dateSplitEnd));
        Date dateEnd = new Date((Integer.parseInt(dateSplitEnd[0]) - 1900),
                (Integer.parseInt(dateSplitEnd[1]) - 1), Integer.parseInt(dateSplitEnd[2]));
        
        return new DateAttestation(0, dateBegin, dateEnd);
    }
    
    private class RowListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            System.out.println("column selected");
            buttonDelete.setEnabled(true);
            buttonEdit.setEnabled(true);
            if (tableDateAttest.getSelectedRow() != -1) {
                
                /*String[] dateSplit = model.getS(tableJournal.getSelectedColumn()).split("-");
                System.out.println(Arrays.toString(dateSplit));
                Date dateDel = new Date((Integer.parseInt(dateSplit[0]) - 1900),
                        (Integer.parseInt(dateSplit[1]) - 1), Integer.parseInt(dateSplit[2]));
                System.out.println(model.getValueAt(0, tableJournal.getSelectedColumn()));
                int mark = (int) model.getValueAt(0, tableJournal.getSelectedColumn());*/
                 DateAttestation da = dateAttest.get(tableDateAttest.getSelectedRow());
                 System.out.println(da.getBeginDate().toString());
                formatStartDate.setText(da.getBeginDate().toString());
                System.out.println(da.getEndDate().toString());
                formatFinishDate.setText(da.getEndDate().toString());
                buttonDelete.setEnabled(true);
                buttonEdit.setEnabled(true);
            }
        }

    }
}
