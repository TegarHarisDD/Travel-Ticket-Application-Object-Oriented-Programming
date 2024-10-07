/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author tegar
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    TripManagementPanel TripManagementPanel;
    
    CardLayout cardLayout;
    JPanel cardPanel;
    
    public MainPage() {
        initComponents();
        customInit();   
    }
    private void customInit() {
        // Initialize CardLayout and cardPanel
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        // Add the cardPanel to the jPanel1
        CardLayout.add(cardPanel);
        
        // Create and add feature panels to the cardPanel
        JPanel tripManagementPanel = new TripManagementPanel();
        JPanel ticketBookingPanel = new TicketBookingPanel();
        JPanel salesReportingPanel = new SalesReportingPanel();
        
        cardPanel.add(tripManagementPanel, "TripManagementPanel");
        cardPanel.add(ticketBookingPanel, "TicketBookingPanel");
        cardPanel.add(salesReportingPanel, "SalesReportingPanel");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CardLayout = new javax.swing.JPanel();
        btnTripManagement = new javax.swing.JButton();
        btnTicketManagement = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardLayout.setLayout(new java.awt.CardLayout());

        btnTripManagement.setText("Manajemen Rute dan Tiket");
        btnTripManagement.setToolTipText("");
        btnTripManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTripManagementActionPerformed(evt);
            }
        });

        btnTicketManagement.setText("Pemesanan Tiket");
        btnTicketManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketManagementActionPerformed(evt);
            }
        });

        btnSales.setText("Transaksi");
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTripManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTicketManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSales)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTripManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTicketManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTripManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTripManagementActionPerformed
        cardLayout.show(cardPanel, "TripManagementPanel");        
    }//GEN-LAST:event_btnTripManagementActionPerformed

    private void btnTicketManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketManagementActionPerformed
        cardLayout.show(cardPanel, "TicketBookingPanel");
    }//GEN-LAST:event_btnTicketManagementActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        cardLayout.show(cardPanel, "SalesReportingPanel");
    }//GEN-LAST:event_btnSalesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayout;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnTicketManagement;
    private javax.swing.JButton btnTripManagement;
    // End of variables declaration//GEN-END:variables
}
