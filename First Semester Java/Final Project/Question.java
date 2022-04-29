package finalProject;

public class Question {

	//Class private member variables
	private String question;
	private String[] possibleAnswers;
	private int answerIndex;
	private int difficulty;
	  
	//Constructor
	public Question(String question, String[] possibleAnswers, int answerIndex, int difficulty) {
		if(answerIndex > 4 || answerIndex < 1) {
			throw new Error("The answer index must be a number between 1-4");
		}
		if(difficulty > 10 || difficulty < 1) {
			throw new Error("The difficulty must be a number between 1-10");
		}
		this.question = question;
		this.possibleAnswers = possibleAnswers;
		this.answerIndex = answerIndex;
		this.difficulty = difficulty;
	}
	  
	//Getters
	public String getQuestion() { return question; }
	public String[] getPossibleAnswers() { return possibleAnswers; }
	public int getAnswerIndex() { return answerIndex; }
	  
	//Setters
	public void setQuestion(String question) { this.question = question; }
	public void setPossibleAnswers(String[] possibleAnswers) { this.possibleAnswers = possibleAnswers; }
	public void setAnswerIndex(int answerIndex) { this.answerIndex = answerIndex; }

	@Override
	public String toString() {
		String result = question + " (difficulty:" + this.difficulty + ") \n";   
		for(int i = 0;i<4;i++){
			result += (i+1) + ". " + possibleAnswers[i] + "\n";
		}
		return result;
	}
}


