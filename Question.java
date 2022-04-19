/**
   A question with a text and an answer.
*/
public class Question
{
    private String text, answer;

    public Question()
        {
        text = "";
        answer = "";
        }

    public void setText(String questionText)
        {
        text = questionText;
        }

    public void setAnswer(String correctResponse)
        {
        answer = correctResponse;
        }

    public boolean checkAnswer(String response)
        {
        return response.equalsIgnoreCase(answer);
        }

    public void display()
        {
        System.out.println(text);
        }

    public void presentQuestion()
    {
        this.display();
        System.out.println("Your Answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(this.checkAnswer(response));
   `}

}
