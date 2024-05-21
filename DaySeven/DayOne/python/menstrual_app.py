print("Welcome to MyChekker healthcare")
print()
print("We are on a mission to improve the well-being of all women")

options = int(input(""" 

1. signUp
2. Login

"""))

match options:
	case 1: 
		user_name = input("Enter your name: ")

		user_age = int(input("How old are you: "))
	
		if user_age < 12:
			print("Oops!! The age you entered is below the normal age we expect for adult  check the program again")
			

	case 2:
		print("Answer the following questions to calculate when next your period will come")
		print()
		print()
		
		userPeriod = int(input("What are the signs of your period coming"))

sympthoms =  int (input(""" 
_____________________________________________________________________+
.....................................................................+
	1. Tender breasts
	2. Acne-prone skin
	3. Menstrual cramps
	4. Mood swings
	5. Feeling bloated
	6. Feeling very tired
	7. Dry discharge
________________________________________________________________________+
........................................................................+
"""))
print("Select the option")

match sympthoms:
	case 1:
		period_start_date = input("When did your last period start: ")
		
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break
		

	case 2:
		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break
	case 3:
		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))

		#break
	case 4:

		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break
	case 5:
		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break
	case 6:

		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break
	case 7:
		period_start_date = input("When did your last period start: ")
		period_duration = int(input("How many days did it last: "))

		cycleLength = int(input("What is the average length of the menstruation"))
		#break

	#efault_:
		#print("Invalid input")
		
		

	
		




