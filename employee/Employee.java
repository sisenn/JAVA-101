public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary =  salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    double tax() {

        double tax = 0;

        if (this.salary > 1000) {
            tax = (this.salary * 3) / 100;
            this.salary -= tax;
        }
        return tax;
    }

    double bonus() {
        double bonus = 0;

        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            this.salary += bonus;
        }

        return(bonus);
    }

    double raiseSalary() {
        double raise= 0;
        if (2021 - hireYear < 10)
            raise = (salary * 5) / 100;
        else if (2021 - hireYear > 9 && 2021 - hireYear < 20)
            raise = (salary * 10) / 100;
        else if (2021 - hireYear > 19)
            raise = (salary * 15) / 100;
        return raise;
    }

    void employeeInformation() {
        double salaryTaxBonuses = bonus() - tax();
        if (salaryTaxBonuses < 0)
            salaryTaxBonuses = 0;
        double totalSalary = salaryTaxBonuses + raiseSalary() + this.salary;
        System.out.println("=================================================");
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working hours: " + this.workHours);
        System.out.println("Start year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Increase: " + raiseSalary());
        System.out.println("Salary with Tax and Bonuses: " + salaryTaxBonuses);
        System.out.println("Total Salary: " + totalSalary);
    }
}
