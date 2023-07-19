/*
* Le Chi Truong
*@author  Admin
*@{date} May 18, 2023
*@version 1.0
*/
package Controller;

import entities.Score;
import model.ScoreModelInterface;
import teacher.JFrameViewList;

public class ScoreController implements ControllerScoreInterface {
	private ScoreModelInterface model;
	private JFrameViewList view;

	public ScoreController(ScoreModelInterface model) {
		super();
		this.model = model;
		view = new JFrameViewList(this, model);
	}

	@Override
	public String updateRank(Score score) { // controller se goi lai ham tu model
		// TODO Auto-generated method stub
		return model.rank(score);
	}

	@Override
	public String updateRank2(Score score) {
		// TODO Auto-generated method stub
		return model.rank2(score);
	}

	
}
