package hw2_xc_hessv2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class HW2_XC_HESSV2 {
	
	static Scanner get = new Scanner(System.in);
	static String input = "";
	static int Answer = 0;
	static int Age = 0; 
	static DecimalFormat DF = new DecimalFormat("####0.00");
	static int TotalUnderWeight = 0;
	static int TotalNormalWeight = 0;
	static int TotalOverWeight = 0;
	static int TotalObese = 0;
	static int TotalHighRisk = 0;
	static String FirstName = ""; 
	static String LastName = ""; 
	static int TotalPeople = 0;
	static String DetermineRisk = "";
	static String WeightString = "";
	static int WeightClass = 0;
	static double Lbs = 0.00;
	static double Inches = 0.00;
	static double HeartRate = 0.00;
	static double BMI  = 0.00;

	public static void main(String[] args) {
		Hello();
		ContinueProgram();
		while(Answer == 1) {
		GetFirstName();
		GetLastName();
		GetAge();
		GetWeightInLbs();
		GetInches();
		GetHeartRate();
		BMICalculator();
		DetermineStatus();
		WeightStringify();
		CardiovascularRisk();
		AddPerson();
		CalculateWeightTotal();
		Recipt();
		ContinueProgram();
		}
		Goodbye();
	}//end main
	
//==================CONTINUE PROGRAM METHOD===================
	
	public static void  ContinueProgram() {
		System.out.println("Would you like to continue on with the program\n1 for yes \n2 for no ");
		input = get.nextLine();
		Answer = Integer.parseInt(input);
		while(Answer != 1 && Answer != 2) {
		System.out.println("Please enter\n1 for yes \n2 for no ");
			input = get.nextLine();
			Answer = Integer.parseInt(input);
				}
			}
			
//===============END CONTINUE PROGRAM METHOD===================
	
	
//==================GET FIRST NAME METHOD===================
	
	public static void GetFirstName() {
		System.out.println("Please tell us your first name");
		FirstName = get.nextLine();
	}
	
//===============END GET FIRST NAME METHOD===================
	
//==================GET LAST NAME METHOD===================
	
	public static void GetLastName() {
		System.out.println("Please tell us your last name");
		LastName = get.nextLine();
	}
		
//===============END GET LAST NAME METHOD===================
		
//==================GET AGE METHOD===================
		
	public static void GetAge() {
		System.out.println("Please tell us your age:");
		input = get.nextLine();
		Age = Integer.parseInt(input);
	
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static void GetWeightInLbs() {
		System.out.println("Please tell us your weight :");
		input = get.nextLine();
		Lbs = Double.parseDouble(input);
	
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static void GetInches() {
		System.out.println("Please tell us your Height In Inches :");
		input = get.nextLine();
		Inches = Double.parseDouble(input);
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static void GetHeartRate() {
		System.out.println("Please tell us your Heart Rate :");
		input = get.nextLine();
		HeartRate = Double.parseDouble(input);		
	}
//===============END GET AGE METHOD===================
	
//==================BMI CALC METHOD===================
	
	public static void BMICalculator() {
		BMI = ((Lbs / (Inches * Inches)) * 703);			
	}
//===============END BMI CALC METHOD===================
	
//==================DETERMINE STATUS METHOD===================
	
	public static void DetermineStatus() {
		if (BMI < 18.5) {
			WeightClass = 0;
			System.out.println("You are underweight");
		} if (BMI >= 18.5 && BMI < 25) {
			WeightClass = 1;
			System.out.println("You are healthy");
		} if (BMI >= 25 && BMI < 30) {
			WeightClass = 2;
			System.out.println("You are overweight");
		} if (BMI >= 30) {
			WeightClass = 3;
			System.out.println("You are obese");
		}
				
	}
//===============END DETERMINE STATUS METHOD===================
	
//==================DETERMINE STATUS METHOD===================
	
	public static void WeightStringify() {
		if(WeightClass == 0) {
			WeightString = "Underweight";
		} else if(WeightClass == 1) {
			WeightString = "Healthy";
		} else if(WeightClass == 2) {
			WeightString = "Overweight";
		} else if(WeightClass == 3) {
			WeightString = "Obese";
		} 		
	}
//===============END DETERMINE STATUS METHOD===================
	
//==================CARDIOVASCULAR RISK METHOD===================
	
	public static void CardiovascularRisk() {
		if (WeightClass == 0 && HeartRate <= 78.0) {
			DetermineRisk = "Low or no risk";
		}  else if (WeightClass == 1 && HeartRate <= 81.0) {
			DetermineRisk = "Low or no risk";
		} else if (WeightClass == 2 && HeartRate <= 76.0) {
			DetermineRisk = "Low or no risk";
		}  else if (WeightClass == 3 && HeartRate <= 84.6) {
			DetermineRisk = "Low or no risk";
		} else {
			DetermineRisk = "Risk is High";
			TotalHighRisk = TotalHighRisk + 1;
		}					
	}
//===============END CARDIOVASCULAR RISK METHOD===================
	
//==================CARDIOVASCULAR RISK METHOD===================
	
	public static void Recipt() {
		System.out.println("Patient : " + FirstName + " " + LastName);
		System.out.println("Age : " + Age);
		System.out.println("Weight : " + DF.format(Lbs));
		System.out.println("Height : " + DF.format(Inches));
		System.out.println("Heart Rate : " + DF.format(HeartRate));
		System.out.println("BMI : " + DF.format(BMI));
		System.out.println("Weight Class : " + WeightString);
		System.out.println("Disease Risk : " + DetermineRisk);
		System.out.println("Total number of people processed : " + TotalPeople) ;
		System.out.println("Total Under Weight " + TotalUnderWeight);
		System.out.println("Total Healthy Weight " + TotalNormalWeight);
		System.out.println("Total Over Weight " + TotalOverWeight);
		System.out.println("Total Obese " + TotalObese);
		System.out.println("Total High Risk " + TotalHighRisk);
	}
//===============END CARDIOVASCULAR RISK METHOD===================
	
//==================ADD PERSON METHOD===================
	
	public static void AddPerson() {
		TotalPeople = TotalPeople + 1;
	}
//===============END ADD PERSON METHOD===================
	
//==================CALCULATE TOTAL METHOD===================
	
	public static void CalculateWeightTotal() {
		
		if(WeightClass == 0) {
			TotalUnderWeight = TotalUnderWeight + 1;
		} else if(WeightClass == 1) {
			TotalNormalWeight = TotalNormalWeight + 1;
		} else if(WeightClass == 2) {
			TotalOverWeight = TotalOverWeight + 1;
		} else if(WeightClass == 3) {
			TotalObese = TotalObese + 1;
		} 
		
	}
//===============END CALCULATE TOTAL METHOD===================
	
//==================ADD PERSON METHOD===================
	
	public static void Hello() {
		System.out.println("Hello welcome to the BMI Calculator 3000!");
	}
//===============END ADD PERSON METHOD===================
	
//==================ADD PERSON METHOD===================
	
	public static void Goodbye() {
		System.out.println("Thank you for using the BMI Calculator 3000, have a nice day");
	}
//===============END ADD PERSON METHOD===================


}
//end class

