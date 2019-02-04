package com.tonikelope.megabasterd;

import static com.tonikelope.megabasterd.MainPanel.*;
import static com.tonikelope.megabasterd.MiscTools.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author tonikelope
 */
public class Get2FACode extends javax.swing.JDialog {

    private boolean _code_ok;

    private String _pin_code;

    public boolean isCode_ok() {
        return _code_ok;
    }

    public String getPin_code() {
        return _pin_code;
    }

    public Get2FACode(java.awt.Frame parent, boolean modal, String email, MainPanel main_panel) {
        super(parent, modal);

        initComponents();

        updateFonts(this, DEFAULT_FONT, main_panel.getZoom_factor());

        translateLabels(this);

        _code_ok = false;

        this.email_label.setText(email);

        pack();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel_button = new javax.swing.JButton();
        ok_button = new javax.swing.JButton();
        lock_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        status_label = new javax.swing.JLabel();
        please_label = new javax.swing.JLabel();
        current_code_textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("2FA CODE");

        cancel_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancel_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-30.png"))); // NOI18N
        cancel_button.setText("CANCEL");
        cancel_button.setDoubleBuffered(true);
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        ok_button.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ok_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ok-30.png"))); // NOI18N
        ok_button.setText("OK");
        ok_button.setDoubleBuffered(true);
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        lock_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock_medium.png"))); // NOI18N
        lock_label.setDoubleBuffered(true);

        email_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        email_label.setDoubleBuffered(true);

        status_label.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        status_label.setDoubleBuffered(true);

        please_label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        please_label.setText("Please enter 2FA PIN CODE:");
        please_label.setDoubleBuffered(true);

        current_code_textfield.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        current_code_textfield.setToolTipText("");
        current_code_textfield.setDoubleBuffered(true);
        current_code_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                current_code_textfieldKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                current_code_textfieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_button))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lock_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(please_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(current_code_textfield))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(please_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(current_code_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lock_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ok_button)
                        .addComponent(cancel_button))
                    .addComponent(status_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed

        _code_ok = false;

        setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed

        _code_ok = true;

        _pin_code = current_code_textfield.getText();

        setVisible(false);
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void current_code_textfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_current_code_textfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ok_buttonActionPerformed(null);
        }
    }//GEN-LAST:event_current_code_textfieldKeyPressed

    private void current_code_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_current_code_textfieldKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_current_code_textfieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField current_code_textfield;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel lock_label;
    private javax.swing.JButton ok_button;
    private javax.swing.JLabel please_label;
    private javax.swing.JLabel status_label;
    // End of variables declaration//GEN-END:variables
}
