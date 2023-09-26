package encapsulation;

public class Encapsulation_1 {

	private int number;
	private String word;
	private int dig= 12;
	private static int dig1=14;
	
	public int getdig() {
		return dig;
	}
	public int getdig1() {
		return dig1;
	}

		public int getnumber() {
			return number;
		}
		
		public String getword() {
			return word;
		}

		public void setdig(int dig) {
			this.dig=dig;
		}
		public void setdig1(int dig1) {
			this.dig1=dig1;
		}
		public void setnumber(int inputNumber) {
			number=inputNumber;
		}

		public void setword(String inputWord) {
			word=inputWord;
		}
	

}
