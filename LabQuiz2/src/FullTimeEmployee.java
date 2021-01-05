/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JrBcrypted
*  Md. Jafar Sadik
*  ID: 1620660042
 */
public class FullTimeEmployee extends JobHolder
{
   private int min_salary_amount;
   private int increment_given;
   private int year;
   private double gross_salary;
   private int overtime_hour;
   private double lateHour;
   private double pay_per_overtime_hour;
   
   FullTimeEmployee(String name, int age, int employeeNumber, int salary, int min_salary_amount, int increment_given, int year, double gross_salary, int overtime_hour, double lateHour, double pay_per_overtime_hour)
   {
       super(name, age, employeeNumber, salary);
       this.min_salary_amount = min_salary_amount;
       this.increment_given = increment_given;
       this.year = year;
       this.gross_salary = gross_salary;
       this.overtime_hour = overtime_hour;
       this.lateHour = lateHour;
       this.pay_per_overtime_hour = pay_per_overtime_hour;
       
   }
   public boolean isEligible_for_increment(int year, int overtime_hour)
   {
       boolean ret = true;
       if(year >= 2 && overtime_hour >= 3)
       {
           ret = true;
       }
       else
           ret = false;
       return ret;
   }
   public int totalSalary()
   {
       return (int)(gross_salary - (lateHour * 500));
   }
   public boolean given_increment(int amount, int years)
   {
       boolean ret;
       if(amount<= 60000 && years>=2)
       {
           ret = true;
       }
       else 
           ret = false;
       return ret;
   }
   double deduction_for_late(double Lhours)
   {
       return Lhours * 500;
   }
   public void print()
   {
       System.out.println("Name: " + getName() +"\nAge: " + getAge() + "\nEmployeeNumber: " + getEmployeeNumber() + "\nSalary: " + getSalary()+ "\nMinimum Salary: " + this.min_salary_amount + "Increment: " + this.increment_given + "\nYear: " + this.year + "\nGross Salary: " + this.gross_salary + "\nOvertime Hour: " + this.overtime_hour + "\nLAte Hour" + this.lateHour + "\nPay Per Overtime Hour: " + this.pay_per_overtime_hour);
       
   }
   
}
