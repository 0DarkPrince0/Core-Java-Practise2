package assignment_3;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class Quiz
	{
		int i=0;
		private LinkedList<AddQuestions>question;
	 	private LinkedList<Integer>answer;
	
		private static Scanner scan;
		static
		{
			scan=new Scanner(System.in);
		}
		
		Quiz()
		{
			answer=new LinkedList<Integer>();
			question=new LinkedList<AddQuestions>();
		}
		
		public void addQuestion()
		{			
					scan.nextLine();
					AddQuestions addQuestion=new AddQuestions();
					String question_;
					String option;
					int option_count=1;
					
					int correct_answer;
					System.out.println("Enter your Question: ");
					question_=scan.nextLine();
					addQuestion.setQuestion(question_);
					System.out.println("Enter Options: ");
					while(true)
					{	
						scan.nextLine();
						AddOption addOption=new AddOption();
						System.out.println("Enter Option "+option_count);
						option=scan.nextLine();
						addOption.setOption(option);
						addQuestion.getOption().add(addOption);
						System.out.println("Do you want to add more options?");
						System.out.println("If Yes please Enter 'Y' for No press any key");
						char ch=scan.next().charAt(0);
						if(!(ch=='y')|| (ch=='Y'))
						{
							break;
						}
						option_count++;
					}
					System.out.println("Please enter correct Answer option number");
					correct_answer=scan.nextInt();
					addQuestion.setAnswer(correct_answer);
					question.add(addQuestion);
		}
		
	
		public void play()
		{
			System.out.println("\n\n\n\n\n");
			System.out.println("***************************Quiz Started:******************************");
			int question_number=1;
			int correct_answers=0;
			Iterator<AddQuestions> itr=question.iterator();
			while(itr.hasNext())
			{
				System.out.println("\n\n\n");
				AddQuestions a=(AddQuestions) itr.next();
				System.out.println(question_number+" "+a.getQuestion());	
				Iterator<AddOption> opt_itr=a.getOption().iterator();
				System.out.println("Options are: ");
				int option_number=1;
				while(opt_itr.hasNext())
				{
					
					AddOption ao=(AddOption) opt_itr.next();
					System.out.println(option_number+" "+ao.getOption()); 
					option_number++;
				}
				int user_answer;
				System.out.println("Please choose correct Answer:");
				user_answer=scan.nextInt();
				System.out.println("You choosen: "+user_answer);
				if(a.getAnswer()==user_answer)
				{
					System.out.println();
					correct_answers++;
				}	
				else
				{
					answer.add(question_number);
				}

				question_number++;
			}
			System.out.println("Total Questions are: "+(question_number-1));
			System.out.println("Correct Answers: "+correct_answers );
			System.out.println("\n\n");
			System.out.println("Do you want to see your wrong Questions with correct Answers:");
			System.out.println("If yes please enter y or Y");
			char ch=scan.next().charAt(0);
			if(ch=='y' || ch=='Y')
			{
				Iterator<Integer> answer_itr=answer.iterator();
			
				
				while(answer_itr.hasNext())
				{
					int temp=1;
					int count=answer_itr.next();
					itr=question.iterator();
			
						while(itr.hasNext())
						{

								AddQuestions a=(AddQuestions) itr.next();
								if(count==temp)
								{
									System.out.println("\n\n\n");
									System.out.println(temp+" "+a.getQuestion());
									int right_option=a.getAnswer();
									Iterator<AddOption> opt_itr=a.getOption().iterator();
									
									System.out.println("Right Option is: ");
									int option_number=1;
									while(opt_itr.hasNext())
									{
										AddOption ao=(AddOption) opt_itr.next();
										if(right_option==option_number)
										{
											System.out.println(option_number+" "+ao.getOption()); 
											break;
										}
										else
										{
											option_number++;
										}
									}
									break;
								}
								else
								{
									temp++;
								}
					}
					
				}
			}
			
			System.out.println("\n\n\n\n\n\n\n");
		}
		

	
	public static void main(String[] args)
	{
		Quiz q=new Quiz();
		System.out.println("Welcome in the gaming world:");
		int choice;
		
		
		while(true)
			{
				System.out.println("Enter Your Choice:");
				System.out.println("1. for Add quesitons:");
				System.out.println("2. for Play the Quiz:");
				System.out.println("3. for Quit the Game:");
				choice=scan.nextInt();
				
				switch(choice)
				{
				case 1:
					q.addQuestion();
					break;
					
				case 2:
					q.play();
					
					break;
				
				case 3:
					System.exit(0);
					
				
				default:
					System.out.println("Wrong choice");
				}
				
			
					
				
				
			}
		
		}
	
	}