package artphi.bblu;





import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import artphi.bblu.GUI.BbluMainView;
import artphi.bblu.GUI.BbluMenuBar;
import artphi.bblu.GUI.BbluRoasterInfo;
import artphi.bblu.GUI.BbluStatusBar;

@SuppressWarnings("serial")
public class BbluMain extends JFrame implements ActionListener{

	private boolean loaded;
	private boolean saved;
	private BbluMenuBar menuBar;
	private BbluStatusBar statusBar;
	
	private BbluMainView view;
	private BbluRoasterInfo roasterInfo;
	/**
	 * @param args
	 */
	public BbluMain(){
		
		//Menus Definitions
		menuBar = new BbluMenuBar();
		setJMenuBar(menuBar);
		menuBar.menuItemNew.addActionListener(this);
		menuBar.menuItemOpen.addActionListener(this);
		menuBar.menuItemSave.addActionListener(this);
		menuBar.menuItemSaveAs.addActionListener(this);
		menuBar.menuItemQuit.addActionListener(this);
		menuBar.menuItemAbout.addActionListener(this);
		
		//StatusBar
		
		statusBar = new BbluStatusBar();
		
		setTitle("Baseball Lineup");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setResizable(true);

		add(statusBar, BorderLayout.SOUTH);
		statusBar.setMessage("Statut");
		
		view = new BbluMainView();
		add(view, BorderLayout.CENTER);
		
		roasterInfo = new BbluRoasterInfo();
		add(roasterInfo, BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
	public static void main(String[] args) {
		try{
			BbluMain gui = new BbluMain();
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
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		switch (actionCommand) {
		case "Quit":

			System.exit(0);
			break;
		case "Open...":

			this.revalidate();
			break;
		case "Save":
			
			this.revalidate();
			break;
		case "Save As...":
			this.revalidate();
			break;
		case "About":
			String about = "Baseball Lineup v1.0\n" +
						   "\n" +
						   "Simple Baseball roaster lineup manager\n" +
						   "\n" +
						   "by:\n" +
						   "- Olivier Francillon"; 
			JOptionPane.showMessageDialog(this, about);
			break;

		}
		
	}
	
	public boolean isLoaded(){
		return loaded;
	}
	

}
