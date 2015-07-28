import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.util.ArrayList;
public class JavaCalci  {
 String [] str = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/","%","=","AC"};
 JFrame fr;
 JPanel pn;
 JTextField tx;
 JButton [] bt= new JButton[16];
  public void go()
    {
	  fr= new JFrame("Calculator");
	  pn= new JPanel();
	  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	  fr.setSize(400, 400);
	  fr.setBounds(3,3,400,400);
	  
	  fr.setVisible(true);
	  tx = new JTextField(20);
	  fr.getContentPane().add(BorderLayout.NORTH,tx);
	  
	  GridLayout gl = new GridLayout(4,4);
	  gl.setHgap(2);
	  gl.setVgap(3);
	  pn.setLayout(gl);
	  
	  
	  for(int i=0; i<16;i++)
	  {
		  try {
			bt[i] = new JButton(str[i]);
			  bt[i].addActionListener(new MybuttonCalc());
			  pn.add(bt[i]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  fr.getContentPane().add(BorderLayout.CENTER,pn);
	  }
  
class MybuttonCalc implements ActionListener 
{
	public void actionPerformed(ActionEvent ev) {
		while(bt.length<10)
		{
			tx.setText("");
			tx.setText((String) ev.getSource());
			
		}
//		for (JButton i :bt)
//		{
//			
//		}
////		if(ev.getSource()==bt1|| ev.getSource()==bt2)
////		tx.setText("lsflklfsklfksdkfskl");
	}
	}

public static void main(String [] args)
{
	JavaCalci jv = new JavaCalci();
	jv.go();
	
}


}
