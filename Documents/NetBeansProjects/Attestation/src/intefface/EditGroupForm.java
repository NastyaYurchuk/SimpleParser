/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intefface;

import dao.DaoFactory;
import dao.entities.Group;
import dao.entities.Subject;
import validators.CheckInput;

/**
 *
 * @author nastja
 */
public class EditGroupForm extends javax.swing.JFrame {
  DaoFactory daoFactory;
    Group group;
    private final static String EDIT = "EDIT";
    private final static String ADD = "ADD";
    String type;
    /**
     * Creates new form AddGroupForm
     */
    public EditGroupForm() {
        initComponents();
        daoFactory = DaoFactory.getInstance(DaoFactory.DaoType.ORACLE);
        this.type = ADD;
        this.setTitle(type);
    }

    public EditGroupForm(Group group) {
        initComponents();
        this.type = EDIT;
        this.setTitle(type);
        this.group = group;
        textGroupCode.setText(group.getGroupCode());
        daoFactory = DaoFactory.getInstance(DaoFactory.DaoType.ORACLE);
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
        textGroupCode = new javax.swing.JFormattedTextField();
        buttonOK = new javax.swing.JButton();
        buttonCansel = new javax.swing.JButton();
        labelWrongCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 232, 168));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Group code:");

        try {
            textGroupCode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textGroupCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGroupCodeActionPerformed(evt);
            }
        });

        buttonOK.setBackground(new java.awt.Color(239, 132, 72));
        buttonOK.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        buttonCansel.setBackground(new java.awt.Color(239, 132, 72));
        buttonCansel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        buttonCansel.setText("Cansel");
        buttonCansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCanselActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textGroupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWrongCode, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCansel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGroupCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWrongCode, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCansel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonOK)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCanselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCanselActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_buttonCanselActionPerformed

    private void textGroupCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGroupCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textGroupCodeActionPerformed

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        CheckInput checkInput = new CheckInput();
        String groupCode =  textGroupCode.getText();
        System.out.println(groupCode);
        Group newGroup = new Group(groupCode);
        //if(checkInput.checkName(groupCode)){
            switch (type) {
                case EDIT:
                    daoFactory.createGroupDao().update(group, newGroup);
                    break;
                case ADD:
                    
                    daoFactory.createGroupDao().create(newGroup);
                    break;
            }
        this.setVisible(false);
       // }
       // else{
         //   labelWrongCode.setText("Wrong name");
       // }
    }//GEN-LAST:event_buttonOKActionPerformed

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
            java.util.logging.Logger.getLogger(EditGroupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditGroupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditGroupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditGroupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGroupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCansel;
    private javax.swing.JButton buttonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelWrongCode;
    private javax.swing.JFormattedTextField textGroupCode;
    // End of variables declaration//GEN-END:variables
}
