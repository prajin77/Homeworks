import java.util.Scanner;
class Knowledge
{
	public static void main(String[] args)
	{
		System.out.println("THE WORLD OF KNOWLEDGE");
		System.out.println("WE WELCOMES YOU");
		System.out.println("1. FICTION ");
		System.out.println("2. FANTASY ");
		System.out.println("3. BUSINESS ");
		System.out.println("4. PSYCHOLOGY ");
		System.out.println("SELECT YOUR OPTIONS :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("The Options are: ");
			System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book");
			System.out.println("2. Shadows Rising ");
			System.out.println("3. Kunex,It Ends with Us ");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("RISE OF THE FALLEN: The Manwaan Series Book");
				String Description="Description:A cultural fusion. A modern twist. An ancient battle of good and evil. Amidst an eternal \n family feud, a purposeless and hyper-anxious Rinad discovers that he is part human and part celestian \n Manwaan! As he navigates through his strange new reality, he encounters magnificent Angels, along with"  ;
				System.out.println(Description);
				System.out.println("Author: Abhishek Krishnan    ");
				System.out.println("Language: English ");
				System.out.println(" Rate: Rs.300.");
			}
			else if(option==2)
			{
				System.out.println("Shadows Rising ");
				String Description="Description:Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha,\n spends his days in the city of Mumbai, drinking cheap rum and pretending to be human. \n When a young girl is abducted, Akran finds himself reluctantly dragged into the investigation. But, as\n soon discovers, this is not a simple case of kidnapping—villainous thugs, gods and demons are all \n involved. And an ancient evil is returning to the world. ";
				System.out.println(Description);
				System.out.println("Author: Rohan Monteiro");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.250");
			}
			else if(option==3)
			{
				System.out.println("Kunex, It Ends with Us ");
				String Description="Description:The newest, highly anticipated novel from beloved #1 New York Times bestselling author, \n Colleen Hoover. Sometimes it is the one who loves you who hurts you the most. Lily hasn?t always had it \n easy, but that's never stopped her from working hard for the life she wants. She?s come a long way from \n the small town in Maine where she grew up?she graduated from college, moved to Boston and started her \n own business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything \n in Lily?s life suddenly seems almost too good to be true.";
				System.out.println(Description);
				System.out.println("Author: Rohan Monteiro    ");
				System.out.println(" Language: English");
				System.out.println("Rate: Rs.350.");
			}
			else
			{
				System.out.println("out of stock book");
			}
		}
		else if(choice==2)
		{
			System.out.println(" FANTASY ");
			System.out.println("The Options are: ");
			System.out.println("1.Compass and Blade  ");
			System.out.println("2.Blood metal Bone ");
			System.out.println("3.The shadows between us.   ");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("Compass and Blade");
				String Description="Description: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked ships \n beyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeper \n waters. But Rosevear needs her, and she could never abandon her home. Until one evening when \n lightning splits the sky and the Watch descend, taking Mira’s father away. "  ;
				System.out.println(Description);
				System.out.println("Author: Rachel Greenlaw  ");
				System.out.println("Language: English   ");
				System.out.println(" Rate: Rs.370. ");
			}
			else if(option==2)
			{
				System.out.println("Blood metal Bone");
				String Description=" Description :Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced to \n execution by her own mother. Punished and left for dead, the shadows have cursed her with a second life \n as a Shadow-blood, cast out and hunted by society for her demon-like powers. "  ;
				System.out.println(Description);
				System.out.println(" Author: Lindsay Cummings  ");
				System.out.println(" Language: English ");
				System.out.println("Rate: Rs.275 ");
			}
			else if(option==3)
			{
				System.out.println(" The Shadows between us. ");
				String Description=" Description:No one knows the extent of the freshly crowned Shadow King's power. Some say he can \n command the shadows that swirl around him to do his bidding. Others say they speak to him, whispering \nthe thoughts of his enemies. Regardless, Alessandra, tired of being overlooked, has a plan to gain power: \nwoo the Shadow King, marry him, then kill him and take his kingdom for herself. "  ;
				System.out.println(Description);
				System.out.println("Author: Tricia Leven-seller      ");
				System.out.println(" Language: English ");
				System.out.println("  Rate: Rs.304");
			}
			else
			{
				System.out.println("out of stock book");
			}
		}
		
		else if(choice ==3)
		{
			System.out.println("BUSINESS");
			System.out.println(" 1.The Psychology of Money ");
			System.out.println("2.Do It Today");
			System.out.println("3.Atomic Habits");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println(" Compass and Blade ");
				String Description=" Decription: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked ships \n beyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeper \n waters. But Rosevear needs her, and she could never abandon her home. Until one evening when \n lightning splits the sky and the Watch descend, taking Mira’s father away";
				System.out.println(Description);
				System.out.println("  Author: Rachel Greenlaw   ");
				System.out.println(" Language: English   ");
				System.out.println("Rate: Rs.370.");
			}
			else if(option==2)
			{
				System.out.println("Blood metal Bone");
				String Description=" Description:Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced to \n execution by her own mother. Punished and left for dead, the shadows have cursed her with a second life \n as a Shadow-blood, cast out and hunted by society for her demon-like powers. "  ;
				System.out.println(Description);
				System.out.println("Author: Lindsay Cummings ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.275 ");
			}
			else if(option==3)
			{
				System.out.println(" The Shadows between us");
				String Description="Description: No one knows the extent of the freshly crowned Shadow King's power. Some say he can \n command the shadows that swirl around him to do his bidding. Others say they speak to him, whispering \n the thoughts of his enemies. Regardless, Alessandra, tired of being overlooked, has a plan to gain power: \n woo the Shadow King, marry him, then kill him and take his kingdom for herself"  ;
				System.out.println(Description);
				System.out.println(" Author: Tricia Leven-seller    ");
				System.out.println(" Language: English  ");
				System.out.println("Rate: Rs.304");
			}
			else
			{
				System.out.println("out of stock book");
			}
				
		}
		else if(choice ==4)
		{
			System.out.println("Psychology ");
			System.out.println(" 1.Dark Psychology Secrets & Manipulation ");
			System.out.println("2.The Power of Your Subconscious Mind Do It Today ");
			System.out.println("3.The Courage to Be Disliked ");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				
				System.out.println(" Dark Psychology Secrets & Manipulation  ");
				String Description="Description: In relation to the psychological essence of the various kinds of people who prey on others, \n dark psychology can be seen as studying the human condition. The truth is that there is the potential for \n any single human being to victimize other people or other living creatures. Most people prefer to suppress  \n their dark impulses and prevent themselves from acting on any desire they have because of social norms, \n a human conscience, and other factors. ";
				System.out.println(Description);
				System.out.println("Author: Amy Brown");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(option==2)
			{
				System.out.println("  ");
				String Description="Description: This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmative \n thinking, will unlock for you the truly staggering powers of your subconscious mind. Combining time\n honored spiritual wisdom with cutting edge scientific research, Dr. Murphy explains how the \nsubconscious mind influences every single thing that you do and how, by understanding it and learning to \n control its incredible force, you can improve the quality of your daily life.Everything, from the promotion  \n that you wanted and the raise you think you deserve, to overcoming phobias and bad habits and \n strengthening interpersonal relationships, the Power of Your Subconscious Mind will open a world of \n happiness, success, prosperity and peace for you. It will change your life and your world by changing  \n your beliefs. ";
				System.out.println(Description);
				System.out.println("Author: Joseph Murphy");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.100 ");
			}
			else if(option==3)
			{
				System.out.println("  ");
				String Description="Description: The Courage to be Disliked shows you how to unlock the power within yourself to become  \n your best and truest self, change your future and find lasting happiness. Using the theories of Alfred \n Adler, one of the three giants of 19th century psychology alongside Freud and Jung, the authors explain \n how we are all free to determine our own future free of the shackles of past experiences, doubts and the \n expectations of others. It's a philosophy that's profoundly liberating, allowing us to develop the courage to \n change, and to ignore the limitations that we and those around us can place on ourselves.  ";
				System.out.println(Description);
				System.out.println("Author: Ichiro Kishimi and Fumitake Koga ");
				System.out.println("Language: English ");
				System.out.println("Rate: Rs.350 ");
			}
			else
			{
				System.out.println("out of stock book");
			}
				
		}
		else
		{
			System.out.println("invalid choice"); 
		}
		System.out.println("THANK YOU FOR USING ME");
	}
}	