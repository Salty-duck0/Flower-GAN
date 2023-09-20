package main;

public class App {
	private Panel panel;
	private Frame frame;
	private sidePanel d;
	public App() {
		d = new sidePanel();
		panel = new Panel(d);
		frame = new Frame(panel);
	}
}
