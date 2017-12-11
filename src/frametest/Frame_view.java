package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import calculation.Calculation_lib;

public class Frame_view extends Frame implements ActionListener,WindowListener
{
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("", 10);
	private Button button1 = new Button("足し算");
	private Button button2 = new Button("引き算");
	private Button button3 = new Button("掛け算");
	private Button button4 = new Button("割り算");
	private TextField text3 = new TextField("", 10);
	
	
	public Frame_view() {
		addWindowListener(this);
		setTitle("FrameTest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		button1.addActionListener(this);
		add(button2);
		button2.addActionListener(this);
		add(button3);
		button3.addActionListener(this);
		add(button4);
		button4.addActionListener(this);
		
		add(text3);

	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		
		if(e.getSource() == button1){
			text3.setText(String.valueOf(clib.getPlus()));
		}else if(e.getSource() == button2){
			text3.setText(String.valueOf(clib.getMinus()));
		}else if(e.getSource() == button3){
			text3.setText(String.valueOf(clib.getTimes()));
		}else if(e.getSource() == button4){
			text3.setText(String.valueOf(clib.getDivide()));
		}

	}

}
