package labBuildingApp;


	import javax.swing.JFrame;

	@SuppressWarnings("serial")
	public class LabBuildingApp extends JFrame {

		public static void main(String[] args) {
			new LabBuildingApp().run();
		}
		
		public void run() {
			setBounds(100, 10, 400, 500);
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    add(new LabBuilding());
		    setVisible(true);
		}

	}

