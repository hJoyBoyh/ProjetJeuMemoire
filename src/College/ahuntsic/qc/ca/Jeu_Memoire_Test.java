package College.ahuntsic.qc.ca;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Jeu_Memoire_Test extends JFrame {
	// arraylist
	private ArrayList<Integer> listeNombre = new ArrayList<>();
	private ArrayList<JLabel> listeLabel = new ArrayList<>();
	private ArrayList<Color> listeColor = new ArrayList<>();
	private ArrayList<JLabel> tempLabel = new ArrayList<>();

	private int nbCoup = 0;
	private int nbPaireTrouve = 0;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JLabel lbl_0;
	private JLabel lbl_1;
	private JLabel lbl_2;
	private JLabel lbl_3;
	private JLabel lbl_4;
	private JLabel lbl_5;
	private JLabel lbl_6;
	private JLabel lbl_7;
	private JLabel lbl_8;
	private JLabel lbl_9;
	private JLabel lbl_10;
	private JLabel lbl_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Jeu_Memoire_Test frame = new Jeu_Memoire_Test();
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
	public Jeu_Memoire_Test() {
		initialize();
		shuffle();

	}

	public void initialize() {
		// add color dans listeColor
		listeColor.add(Color.RED);
		listeColor.add(Color.YELLOW);
		listeColor.add(Color.BLACK);
		listeColor.add(Color.PINK);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Jeu de Mémoire");
		lblNewLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(230, 24, 172, 62);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Nombre de Coups : ___");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(206, 414, 196, 43);
		contentPane.add(lblNewLabel_1);

		btnNewButton = new JButton("Rejouer");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new BtnNewButtonActionListener());

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(228, 467, 149, 28);
		contentPane.add(btnNewButton);

		lbl_0 = new JLabel("2");
		lbl_0.addMouseListener(new Lbl_0MouseListener());

		lbl_0.setForeground(Color.RED);
		lbl_0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_0.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_0.setOpaque(true);
		lbl_0.setBackground(Color.CYAN);
		lbl_0.setBounds(58, 96, 91, 80);
		contentPane.add(lbl_0);

		lbl_1 = new JLabel("1");
		lbl_1.addMouseListener(new Lbl_1MouseListener());
		lbl_1.setOpaque(true);
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_1.setBackground(Color.CYAN);
		lbl_1.setBounds(191, 96, 91, 80);
		contentPane.add(lbl_1);

		lbl_2 = new JLabel("5");
		lbl_2.addMouseListener(new Lbl_2MouseListener());
		lbl_2.setForeground(Color.MAGENTA);
		lbl_2.setOpaque(true);
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_2.setBackground(Color.CYAN);
		lbl_2.setBounds(311, 96, 91, 80);
		contentPane.add(lbl_2);

		lbl_3 = new JLabel("1");
		lbl_3.addMouseListener(new Lbl_3MouseListener());
		lbl_3.setOpaque(true);
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_3.setBackground(Color.CYAN);
		lbl_3.setBounds(445, 96, 91, 80);
		contentPane.add(lbl_3);

		lbl_4 = new JLabel("4");
		lbl_4.addMouseListener(new Lbl_4MouseListener());
		lbl_4.setForeground(Color.YELLOW);
		lbl_4.setOpaque(true);
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_4.setBackground(Color.CYAN);
		lbl_4.setBounds(58, 196, 91, 80);
		contentPane.add(lbl_4);

		lbl_5 = new JLabel("2");
		lbl_5.addMouseListener(new Lbl_5MouseListener());
		lbl_5.setForeground(Color.RED);
		lbl_5.setOpaque(true);
		lbl_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_5.setBackground(Color.CYAN);
		lbl_5.setBounds(191, 196, 91, 80);
		contentPane.add(lbl_5);

		lbl_6 = new JLabel("3");
		lbl_6.addMouseListener(new Lbl_6MouseListener());
		lbl_6.setForeground(Color.WHITE);
		lbl_6.setOpaque(true);
		lbl_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_6.setBackground(Color.CYAN);
		lbl_6.setBounds(311, 196, 91, 80);
		contentPane.add(lbl_6);

		lbl_7 = new JLabel("5\r\n");
		lbl_7.addMouseListener(new Lbl_7MouseListener());
		lbl_7.setForeground(Color.MAGENTA);
		lbl_7.setOpaque(true);
		lbl_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_7.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_7.setBackground(Color.CYAN);
		lbl_7.setBounds(445, 196, 91, 80);
		contentPane.add(lbl_7);

		lbl_8 = new JLabel("6");
		lbl_8.addMouseListener(new Lbl_8MouseListener());
		lbl_8.setForeground(Color.BLUE);
		lbl_8.setOpaque(true);
		lbl_8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_8.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_8.setBackground(Color.CYAN);
		lbl_8.setBounds(58, 298, 91, 80);
		contentPane.add(lbl_8);

		lbl_9 = new JLabel("3");
		lbl_9.addMouseListener(new Lbl_9MouseListener());
		lbl_9.setForeground(Color.WHITE);
		lbl_9.setOpaque(true);
		lbl_9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_9.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_9.setBackground(Color.CYAN);
		lbl_9.setBounds(191, 298, 91, 80);
		contentPane.add(lbl_9);

		lbl_10 = new JLabel("4");
		lbl_10.addMouseListener(new Lbl_10MouseListener());
		lbl_10.setForeground(Color.YELLOW);
		lbl_10.setOpaque(true);
		lbl_10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_10.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_10.setBackground(Color.CYAN);
		lbl_10.setBounds(311, 298, 91, 80);
		contentPane.add(lbl_10);

		lbl_11 = new JLabel("6");
		lbl_11.addMouseListener(new Lbl_11MouseListener());

		lbl_11.setForeground(Color.BLUE);
		lbl_11.setOpaque(true);
		lbl_11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_11.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lbl_11.setBackground(Color.CYAN);
		lbl_11.setBounds(445, 298, 91, 80);
		contentPane.add(lbl_11);

	}

	private void rejouer() {
		if (nbPaireTrouve == 6) {
			JOptionPane.showMessageDialog(null, "Vous avez terminer la partie avec " + nbCoup
					+ " effecutés. Appuyer sur rejouer pour recommencer la partie.");
			btnNewButton.setEnabled(true);
		}
	}

	private void shuffle() {

		// chiffre add dans le arraylist liste nombre
		listeNombre.add(1);
		listeNombre.add(1);
		listeNombre.add(2);
		listeNombre.add(2);
		listeNombre.add(3);
		listeNombre.add(3);
		listeNombre.add(4);
		listeNombre.add(4);
		listeNombre.add(5);
		listeNombre.add(5);
		listeNombre.add(6);
		listeNombre.add(6);

		// jlabel add dans le arraylist listeJlabel
		listeLabel.add(lbl_0);
		listeLabel.add(lbl_1);
		listeLabel.add(lbl_2);
		listeLabel.add(lbl_3);
		listeLabel.add(lbl_4);
		listeLabel.add(lbl_5);
		listeLabel.add(lbl_6);
		listeLabel.add(lbl_7);
		listeLabel.add(lbl_8);
		listeLabel.add(lbl_9);
		listeLabel.add(lbl_10);
		listeLabel.add(lbl_11);

		// melange des nombres
		Collections.shuffle(listeNombre);

		// insertion des nombre dans le jlabel

		for (int i = 0; i < listeNombre.size(); i++) {
			listeLabel.get(i).setText(String.valueOf(listeNombre.get(i)));
			listeLabel.get(i).setForeground(Color.CYAN);

		}
	}

	private void pairOuPas(JLabel j1, JLabel j2) {

		// verifier si les deux chiffre sont pareil
		if (j1.getText().equalsIgnoreCase(j2.getText())) {
			JOptionPane.showMessageDialog(null, "Paire de " + j1.getText() + " trouvée!!");

			// rendre visible
			j1.setVisible(false);
			j2.setVisible(false);

			// remove les jlabel de la liste
			listeLabel.removeAll(tempLabel);
			tempLabel.removeAll(tempLabel);

			// nombre de coup ++ et nb paire trouver ++
			nbCoup++;
			nbPaireTrouve++;

			lblNewLabel_1.setText("Nombre de Coups : " + nbCoup);

			rejouer();

		} else {
			JOptionPane.showMessageDialog(null, "Aucune paire trouvée!!");

			j1.setForeground(Color.CYAN);
			j2.setForeground(Color.CYAN);

			tempLabel.removeAll(tempLabel);

			nbCoup++;
			lblNewLabel_1.setText("Nombre de Coups : " + nbCoup);

		}

	}

	private void clickVerification(JLabel jl) {
		Random random = new Random();
		int colorRand = random.nextInt(listeColor.size());

		// si le templabel est plus petit que 2 et que il ne contain pas le meme jlabel

		if (tempLabel.size() < 2 && !(tempLabel.contains(jl))) {

			// add dans la liste temp label
			tempLabel.add(jl);

			// couleur mis aleatoirement
			jl.setForeground(listeColor.get(colorRand));

		}

		if (tempLabel.size() == 2) {

			tempLabel.get(1).setForeground(listeColor.get(colorRand));

			pairOuPas(tempLabel.get(0), tempLabel.get(1));
		}
	}

	private class Lbl_11MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_11);
		}
	}

	private class Lbl_0MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_0);
		}
	}

	private class Lbl_1MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_1);
		}
	}

	private class Lbl_2MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_2);
		}
	}

	private class Lbl_8MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_8);
		}
	}

	private class Lbl_4MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_4);
		}
	}

	private class Lbl_6MouseListener extends MouseAdapter {
		@Override

		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_6);
		}
	}

	private class Lbl_3MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_3);
		}
	}

	private class Lbl_9MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_9);
		}
	}

	private class Lbl_10MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_10);
		}
	}

	private class Lbl_7MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_7);
		}
	}

	private class Lbl_5MouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			clickVerification(lbl_5);
		}

	}

	private class BtnNewButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			Jeu_Memoire_Test JMT = new Jeu_Memoire_Test();
			JMT.setVisible(true);

		}
	}
}
