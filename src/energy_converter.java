/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.*;
public class energy_converter extends javax.swing.JFrame {

    /**
     * Creates new form energy_converter
     */
    public energy_converter() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        outputField = new javax.swing.JTextField();
        outputUnitComboBox = new javax.swing.JComboBox<>();
        inputUnitComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        decimalPlacesField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 0, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 375));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energy.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Energy Converter");

        inputField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("=");

        outputField.setEditable(false);
        outputField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        outputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputFieldActionPerformed(evt);
            }
        });

        outputUnitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Joule", "Kilojoule", "Kilowatt-hour", "Watt-hour", "Calorie" , "Kilocalorie", "Horsepower (metric) hour", "Electron-volt"}));
        outputUnitComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputUnitComboBoxActionPerformed(evt);
            }
        });

        inputUnitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Joule", "Kilojoule", "Kilowatt-hour", "Watt-hour", "Calorie" , "Kilocalorie", "Horsepower (metric) hour", "Electron-volt"}));
        inputUnitComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUnitComboBoxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Britannic Bold", 0, 16)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo (3).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Back to Homepage");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        decimalPlacesField.setToolTipText("For more accurate and precise results, input higher decimal places");
        decimalPlacesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalPlacesFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Decimal Places");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(370, 370, 370)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputField)
                                        .addComponent(inputUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(outputField)
                                        .addComponent(outputUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(decimalPlacesField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(decimalPlacesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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
    private void convertEnergy() {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            String inputUnit = (String) inputUnitComboBox.getSelectedItem();
            String outputUnit = (String) outputUnitComboBox.getSelectedItem();
            String decimalPlacesText = decimalPlacesField.getText();

            int decimalPlaces = 0; 
            if (!decimalPlacesText.isEmpty()) {
                decimalPlaces = Integer.parseInt(decimalPlacesText);
            }

            double convertedEnergy = convert(inputValue, inputUnit, outputUnit);

            // Format the converted volume with specified decimal places if provided
            String formattedOutput;
            if (decimalPlacesText.isEmpty()) {
                formattedOutput = String.valueOf(convertedEnergy); // No rounding off
            } else {
                formattedOutput = String.format("%." + decimalPlaces + "f", convertedEnergy);
            }

            outputField.setText(formattedOutput);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    private double convert(double value, String inputUnit, String outputUnit) {
        if (inputUnit.equals(outputUnit)) {
            return value; // No conversion needed if input and output units are the same
        }

        // Perform energy conversion based on input unit
        switch (inputUnit) {
            case "Joule":
                return convertJoule(value, outputUnit);
            case "Kilojoule":
                return convertKilojoule(value, outputUnit);
            case "Kilowatt-hour":
                return convertKilowattHour(value, outputUnit);
            case "Watt-hour":
                return convertWattHour(value, outputUnit);
            case "Calorie":
                return convertCalorie(value, outputUnit);
            case "Kilocalorie":
                return convertKilocalorie(value, outputUnit);
            case "Horsepower (metric) hour":
                return convertHorsepowerHour(value, outputUnit);
            case "Electron-volt":
                return convertElectronVolt(value, outputUnit);
            default:
                return value; // Default to returning input value if unit is not recognized
        }
    }

    // Conversion methods
    private double convertJoule(double joule, String outputUnit) {
        switch (outputUnit) {
            case "Joule":
                return joule;
            case "Kilojoule":
                return joule / 1000.0;
            case "Kilowatt-hour":
                return joule / 3600000.0;
            case "Watt-hour":
                return joule / 3600.0;
            case "Calorie":
                return joule / 4.184;
            case "Kilocalorie":
                return joule / 4184.0;
            case "Horsepower (metric) hour":
                return joule / 2647795.5;
            case "Electron-volt":
                return joule / 1.60218e-19;
            default:
                return joule; // If unit is not recognized, return Joules as is
        }
    }

    private double convertKilojoule(double kilojoule, String outputUnit) {
        // Convert kilojoules to other units
        double joule = kilojoule * 1000.0;
        return convertJoule(joule, outputUnit);
    }

    private double convertKilowattHour(double kilowattHour, String outputUnit) {
        // Convert kilowatt-hours to other units
        double joule = kilowattHour * 3600000.0;
        return convertJoule(joule, outputUnit);
    }

    private double convertWattHour(double wattHour, String outputUnit) {
        // Convert watt-hours to other units
        double joule = wattHour * 3600.0;
        return convertJoule(joule, outputUnit);
    }

    private double convertCalorie(double calorie, String outputUnit) {
        // Convert calories to other units
        double joule = calorie * 4.184;
        return convertJoule(joule, outputUnit);
    }

    private double convertKilocalorie(double kilocalorie, String outputUnit) {
        // Convert kilocalories to other units
        double joule = kilocalorie * 4184.0;
        return convertJoule(joule, outputUnit);
    }

    private double convertHorsepowerHour(double horsepowerHour, String outputUnit) {
        // Convert horsepower-hour to other units
        double joule = horsepowerHour * 2647795.5;
        return convertJoule(joule, outputUnit);
    }

    private double convertElectronVolt(double electronVolt, String outputUnit) {
        // Convert electron-volts to other units
        double joule = electronVolt * 1.60218e-19;
        return convertJoule(joule, outputUnit);
    }
    
    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

    private void outputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputFieldActionPerformed

    private void outputUnitComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputUnitComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputUnitComboBoxActionPerformed

    private void inputUnitComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUnitComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUnitComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        convertEnergy();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new UnitConverterUI().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void decimalPlacesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalPlacesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decimalPlacesFieldActionPerformed

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
            java.util.logging.Logger.getLogger(energy_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(energy_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(energy_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(energy_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new energy_converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField decimalPlacesField;
    private javax.swing.JTextField inputField;
    private javax.swing.JComboBox<String> inputUnitComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField outputField;
    private javax.swing.JComboBox<String> outputUnitComboBox;
    // End of variables declaration//GEN-END:variables
}
