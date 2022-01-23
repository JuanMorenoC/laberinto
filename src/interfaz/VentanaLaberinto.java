package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.LaberintoLogico;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VentanaLaberinto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton P1;
	private JButton P2;
	private JButton P3;
	private JButton P4;
	private JButton P5;
	private JButton P6;
	private JButton P20;
	private JButton C1;
	private JButton C2;
	private JButton C3;
	private JButton C4;
	private JButton P7;
	private JButton P19;
	private JButton P21;
	private JButton C10;
	private JButton P22;
	private JButton C5;
	private JButton P8;
	private JButton P18;
	private JButton C9;
	private JButton C11;
	private JButton C12;
	private JButton C6;
	private JButton P9;
	private JButton P17;
	private JButton C8;
	private JButton P23;
	private JButton C7;
	private JButton P10;
	private JButton P16;
	private JButton P15;
	private JButton P14;
	private JButton P13;
	private JButton P12;
	private JButton P11;
	private int a[];
	private JButton P24;
	private int coordX;
	private int coordY;
	private int coordA;
	private int coordB;
	public LaberintoLogico ll;
	private JButton btnIniciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLaberinto frame = new VentanaLaberinto();
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
	public VentanaLaberinto() {
		a = new int [2];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		P1 = new JButton("");
		P1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P1.setBackground(Color.RED);
		P1.setBounds(28, 66, 40, 40);
		contentPane.add(P1);
		
		P20 = new JButton("");
		P20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P20.setBackground(Color.RED);
		P20.setBounds(28, 106, 40, 40);
		contentPane.add(P20);
		
		P2 = new JButton("");
		P2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P2.setBackground(Color.RED);
		P2.setBounds(68, 66, 40, 40);
		contentPane.add(P2);
		
		P19 = new JButton("");
		P19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P19.setBackground(Color.RED);
		P19.setBounds(28, 146, 40, 40);
		contentPane.add(P19);
		
		C1 = new JButton("");
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 1;
					C1.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 1;
						C1.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C1.setBounds(68, 106, 40, 40);
		contentPane.add(C1);
		
		P17 = new JButton("");
		P17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P17.setBackground(Color.RED);
		P17.setBounds(28, 226, 40, 40);
		contentPane.add(P17);
		
		P18 = new JButton("");
		P18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P18.setBackground(Color.RED);
		P18.setBounds(28, 186, 40, 40);
		contentPane.add(P18);
		
		P16 = new JButton("");
		P16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P16.setBackground(Color.RED);
		P16.setBounds(28, 266, 40, 40);
		contentPane.add(P16);
		
		P3 = new JButton("");
		P3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P3.setBackground(Color.RED);
		P3.setBounds(108, 66, 40, 40);
		contentPane.add(P3);
		
		P4 = new JButton("");
		P4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P4.setBackground(Color.RED);
		P4.setBounds(148, 66, 40, 40);
		contentPane.add(P4);
		
		P5 = new JButton("");
		P5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P5.setBackground(Color.RED);
		P5.setBounds(188, 66, 40, 40);
		contentPane.add(P5);
		
		P6 = new JButton("");
		P6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P6.setBackground(Color.RED);
		P6.setBounds(228, 66, 40, 40);
		contentPane.add(P6);
		
		C2 = new JButton("");
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 2;
					C2.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 2;
						C2.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C2.setBounds(108, 106, 40, 40);
		contentPane.add(C2);
		
		C3 = new JButton("");
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 3;
					C3.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 3;
						C3.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C3.setBounds(148, 106, 40, 40);
		contentPane.add(C3);
		
		C4 = new JButton("");
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 4;
					C4.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 4;
						C4.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C4.setBounds(188, 106, 40, 40);
		contentPane.add(C4);
		
		P7 = new JButton("");
		P7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P7.setBackground(Color.RED);
		P7.setBounds(228, 106, 40, 40);
		contentPane.add(P7);
		
		P21 = new JButton("");
		P21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P21.setBackground(Color.RED);
		P21.setBounds(68, 146, 40, 40);
		contentPane.add(P21);
		
		C10 = new JButton("");
		C10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 10;
					C10.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 10;
						C10.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C10.setBounds(108, 146, 40, 40);
		contentPane.add(C10);
		
		P22 = new JButton("");
		P22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P22.setBackground(Color.RED);
		P22.setBounds(148, 146, 40, 40);
		contentPane.add(P22);
		
		C5 = new JButton("");
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 5;
					C5.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 5;
						C5.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C5.setBounds(188, 146, 40, 40);
		contentPane.add(C5);
		
		P8 = new JButton("");
		P8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P8.setBackground(Color.RED);
		P8.setBounds(228, 146, 40, 40);
		contentPane.add(P8);
		
		C9 = new JButton("");
		C9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 9;
					C9.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 9;
						C9.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C9.setBounds(68, 186, 40, 40);
		contentPane.add(C9);
		
		C11 = new JButton("");
		C11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 11;
					C11.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 11;
						C11.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C11.setBounds(108, 186, 40, 40);
		contentPane.add(C11);
		
		C12 = new JButton("");
		C12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 12;
					C12.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 12;
						C12.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C12.setBounds(148, 186, 40, 40);
		contentPane.add(C12);
		
		C6 = new JButton("");
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 6;
					C6.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 6;
						C6.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C6.setBounds(188, 186, 40, 40);
		contentPane.add(C6);
		
		P9 = new JButton("");
		P9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P9.setBackground(Color.RED);
		P9.setBounds(228, 186, 40, 40);
		contentPane.add(P9);
		
		C8 = new JButton("");
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 8;
					C8.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] =8;
						C8.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C8.setBounds(68, 226, 40, 40);
		contentPane.add(C8);
		
		P23 = new JButton("");
		P23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P23.setBackground(Color.RED);
		P23.setBounds(108, 226, 40, 40);
		contentPane.add(P23);
		
		C7 = new JButton("");
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==0)
				{
					a[0] = 7;
					C7.setBackground(Color.GREEN);
				}
				else
				{
					if(a[1]==0)
					{
						a[1] = 7;
						C7.setBackground(Color.BLUE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No se puede asignar ");
					}
				}
			}
		});
		C7.setBounds(148, 226, 40, 40);
		contentPane.add(C7);
		
		P24 = new JButton("");
		P24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P24.setBackground(Color.RED);
		P24.setBounds(188, 226, 40, 40);
		contentPane.add(P24);
		
		P10 = new JButton("");
		P10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P10.setBackground(Color.RED);
		P10.setBounds(228, 226, 40, 40);
		contentPane.add(P10);
		
		P15 = new JButton("");
		P15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P15.setBackground(Color.RED);
		P15.setBounds(68, 266, 40, 40);
		contentPane.add(P15);
		
		P14 = new JButton("");
		P14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P14.setBackground(Color.RED);
		P14.setBounds(108, 266, 40, 40);
		contentPane.add(P14);
		
		P13 = new JButton("");
		P13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P13.setBackground(Color.RED);
		P13.setBounds(148, 266, 40, 40);
		contentPane.add(P13);
		
		P12 = new JButton("");
		P12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P12.setBackground(Color.RED);
		P12.setBounds(188, 266, 40, 40);
		contentPane.add(P12);
		
		P11 = new JButton("");
		P11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "la posicion seleccionada es una pared");
			}
		});
		P11.setBackground(Color.RED);
		P11.setBounds(228, 266, 40, 40);
		contentPane.add(P11);
		
		JLabel lblPared = new JLabel("PARED:");
		lblPared.setBounds(28, 341, 80, 14);
		contentPane.add(lblPared);
		
		JLabel lblCamino = new JLabel("CAMINO:");
		lblCamino.setBounds(28, 367, 80, 14);
		contentPane.add(lblCamino);
		
		JLabel lblRecorrido = new JLabel("RECORRIDO:");
		lblRecorrido.setBounds(28, 393, 99, 14);
		contentPane.add(lblRecorrido);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBackground(Color.RED);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setBounds(132, 338, 28, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(132, 364, 28, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBackground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBounds(132, 390, 28, 20);
		contentPane.add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(187, 341, 15, 82);
		contentPane.add(separator);
		
		JLabel lblInicio = new JLabel("INICIO:");
		lblInicio.setBounds(203, 341, 46, 14);
		contentPane.add(lblInicio);
		
		JLabel lblFin = new JLabel("FIN:");
		lblFin.setBounds(203, 393, 46, 14);
		contentPane.add(lblFin);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.GREEN);
		textField_3.setBounds(266, 338, 28, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.BLUE);
		textField_4.setBounds(266, 390, 28, 20);
		contentPane.add(textField_4);
		
		JLabel lblLaberinto = new JLabel("LABERINTO");
		lblLaberinto.setFont(new Font("Arial", Font.BOLD, 14));
		lblLaberinto.setBounds(132, 11, 117, 14);
		contentPane.add(lblLaberinto);
		
		btnIniciar = new JButton("INICIAR");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a[0]==1)
		    	{
		    		coordA = 1;
		    		coordB = 1;
		    	}
		    	if(a[0]==2)
		    	{
		    		coordA = 1;
		    		coordB = 2;
		    	}
		    	if(a[0]==3)
		    	{
		    		coordA = 1;
		    		coordB = 3;
		    	}
		    	if(a[0]==4)
		    	{
		    		coordA = 1;
		    		coordB = 4;
		    	}
		    	if(a[0]==5)
		    	{
		    		coordA = 2;
		    		coordB = 4;
		    	}
		    	if(a[0]==6)
		    	{
		    		coordA = 3;
		    		coordB = 4;
		    	}
		    	if(a[0]==7)
		    	{
		    		coordA = 4;
		    		coordB = 3;
		    	}
		    	if(a[0]==8)
		    	{
		    		coordA = 4;
		    		coordB = 1;
		    	}
		    	if(a[0]==9)
		    	{
		    		coordA = 3;
		    		coordB = 1;
		    	}
		    	if(a[0]==10)
		    	{
		    		coordA = 2;
		    		coordB = 2;
		    	}
		    	if(a[0]==11)
		    	{
		    		coordA = 3;
		    		coordB = 2;
		    	}
		    	if(a[0]==12)
		    	{
		    		coordA = 3;
		    		coordB = 3;
		    	}
		    	//fin
				if(a[1]==1)
		    	{
		    		coordX = 1;
		    		coordY = 1;
		    	}
		    	if(a[1]==2)
		    	{
		    		coordX = 1;
		    		coordY = 2;
		    	}
		    	if(a[1]==3)
		    	{
		    		coordX = 1;
		    		coordY = 3;
		    	}
		    	if(a[1]==4)
		    	{
		    		coordX = 1;
		    		coordY = 4;
		    	}
		    	if(a[1]==5)
		    	{
		    		coordX = 2;
		    		coordY = 4;
		    	}
		    	if(a[1]==6)
		    	{
		    		coordX = 3;
		    		coordY = 4;
		    	}
		    	if(a[1]==7)
		    	{
		    		coordX = 4;
		    		coordY = 3;
		    	}
		    	if(a[1]==8)
		    	{
		    		coordX = 4;
		    		coordY = 1;
		    	}
		    	if(a[1]==9)
		    	{
		    		coordX = 3;
		    		coordY = 1;
		    	}
		    	if(a[1]==10)
		    	{
		    		coordX = 2;
		    		coordY = 2;
		    	}
		    	if(a[1]==11)
		    	{
		    		coordX = 3;
		    		coordY = 2;
		    	}
		    	if(a[1]==12)
		    	{
		    		coordX = 3;
		    		coordY = 3;
		    	}
		    	System.out.println(a[0]+ "   "+a[1]);
		    	ll = new LaberintoLogico(coordX, coordY, coordA, coordB);
		    	ll.menuLab(coordX, coordY, coordA, coordB);
		    	char lab[][] = ll.imprimir();
		    	imprime(lab);
			}
		});
		btnIniciar.setBounds(278, 106, 89, 23);
		contentPane.add(btnIniciar);
	}
	public int verificarVerde(int n)
	{
		int verificado = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if((a[i]==1 || a[i]==2 || a[i]==3 || a[i]==4 || a[i]==5 || a[i]==6 ||
					a[i]==7 || a[i]==8 || a[i]==9 || a[i]==10 || a[i]==11 || a[i]==12)
					&& (i==0))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		return verificado;
	}
	public int verificarAzul(int n)
	{
		int verificado = 0;
		for (int i = 1; i < a.length; i++) 
		{
			if((a[i]==1 || a[i]==2 || a[i]==3 || a[i]==4 || a[i]==5 || a[i]==6 ||
					a[i]==7 || a[i]==8 || a[i]==9 || a[i]==10 || a[i]==11 || a[i]==12)
					&& (i==1))
			{
				return 2;
			}
			else
			{
				return 3;
			}
		}
		return verificado;
	}
	public void imprime(char laberinto[][])
	{
		C1.setText("*");
		C1.setBackground(Color.BLACK);
		for (int x=0; x<laberinto.length; x++) { // recorremos filas
            for (int y=0; y<laberinto.length; y++) { // recorremos columnas
                if(laberinto[x][y]=='*')
                {
                	System.out.println(x+"  "+y+"   "+laberinto[4][1]);
                	if(x==1 && y==1)
                	{
                		C1.setBackground(Color.black);
                	}
                	if(x==1 && y==2)
                	{
                		C2.setBackground(Color.black);
                	}
                	if(x==1 && y==3)
                	{
                		C3.setBackground(Color.black);
                	}
                	if(x==1 && y==4)
                	{
                		C4.setBackground(Color.black);
                	}
                	if(x==2 && y==4)
                	{
                		C5.setBackground(Color.black);
                	}
                	if(x==3 && y==4)
                	{
                		C6.setBackground(Color.black);
                	}
                	if(x==4 && y==3)
                	{
                		C7.setBackground(Color.black);
                	}
                	if(x==4 && y==1)
                	{
                		C8.setBackground(Color.black);
                	}
                	if(x==3 && y==1)
                	{
                		C9.setBackground(Color.black);
                	}
                	if(x==2 && y==2)
                	{
                		C10.setBackground(Color.black);
                	}
                	if(x==3 && y==2)
                	{
                		C11.setBackground(Color.black);
                	}
                	if(x==3 && y==3)
                	{
                		C12.setBackground(Color.black);
                	}
                }
            }
        }
	}
}
