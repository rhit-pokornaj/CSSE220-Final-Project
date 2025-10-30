package finalvers1;

	import java.awt.BorderLayout;
	import javax.swing.JPanel;

	/**
	 * Controller class for the game.
	 * Handles user input (buttons + keys) and controls the main Timer loop.
	 */

	public class GamePanel extends JPanel {
		
		private final GameComponent canvas = new GameComponent();
	    
	    /**
	     * Constructs the main game panel with controls and keyboard support.
	     */
	    
	    public GamePanel() {
	    	this.setLayout(new BorderLayout(8, 8));
	        this.add(canvas, BorderLayout.CENTER);
	        this.setBackground(canvas.BG);
	    	
	    }
	

}
