package com.company;

public class Employee_Company {
    public String name_employee;
    public String role;
    private float salary_employee;
    public String EmailAddress;
    private char Intern_apply_company_grade;

    public void Set_Intern_application(char Intern_application){
        Intern_apply_company_grade = Intern_application;
    }
    public char Get_Intern_application(){
        return Intern_apply_company_grade;
    }
    public void Set_name_employee(String name_input_system)
    {
        name_employee = name_input_system;
    }
    public String Get_name_employee(){
        return name_employee;
    }
    public void Set_role_employee(String role_input_system){
        role = role_input_system;
    }
    public String Get_role_employee(){
        return  role;
    }
    public void setSalary_employee(float salary_amount) {
        salary_employee = salary_amount;
    }
    public float getSalary_employee() {
        return salary_employee;
    }
    public void Set_Email_employee(String Email_Address)
    {
        EmailAddress = Email_Address;
    }
    public String Get_Email_employee(){
        return EmailAddress;
    }


}
