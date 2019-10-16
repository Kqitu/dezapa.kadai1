

class renban {
	private static renban Renban = new renban();
	private int num=0;
	private renban() {}

	public static renban getInstance() {
		return Renban;
	}
	public String getNumber() {
		num +=1;
		return String.format("%04d",num);
	}
}

public class Test{
	public static void main(String args[]) {
		renban R1=renban.getInstance();
		renban R2=renban.getInstance();

		System.out.println(R1.getNumber());
		System.out.println(R2.getNumber());
		System.out.println(R1.getNumber());
	}
}