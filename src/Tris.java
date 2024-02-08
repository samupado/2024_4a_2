import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tris extends JFrame{

		public Tris() {
			super("TRIS");
			Container co=getContentPane();
			JPanel nord, centro, sud;
			nord=new JPanel();
			centro=new JPanel();
			sud=new JPanel();
			
			co.add(nord, "North");
			co.add(centro);
			co.add(sud, "South");
			
			//Area Nord
			
			nord.add(new JLabel(new ImageIcon("Xc.png")));
			JLabel tit=new JLabel("IL GIOCO DEL TRIS");
			tit.setFont(new Font("Times New Roman", 1, 30));
			nord.add(tit);
			nord.add(new JLabel(new ImageIcon("Oc.png")));
			
			//Area Sud
			
			JLabel nome;
			JTextField nomeG;
			nome=new JLabel("Nome del giocatore");
			nomeG=new JTextField(10);
			sud.add(nome);
			sud.add(nomeG);
			
			//Area centro
			
			centro.setLayout(new GridLayout(3, 2, 5, 5));
			centro.setBackground(Color.black);
			JButton ok=new JButton("X");
			ok.setBackground(Color.white);
			ok.setFont(new Font("Arial", 1, 30));
			ok.setForeground(Color.blue);
			JButton ok1=new JButton("O");
			ok1.setFont(new Font("Arial", 1, 30));
			ok1.setForeground(Color.red);
			ok1.setBackground(Color.white);
			JButton ok2=new JButton(" ");
			ok2.setBackground(Color.white);
			JButton ok3=new JButton(" ");
			ok3.setBackground(Color.white);
			JButton ok4=new JButton(" ");
			ok4.setBackground(Color.white);
			JButton ok5=new JButton(" ");
			ok5.setBackground(Color.white);
			JButton ok6=new JButton(" ");
			ok6.setBackground(Color.white);
			JButton ok7=new JButton(" ");
			ok7.setBackground(Color.white);
			JButton ok8=new JButton(" ");
			ok8.setBackground(Color.white);
			centro.add(ok);
			centro.add(ok1);
			centro.add(ok2);
			centro.add(ok3);
			centro.add(ok4);
			centro.add(ok5);
			centro.add(ok6);
			centro.add(ok7);
			centro.add(ok8);
			
			
			this.setResizable(false);
			setVisible(true);
			setSize(500, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			new Tris();
		}
}
