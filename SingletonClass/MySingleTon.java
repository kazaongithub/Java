
public class MySingleTon {

	private static MySingleTon myObj;

	/**
 	 * Create private constrcutor
 	 */
	private MySingleTon() {
	}

	/**
 	 * Create a static method to get instance.
 	 */
	public static MySingleTon getInstance() {
		if(myObj == null) {
			myObj = new MySingleTon();
		}

		return myObj;
	}

	public void getSomeThing() {
		System.out.println("I am here ....");
	}

	public static void main(String a[]) {
		MySingleTon st = MySingleTon.getInstance();
		st.getSomeThing();
	}
}  
