import javax.swing.JOptionPane;

public class InputBoxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f_name = JOptionPane.showInputDialog("First name");
		String l_name = JOptionPane.showInputDialog("Last name");

		String full_name = f_name +" "+ l_name;
		JOptionPane.showMessageDialog(null, full_name);
		System.exit(0);
	}

}
