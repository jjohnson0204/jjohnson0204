package finalProject;

public class QuizDemo {

	public static void main(String[] args) {

		//Creates a quiz class object
		Quiz quiz = new Quiz();
		System.out.println("Welcome to " + quiz.getName());
		  
		//Adding questions to the quiz
		String[] answers1 = {"Red","Green","Orange","Blue"};
		quiz.add("What is the color of tomato?",answers1,1);

		String[] answers2 = {"White Marsh","Towson","Anne Arundel","Baltimore"};
		quiz.add("What is the capital city of Maryland?",answers2,3, 5);
		  
		String[] answers3 = {"Oxygen","Carbon","Mercury","Nitrogen"};
		quiz.add("What is most common element found in the air?",answers3,1, 8);
		  
		String[] answers4 = {"Solamon","Hussein","Akem","Hassan"};
		quiz.add("What is Obamas' middle name?",answers4,2, 10);
		  
		String[] answers5 = {"North","South","West","East"};
		quiz.add("Where does sun rise?",answers5,4, 3);
		System.out.println("");  
		//Presents quiz and displaying results
		quiz.giveQuiz();

	  }
}


