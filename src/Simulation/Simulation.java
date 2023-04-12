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
import java.util.Random;

public class Simulation {
	
	private int [][] performanceTable;
	private ArrayList<Training> trainingList = new ArrayList<Training>();
	
	public Simulation(int a, int b) {
		performanceTable = new int [a][b];
	}

	public int[][] getPerformanceTable() {
		return performanceTable;
	}

	public void setPerformanceTable(int[][] performanceTable) {
		this.performanceTable = performanceTable;
	}

	public ArrayList<Training> getTrainingList() {
		return trainingList;
	}

	public void setTrainingList(ArrayList<Training> trainingList) {
		this.trainingList = trainingList;
	}

	public void appendTraining(Training trn) {
		trainingList.add(trn);
	}
	
	public void simulateTable() { 
				
		System.out.printf("%16s", "Name     |");
		
		Random random = new Random(1500);
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < performanceTable[i].length; j++) {
				System.out.printf("%6s|", trainingList.get(j).getTitleOfTraining());
			}
		}
		
		System.out.printf("%n%s", "-----------------------------------------------------------------------");

		for (int i = 0; i < performanceTable.length; i++) {
			System.out.printf("%n%13s  |", trainingList.get(1).getInternList().get(i));
			for (int j = 0; j < performanceTable[i].length ; j++ ) {
				int randomValue = random.nextInt(100-10)+10;
				performanceTable [i][j] = randomValue;
				System.out.printf("%4d  |", randomValue);
			}
		}	
	}
		
	public void showInternPerformance() {
		System.out.printf("%n%n%s", "------------------------ Intern Performance ------------------------");
		for (int i = 0; i < performanceTable.length; i++) {
			int internPerformance = 0;
			for (int j = 0; j < performanceTable[i].length; j++) {
				internPerformance += performanceTable[i][j];
			}
			double averagePerformance = internPerformance/trainingList.size();
			
			System.out.printf("%n%s%s%.1f", trainingList.get(1).getInternList().get(i), 
					" has the Average score of ", 
					averagePerformance);
		}	
	}
	
	public void showTrainingLevel() {
		System.out.printf("%n%n%s", "----------------------- Training Performance -----------------------");
		for (int i = 0; i < performanceTable[i].length; i++) {
			int internPerformance = 0;
			for (int j = 0; j < performanceTable.length; j++) {
				internPerformance += performanceTable[j][i];
			}
			
			double averagePerformance = internPerformance / performanceTable.length;
			
			if (averagePerformance < 65) {
				System.out.printf("%n%s%s is %.1f%s", "The average of ", 
						trainingList.get(i).getTitleOfTraining(), 
						averagePerformance, 
						", then, its level is below the thershold.");
			}
			
			else {
				System.out.printf("%n%s%s is %.1f%s", "The average of ", 
						trainingList.get(i).getTitleOfTraining(), 
						averagePerformance, 
						", then, its level is above the thershold.");
			}
		}
	}
	
	public void findMax() {
		System.out.printf("%n%n%s", "----------------------------------------------");
		int max = 0;
		String nameMax = "";
		String idMax = "";
		String trainingMax = "";
		String trainingIdMax = "";
		for (int i = 0; i < performanceTable.length; i++) {
			for (int j = 0; j < performanceTable[i].length; j++) {
				if (performanceTable[i][j] > max) {
					max = performanceTable[i][j];
					nameMax = trainingList.get(1).getInternList().get(i);
					idMax = trainingList.get(1).getInternList().get(i);
					trainingMax = trainingList.get(j).getTitleOfTraining();
					trainingIdMax = trainingList.get(j).getCodeOfTraining();
				}
			}
		}
		System.out.printf("%n%s %d%nIntern: %s, ID: %s%nTraining: %s, CODE: %s", "Maximum Performance:",
				max, nameMax, idMax, trainingMax, trainingIdMax);
		System.out.printf("%n%s", "----------------------------------------------");
	}
	
	public void updateTrainingPerformance (String trainingName, String internName, 
			int newPerformance) {
//		System.out.printf("%n%n%s", "----------------------------------------------");
		for (int i = 0; i < performanceTable.length; i++) {
//			System.out.println("between for1 and for2");
			for (int j = 0; j < performanceTable[i].length; j++) {
//				System.out.println("inside for2");
				if (trainingName == trainingList.get(j).getTitleOfTraining()) {
//					System.out.println("inside if1");
					if (internName == trainingList.get(1).getInternList().get(i)) {
						performanceTable[i][j] = newPerformance;
//						System.out.println("\n Updated performance: " + performanceTable[i][j]);
					}
				}
			}
		}
	}
}