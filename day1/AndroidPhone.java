package week3.day1;

public class AndroidPhone extends SmartPhone {
	public void takevideo() {
		System.out.println("video");
	}
	public static void main(String[] args) {
		AndroidPhone  Aphone= new AndroidPhone ();
		SmartPhone Sphone = new SmartPhone ();
	    Aphone.sentMsg();
	    Aphone.accesswhatsapp();
	    Aphone.makeCall();
	    Aphone.saveContact();
	    Aphone.takevideo();

}}

