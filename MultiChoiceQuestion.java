import java.util.ArrayList;

/**
 * Name: Mick Zeller
 * Worked Solutions from the textbook:  Java for Everyone by Cay Horstmann (Chapter 9 Inheritance and Interfaces)
 */
public class MultipleChoiceQuestion extends AnyCorrectChoiceQuestion
{
    private ArrayList<String> ans;
    private String[] responses;


    public MultipleChoiceQuestion()
        {
        ans = new ArrayList<>();
        }

    @Override
    public void setAnswer(String correctResponse)
        {
        ans.add(correctResponse);
        }

    @Override
    public boolean checkAnswer(String response)
        {
        responses = response.split(" ");
        int correctCount = 0;
        for (String check : ans)
            {
            for (int i = 0; i < responses.length; i++)
                {
                if (responses[i].equalsIgnoreCase(check))
                    {
                    correctCount++;
                    }
                }
            }
        return correctCount == ans.size();
        }

}
