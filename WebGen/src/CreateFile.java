import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		try {
			String content = "<!DOCTYPE HTML><html><head><meta charset=\"utf-8\"><title>Motivation website</title><link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\"></head><body></body></html>";
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a project name  :");
			String str = sc.nextLine();	
			File dir1 = new File("/home/rezguino/"+str);
			dir1.mkdirs();
			File file1 = new File("/home/rezguino/"+str+"/index.html");
			File dir2 = new File("/home/rezguino/"+str+"/style");
			dir2.mkdirs();
			File dir3 = new File("/home/rezguino/"+str+"/images");
			dir3.mkdirs();
			File file2 = new File("/home/rezguino/"+str+"/style/style.css");

			if (file1.createNewFile() && file2.createNewFile()) {
				System.out.println("File is created!");
				FileWriter fw = new FileWriter(file1.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(content);
				bw.close();

			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}