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
int phoneBookChoice = scanner.nextInt();

switch(phoneBookChoice) { 

case 1: 
System.out.println("Search");
break;
case 2:						
System.out.println("Service");
break;
case 3:						
System.out.println("Add name");
break;		
case 4: 
System.out.println("Erase");
break;
case 5:						
System.out.println("Edit");
break;
case 6:						
System.out.println("Assign tone");
break;
case 7:						
System.out.println("send b'card");
break;	
case 8:					
System.out.println("options");
String options = """
1 -> Type of view 
2 -> Memory Status 
3 -> Back 
""";
System.out.println(options);
int optionsChoice = scanner.nextInt();
						
switch(optionsChoice) {				
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
}
case 9:
System.out.println("Calculator");
break;
case 10:						
System.out.println("Reminders");
break; 
default: System.out.println("e don finish in this case");
break;
}
				
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
int messagesChoice = scanner.nextInt();

switch(messagesChoice) {

case 1:
System.out.print("Write messages");
break;
case 2:
System.out.print("Inbox");
break;
case 3:
System.out.print("Outbox");
break;
case 4:
System.out.print("Picture messages");
break;
case 5:
System.out.print("Templates");
break;
case 6:
System.out.print("Smileys");
break;

case 7:
System.out.print("messageSettings");
String messageSettings  = """
1 -> Set
2 -> Common
""";
System.out.print(messageSettings);
int messageSettingsChoice = scanner.nextInt();

switch(messageSettingsChoice) {
			
case 1:
System.out.print("Set");
String set = """
1 -> Message centre number
2 -> Message sent as
3 -> Message validity
System.out.println(set);
int setChoice = scanner.nextInt();

switch(setChoice) { 
case 1: 
System.out.println("Message centre number");
break;
case 2: 						
System.out.println("message sent as");
break;
case 3:
System.out.println("message sent as");
break;
default: System.out.println("e don finish in this case");
break;
}

		
case 2: 
System.out.print("Common");
String common = "
1 -> Delivery reports 
2 -> Reply via same centre
3 -> Character support
""";

System.out.print(common);
int commonChoice = scanner.nextInt();

switch(commonChoice) {
case 1: 
System.out.println("Delivery reports");
break;
case 2:						
System.out.println("Reply via same centre");
break;
case 3: 
System.out.println("Character support");
break;
default: System.out.println("e don finish in this case");
break;
}
case 8:
System.out.println("Info service");
break;
case 9:						
System.out.println("Voice mailbox number");
break;
case 10: 
System.out.println("Service command editor");
break;
default: System.out.println("e don finish in this case");
break;
} 
}

case 3: System.out.println("Chat");
break;

case 4: System.out.println("Call register");
String callRegister = """
1 -> Missed calls
2 -> Received calls'
3 -> Dialled numbers
4 -> Erase recent call lists
""";
System.out.print(callRegister);
int callRegisterChoice = scanner.nextInt();

switch(callRegisterChoice) {

case 1: 
System.out.print("Missed calls");
break;
case 2: 
System.out.print("Received calls'");
break;
case 3: 
System.out.print("Dialled numbers");
break;
case 4:
System.out.print("Erase recent call lists");
break;
case 5:
System.out.print("Show call duration");
String ShowCallDuration = """
1 -> Last call duration
2 -> All calls duration
3 -> Received call duration
4 -> Dialled calls duration
5 -> Clear timers
""";
System.out.print(ShowCallDuration);
int ShowCallDurationChoice = scanner.nextInt();

switch(ShowCallDurationChoice) {

case 1: 
System.out.print("Last call duration");
break;
case 2: 
System.out.print("All calls duration");
break;
case 3: 
System.out.print("Received call duration");
break;
case 4:
System.out.print("Dialled calls duration");
break;
case 5:
System.out.print("Clear timers");
break;
default: System.out.println("e don finish in this case");
break;
}
case 6: 
System.out.print("Show call costs");
String ShowCallDuration = """
1 -> Last call cost
2 -> All call's cost 
3 -> Clear counters
""";
System.out.print(ShowCallDuration);
int ShowCallDurationChoice = scanner.nextInt();

switch(ShowCallDurationChoice) { 
case 1: 
System.out.print("Last call cost");
break;
case 2: 
System.out.print("All calls cost");
break;
case 3: 
System.out.print("Clear counters");
break;
default: System.out.println("e don finish in this case");
break;
}
case 7: 
System.out.print("Call cost settings");
String CallCostSettings = """
1 -> Call cost limits
2 -> Show cost in 
""";
System.out.print(CallCostSettings);
int CallCostSettingsChoice = scanner.nextInt();

switch(CallCostSettingsChoice) { 
case 1: 
System.out.print("Call cost limits");
break;
case 2: 
System.out.print("Show cost in ");
break;
default: System.out.println("e don finish in this case");
break;
}
case 8: 
System.out.print("Prepaid credit");
break;
default: System.out.println("e don finish in this case");
break;
}
case 5:
System.out.println("Tones");
String tones = """
1 -> Ringing Tones
2 -> Ringing Volume
3 -> Incoming call alert
4 -> Composer
5 -> Message alert tones
6 -> Keypad Tones
7 -> Warning and games tones
8 -> Vibrating alert
9 -> Screen saver
""";
System.out.print(tones);
int tonesChoice = scanner.nextInt();

