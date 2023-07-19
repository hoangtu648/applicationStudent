package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Account;

public class AccountModel {
	public static void main(String[] args) {
		System.out.println(findAll().get(findAll().size() - 1).getUserID() + 1);
	}
	public static List<Account> findAll(){
		List<Account> accounts = new ArrayList<Account>();
		try {
			List<String> files =  Files.readAllLines(Paths.get("src/demoData/user.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				//values[0] = userID
				try {
					accounts.add(new Account(Integer.parseInt(values[0]), values[1], values[2], values[3], 
							values[5], values[6], Integer.parseInt(values[7])));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}
	public static boolean createNewAccount(String content) {
		boolean result = true;
		String oldContent = "";
		
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/user.csv"));
			for (String string : files) {
				oldContent += string + "\n";
			}
			String newContent = oldContent + content;
			Files.write(Paths.get("src/demoData/user.csv"), newContent.getBytes());
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result = false;
			
			e.printStackTrace();
		}
		return result;
	}
	
	public static Account checkUsername(String username) {
		Account account = null;
		for (Account accounts : findAll()) {
			if(accounts.getUserName().equalsIgnoreCase(username)) {
				account = accounts;
			} 
		}
		
		return account;
		
	}
	public boolean checkLogin(String username, String password) {
		boolean result = false;
		if(checkUsername(username) != null) {
			if(checkUsername(username).getPassword().equalsIgnoreCase(password)) {
				result = true;
			} 
		}
		return result;
	}
	public static Account checkName(String name) {
		Account account = null;
		for (Account accounts : findAll()) {
			if(accounts.getFullName().equalsIgnoreCase(name)) {
				account = accounts;
			} 
		}
		
		return account;
		
	}
}
