import java.io.FileWriter;
import java.io.IOException;


public class FileTranss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fr = new FileWriter("txtfile.txt");
	fr.write("hello file");
	fr.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
