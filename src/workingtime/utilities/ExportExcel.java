/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingtime.utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Class ExportExcel
 * @author Lidia Parral
 * @version 1.0.0
 */
public class ExportExcel {
    
    /**
     * Método exportExcel: Este método permite guardar y exportar los documentos seleccionados en formato Excel.
     * @param t
     * @throws IOException 
     */
    public void exportExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                try (FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    Sheet hoja;
                    hoja = libro.createSheet("Nueva Hoja");
                    hoja.setDisplayGridlines(false);
                    for (int f = 0; f < t.getSelectedRowCount(); f++) {
                        Row fila = hoja.createRow(f);
                        for (int c = 0; c < t.getColumnCount(); c++) {
                            Cell celda = fila.createCell(c);
                            if (f == 0) {
                                celda.setCellValue(t.getColumnName(c));
                            }
                        }
                    }
                    int filaInicio = 1;
                    for (int f = 0; f < t.getSelectedRowCount(); f++) {
                        Row fila = hoja.createRow(filaInicio);
                        filaInicio++;
                        for (int c = 0; c < t.getColumnCount(); c++) {
                            Cell celda = fila.createCell(c);
                            if (t.getValueAt(f, c) instanceof Double) {
                                celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                            } else if (t.getValueAt(f, c) instanceof Float) {
                                celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                            } else {
                                celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                            }
                        }
                    }
                    libro.write(archivo);
                }
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
}