switch(tonesChoice) { 
case 1: 
System.out.print("Ringing Tones");
break;
case 2: 
System.out.print("Ringing Volume");
break;
case 3: 
System.out.print("Incoming call alert");
break;
case 4: 
System.out.print("Composer");
break;
case 5: 
System.out.print("Message alert tones");
break;
case 6: 
System.out.print("Keypad Tones");
break;
case 7: 
System.out.print("Warning and games tones");
break;
case 8: 
System.out.print("Vibrating alert");
break;
case 9: 
System.out.print("Screen saver");
break;
default: System.out.println("e don finish in this case");
break;
}
case 6:
System.out.print("Settings");
String settings = """
1 -> Call settings
2 -> Phone Settings 
3 -> Security Settings 
4 -> Restore factory Settings
""";

System.out.print(setting);
int settingChoice = scanner.nextInt();

switch(settingChoice) { 
case 1: 
System.out.print("Call settings");
String callSettings = """
1 -> Automatic redial 
2 -> Speed dialling 
3 -> Call waiting options
4 -> Own number sending 
5 -> Phone line in use 
6 -> Automatic answer
""";
System.out.print(callSetting);
int callSettingChoice = scanner.nextInt();

switch(callSettingChoice) {
case 1: 
System.out.print("Automatic redial ");
break;
case 2: 
System.out.print("Speed dialling ");
break;
case 3: 
System.out.print("Call waiting options");
break;
case 4: 
System.out.print("Own number sending ");
break;
case 5: 
System.out.print("Phone line in use ");
break;
case 6: 
System.out.print("Automatic answer");
break;  
default: System.out.println("e don finish in this case");
break;
}

case 2: 
System.out.print("Phone Settings");
String phoneSettings = """
1 -> Language 
2 -> Cell info display
3 -> Welcome note
4 -> Network selection
5 -> Lights 
6 -> Confirm SIM service actions
""";
System.out.print(phoneSetting);
int phoneSettingChoice = scanner.nextInt();

switch(phoneSettingChoice) {
case 1: 
System.out.print("Language ");
break;
case 2: 
System.out.print("Cell info display");
break;
case 3: 
System.out.print("Welcome note");
break;
case 4: 
System.out.print("Network selection");
break;
case 5: 
System.out.print("Lights ");
break;
case 6: 
System.out.print("Confirm SIM service actions");
break;  
default: System.out.println("e don finish in this case");
break;
}
case 3: 
System.out.print("Security Settings");
String securitySettings = """
1 -> PIN code request 
2 -> Call barring service 
3 -> Fixed dialling 
4 -> Closed user group 
5 -> Phone security 
6 -> Change access code 
"""; 
System.out.print(securitySetting);
int securitySettingChoice = scanner.nextInt();

switch(securitySettingChoice) {
case 1: 
System.out.print("PIN code request ");
break;
case 2: 
System.out.print("Call barring service ");
break;
case 3: 
System.out.print("Fixed dialling ");
break;
case 4: 
System.out.print("Closed user group ");
break;
case 5: 
System.out.print("Phone security ");
break;
case 6: 
System.out.print("Change access code ");
break;  
default: System.out.println("e don finish in this case");
break;
}
case 4: 
System.out.print("Restore factory Settings");
break;  
default: System.out.println("e don finish in this case");
break;
} 
case 7: 
System.out.print("Call divert");
break;
case 8: 
System.out.print("Games");
break;
case 9: 
System.out.print("Calculator");
break;
case 10: 
System.out.print("Reminders");
break;
case 10: 
System.out.print("Clock");
String clock = """
1 -> Alarm clock 
2 -> Clock settings 
3 -> Date settings 
4 -> Stopwatch 
5 -> Countdown timer 
6 -> Auto update of date and time
""";
System.out.print(clock);
int clockChoice = scanner.nextInt();

switch(clockChoice) {
case 1: 
System.out.print("Alarm clock ");
break;
case 2: 
System.out.print("Clock settings ");
break;
case 3: 
System.out.print("Date settings");
break;
case 4: 
System.out.print("Stopwatch");
break;
case 5: 
System.out.print("Countdown timer ");
break;
case 6: 
System.out.print("Auto update of date and time");
break;  
default: System.out.println("e don finish in this case");
break;
}
case 12:
System.out.print("Profiles");
break;
case 13: 
System.out.print("SIM services");
break;
default: System.out.println("e don finish in this case");
break;
}
	}
}