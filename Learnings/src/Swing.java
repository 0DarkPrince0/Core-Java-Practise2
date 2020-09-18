import javax.swing.JOptionPane;
public class Swing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name=JOptionPane.showInputDialog("Enter First Name");
		String last_name=JOptionPane.showInputDialog("Enter Second Name");
		String full_name;
		full_name=first_name+" "+last_name;
		JOptionPane.showMessageDialog(null,full_name);
		System.exit(0);
	}

}
