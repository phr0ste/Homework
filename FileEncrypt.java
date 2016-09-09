import java.io.*;

public class FileEncrypt {

	private static boolean eof; // Boolean variable for reading end of file

	public static void EncryptFile(String fileName, String nFile) throws IOException {
		
		// Stream for the file to be read in.
		FileInputStream inFile = new FileInputStream(fileName);
		DataInputStream outFile = new DataInputStream(inFile);
		
		// Stream to output file
		FileOutputStream enFile = new FileOutputStream(nFile);
		DataOutputStream encFile = new DataOutputStream(enFile);
		
		// Read from the file
		while (!eof)
			{
			try {
					
				byte eData = outFile.readByte(); // Read bye from inFile
				
				eData +=20; // Add 20 to byte for encryption
				
				encFile.writeByte(eData);  // Write encrypted data to file
				
				
			}
			catch (EOFException e) {
				eof = true;
			}
		// Close the files
		} outFile.close();
		  encFile.close();
	}

}