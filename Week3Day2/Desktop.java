package Week3Day2;

public class Desktop implements HardWare,Software {

	

public void hardwareResources() {
		System.out.println("The Hardware is Dell Window 7");
	}
	

public void softwareResources() {
		System.out.println("The SW is 1TB");	
			}
public void desktopModel() {
	System.out.println("The desktopModel is Dell");	
		}
	
public static void main(String[] args) {
	Desktop resource = new Desktop();
	resource.hardwareResources();
	resource.softwareResources();
	resource.desktopModel();
				

			}
}
