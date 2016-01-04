public class MineSweeper22 {
	public static void main(String[] args) {
		MineSweeper22 x = new MineSweeper22();
	}

	MineSweeper22() {

	}

	void speak(String words) {

		try {

			Runtime.getRuntime().exec("say " + words).waitFor();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
