import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.util.ArrayList;
public class JavaCalci  {
 String [] str = {"0","1","2","3","4","5","6","7","8","9","+","-","*","/","%","=","AC"};
 JFrame fr;
 JPanel pn;
 JTextField tx;
 JButton [] bt= new JButton[16];
 Double num1,num2,ans;
 int op;
 float g;
 
 public JavaCalci()
 {
	  fr= new JFrame("Calculator");
	  pn= new JPanel();
	  fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  fr.setSize(400, 400);
//	  fr.setBounds(3,3,400,400);
	  fr.setVisible(true);
	  tx = new JTextField(20);
	  fr.getContentPane().add(BorderLayout.NORTH,tx);
//	  fr.setResizable(false);
	  fr.setLocationRelativeTo(null);
 }
  public void go()
    {
	
//	  fr.pack();
	  
	  
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
//		while(bt.length<10)
//		{
//			tx.setText();
//			tx.setText((String) ev.getSource());
//			
//		}
		
		for (int i=0;i<10;i++)
		{
			if(ev.getSource()==bt[i])
			tx.setText(tx.getText()+i);
			
		}
		
		
		if(ev.getSource()==bt[10])
		{
			num1= Double.parseDouble(tx.getText());
			tx.setText("");
			 op= 1;
		}
		if(ev.getSource()==bt[15])
		{
			num2= Double.parseDouble(tx.getText());
			switch(op){
			case 1:
			 ans = num1 +num2;
			 tx.setText(""+ans);
		}
		}
//		for (int i=10;i<16;i++)
//		{
//			if(ev.getSource()==bt[i])
//				num1= tx.getText();
//			tx.setText("");
//			
//		}
		
	
	}
	}

public static void main(String [] args)
{
	JavaCalci jv = new JavaCalci();
	jv.go();
	
}


}
