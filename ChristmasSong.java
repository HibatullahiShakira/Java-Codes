import java.util.Scanner;
	public class ChristmasSong {

		public static void main(String... args){
		Scanner scanner = new Scanner(System.in);

while(true) {
System.out.println("The Twelves Days of Christmas");
System.out.println("Song by the Wiggles");

String prompt = """
Press Day of Choice
1 -> First day
2 -> Second day
3 -> Third day 
4 -> Fourth day
5 -> Fifth day
6 -> Sixth day 
7 -> seventh day
8 -> Eight day
9 -> Nineth day
10 -> Tenth day
11 -> Eleventh day 
12 -> Twelveth day
""";

		System.out.println(prompt);
			int userInput = scanner.nextInt();

				
				switch(userInput) {
							case 1:
						System.out.println("First day");
						System.out.println("On the first day of christmas,");
						System.out.println("my true love gave to me");
						System.out.println("A patridge in a pear tree.");
						break;
	
							case 2: 
						System.out.println("Second day");
						System.out.println("On the second day of christmas,");
						System.out.println("my true love gave to me");
						System.out.println("Two turtle doves");
						System.out.println("A patridge in a pear tree.");
						break;

							case 3:
						System.out.println("Third day");
						System.out.println("On the third day of christmas,");
						System.out.println("my true love gave to me");
						System.out.println("Three french hens");
						System.out.println("Two turtle doves");
						System.out.println("A patridge in a pear tree.");
						break;
				
							case 4: 
						System.out.println("Fourth day");
						System.out.println("On the fourth day of christmas,");
						System.out.println("my true love gave to me");
						System.out.println("Three french hens");
						System.out.println("Two turtle doves");
						System.out.println("And a patridge in a pear tree.");			
						break;

							case 5: 
						System.out.println("Fifth day");
						System.out.println("On the fifth day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Five golden rings,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
						
							case 6: 
						System.out.println("Sixth day");
						System.out.println("On the sixth day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
						
							case 7:
						System.out.println("Seventh day");
						System.out.println("On the seventh day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
									
							case 8: 
						System.out.println("Eighth day");
						System.out.println("On the Eighth day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Eight maids a-milking,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;

							case 9:
					 	System.out.println("Nineth day");
						System.out.println("On the Nineth day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Nine ladies dancing,");
						System.out.println("Eight maids a-milking,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
						
							case 10:
						System.out.println("Tenth day");
						System.out.println("On the Tenth day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Ten lords a-leaping,,");
						System.out.println("Nine ladies dancing,");
						System.out.println("Eight maids a-milking,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
						

							case 11:
						System.out.println("Eleventh day");
						System.out.println("On the Eleventh day of christmas,");
						System.out.println("my true love gave to me,");
						System.out.println("Eleven pipers piping,");
						System.out.println("Ten lords a-leaping,,");
						System.out.println("Nine ladies dancing,");
						System.out.println("Eight maids a-milking,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;
						
							case 12:
						System.out.println("Twelveth day");
						System.out.println("On the Twelveth day of christmas,");
						System.out.println("Twelve drummers drumming");
						System.out.println("my true love gave to me,");
						System.out.println("Eleven pipers piping,");
						System.out.println("Ten lords a-leaping,,");
						System.out.println("Nine ladies dancing,");
						System.out.println("Eight maids a-milking,");
						System.out.println("Seven swans a-swimming,");
						System.out.println("Six geese a-laying,");
						System.out.println("Five golden rings,");
						System.out.println("Four calling birds,");
						System.out.println("Three French hens,");
						System.out.println("Two turtle doves,");
						System.out.println("And a patridge in a pear tree.");			
						break;

						case 0: System.out.println("Thats all for the days");

					default: System.out.println("End of the lyrics. please choose again: ");

							}
					
					
						}


					}

				}

					

