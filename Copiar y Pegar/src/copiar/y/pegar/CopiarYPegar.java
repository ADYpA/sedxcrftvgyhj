/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiar.y.pegar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Alumno
 */
public class CopiarYPegar extends JFrame{
            
    private JTextField Labelpegar = new JTextField("Texto Copiado");
    private JTextField LabelTitulo = new JTextField("Texto POegar");
    private String TextCopiar;
    private JButton btnCopiar = new JButton("Copi");
    private JButton btnPegar = new JButton("Peist");
    
    public CopiarYPegar(){
        setTitle("Copiar Pegar");
        setSize(350,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        
        LabelTitulo = new JTextField(20); 
        Labelpegar = new JTextField(20);
        btnCopiar = new JButton("Copiar");
        btnPegar = new JButton("Pegar");

        // Agregar componentes a la ventana
        add(new JLabel("Interfaz de Copiar y Pegar")); // Etiqueta de título
        add(LabelTitulo);
        add(Labelpegar);
        add(btnCopiar);
        add(btnPegar);

        // Añadir acciones a los botones
        btnCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    private void btnCopiarActionPerformed(ActionEvent evt) {
        TextCopiar = LabelTitulo.getText(); // Guardar el texto de la primera caja
    }

    private void btnPegarActionPerformed(ActionEvent evt) {
        Labelpegar.setText(TextCopiar); // Pegar el texto en la segunda caja
    }

    public static void main(String[] args) {
        CopiarYPegar ventana = new CopiarYPegar();
        ventana.setVisible(true); // Activar la ventana
    }
    
    
}
