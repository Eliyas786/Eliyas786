import javax.swing.*;

import java.awt.*;

class NewList
{
	JFrame f = null;
	 
	
	JLabel cusName = null;
	
	JLabel custAdd = null;
	JLabel cusPh = null;
	JTextField cnf = null;
	JTextField caf = null;
	JTextField cpf = null;
	JLabel paymthd = null;
	JLabel drniks = null;
	JButton order = null;
	JCheckBox cocabox = null;
	JCheckBox Doughbox = null;
	JCheckBox Energybox = null;
	
	
	
	void Frame()
	{
	//Frame
	f = new JFrame("EATS");
    f.setSize(600,500);
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 JPanel pnl = new JPanel();
	
	
	//customer name label
	cusName = new JLabel("Customer Name:");
	cusName.setBounds(20,20,150,100);
	// cusAddLabel
	custAdd = new JLabel("Customer Address:");
	custAdd.setBounds(20,80,150,100);
	// customer Phone
	cusPh = new JLabel("Customer Phone:");
    cusPh.setBounds(20,140,150,100);	
	// payment method radio buttons
	paymthd = new JLabel("Payment method:");
	paymthd.setBounds(20,200,150,100);
	// combobox of drinks choices
	drniks = new JLabel("Drinks:");
	drniks.setBounds(20,240,150,100);
	// check box
	cocabox = new JCheckBox("Coca");
	cocabox.setBounds(140,240,150,100);
	
	Doughbox = new JCheckBox("Dough");
	Doughbox.setBounds(180,240,150,100);
	
	Energybox = new JCheckBox("Energy");
	Energybox.setBounds(240,240,250,120);
	
	
	
	order = new JButton("Order");
	order.setBounds(200,2000,120,30);
	
	
	
	// Text Fields
	cnf = new JTextField();
	cnf.setBounds(170,55,250,30);
	caf = new JTextField();
	caf.setBounds(170,112,250,30);
	cpf = new JTextField();
	cpf.setBounds(170,173,250,30);
	// Payment methods
   JRadioButton [] btn = new JRadioButton[3];
	btn[0] = new JRadioButton("Cash");
	btn[1] = new JRadioButton("C");
	btn[2] = new JRadioButton("Cash");
	
	ButtonGroup g = new ButtonGroup();
	for (JRadioButton opt: btn)
	{
		g.add(opt);
		pnl.add(opt);
	}

		
	//
	
	JPanel pan = new JPanel();
	pan.add(order);
	
	pan.setLayout(null);
	f.add(pan);
	pan.setBounds(200,400,200,200);
	
	pnl.setLayout(null);
	pnl.add(cusName);
	pnl.add(custAdd);
	pnl.add(cusPh);
	pnl.add(cnf);
	pnl.add(caf);
	pnl.add(cpf);
	pnl.add(paymthd);
	pnl.add(order);
	pan.add(Doughbox);
	pan.add(Energybox);
	pan.add(drniks);
	pan.add(cocabox);
	
	
	f.add(pnl);
	
	
	
	
	
	f.setVisible(true);
	
	
	}




}






