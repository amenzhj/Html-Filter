import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.jsoup.Jsoup;

public class HTMLtoTEXT2 {
	
	File selectedFile;
	String textOfFile;
	String[] texts=new String[101];//storage of 101 html's text result.
	String path="D:/100 given pages";
	File file=new File(path);
	File[] tempList = file.listFiles();
	
	public void HTMLtoTEXT2() throws IOException{
	for (int i = 0; i < tempList.length; i++) {
		selectedFile=tempList[i];
		org.jsoup.nodes.Document doc = Jsoup.parse(selectedFile,"UTF-8");
		textOfFile = doc.text();
		texts[i]=textOfFile;
//		System.out.println(textOfFile);
		PrintWriter out = new PrintWriter("D:/101result/"+tempList[i].getName().substring(0,tempList[i].getName().lastIndexOf("."))+".txt");//write every html's result to a text
		out.println(textOfFile);
		out.close();
		}
	}

	public static void main(String[] args) throws IOException{
		HTMLtoTEXT2 x=new HTMLtoTEXT2();
		x.HTMLtoTEXT2();
	}
}