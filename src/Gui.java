import javax.swing.JOptionPane;

public class Gui {

	public static void main(String[] args) {
		
		String name =JOptionPane.showInputDialog("What is ur name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
	}

}
