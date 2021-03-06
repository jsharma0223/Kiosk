package GUI.adddeletespec;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;



/**
 *
 * @author Spconway 4/26/2014
 */
public class AddDeleteSpecFrame extends JFrame{
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 500;
    private SubmitorDelete submitPanel;
    private InfoPanel infoPanel;
    private ListPanel listPanel;
    
    public AddDeleteSpecFrame(){
        //Window title
        setTitle("Add/Delete User");
        //Set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Build the main frame and add components
        buildMainFrame();
        //Set location
        setLocationRelativeTo(null);
        //Set visible
        setVisible(true);
        //Block resizing
        setResizable(false);
    }
    
    private void buildMainFrame(){
        submitPanel = new SubmitorDelete();
        infoPanel = new InfoPanel();
        listPanel = new ListPanel();
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        setLayout(new BorderLayout());
        
        add(listPanel, BorderLayout.WEST);
        add(infoPanel, BorderLayout.EAST);
        add(submitPanel, BorderLayout.SOUTH);
    }
    
    //LISTENERS???
    private class submitOrDeleteListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    }
}
