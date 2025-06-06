package ec.edu.ups.poo;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends Frame {

    private TextField txtCedula, txtNombre, txtApellido;

    public Ventana() {
        super("Registro de Estudiantes");

        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(245, 245, 245));
        Font fuente = new Font("Segoe UI", Font.PLAIN, 14);

        Panel panelSuperior = new Panel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        Button btnAgregar = new Button("Agregar");
        Button btnModificar = new Button("Modificar");
        Button btnEliminar = new Button("Eliminar");
        btnAgregar.setFont(fuente);
        btnModificar.setFont(fuente);
        btnEliminar.setFont(fuente);
        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnModificar);
        panelSuperior.add(btnEliminar);
        panelSuperior.setBackground(new Color(220, 220, 220));

        Panel panelCentral = new Panel(new GridLayout(3, 2, 10, 10));
        panelCentral.setFont(fuente);
        panelCentral.setBackground(Color.white);
        panelCentral.setPreferredSize(new Dimension(300, 100));

        panelCentral.add(new Label("Cédula:"));
        txtCedula = new TextField(20);
        panelCentral.add(txtCedula);

        panelCentral.add(new Label("Nombre:"));
        txtNombre = new TextField(20);
        panelCentral.add(txtNombre);

        panelCentral.add(new Label("Apellido:"));
        txtApellido = new TextField(20);
        panelCentral.add(txtApellido);

        Panel panelInferior = new Panel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        Button btnGuardar = new Button("Guardar");
        Button btnCancelar = new Button("Cancelar");
        btnGuardar.setFont(fuente);
        btnCancelar.setFont(fuente);
        panelInferior.add(btnGuardar);
        panelInferior.add(btnCancelar);
        panelInferior.setBackground(new Color(240, 240, 240));

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cedula = txtCedula.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                System.out.println("Datos ingresados:");
                System.out.println("Cédula: " + cedula);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
            }
        });


        setSize(420, 230);
        setLocationRelativeTo(null);
        setVisible(true);

      
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

}
