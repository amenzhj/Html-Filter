import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.jsoup.Jsoup;

public class HTMLtoTEXT {
	
	File selectedFile;
	String textOfFile;
	
	public File getFile(String file) throws IOException{
		
		selectedFile=new File(file);
		return selectedFile;
	}
	
	public String fileToText() throws IOException{
		org.jsoup.nodes.Document doc = Jsoup.parse(selectedFile,"UTF-8");
		textOfFile = doc.text();
//		System.out.println(textOfFile);
		PrintWriter out = new PrintWriter("D:/Google.txt");
		out.println(textOfFile);
		out.close();
		return textOfFile;
	}

	public static void main(String[] args)throws IOException{
		HTMLtoTEXT htt=new HTMLtoTEXT();
		Scanner scan=new Scanner(System.in);
		String reader=scan.nextLine();
		htt.getFile(reader);
		System.out.println(htt.fileToText());
		
	}
}