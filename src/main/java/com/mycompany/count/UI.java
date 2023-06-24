/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.count;

import java.awt.event.ActionEvent;

/**
 *
 * @author Crino
 */
public class UI extends javax.swing.JFrame {
    Controller controller = new Controller();

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Show_area = new javax.swing.JTextArea();
        number7 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        sign_percent = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        sign_float = new javax.swing.JButton();
        sign_minus = new javax.swing.JButton();
        sign_multiplication = new javax.swing.JButton();
        sign_division = new javax.swing.JButton();
        sign_plus = new javax.swing.JButton();
        sign_end = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        sign_power2 = new javax.swing.JButton();
        sign_power3 = new javax.swing.JButton();
        sign_factorial = new javax.swing.JButton();
        sign_sin = new javax.swing.JButton();
        sign_cos = new javax.swing.JButton();
        sign_tan = new javax.swing.JButton();
        number_e = new javax.swing.JButton();
        number_pai = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        member_clean = new javax.swing.JButton();
        member_plus = new javax.swing.JButton();
        member_minus = new javax.swing.JButton();
        member_read = new javax.swing.JButton();
        sign_ln = new javax.swing.JButton();
        sign_power = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Show_area.setColumns(20);
        Show_area.setRows(5);
        Show_area.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(Show_area);

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        sign_percent.setText("%");
        sign_percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_percentActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        sign_float.setText(".");
        sign_float.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_floatActionPerformed(evt);
            }
        });

        sign_minus.setText("—");
        sign_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_minusActionPerformed(evt);
            }
        });

        sign_multiplication.setText("X");
        sign_multiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_multiplicationActionPerformed(evt);
            }
        });

        sign_division.setText("/");
        sign_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_divisionActionPerformed(evt);
            }
        });

        sign_plus.setText("+");
        sign_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_plusActionPerformed(evt);
            }
        });

        sign_end.setText("=");
        sign_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_endActionPerformed(evt);
            }
        });

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        sign_power2.setText("x^2");
        sign_power2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_power2ActionPerformed(evt);
            }
        });

        sign_power3.setText("x^3");
        sign_power3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_power3ActionPerformed(evt);
            }
        });

        sign_factorial.setText("x!");
        sign_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_factorialActionPerformed(evt);
            }
        });

        sign_sin.setText("sin");
        sign_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_sinActionPerformed(evt);
            }
        });

        sign_cos.setText("cos");
        sign_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_cosActionPerformed(evt);
            }
        });

        sign_tan.setText("tan");
        sign_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_tanActionPerformed(evt);
            }
        });

        number_e.setText("e");
        number_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_eActionPerformed(evt);
            }
        });

        number_pai.setText("Π");
        number_pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_paiActionPerformed(evt);
            }
        });

        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        member_clean.setText("mc");
        member_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_cleanActionPerformed(evt);
            }
        });

        member_plus.setText("m+");
        member_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_plusActionPerformed(evt);
            }
        });

        member_minus.setText("m-");
        member_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_minusActionPerformed(evt);
            }
        });

        member_read.setText("mr");
        member_read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_readActionPerformed(evt);
            }
        });

        sign_ln.setText("ln");
        sign_ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_lnActionPerformed(evt);
            }
        });

        sign_power.setText("x^y");
        sign_power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_powerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sign_sin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(sign_cos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sign_tan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(number_e, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sign_ln, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(member_read, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                            .addComponent(sign_power, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sign_power2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(sign_power3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sign_factorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(member_clean, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                .addComponent(number_pai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sign_percent, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(number1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addComponent(number4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(number7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sign_float, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(number3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(number6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sign_end, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(member_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(member_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(sign_multiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sign_division, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sign_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sign_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number7)
                        .addComponent(number8)
                        .addComponent(number9)
                        .addComponent(sign_power)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number4)
                    .addComponent(number5)
                    .addComponent(number6)
                    .addComponent(sign_power2)
                    .addComponent(sign_sin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number1)
                    .addComponent(number2)
                    .addComponent(number3)
                    .addComponent(sign_power3)
                    .addComponent(sign_cos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number0)
                    .addComponent(sign_float)
                    .addComponent(sign_factorial)
                    .addComponent(sign_tan)
                    .addComponent(sign_end))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_plus)
                    .addComponent(number_e)
                    .addComponent(sign_minus)
                    .addComponent(number_pai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_ln)
                    .addComponent(sign_multiplication)
                    .addComponent(sign_division)
                    .addComponent(sign_percent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(member_read)
                    .addComponent(member_plus)
                    .addComponent(member_minus)
                    .addComponent(member_clean)
                    .addComponent(delete))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_powerActionPerformed
        // TODO add your handling code h1ere:
        controller.put("^");
        Show_area.setText(controller.show());
    }//GEN-LAST:event_sign_powerActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number7ActionPerformed
        // TODO add your handling code here:
        controller.put("7");
        Show_area.setText(controller.show());

    }// GEN-LAST:event_number7ActionPerformed

    private void sign_endActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_endActionPerformed
        // TODO add your handling code here:
        

        //System.out.println(controller.show());
        Show_area.setText(controller.show()+"=\n");
        controller.count();
        Show_area.append(controller.show());
    }// GEN-LAST:event_sign_endActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cleanActionPerformed
        // TODO add your handling code here:
        // 这是清空，先不管
        Show_area.setText("");
        controller.clear();
    }// GEN-LAST:event_cleanActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number8ActionPerformed
        // TODO add your handling code here:
        controller.put("8");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number9ActionPerformed
        // TODO add your handling code here:
        controller.put("9");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number9ActionPerformed

    private void sign_sinActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_sinActionPerformed
        // TODO add your handling code here:
        controller.put("sin");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_sinActionPerformed

    private void sign_power2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_power2ActionPerformed
        // TODO add your handling code here:
        controller.put("^2");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_power2ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number4ActionPerformed
        // TODO add your handling code here:
        controller.put("4");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number4ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number5ActionPerformed
        // TODO add your handling code here:
        controller.put("5");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number6ActionPerformed
        // TODO add your handling code here:
        controller.put("6");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number6ActionPerformed

    private void sign_cosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_cosActionPerformed
        // TODO add your handling code here:
        controller.put("cos");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_cosActionPerformed

    private void sign_power3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_power3ActionPerformed
        // TODO add your handling code here:
        controller.put("^3");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_power3ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number1ActionPerformed
        // TODO add your handling code here:
        controller.put("1");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number2ActionPerformed
        // TODO add your handling code here:
        controller.put("2");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number3ActionPerformed
        // TODO add your handling code here:
        controller.put("3");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number3ActionPerformed

    private void sign_tanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_tanActionPerformed
        // TODO add your handling code here:
        controller.put("tan");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_tanActionPerformed

    private void sign_factorialActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_factorialActionPerformed
        // TODO add your handling code here:
        controller.put("!");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_factorialActionPerformed

    private void sign_percentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_percentActionPerformed
        // TODO add your handling code here:
        controller.put("%");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_percentActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number0ActionPerformed
        // TODO add your handling code here:
        controller.put("0");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number0ActionPerformed

    private void sign_floatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_floatActionPerformed
        // TODO add your handling code here:
        controller.put(".");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_floatActionPerformed

    private void sign_plusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_plusActionPerformed
        // TODO add your handling code here:
        controller.put("+");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_plusActionPerformed

    private void sign_minusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_minusActionPerformed
        // TODO add your handling code here:
        controller.put("-");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_minusActionPerformed

    private void sign_multiplicationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_multiplicationActionPerformed
        // TODO add your handling code here:
        controller.put("*");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_multiplicationActionPerformed

    private void sign_divisionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_divisionActionPerformed
        // TODO add your handling code here:
        controller.put("/");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_divisionActionPerformed

    private void number_eActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number_eActionPerformed
        // TODO add your handling code here:
        controller.put("2.7182818285");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number_eActionPerformed

    private void number_paiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_number_paiActionPerformed
        // TODO add your handling code here:
        controller.put("3.1415926535");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_number_paiActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        // 删除，单独写一个函数
        controller.delete();
        Show_area.setText(controller.show());
    }// GEN-LAST:event_deleteActionPerformed

    private void sign_lnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sign_lnActionPerformed
        // TODO add your handling code here:
        controller.put("ln");
        Show_area.setText(controller.show());
    }// GEN-LAST:event_sign_lnActionPerformed

    private void member_cleanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_member_cleanActionPerformed
        // TODO add your handling code here:
        controller.mc();
    }// GEN-LAST:event_member_cleanActionPerformed

    private void member_plusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_member_plusActionPerformed
        // TODO add your handling code here:
        controller.mp();
    }// GEN-LAST:event_member_plusActionPerformed

    private void member_minusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_member_minusActionPerformed
        // TODO add your handling code here:
        controller.mm();
    }// GEN-LAST:event_member_minusActionPerformed

    private void member_readActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_member_readActionPerformed
        // TODO add your handling code here:
        Show_area.setText(controller.mr());
    }// GEN-LAST:event_member_readActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Show_area;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton member_clean;
    private javax.swing.JButton member_minus;
    private javax.swing.JButton member_plus;
    private javax.swing.JButton member_read;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton number_e;
    private javax.swing.JButton number_pai;
    private javax.swing.JButton sign_cos;
    private javax.swing.JButton sign_division;
    private javax.swing.JButton sign_end;
    private javax.swing.JButton sign_factorial;
    private javax.swing.JButton sign_float;
    private javax.swing.JButton sign_ln;
    private javax.swing.JButton sign_minus;
    private javax.swing.JButton sign_multiplication;
    private javax.swing.JButton sign_percent;
    private javax.swing.JButton sign_plus;
    private javax.swing.JButton sign_power;
    private javax.swing.JButton sign_power2;
    private javax.swing.JButton sign_power3;
    private javax.swing.JButton sign_sin;
    private javax.swing.JButton sign_tan;
    // End of variables declaration//GEN-END:variables
}