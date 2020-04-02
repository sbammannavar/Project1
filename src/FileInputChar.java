import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream	input = null;
		FileOutputStream  output = null;
		
		try
		{
			input = new FileInputStream("C:\\Users\\sbammannavar\\Documents\\JAVA Training\\Input files\\byte_input.txt");
			output = new FileOutputStream("C:\\Users\\sbammannavar\\Documents\\JAVA Training\\Input files\\byte_output.txt");
		  
			int character;
			
			while ((character = input.read()) != -1){
				output.write(character);
				}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			if (input != null)
				input.close();
			if (output != null)
				output.close();
				
		}
	}

}
