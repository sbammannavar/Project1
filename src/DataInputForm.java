
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputForm {

	static final String dataFile = "totalfile.txt";

	static final double[] prices = { 19.88, 9.99, 24.99, 29.99, 4.99 };
	static final int[] units = { 12, 5, 10, 11, 8 };
	static final String[] descs = { "Java T Shirts", "Java Jockets", "Java Trousers", "Java Shorts", "Java Pants" };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));

		for (int i = 0; i < prices.length; i++) {
			out.writeDouble(prices[i]);
			out.writeInt(units[i]);
			out.writeUTF(descs[i]);
		}

		out.close();

		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));

		double price;
		int unit;
		String desc;
		double total = 0.0;

		try {
			//while (prices.length < 5) {
			for (int i = 0; i < prices.length; i++) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d"+"\t"+ " units of %s at"+"\t"+" $%.2f%n", unit, desc, price);
				total += unit * price;
			}

		} catch (EOFException e) {
		}
		System.out.format("---- Total ordered value is $%.2f -----%n", total);
		in.close();
	}
}
