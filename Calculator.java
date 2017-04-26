import java.*;

public class Calculator
{

	private String infixExpression;
	private String postfixExpression;


	public StackArrayBased stack = new StackArrayBased();


	public Calculator(String exp)
	{
		infixExpression = exp;
		postfixExpression = "";
	}


	public String toString() //returns the infix expression
	{
		return ("infixExpression: [" + infixExpression + "]");
	}


	public boolean convertPostfix() //finds the postfix expression, returning true if successful
	{
		postfixExpression = postfixExpression.concat(infixExpression.substring(0,1));

		int i = 1;

		System.out.println("In convertPostfix");

		while(i < infixExpression.length())
		{
			String evaluatedChar = infixExpression.substring(i, i+1);

			System.out.println("i = " + i + ", evaluatedChar = " + evaluatedChar);

			if((evaluatedChar.equals("+")) || (evaluatedChar.equals("-")) || (evaluatedChar.equals("*")) || (evaluatedChar.equals("/")))
			{
				postfixExpression = postfixExpression.concat(infixExpression.substring(i+1, i+2)).concat(infixExpression.substring(i, i+1));
				//System.out.println("Postfix: [ " + postfixExpression + " ], concatenated values: [ " + infixExpression.substring(i+1, i+2) + infixExpression.substring(i, i+1) + " ]");
				i += 2;
			}
			else
			{
				postfixExpression = postfixExpression.concat(infixExpression.substring(i, i+1));
				i++;
			}
		}
		return true;
	}


	public String getPostfix() //returns the postfix expression
	{
		return postfixExpression;
	}


	public int evaluate() //evaluates the entire expression and returns the integer result
	{
		//
		return 3;
	}

}