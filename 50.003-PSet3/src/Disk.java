public class Disk {
	private int x;
	private int y;

	Disk(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void manipulate () {
		int threshold = 1000;
		
		while ((threshold - (x + y)) > 0) {
			//System.out.println("staement 1");
			if (x > 5) {
				//for debugging
				//System.out.println("statement2");
				threshold = threshold - 1;
			}
			else if (y <= 12) {
				//System.out.println("statement3");

				threshold = threshold - 2;
			}
			if (x <= 1000) {
				//System.out.println("statement4");

				threshold = threshold - 3;
			}
			else if (y < 1) {
				
				//System.out.println("statement5");

				threshold = threshold + 1;
			}
		}
		//System.out.println("terminating");
	}
}
