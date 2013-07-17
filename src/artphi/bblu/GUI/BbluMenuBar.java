package artphi.bblu.GUI;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class BbluMenuBar extends JMenuBar{
	// File menu
		
		public JMenuItem menuItemNew;
		public JMenuItem menuItemOpen;
		public JMenuItem menuItemSave;
		public JMenuItem menuItemSaveAs;
		public JMenuItem menuItemQuit;

		// Edit Menu


		// Help Menu
		public JMenuItem menuItemAbout;
		
		public BbluMenuBar(){
			//*****************
			// File - Mnemo F
			JMenu menuFile = new JMenu("File");
			menuFile.setMnemonic(KeyEvent.VK_F);
			add(menuFile);
			
			// File > New... - Mnemo N
			menuItemNew = new JMenuItem("New", KeyEvent.VK_N);
			// menuItemQuitter.addActionListener(menuListener);
			menuFile.add(menuItemNew);
			
			// File > Open... - Mnemo O
			menuItemOpen = new JMenuItem("Open...", KeyEvent.VK_O);
			// menuItemQuitter.addActionListener(menuListener);
			menuFile.add(menuItemOpen);
			
			// File > Save - Mnemo S
			menuItemSave = new JMenuItem("Save", KeyEvent.VK_S);
			// menuItemQuitter.addActionListener(menuListener);
			menuFile.add(menuItemSave);
			
			// File > Save As...
			menuItemSaveAs = new JMenuItem("Save As...");
			// menuItemQuitter.addActionListener(menuListener);
			menuFile.add(menuItemSaveAs);
			
			// File > Quit -Mnemo Q
			menuItemQuit = new JMenuItem("Quit", KeyEvent.VK_Q);
			// menuItemQuitter.addActionListener(menuListener);
			menuFile.add(menuItemQuit);
			
			//******************
			// Help - Menmo H
			JMenu menuHelp = new JMenu("?");
			menuHelp.setMnemonic(KeyEvent.VK_H);
			add(menuHelp);

			// Help > About... - Mnemo A
			menuItemAbout = new JMenuItem("About", KeyEvent.VK_A);
			// menuItemApropos.addActionListener(menuListener);
			menuHelp.add(menuItemAbout);
		}
}
