package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("* * * * * Welcome to the employee inform * * * * * ");

        Employee_Company Jane = new Employee_Company();
        Employee_Company Lucas = new Employee_Company();
        Employee_Company Intern_Sophia = new Employee_Company();
        Employee_Company Intern_Ava = new Employee_Company();
        Employee_Company Intern_James = new Employee_Company();
        Employee_Company Intern_Nicholas = new Employee_Company();


        Lucas.Set_name_employee("Lucas Smith");
        Lucas.Set_Email_employee("Lucas_Smith@TechCompany.org");
        Lucas.Set_role_employee("Software Engineer");
        Lucas.setSalary_employee(103438);


        Jane.Set_name_employee("Jane charlotte");
        Jane.Set_Email_employee("Jane_Charlotte@TechCompany.org");
        Jane.setSalary_employee(623100);
        Jane.Set_role_employee("CEO Tech Company");


        Intern_Sophia.Set_name_employee("Sophia Wood");
        Intern_Sophia.Set_Intern_application('A');
        Intern_Sophia.Set_role_employee("Intern Artificial Intelligence ");


        Intern_Ava.Set_name_employee("Ava Richardson");
        Intern_Ava.Set_Intern_application('B');
        Intern_Ava.Set_role_employee("Intern Computer Science");


        Intern_James.Set_name_employee("James Benjamin");
        Intern_James.Set_Intern_application('B');
        Intern_James.Set_role_employee("Intern Business Analyst");


        Intern_Nicholas.Set_name_employee("Nicholas Miller");
        Intern_Nicholas.Set_Intern_application('C');
        Intern_Nicholas.Set_role_employee("Intern Systems Integration Engineering");



        System.out.println("\n\t*** Tech Company employee information ***");
        System.out.println("1. View Salary");
        System.out.println("2. View Name of the Employee");
        System.out.println("3. View Email Address");
        System.out.println("4. View Employee Role");
        System.out.println("5. View Intern Application grade");



        Scanner input = new Scanner(System.in);
        System.out.println("Direction: Input the number is addressed in Tech Company employee information");
        int input_user = input.nextInt();

        switch (input_user){
            case 1 -> {
                System.out.println("Here is the salary of the employee of Tech Company");
                System.out.println("Salary of Software engineering: "+Lucas.getSalary_employee());
                System.out.println("Salary of CEO: "+Jane.getSalary_employee());
            }
            case 2 ->{
                System.out.println("Here is the name of the employee of Tech Company");
                System.out.println("The software engineering of Tech Company name of the employee is: "+Jane.Get_name_employee());
                System.out.println("The CEO Tech Company name of the employee is: "+Lucas.Get_name_employee());
            }
            case 3 ->{
                System.out.println("Here is the Email Address of employee of Tech Company");
                System.out.println("Jane Charlotte is CEO of Tech company Email Address its : "+Jane.Get_Email_employee());
                System.out.println("Lucas Smith is Software Engineering of Tech Company Email Address its: "+Lucas.Get_Email_employee());
            }
            case 4 ->{
                System.out.println("Here is the Employee Role of Tech Company");
                System.out.println(Jane.Get_role_employee());
                System.out.println(Lucas.Get_role_employee());
            }
            case 5 ->{
                System.out.println("Here is all the Intern get accepted to Tech Company ");
                System.out.println("1."+Intern_Ava.Get_name_employee()+" GPA college: "+Intern_Ava.Get_Intern_application()+"- "+" Application: Accepted "+Intern_Ava.Get_role_employee());
                System.out.println("2."+Intern_Sophia.Get_name_employee()+" GPA college: "+Intern_Sophia.Get_Intern_application()+"+ "+" Application: Accepted "+Intern_Sophia.Get_role_employee());
                System.out.println("3."+Intern_James.Get_name_employee()+" GPA college: "+Intern_James.Get_Intern_application()+"+ "+" Application: Accepted "+Intern_James.Get_role_employee());
                System.out.println("4."+Intern_Nicholas.Get_name_employee()+"GPA college: "+Intern_Nicholas.Get_Intern_application()+"+ "+" Application: Accepted "+Intern_Nicholas.Get_role_employee());
            }
        }



    }
}
