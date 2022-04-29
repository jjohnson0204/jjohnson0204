package finalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

	// declaration of variables
	private String name;
	private int capacity = 5;
	private ArrayList<Question> questions = new ArrayList<Question>();
	private int totalPoints = 0;
	  
	// constructor Quiz
	public Quiz() {
		this.name = "Quiz" + ((new Random()).nextInt(999 - 100 + 1)+100); // sets the quiz method with name having random 3 digit number
		this.totalPoints = 0; // start before quiz
	}
	  
	// to display quiz name
	public String getName() { return name; }
	  
	// to add a question
	public void add(String question, String[] possibleAnswers, int answerIndex, int difficulty){ // the question, array of answers, 1-4, 1-10
		if(capacity < this.questions.size() + 1 ) { capacity++; }
		this.questions.add(new Question(question, possibleAnswers, answerIndex, difficulty));
		totalPoints++;
	}
	public void add(String question, String[] possibleAnswers, int answerIndex) {
		this.add(question, possibleAnswers, answerIndex, 1);
	}
	//giveQuiz
	public void giveQuiz(){
		Scanner scan = new Scanner(System.in);
		int score = 0;
		List<Question> qs = this.questions;
		Collections.shuffle(qs);
		for(int i = 0; i<qs.size(); i++){
			System.out.println("\n" + (i+1) + ": " + qs.get(i));
			System.out.print("Enter the option number of your answer: ");
			int answer = scan.nextInt();
			int correct = qs.get(i).getAnswerIndex();
			if(answer == correct)
			score++;
		}
		double finalScore = score/(double)totalPoints;
		System.out.printf("Your score is %.2f\n",finalScore*100);
		scan.close();
	}
}
