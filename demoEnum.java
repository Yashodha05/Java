package Week12;
enum Signal{
	RED, YELLOW, GREEN
}
class checkSignal
{
	Signal currentsignal;
	public checkSignal (Signal cs) {
		this.currentsignal=cs;
	}
	public void makeRIde()
	{
		switch (currentsignal) {
			case RED:
				System.out.println("The signal is Red.\nKindly wait until it turns to Green.");
				break;
			case YELLOW:
				System.out.println("The signal is Yellow.\nKindly wait look around and make safe move");
				break;
			case GREEN:
				System.out.println("The signal is Green.\nHave safe ride");
				break;
		}
	}
}
public class demoEnum {
	public static void main(String args[]) {
		checkSignal myDrive= new checkSignal(Signal.YELLOW);
		myDrive.makeRIde();	
	}
}

