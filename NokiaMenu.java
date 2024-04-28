import java.util.Scanner;

	public class NokiaMenu{

		public static void main(String... args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Welcome to Nokia");
		System.out.println("List of Menu");


String menu = """
Press Choice

1 -> phonebook
2 -> messages
3 -> Chat
4 -> Call register
5 -> Tones
6 -> Settings
7 -> Call divert
8 -> Games
9 -> Calculator
10 -> Reminders
11 -> Clock
12 -> Profiles
13 -> SIM services
0 -> Back
""";

System.out.println(menu);
int userInput = scanner.nextInt();


switch(userInput) {

case 1:
System.out.println("phonebook");
						
String phonebook = """
Press Choice

1 -> Search
2 -> Service
3 -> Add name
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> send b' card
8 -> options
9 -> Calculator
10 -> Reminders
""";

System.out.println(phonebook);
int phoneBook = scanner.nextInt();


switch(phoneBook) {
								
	case 8:
String options = """
1 -> Type of view 
2 -> Memory Status 
3 -> Back 
""";
System.out.println(options);
int optionss = scanner.nextInt();
				
case 1: 					
System.out.println("Type of view");
break;
case 2:						
System.out.println("Memory status");
break;
case 3:						
System.out.println("back");
break;						
default: System.out.println("e don finish in this case");
break;


System.out.println("messages");
int messagess = scanner.nextInt();

switch(messagess) {
				
case 2: 
System.out.println("messages");
		
String messages = """
1 -> Write messages
2 -> Inbox
3 -> Outbox
4 -> Picture messages
5 -> Templates
6 -> Smileys
7 -> Message settings 
8 -> Info Services
9 -> Voice mailbox number
10 -> Service command editor
"""; 

System.out.println(messages);
int userInput3 = scanner.nextInt();


					switch(userInput3) {

case 1: System.out.println(messageSettings);
String messageSettings  = """
1 -> Set
2 -> Common
""";

			System.out.println("messageSettings");
			
							case 1:
						System.out.println("message centre number");
						break;
						System.out.println("message sent as");
						break;
						System.out.println("message sent as");
						break;
		
							case 2: 
						System.out.println("Delivery reports");
						break;
						System.out.println("Reply via same centre");
						break;
						System.out.println("Character support");
						break;

						default: System.out.println("e don finish in this case");

							}
			





case 3: System.out.println("Chat");

case 4: System.out.println("Call register");

				}

			}
		}
	}
}