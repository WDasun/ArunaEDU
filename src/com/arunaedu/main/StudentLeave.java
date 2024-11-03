/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arunaedu.main;

import static com.anuraedu.common.SQ.LIKESEARCH;
import static com.anuraedu.common.SQ.SAVE;
import static com.anuraedu.common.SQ.SEARCH;
import static com.anuraedu.common.SQ.STATUSSEARCH;
import static com.anuraedu.common.SQ.UPDATE;
import static com.anuraedu.common.SQ.getResult;
import com.anuraedu.db.DB;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class StudentLeave extends javax.swing.JInternalFrame {

        String startDate,endDate,prevText;
    ArrayList<JTextField> jf;
    ArrayList<String> defaultText;
      DefaultTableModel dtm1;
    
    public StudentLeave() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
        
        addDefaultTextToList();
        addTextFieldsToList();
        setDefaultText();
        setDefaultTextField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_save = new javax.swing.JLabel();
        txt_studentid = new javax.swing.JTextField();
        txt_classid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_reason = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbox_studentidSuggestion = new javax.swing.JCheckBox();
        cbox_studentidShowall = new javax.swing.JCheckBox();
        cbox_classidSuggestion = new javax.swing.JCheckBox();
        cbox_classidShowall = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1670, 1040));

        jPanel1.setBackground(new java.awt.Color(178, 230, 245));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_save.setBackground(new java.awt.Color(69, 141, 152));
        btn_save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_save.setText("Save");
        btn_save.setOpaque(true);
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_saveMouseExited(evt);
            }
        });

        txt_studentid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_studentid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_studentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_studentidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_studentidFocusLost(evt);
            }
        });
        txt_studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_studentidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_studentidKeyTyped(evt);
            }
        });

        txt_classid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_classid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_classid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_classidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_classidFocusLost(evt);
            }
        });
        txt_classid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_classidKeyReleased(evt);
            }
        });

        txt_reason.setColumns(20);
        txt_reason.setRows(5);
        jScrollPane1.setViewportView(txt_reason);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Reason");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 76, 76));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Class ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Student ID");

        cbox_studentidSuggestion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbox_studentidSuggestion);
        cbox_studentidSuggestion.setSelected(true);
        cbox_studentidSuggestion.setText("suggestions");
        cbox_studentidSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_studentidSuggestionActionPerformed(evt);
            }
        });

        cbox_studentidShowall.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbox_studentidShowall);
        cbox_studentidShowall.setText("show all");
        cbox_studentidShowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_studentidShowallActionPerformed(evt);
            }
        });

        cbox_classidSuggestion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(cbox_classidSuggestion);
        cbox_classidSuggestion.setSelected(true);
        cbox_classidSuggestion.setText("suggestions");
        cbox_classidSuggestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_classidSuggestionActionPerformed(evt);
            }
        });

        cbox_classidShowall.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(cbox_classidShowall);
        cbox_classidShowall.setText("show all");
        cbox_classidShowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_classidShowallActionPerformed(evt);
            }
        });
        cbox_classidShowall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbox_classidShowallKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_classid, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbox_studentidSuggestion)
                    .addComponent(cbox_studentidShowall)
                    .addComponent(cbox_classidSuggestion)
                    .addComponent(cbox_classidShowall))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbox_studentidSuggestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_studentidShowall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_classid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbox_classidSuggestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbox_classidShowall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Description", "Contract ID", "Status"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable2);

        jTabbedPane1.addTab("Class ID Search", jScrollPane8);

        jTable_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First name", "Last name", "NIC", "Contact No.", "Address", "Email", "Gender", "DOB", "FTHR.Fname", "FTHR.Lname", "FTHR.ContactNo.", "MTH.Fname", "MTH.Lname", "MTH.ContactNo.", "GDN.Fname", "GDN.Lname", "GDN.ContactNo.", "Status"
            }
        ));
        jTable_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_1);

        jTabbedPane1.addTab("Student ID Search", jScrollPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_studentidSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_studentidSuggestionActionPerformed
        if (cbox_studentidSuggestion.isSelected()) {
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_cbox_studentidSuggestionActionPerformed

    private void cbox_studentidShowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_studentidShowallActionPerformed
        if(cbox_studentidShowall.isSelected()){
            removeAllRows(jTable_1);
            jTabbedPane1.setSelectedIndex(1);
            try {
                SEARCH("student");
                fillTableProcess(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbox_studentidShowallActionPerformed

    private void cbox_classidSuggestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_classidSuggestionActionPerformed
 
    }//GEN-LAST:event_cbox_classidSuggestionActionPerformed

    private void cbox_classidShowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_classidShowallActionPerformed
        if(cbox_classidShowall.isSelected()){
            removeAllRows(jTable2);
            jTabbedPane1.setSelectedIndex(0);
            try {
                SEARCH("class");
                fillTableProcess(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbox_classidShowallActionPerformed

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked

        if (checkFields()) {
            if (checkStatus("student", "id_student", txt_studentid.getText())) {
                if (checkStatus("class", "id_class", txt_classid.getText())) {

                    try {
                        DB.push("insert into student_leave (id_student,id_class,reason,date_time) values ('"
                                + txt_studentid.getText() + "','"
                                + txt_classid.getText() + "','"
                                + txt_reason.getText() + "',now())");
                        JOptionPane.showMessageDialog(this, " Saved !");
                        clearFields();
//                    if (cbox_contracShowAll.isSelected()) {
//                        removeAllRows(jTable3);
//         fillTable(3);
//                    }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Class not Active !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Student not Active !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill all Fields !");
        }
    }//GEN-LAST:event_btn_saveMouseClicked

    private void txt_studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_studentidKeyReleased
        if (cbox_studentidSuggestion.isSelected()) {
            removeAllRows(jTable_1);
            jTabbedPane1.setSelectedIndex(1);
            try {
                LIKESEARCH("student", "id_student", txt_studentid.getText());
                fillTableProcess(1);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txt_studentidKeyReleased

    private void cbox_classidShowallKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbox_classidShowallKeyReleased
         if (cbox_classidSuggestion.isSelected()) {
            removeAllRows(jTable2);
            jTabbedPane1.setSelectedIndex(0);
            try {
                LIKESEARCH("class", "id_class", txt_classid.getText());
                fillTableProcess(2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_cbox_classidShowallKeyReleased

    private void txt_studentidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_studentidFocusGained
        warnningLabel(evt.getID(), (JTextField) evt.getSource());
    }//GEN-LAST:event_txt_studentidFocusGained

    private void txt_studentidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_studentidFocusLost
       warnningLabel(evt.getID(), (JTextField) evt.getSource());
    }//GEN-LAST:event_txt_studentidFocusLost

    private void txt_classidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_classidFocusGained
        warnningLabel(evt.getID(), (JTextField) evt.getSource());
    }//GEN-LAST:event_txt_classidFocusGained

    private void txt_classidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_classidFocusLost
       warnningLabel(evt.getID(), (JTextField) evt.getSource());
    }//GEN-LAST:event_txt_classidFocusLost

    private void btn_saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseEntered
        colorButtons(evt.getID(), (JLabel) evt.getSource());
    }//GEN-LAST:event_btn_saveMouseEntered

    private void btn_saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseExited
        colorButtons(evt.getID(), (JLabel) evt.getSource());
    }//GEN-LAST:event_btn_saveMouseExited

    private void txt_studentidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_studentidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_studentidKeyTyped

    private void txt_classidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_classidKeyReleased
        if (cbox_classidSuggestion.isSelected()) {
            removeAllRows(jTable2);
            jTabbedPane1.setSelectedIndex(0);
            try {
                LIKESEARCH("class", "id_class", txt_classid.getText());
                fillTableProcess(2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_txt_classidKeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        txt_classid.setText((String) jTable2.getValueAt(jTable2.getSelectedRow(), 0));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_1MouseClicked
       txt_studentid.setText((String) jTable_1.getValueAt(jTable_1.getSelectedRow(), 0));
    }//GEN-LAST:event_jTable_1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbox_classidShowall;
    private javax.swing.JCheckBox cbox_classidSuggestion;
    private javax.swing.JCheckBox cbox_studentidShowall;
    private javax.swing.JCheckBox cbox_studentidSuggestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable_1;
    private javax.swing.JTextField txt_classid;
    private javax.swing.JTextArea txt_reason;
    private javax.swing.JTextField txt_studentid;
    // End of variables declaration//GEN-END:variables

    private boolean checkFields() {

        if (txt_studentid.getText().equals("")
                && txt_classid.getText().equals("")
                && txt_reason.getText().equals("")) {
            return false;
        } else {
            return true;
        }

    }

    private void colorButtons(int i, JLabel jl) {
        if (i == 504) {
            jl.setBackground(new java.awt.Color(117, 170, 179));

        } else if (i == 505) {
            jl.setBackground(new java.awt.Color(69, 141, 152));
        }
    }

    private void textFieldTextType(int i, JTextField jt) {
        if (i == 0) {
            jt.setForeground(new java.awt.Color(0, 0, 0));
            Font f = new Font("Tahoma", 0, 16);
            jt.setFont(f);
        } else if (i == 1) {
            jt.setForeground(new java.awt.Color(124, 124, 124));
            Font f = new Font("Tahoma", 0, 14);
            jt.setFont(f);
        }

    }

    private void setDefaultTextField() {
        for (JTextField jTextField : jf) {
            jTextField.setBackground(new java.awt.Color(253, 237, 237));
            jTextField.setForeground(new java.awt.Color(124, 124, 124));
            Font f = new Font("Tahoma", 0, 14);
            jTextField.setFont(f);
        }
    }

    private void addTextFieldsToList() {
        jf = new ArrayList<JTextField>();
        jf.add(txt_studentid);
        jf.add(txt_classid);

    }

    private void addDefaultTextToList() {
        defaultText = new ArrayList<String>();
        defaultText.add("Student ID");
        defaultText.add("Class ID");

    }

    private void setDefaultText() {
        for (int i = 0; i < defaultText.size(); i++) {
            jf.get(i).setText(defaultText.get(i));
        }
    }

    private void clearFields() {

        setDefaultText();
        setDefaultTextField();
        txt_reason.setText("");
    }

    private void warnningLabel(int id, JTextField jTextField) {

        if (id == 1004) {
            if (jTextField.getFont().getSize() == 14) {
                prevText = jTextField.getText();
                jTextField.setText("");
                textFieldTextType(0, jTextField);

            }
            jTextField.setBackground(new java.awt.Color(218, 243, 250));
        } else if (id == 1005) {
            if (jTextField.getText().equals("")) {
                jTextField.setText(prevText);
                textFieldTextType(1, jTextField);
                prevText = null;
                jTextField.setBackground(new java.awt.Color(253, 237, 237));

            } else {
                prevText = null;
                jTextField.setBackground(new java.awt.Color(178, 230, 245));
            }
        }

    }

    private boolean checkStatus(String tableName, String coloumnName, String searchValue) {
        try {
            return STATUSSEARCH(tableName, coloumnName, searchValue);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return false;
        }

    }
    private void removeAllRows(JTable j) {
        for (int i = j.getRowCount() - 1; i >= 0; i--) {
            ((DefaultTableModel) j.getModel()).removeRow(i);
        }
    }
    
    private void fillTableProcess(int i) {
        
         try { 
             if(i==1){
            ResultSet rs = getResult();
            while (rs.next()) {

                String id_student = rs.getString("id_student");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String nic = rs.getString("nic");
                String contact_no = rs.getString("contact_no");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String dob = rs.getString("dob");
                String father_fname = rs.getString("father_fname");
                String father_lname = rs.getString("father_lname");
                String father_ctn = rs.getString("father_ctn");
                String mother_fname = rs.getString("mother_fname");
                String mother_lname = rs.getString("mother_lname");
                String mother_ctn = rs.getString("mother_ctn");
                String guardian_fname = rs.getString("guardian_fname");
                String guardian_lname = rs.getString("guardian_lname");
                String guardian_ctn = rs.getString("guardian_ctn");

                boolean status = rs.getBoolean("status");

                Vector v = new Vector();

                v.add(id_student);
                v.add(fname);
                v.add(lname);
                v.add(nic);
                v.add(contact_no);
                v.add(address);
                v.add(email);
                v.add(gender);
                v.add(dob);
                v.add(father_fname);
                v.add(father_lname);
                v.add(father_ctn);
                v.add(mother_fname);
                v.add(mother_lname);
                v.add(mother_ctn);
                v.add(guardian_fname);
                v.add(guardian_lname);
                v.add(guardian_ctn);

                if (status) {
                    v.add("Active");
                } else {
                    v.add("Inactive");
                }

                dtm1 = (DefaultTableModel) jTable_1.getModel();
                dtm1.addRow(v);
            }

            }else if(i==2){
                ResultSet rs = getResult();
                
                while (rs.next()) {
                    
                String id_class = rs.getString("id_class");
                String description = rs.getString("description");
                String id_contract = rs.getString("id_contract");
                String class_fees = String.valueOf(rs.getDouble("class_fees"));
                boolean status = rs.getBoolean("status");

                Vector v = new Vector();

                v.add(id_class);
                v.add(description);
                v.add(id_contract);
                v.add(class_fees);
                if (status) {
                    v.add("Active");
                } else {
                    v.add("Inactive");
                }

                dtm1 = (DefaultTableModel) jTable2.getModel();
                dtm1.addRow(v);
            }
            }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}