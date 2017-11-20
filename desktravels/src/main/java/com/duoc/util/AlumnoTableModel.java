package main.java.com.duoc.util;

import com.duoc.domain.Alumno;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlumnoTableModel extends AbstractTableModel {

    private String[] headers = {"RUT","Nombre", "Apellido","Email", "Telefono","Apoderado"};
    private List<Alumno> alumnos;

    public AlumnoTableModel() {
        alumnos = new ArrayList<>(25);
    }

    AlumnoTableModel(List<Alumno> alumnos) {
        this();
        this.alumnos.addAll(alumnos);
    }

    public AlumnoTableModel(Alumno... alumnos) {
        this(Arrays.asList(alumnos));
    }

    @Override
    public int getRowCount() {
        return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
 protected Alumno getAlumnoAt(int row) {
        return alumnos.get(row);
    }

    @Override
    public Object getValueAt(int row, int col) {
        Object value = null;
        Alumno alumno = getAlumnoAt(row);
        switch (col) {
            case 0:
                value  = alumno.getRut();
                break;
            case 1:
                value = alumno.getNombre();
                break;
            case 2:
                value = alumno.getApellidos();
                break;
            case 3:
                value = alumno.getCorreoelectronico();
            case 4:
                value = alumno.getTelefono();
            case 5:
                value = alumno.getNombreapoderado();
        }
        return value;
    }
    
@Override
    public void setValueAt(Object value, int rowIndex, int colIndex) {
        Alumno alumno = getAlumnoAt(rowIndex);
        switch (colIndex) {
            case 0:
                alumno.setRut(value.toString());
                break;
            case 1:
                alumno.setNombre(value.toString());
                break;
            case 2:
                
                    alumno.setApellidos(value.toString());
             
                break;
            case 3:
                alumno.setCorreoelectronico(value.toString());
                break;
            case 4:
                if (value instanceof Integer) {
                    Integer tel =  (Integer)value;
                    alumno.setTelefono(BigDecimal.valueOf(tel));
                }
                break;
            case 5:
                alumno.setNombreapoderado(value.toString());
                break;
        }
        fireTableRowsUpdated(rowIndex, colIndex);
    }
}