import javax.swing.JOptionPane;

public class Gui {

	public static void main(String[] args) {
		
		String name =JOptionPane.showInputDialog("What is ur name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is ur age"));
		JOptionPane.showMessageDialog(null, "Your age is "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is ur height"));
		JOptionPane.showMessageDialog(null, "Your age is "+height);
	}

}
