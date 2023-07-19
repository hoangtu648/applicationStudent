package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.CourseObserver;
import entities.Student;

public class StudentModel implements CourseObserver{
	public static void main(String[] args) {
		System.out.println(updateStudent(6, "6,6,tranquoctrung,02/00/2023,Male,email6,phone6,address6,C:\\Users\\ACER\\Desktop\\ThanhTu.jpg"));
		
	}
	
	public static List<Student> findAll(){
		List<Student> students = new ArrayList<Student>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/student.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				try {
					students.add(new Student(Integer.parseInt(values[0]), Integer.parseInt(values[1]), values[2], 
							dateFormat.parse(values[3]), values[4], values[5], values[6], values[7], values[8]));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}
	public static boolean createNewStudent(String content) {
		boolean result = true;
		String oldContent = "";
		
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/student.csv"));
			for (String string : files) {
				oldContent += string + "\n";
			}
			String newContent = oldContent + content;
			Files.write(Paths.get("src/demoData/student.csv"), newContent.getBytes());
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result = false;
			
			e.printStackTrace();
		}
		return result;
	}
	public static boolean updateStudent(int AccID, String content) {
		boolean result = true;
		
		List<String> files;
		try {
			String first = "";
			String last = "";
			String newContent = "";
			files = Files.readAllLines(Paths.get("src/demoData/student.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				if(values[0].equalsIgnoreCase(String.valueOf(AccID))) {
					System.out.println(i);
					for (int j = 0; j < i; j++) {
						first += files.get(j) + "\n";
					}
					for (int k = i + 1; k < files.size(); k++) {
						last += files.get(k) + "\n";
					}
				}
				
				
			}
			newContent = first + content + "\n" + last;
			Files.write(Paths.get("src/demoData/student.csv"), newContent.getBytes());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	public Student checkStudent(int studentID) {
		Student student = null;
		for (Student students : findAll()) {
			if(students.getAccountID() == studentID) {
				student = students;
			}
		}
		return student;
	}
	public Student findStudentByName(String name) {
		Student student = null;
		for (Student students : findAll()) {
			if(students.getFullName().equals(name)) {
				student = students;
			}
		}
		return student;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		findAll();
	}
}
