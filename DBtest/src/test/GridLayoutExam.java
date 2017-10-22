package test;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutExam extends JFrame{
	public GridLayoutExam() {
		super("GridLayout");
		setLayout(new GridLayout(2,3)); //배치 관리자 2줄 3칸 GridLauout 적용
		JPanel jp=new JPanel();
		JLabel jl=new JLabel();
		JLabel jl_grid=new JLabel();
		
		JButton b1=new JButton("버튼1");
		JButton b2=new JButton("버튼2");
		JButton b3=new JButton("버튼3");
		JButton b4=new JButton("버튼4");
		JButton b5=new JButton("버튼5");
		JButton b6=new JButton("버튼6");
		
		jl.add(b1); jl.add(b2); jl.add(b3);
		jl.add(b4); jl.add(b5); jl.add(b6);
		jp.add(jl);
	//	jp_grid.setLayout(new GridLayout(2,3));
		
		add(jp);
		/*
		add(b1); add(b2); add(b3);
		add(b4); add(b5); add(b6);
		*/
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutExam();

	}

}
