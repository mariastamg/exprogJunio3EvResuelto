import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class Ejercicio4 extends JFrame implements ActionListener , MouseListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	private static JButton botonPulsa;
	private static JLabel nClicks;
	private static JButton botonReiniciar;
	private int numClicks = 0;

	
	public static void main(String[] args) {
		//SwingUtilities.invokeLater(() -> new Ejercicio4().setVisible(true));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 marco = new Ejercicio4();
					marco.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Ejercicio4() {
		
		setTitle("Examen 3ª Evaluación - Ejercicio 4");
		setVisible(true);
		addWindowListener(this);
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new GridLayout(3, 3));
		
		
		botonPulsa = new JButton("Pulsa aquí");
		botonPulsa.setMnemonic(KeyEvent.VK_P);
		panel.add(botonPulsa);
		
		// LABEL NCLICKS
		nClicks = new JLabel();
		nClicks.setText("0");
		panel.add(nClicks);

		// BOTON REINICIAR
		botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.setMnemonic(KeyEvent.VK_R);
		panel.add(botonReiniciar);
		
		botonPulsa.addActionListener(this);
		botonReiniciar.addActionListener(this);
		
		nClicks.addMouseListener(this);
		
		
		// setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		nClicks.setForeground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		nClicks.setForeground(Color.BLACK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botonPulsa) {
			numClicks++;
			nClicks.setText(""+numClicks);
		}
		
		if(e.getSource()==botonReiniciar) {
			numClicks=0;
			nClicks.setText(""+numClicks);
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		if (JOptionPane.showConfirmDialog(this, "Salir de la aplicación", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
			System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}

	