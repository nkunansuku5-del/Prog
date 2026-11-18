/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.productapp;

/**
 *
 * @author Student
 */



import javax.swing.*; 

import java.awt.*; 

import java.io.FileWriter; 

import java.io.IOException; 

import java.io.PrintWriter; 

  

public class ProductApp extends JFrame { 

  

    private JComboBox<String> cmbProduct; 

    private JTextField txtTickets; 

    private JTextField txtPrice; 

    

  

    public ProductApp() { 

        super("Products Prices"); 

  

        // ---------- Q2.1 Components ---------- 

        cmbProduct = new JComboBox<>(new String[]{"Cozy nightlights monarch","Restonic barbaedos","Sealy phuket"}); 

        txtTickets = new JTextField(15); 

        txtPrice = new JTextField(15); 
        
        

        

  

        JPanel form = new JPanel(new GridLayout(4, 2, 5, 10)); 

        form.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

        form.add(new JLabel("Select product")); 
        

        form.add(cmbProduct); 

        form.add(new JLabel("Customer Name"));

        form.add(txtTickets); 

        form.add(new JLabel("enter PRICE:")); 

        form.add(txtPrice);  

        form.add(new JLabel("")); 

  

        add(form, BorderLayout.NORTH); 

         

  

        

        JMenuBar menuBar = new JMenuBar(); 

        JMenu mnuFile = new JMenu("File"); 

        JMenuItem itmExit = new JMenuItem("Exit"); 

        mnuFile.add(itmExit); 

  

        JMenu mnuTools = new JMenu("Tools"); 

        JMenuItem itmProcess = new JMenuItem("Process"); 

        JMenuItem itmClear = new JMenuItem("Clear"); 

        mnuTools.add(itmProcess); 

        mnuTools.add(itmClear); 

  

        menuBar.add(mnuFile); 

        menuBar.add(mnuTools); 

        setJMenuBar(menuBar); 

  

        
        itmExit.addActionListener(e -> System.exit(0));   
        itmProcess.addActionListener(e -> process());    

        itmClear.addActionListener(e -> clear());          

  

        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        pack(); 

        setLocationRelativeTo(null); 

    } 

  

     

    private void process() { 

        String product = (String) cmbProduct.getSelectedItem(); 

        String error = ProductPrices.validate(product, txtPrice.getText(), txtTickets.getText()); 

  

        if (error != null) { 

            JOptionPane.showMessageDialog(this, error, "Invalid Input", JOptionPane.ERROR_MESSAGE); 

            return; 

        } 

  

        MovieTickets ticket = new productsales(product, 

                Double.parseDouble(txtPrice.getText().trim()), 

                Integer.parseInt(txtTickets.getText().trim()));  

    

    } 

  

    // Q2.6 

    private void clear() { 

        cmbProduct.setSelectedIndex(0); 

        txtTickets.setText(""); 

        txtPrice.setText(""); 

         

    } 

  

    public static void main(String[] args) { 

        SwingUtilities.invokeLater(() -> new ProductApp().setVisible(true)); 

    } 

} 