package Scanner.com;

import java.util.Scanner;

public class Scanner_Task {


public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your name");
	
String name = s.next();
System.out.println("The name is" + " " +name);

System.out.println("Enter ur age");
int age =  s.nextInt();
System.out.println("The age is" +" " +age);

System.out.println("Enter ur gender");
String gender = s.next();
System.out.println("The gender is" +" " +gender);

System.out.println("Enter ur address");
String address = s.next();
System.out.println("The address is" +" " +address);

System.out.println("Enter ur pincode");
int pincode = s.nextInt();
System.out.println("The pincode is" +" " +pincode);

System.out.println("Enter ur fees");
int fees = s.nextInt();
System.out.println("The fees is " +" " +fees);

System.out.println("Enter ur father name");
String fathername = s.next();
System.out.println("The father name is" +" " +fathername);

System.out.println("Enter ur bankaccountnumber");
long bankaccountnnumber = s.nextLong();
System.out.println("The bank account number is" +" " + bankaccountnnumber);
s.close();	

}
}
