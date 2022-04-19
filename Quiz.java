import java.util.ArrayList;

public class Quiz {

	ArrayList<Question> quiz = new ArrayList<>();

	Question quest = new Question();
	quest.setText("Who was the inventor of Java?");
	quest.setAnswer("James Gosling");

	ChoiceQuestion choquest = new ChoiceQuestion();
	choquest.setText("What was the original name of the Java language?");
	choquest.setAnswer("Oak");

	AnyCorrectChoiceQuestion anychoquest = new AnyCorrectChoiceQuestion();
	anychoquest.setText("What countries are in Africa?");
	anychoquest.setAnswer("Ghana");

	MultiChoiceQuestion multichoquest = new MultiChoiceQuestion();
	multichoquest.setText("What countries are in Africa?");
	multichoquest.setAnswer("Ghana");
	multichoquest.setAnswer("Egypt");

	boolean c = false; 
	for (int i = 0; i < quiz.size(); i++) {
		c = response..equals(answers.get(i));
		if (c) {
			return c;
		}
	}
	return c;
}