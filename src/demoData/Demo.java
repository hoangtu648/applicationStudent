package demoData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		int accountID = 6;
		
		/*
		 	1,1,le thanh tu,28/03/2003,Male,email1,phone1,address1,C:\Users\ACER\Documents\kc.png
			2,2,tranthanhvu,02/00/2023,Male,email2,phone2,address2,C:\Users\ACER\Desktop\ThanhTu.jpg
			6,6,tranquoctrung,02/00/2023,Male,email2,phone2,address2,C:\Users\ACER\Desktop\ThanhTu.jpg
			7,7,nguyenhoangtu,02/00/2023,Male,email2,phone2,address2,C:\Users\ACER\Desktop\ThanhTu.jpg
			8,8,ledinhvan,02/00/2023,Male,email2,phone2,address2,C:\Users\ACER\Desktop\ThanhTu.jpg 
		 */
		
		try {
			String first = "";
			String last = "";
			String content = "6,6,tranquoctrung,02/00/2023,Male,email6,phone6,address6,C:\\Users\\ACER\\Desktop\\ThanhTu.jpg \n";
			String newContent = "";
			List<String> files = Files.readAllLines(Paths.get("src/demoData/student.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				if(values[0].equals(String.valueOf(accountID))) {
					System.out.println(i);
					for (int j = 0; j < i; j++) {
						first += files.get(j) + "\n";
					}
					for (int k = i + 1; k < files.size(); k++) {
						last += files.get(k) + "\n";
					}
					
				}
				
				
			}
			newContent = first + content + last;
			System.out.println(newContent);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
