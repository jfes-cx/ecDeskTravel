package com.duoc.util;

import com.duoc.domain.CuentaConexionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CuentaTableModel extends AbstractTableModel {

    private String[] headers = {"ID","RUT", "Nombre","Apellido", "Usuario","Perfil","Estado"};
    private List<CuentaConexionDTO> cuentas;

    public CuentaTableModel() {
        cuentas = new ArrayList<>(25);
    }

    public CuentaTableModel(List<CuentaConexionDTO> cuentas) {
        this();
        this.cuentas.addAll(cuentas);
    }
    
    public void addToItemList(CuentaConexionDTO cuenta){
        this.cuentas.add(cuenta);
        fireTableDataChanged();
    }
    
   public CuentaConexionDTO getCuentaIndex(int index){
       return cuentas.get(index);
   }
   
    @Override
    public int getRowCount() {
        return cuentas.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
 protected CuentaConexionDTO getAlumnoAt(int row) {
        return cuentas.get(row);
    }

    @Override
    // {"ID","RUT", "Nombre","Apellido", "Usuario","Perfil","Estado"};
    public Object getValueAt(int row, int col) {
        Object value = null;
        CuentaConexionDTO cuenta = getAlumnoAt(row);
        switch (col) {
            case 0:
                value  = cuenta.getCuenta().getIdcuentausuario();
                break;
            case 1:
                value = cuenta.getCol().getRut();
                break;
            case 2:
                  value = cuenta.getCol().getNombre();
                
                break;
            case 3:
                value = cuenta.getCol().getApellidpaterno();
                break;
            case 4:
                value = cuenta.getCuenta().getCorreoelectronico();
                break;
            case 5:
                value = cuenta.getCuenta().getNombrePerfil();
                break;
            case 6:
                try {
                    int estado = cuenta.getCuenta().getIdestado().intValueExact();
                    String estadoText;
                    if (estado == 1) {
                        estadoText = "Activa";
                    }else{
                        estadoText = "Inactiva";
                    }
                    value = estadoText;
                } catch (Exception e) {
                    System.out.println(e.getCause() + " "+e.getMessage());
                }
                break;
        }
        return value;
    }
    
@Override
    public void setValueAt(Object value, int rowIndex, int colIndex) {
        CuentaConexionDTO cuenta = getAlumnoAt(rowIndex);
        switch (colIndex) {
            
        }
        fireTableRowsUpdated(rowIndex, colIndex);
    }
}