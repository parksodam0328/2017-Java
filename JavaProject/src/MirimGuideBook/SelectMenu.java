package MirimGuideBook;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SelectMenu extends JFrame implements ActionListener{
	private JLabel label;
	private JPanel jp;
	private JButton menubtn[] = new JButton[8];
	private String[] img = {"/button_subject.png","/button_rule.png","/button_club.png",
			"/button_location.png", "/button_entrance.png", "/button_experience.png", 
			"/button_ employment.png","/button_ event.png"
			};
	Image[] btnimg = new Image[8];
	
	public SelectMenu() {
		//mbutton.setVisible(false);
		setTitle("미림가이드북");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		jp = new JPanel();
		jp.setBorder(new EmptyBorder(0, 0, 0, 0));
		jp.setLayout(null);
		getContentPane().add(jp);
		
		label = new JLabel(""); // 라벨 생성
		for(int i=0;i<8;i++) { // 버튼 생성
		menubtn[i] = new JButton("");
		}
		
		// 크기 조절
		label.setSize(1280,720);
		menubtn[0].setBounds(50,85,214,93);
		menubtn[1].setBounds(50,235,214,93);
		menubtn[2].setBounds(50,385,214,93);
		menubtn[3].setBounds(50,535,214,93);
		menubtn[4].setBounds(1000,85,214,93);
		menubtn[5].setBounds(1000,235,214,93);
		menubtn[6].setBounds(1000,385,214,93);
		menubtn[7].setBounds(1000,535,214,93);
		
		//라벨 이미지
		Image lbimg = new ImageIcon(SelectMenu.class.getResource("/MenuSelect.png")).getImage();
		
		for(int i=0;i<8;i++) {
			//jp.add(menubtn[i]); // 판넬에 버튼 추가
			btnimg[i] = new ImageIcon(SelectMenu.class.getResource(img[i])).getImage();
		}
		
		
		for(int i=0;i<8;i++) {
		menubtn[i].setIcon(new ImageIcon(btnimg[i]));
		//System.out.println(menubtn[i]);
		menubtn[i].setBorderPainted(false);
		menubtn[i].setContentAreaFilled(false);
		menubtn[i].setFocusPainted(false);
		//menubtn[i].addActionListener(this);
		}
		
		
		jp.add(label); // 판넬에 라벨 추가
		
		//이미지 넣기, 버튼 설정
		label.setIcon(new ImageIcon(lbimg));
		
		for(int i=0;i<8;i++) {
			label.add(menubtn[i]);
		}
		
		MirimSubject ms = new MirimSubject();
		MirimRule mr = new MirimRule();
		MirimClub mc = new MirimClub();
		MirimLocation ml = new MirimLocation();
		MirimEntrance met = new MirimEntrance();
		MirimExperience mex = new MirimExperience();
		MirimEmployment mem = new MirimEmployment();
		MirimEvent mev = new MirimEvent();
		
		
		menubtn[0].addActionListener(this);
		menubtn[1].addActionListener(this);
		menubtn[2].addActionListener(this);
		menubtn[3].addActionListener(this);
		menubtn[4].addActionListener(this);
		menubtn[5].addActionListener(this);
		menubtn[6].addActionListener(this);
		menubtn[7].addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(true);
		this.setVisible(false);
	}
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMenu frame1 = new SelectMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
