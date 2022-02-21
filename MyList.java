import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollPane;

class MyList
{
	public static void main(String[] entech)
	{
		String[] country = {"Afg","iran","Arabic","US","UK","Pak"};
		JList<String> list = new JList<>(country);
		
		
		
		JPanel pnl = new JPanel();
		pnl.add(list);
		
		JFrame frm = new JFrame("En-Tech");
		frm.add(pnl);
		frm.setSize(300,300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setResizable(false);
		frm.setVisible(true);
	}
}