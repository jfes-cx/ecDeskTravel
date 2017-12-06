/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.ui;

import com.duoc.domain.EstadoResultado;
import com.duoc.util.MyBatisSqlSessionFactory;
import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jxl.biff.FormatRecord.logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Integer
 */
public class EstadoCuenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form EstadoCuenta
     */
    public EstadoCuenta() {
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

        btnGenerarReport = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

        btnGenerarReport.setText("Generar");
        btnGenerarReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReportActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Reporte de Estado de Resultados");

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnGenerarReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTerminar)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReportActionPerformed
        if (evt.getSource() == btnGenerarReport) {
            SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
            try {
                
                
                Map<String, Object> parms = new HashMap<String, Object>();
                sqlSession.selectList("com.duoc.mappers.EstadoresultadoMapper.GET_ESTADO_RESULTADOS", parms);
                List<EstadoResultado> estadosList = (List<EstadoResultado>) parms.get("estados_cursor");

 
                //fill it in JRBeanCollectionDS
                JRBeanCollectionDataSource jrbcds = new JRBeanCollectionDataSource(estadosList);
 
                //compile report
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getFile("reports/estadoResultado.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), jrbcds);
 
                //view report to UI
                JasperViewer.viewReport(jasperPrint, false);
 
            } catch (Exception ex) {
                logger.error(ex.getMessage(), ex);
            } finally {
            sqlSession.close();
        }
 
        }
    }//GEN-LAST:event_btnGenerarReportActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnTerminarActionPerformed
    
    public  File getFile(final String pathAndFileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(pathAndFileName).toURI());
            return file;
        } catch (URISyntaxException ex) {
            Logger.getLogger(EstadoCuenta.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarReport;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
    
  
}
