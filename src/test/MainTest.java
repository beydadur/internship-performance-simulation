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

package test;

import Simulation.*;


public class MainTest {

	public static void main(String[] args) {
		
		/* TODO 1: create seven Intern objects with the names surnames:
		Eda Yilmaz, Ali Korkmaz, Burak Hasan, Can Kuyucu, Ege Argun,
		Burcu Celebi, and Seyma Ece
		
		While creating the objects, you should demonstrate the use all the constructors that are defined in the Intern class. 
		*/
		Intern i1 = new Intern("Eda Yilmaz", "1111");
		Intern i2 = new Intern("Ali Korkmaz", "2222");
		Intern i3 = new Intern("Burak Hasan", "3333");
		Intern i4 = new Intern("Can Kuyucu", "4444");
		Intern i5 = new Intern("Ege Argun", "5555");
		Intern i6 = new Intern("Burcu Celebi");
		i6.setIdOfIntern("6666");
		Intern i7 = new Intern();
		i7.setNameSurnameOfIntern("Seyma Ece");
		i7.setIdOfIntern("7777");
		
		
		/*
		 * TODO 2: create five objects of type Training class, named as Math, Java, Python, ML, and DS
		 * */
		Training t1 = new Training("Math", "111");
		Training t2 = new Training("Java", "222");
		Training t3 = new Training("Python", "333");
		Training t4 = new Training("ML", "444");
		Training t5 = new Training("DS", "555");

		
		/*
		 * TODO 3: add all the interns to all the trainings
		 * */
		t1.appendIntern(i1);
		t2.appendIntern(i1);
		t3.appendIntern(i1);
		t3.appendIntern(i1);
		t4.appendIntern(i1);
		t5.appendIntern(i1);
		
		t1.appendIntern(i2);
		t2.appendIntern(i2);
		t3.appendIntern(i2);
		t3.appendIntern(i2);
		t4.appendIntern(i2);
		t5.appendIntern(i2);
		
		t1.appendIntern(i3);
		t2.appendIntern(i3);
		t3.appendIntern(i3);
		t3.appendIntern(i3);
		t4.appendIntern(i3);
		t5.appendIntern(i3);
		
		t1.appendIntern(i4);
		t2.appendIntern(i4);
		t3.appendIntern(i4);
		t3.appendIntern(i4);
		t4.appendIntern(i4);
		t5.appendIntern(i4);
		
		t1.appendIntern(i5);
		t2.appendIntern(i5);
		t3.appendIntern(i5);
		t3.appendIntern(i5);
		t4.appendIntern(i5);
		t5.appendIntern(i5);
		
		t1.appendIntern(i6);
		t2.appendIntern(i6);
		t3.appendIntern(i6);
		t3.appendIntern(i6);
		t4.appendIntern(i6);
		t5.appendIntern(i6);
		
		t1.appendIntern(i7);
		t2.appendIntern(i7);
		t3.appendIntern(i7);
		t3.appendIntern(i7);
		t4.appendIntern(i7);
		t5.appendIntern(i7);

		/*
		 * TODO 4: create an object of Simulation class with the size of a x b, 
		 * where a is the number of interns (the number of rows) 
		 * and b is the number of trainings (the number of columns).
		 * */
		int a = t1.getInternList().size();

		int b = 5;
		
		Simulation s1 = new Simulation(a,b);
		
		/*
		 * TODO 5: Add all the trainings to the simulation object.
		 * */
		s1.appendTraining(t1);
		s1.appendTraining(t2);
		s1.appendTraining(t3);
		s1.appendTraining(t4);
		s1.appendTraining(t5);

		/*
		 * TODO 6: Call the simulateTable() method that fills in and displays the table.
		 * */
		s1.simulateTable();
		
		/*
		 * TODO 7: Call showInternPerformance() method that finds and displays the performance of interns as shown in the sample output.
		 * */
		s1.showInternPerformance();
		
		/*
		 * TODO 8: Call showTrainingLevel() that finds and displays the level of each training as shown in the sample output.
		 * */
		s1.showTrainingLevel();
		
		s1.findMax();
		
		s1.updateTrainingPerformance("Math", "Burcu Celebi", 92);
		s1.updateTrainingPerformance("ML", "Burak Hasan", 35);
		
		s1.showInternPerformance();
		s1.showTrainingLevel();

	}
}
