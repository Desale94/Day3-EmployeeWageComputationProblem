//UC10-Ability to manage employee Wage of multiple companies
package com.bridgelabz.employee;
public class EmpWageBuilderArray {
    public static final int Is_Part_Time=1;
    public static final int Is_Full_Time=2;
    private int numOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray(){
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth){
        companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
        numOfCompany++;
    }
    private void computeEmpWage(){
        for(int i=0;i<numOfCompany;i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }


    private int computeEmpWage(CompanyEmpWage companyEmpWage){

        int empHrs = 0, totalEmpHrs= 0, totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                case Is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays +"Emp Hrs: " + empHrs);

        }
        return totalEmpHrs * companyEmpWage.empRatePerHr;
    }

    public static void main(String[] args){
        EmpWageBuilderArray empWageBuilder= new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
        empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
        empWageBuilder.computeEmpWage();

    }
}
