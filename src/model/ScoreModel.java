package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import entities.Score;
import entities.Student;

public class ScoreModel implements ScoreModelInterface {
	public static void main(String[] args) {
		/*
		 * 1,1,9,8,10,A,07-04-2023 2,1,8,7,6,B,07-04-2023 3,3,6,5,4,C,07-04-2023
		 * 1,2,9,8,10,A,07-04-2003
		 */

		System.out.println(updateScore(1, 1, "2,2,2,4,3,D,07-04-2003"));
	}

	public static List<Score> findAll() {
		List<Score> scores = new ArrayList<Score>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/score.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				try {
					scores.add(new Score(Integer.parseInt(values[0]), Integer.parseInt(values[1]),
							Double.parseDouble(values[2]), Double.parseDouble(values[3]), Double.parseDouble(values[4]),
							values[5], dateFormat.parse(values[6])));
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

		return scores;
	}

	public Score findScoreST(int id, int courseId) {
		Score score = null;
		for (Score scores : findAll()) {
			if (scores.getMssv() == id && scores.getCourseID() == courseId) {
				score = scores;
			}
		}
		return score;
	}

	public static boolean updateScore(int mssv, int courseID, String content) {

		boolean result = true;

		List<String> files;
		try {
			String first = "";
			String last = "";
			String newContent = "";
			files = Files.readAllLines(Paths.get("src/demoData/score.csv"));
			for (int i = 0; i < files.size(); i++) {
				String[] values = files.get(i).split(",");
				if (values[0].equalsIgnoreCase(String.valueOf(mssv))
						&& values[1].equalsIgnoreCase(String.valueOf(courseID))) {

					for (int j = 0; j < i; j++) {
						first += files.get(j) + "\n";
					}
					for (int k = i + 1; k < files.size(); k++) {
						last += files.get(k) + "\n";
					}
				}

			}
			newContent = first + last + content;

			Files.write(Paths.get("src/demoData/score.csv"), newContent.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;

	}
	public String rank(Score score) {
		String rank = "";
		double avg = (score.getDiemquatrinh() + score.getDiemgiuaki() + score.getDiemcuoiki())/3 ;
		if(avg >= 8) {
			rank = "A";            
		} else if(avg >= 6.5) {
			rank = "B";
		} else if(avg >= 5){
			rank = "C";
		} else {
			rank = "D";
		}
		return rank;
	}
	public String rank2(Score score) {
		String rank = "";
		double avg = score.getDiemquatrinh()*0.1 + score.getDiemgiuaki()*0.3 + score.getDiemcuoiki()*0.6 ;
		if(avg >= 8) {
			rank = "A";            
		} else if(avg >= 6.5) {
			rank = "B";
		} else if(avg >= 5){
			rank = "C";
		} else {
			rank = "D";
		}
		return rank;
	}
	
	public static boolean createNewScore(String content) {
		boolean result = true;
		String oldContent = "";

		try {
			List<String> files = Files.readAllLines(Paths.get("src/demoData/score.csv"));
			for (String string : files) {
				oldContent += string + "\n";
			}
			String newContent = oldContent + content;
			Files.write(Paths.get("src/demoData/score.csv"), newContent.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			result = false;

			e.printStackTrace();
		}
		return result;
	}

}
