package MirimGuideBook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimEmployment extends JFrame{
	public MirimEmployment() {
		//mbutton.setVisible(false);
		setTitle("¹Ì¸²°¡ÀÌµåºÏ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //Ã¢ Áß¾Ó¿¡ ¶ç¿ì±â
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}