import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;

class Resturant
{
  JFrame frm = null;
  JLabel customerName = null;
  JLabel customerAdd = null;
  JLabel customerPh = null;
  JPanel p = null;
  
  JButton order  = null;
  JButton cancel = null;
  JComboBox region = null;
  JTextField namef = null;
  JTextField addf = null;
  JTextField phonef = null;
  
  void components()
  {
	  
	  frm = new JFrame("Sky Resturant");
	  frm.setSize(600,500);
	  frm.setLocationRelativeTo(null);
	  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frm.setVisible(true);
	  p = new JPanel();
	  p.setLayout(null);
	  
	  
	  customerName = new JLabel("Customer Name:");
	  customerName.setBounds(20,30,100,100);
	  customerAdd = new JLabel("Customer Address:");
	  customerAdd.setBounds(20,70,120,100);
	  customerPh = new JLabel("Customer Ph:");
	  customerPh.setBounds(20,110,120,100);
	  
	 //
	 namef = new JTextField();
	 namef.setBounds(140,63,200,30);
	 addf = new JTextField();
	 addf.setBounds(140,107,200,30);
	 phonef = new JTextField();
	 phonef.setBounds(140,147,200,30);
	 //
	 order = new JButton("Order");
	 order.setBounds(450,400,90,30);
	 
	 cancel = new JButton("Canel");
	 cancel.setBounds(310,400,90,30);
	 //
	 
	 
	 
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  p.add(customerName);
	  p.add(customerAdd);
	  p.add(customerPh);
	  p.add(namef);
	  p.add(addf);
	  p.add(phonef);
	  p.add(order);
	  p.add(cancel);
	  p.add(region);
	  frm.add(p);
	  frm.setLayout(null);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}