package com.duoc.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.duoc.controller.AlumnoService;
import com.duoc.domain.Alumno;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class AlumnoTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;
	private final JButton btnEjecutarsp = new JButton("EjecutarSP");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlumnoTest frame = new AlumnoTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlumnoTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnoService alumnosrv = new AlumnoService();
				txtResultado.setText(alumnosrv.findAllAlumnos().toString());
			}
		});
		contentPane.add(btnEjecutar, BorderLayout.SOUTH);
		
		JLabel lblResultado = new JLabel("Resultado :");
		contentPane.add(lblResultado, BorderLayout.WEST);
		
		txtResultado = new JTextField();
		contentPane.add(txtResultado, BorderLayout.CENTER);
		txtResultado.setColumns(10);
		btnEjecutarsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlumnoService alumnosrv = new AlumnoService();
				List<Alumno> list = alumnosrv.getAlumnoByCurso();
				if (list != null) {
					txtResultado.setText(alumnosrv.getAlumnoByCurso().toString());
				}else {
					txtResultado.setText("Resultado vacío");
				}
					
			}
		});
		contentPane.add(btnEjecutarsp, BorderLayout.EAST);
		
	}

}
