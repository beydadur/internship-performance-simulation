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

public class Intern {
	
	private String nameSurnameOfIntern;
	private String idOfIntern;
	
	public Intern(String nameSurnameOfIntern, String idOfIntern) {
		this.nameSurnameOfIntern = nameSurnameOfIntern;
		this.idOfIntern = idOfIntern;
	}
	
	public Intern(String nameSurnameOfIntern) {
		this.nameSurnameOfIntern = nameSurnameOfIntern;
	}
	
	public Intern() {
	}
	
	public String getNameSurnameOfIntern() {
		return nameSurnameOfIntern;
	}

	public void setNameSurnameOfIntern(String nameSurnameOfIntern) {
		this.nameSurnameOfIntern = nameSurnameOfIntern;
	}

	public String getIdOfIntern() {
		return idOfIntern;
	}

	public void setIdOfIntern(String idOfIntern) {
		this.idOfIntern = idOfIntern;
	}


}