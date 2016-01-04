public class MineSweeper2 {
	public static void main(String[] args) {
		MineSweeper2 x = new MineSweeper2();
	}

	MineSweeper2() {

	}

	void speak(String words) {

		try {

			Runtime.getRuntime().exec("say " + words).waitFor();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
