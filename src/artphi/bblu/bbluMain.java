package artphi.bblu;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import artphi.bblu.GUI.bbluMenuBar;

@SuppressWarnings("serial")
public class bbluMain extends JFrame implements ActionListener{

	private bbluMenuBar menuBar;
	/**
	 * @param args
	 */
	public bbluMain(){
		menuBar = new bbluMenuBar();
		setJMenuBar(menuBar);
		menuBar.menuItemNew.addActionListener(this);
		menuBar.menuItemOpen.addActionListener(this);
		menuBar.menuItemSave.addActionListener(this);
		menuBar.menuItemSaveAs.addActionListener(this);
		menuBar.menuItemQuit.addActionListener(this);
		menuBar.menuItemAbout.addActionListener(this);
	}
	public static void main(String[] args) {
		try{
			bbluMain gui = new bbluMain();
			gui.setVisible(true);
		} catch (Exception e) {
			JOptionPane
					.showMessageDialog(
							null,
							"Le programme a rencontrée une erreur importante. Veuillez contacter le support. "
									+ "Message éventuel : "
									+ e.getMessage()
									+ " " + e.getLocalizedMessage());
			System.exit(-1);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
