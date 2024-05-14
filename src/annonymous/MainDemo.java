package annonymous;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting aditya = new Greeting();
		aditya.english();
				
		Greeting gr = new Greeting() {
			public void english() {
				System.out.println("Namaste");
			}
		};
		gr.english();
		gr.english();
		gr.english();
		
		aditya.english();
		
		
		
	}

}
