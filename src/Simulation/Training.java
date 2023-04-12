/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Beyda Dur, 75881>
********************************************************************************/

package Simulation;

import java.util.ArrayList;

public class Training {

	private String titleOfTraining;
	private String codeOfTraining;
	private ArrayList<Intern> internListAll = new ArrayList<Intern>();
	
	public Training(String titleOfTraining, String codeOfTraining) {
		this.titleOfTraining = titleOfTraining;
		this.codeOfTraining = codeOfTraining;
	}

	public String getTitleOfTraining() {
		return titleOfTraining;
	}

	public void setTitleOfTraining(String titleOfTraining) {
		this.titleOfTraining = titleOfTraining;
	}

	public String getCodeOfTraining() {
		return codeOfTraining;
	}

	public void setCodeOfTraining(String codeOfTraining) {
		this.codeOfTraining = codeOfTraining;
	}
	
	public ArrayList<Intern> getInternListAll() {
		return internListAll;
	}

	public void setInternListAll(ArrayList<Intern> internListAll) {
		this.internListAll = internListAll;
	}

	public void appendIntern(Intern intern) {
		internListAll.add(intern);
	}

	public ArrayList<String> getInternList() {
		ArrayList<String> internList = new ArrayList<String>();
		
		for (int i = 0; i < internListAll.size(); i++) {
			internList.add(internListAll.get(i).getNameSurnameOfIntern());
		}
		return internList;
	}
	
}


