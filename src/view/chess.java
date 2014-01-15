package view;

import controller.GameController;
import controller.IGameController;
import org.apache.log4j.PropertyConfigurator;

public class chess {

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		IGameController controller =  GameController.getInstance();

		TUI tui = new TUI(controller);
	}

}
