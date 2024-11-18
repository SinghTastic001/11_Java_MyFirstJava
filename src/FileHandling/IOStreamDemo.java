package FileHandling;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("io.txt");
		
//		file.createNewFile();
//		DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
//		os.writeInt(1234);
//		os.flush();
//		os.close();
//		
//		
		FileOutputStream os = new FileOutputStream(file);
		String data = "SHubhi singh";
		os.write(data.getBytes());
		os.close();
//	}

//}
		
		FileInputStream is = new FileInputStream(file);
		int fileData;
		while((fileData=is.read())!=-1){
			System.out.println((char)fileData);
		}
		is.close();
	
	}
}
	