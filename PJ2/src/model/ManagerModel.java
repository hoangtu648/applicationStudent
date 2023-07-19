package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Manager;

public class ManagerModel {
	public static void main(String[] args) {
		String content = "4,2,1,p01,10-2-2023";
		System.out.println(createManager(content));
	}
	public static List<Manager> findAll(){
		//4,2,1,p01,10-2-2023
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		List<Manager> managers = new ArrayList<Manager>();
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/manager.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				try {
					managers.add(new Manager(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2])
							, values[3], dateFormat.parse(values[4])));
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
		
		return managers;
	}
	public static boolean createManager(String content) {
		boolean result = true;
		String oldContent = "";
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/manager.csv"));
			for(String strings : files) {
				oldContent += strings + "\n";
			}
			String newContent = oldContent + content;
			Files.write(Paths.get("src/demoData/manager.csv"), newContent.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	public List<Manager> findManagerByStudent(int id) {
		List<Manager> managerList = new ArrayList<>();
		for (Manager managers : findAll()) {
			if(managers.getMasv() == id) {
				managerList.add(managers);
			}
		}
		return managerList;
	}
	public List<Manager> findManagerByCourse(int id) {
		List<Manager> managerList = new ArrayList<>();
		for (Manager managers : findAll()) {
			if(managers.getMakh() == id) {
				managerList.add(managers);
			}
		}
		return managerList;
	}
	public Manager findManager(int id) {
		Manager manager = null;
		for (Manager managers : findAll()) {
			if(managers.getMakh() == id) {
				manager = managers;
			}
		}
		return manager;
	}
	
}
