import java.util.Scanner;
class Game{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rNum=0;//store a random number between 1 to 3
		for( ; ; )
		{
			//math.random()gen a double value from 0.00 some
			//we multiply the same value by 10
			//and then to get an integer we used type casting
			
			int num=(int)(Math.random()*10);
			if(num>=1&&num<=3)
			{
				rNum=num;//then only store
				break;//if digit found between 1 to 3 then terminate the loop
			}
		}
		//whatever random valur is generated we need to map it with the opt
		String codeOpt=null;
		if(rNum==1)
		{
			codeOpt="Stone";
		}
		else if(rNum==2)
		{
			codeOpt="Paper";
		}
		else if(rNum==3)
		{
			codeOpt="Scissor";
		}

		System.out.println();
		System.out.println("     WELCOME    ");
		System.out.println();
		System.out.println("1.Stone 2.Paper 3.Scissor");
		System.out.println("Enter option:"); //ask the user to enter an opt

		int opt=sc.nextInt();
		String userOpt=null;

		if(opt==1)
		{
			userOpt="Stone";
		}
		else if(opt==2)
		{
			userOpt="Paper";
		}
		else if(opt==3)
		{
			userOpt="Scissor";
		}
		else
		{
			System.out.println("INVAID INPUT");
			return;
		}

		System.out.println("User : "+userOpt+" Bot:"+codeOpt);
		if((opt==1 && rNum==3)||(opt==2 && rNum==1)||(opt==3 && rNum==2))
		{
			System.out.println("User Wins");
		}
		else if((opt==1 && rNum==2)||(opt==2 && rNum==3)||(opt==3 && rNum==1))
		{
			System.out.println("Bot Wins");
		}
		else
		{
			System.out.println("Draw");
		}
	}
}