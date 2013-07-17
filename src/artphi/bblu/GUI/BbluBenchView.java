package artphi.bblu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import artphi.bblu.data.Roster;

public class BbluBenchView extends JPanel implements ActionListener {
	
	Roster roster;
	
	public BbluBenchView(Roster roster){
		this.roster = roster;
		DefaultTableModel tm = new DefaultTableModel(new String[] {"Player Name"}, 0);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
