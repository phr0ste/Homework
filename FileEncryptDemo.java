import java.io.IOException;

public class FileEncryptDemo {

	public static void main(String[] args) throws IOException {
		
		String txtFile = "MyLetters.txt";
		String enFile = "Encrypted.txt";
		
		FileEncrypt.EncryptFile(txtFile, enFile);

	}

}
