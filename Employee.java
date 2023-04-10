import java.nio.file.StandardOpenOption;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(){

    }
    Employee(String name,int salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    int tax(int salary)
    {
        int vergi=0;
       this.salary=salary;
        if(salary>1000)
        {
         vergi+=(salary*(0.03));
         return vergi;
        }
        return vergi;
    }
    int bonus(int workHours)
    {
        int fazladsnSaat,ucret=0;
        this.workHours=workHours;
        if(workHours>40)
        {
            fazladsnSaat=workHours%40;
            ucret=fazladsnSaat*30;
            return ucret;
        }
        return ucret;
    }
    int raiseSalary(int hireYear,int salary)
    {
        this.hireYear=hireYear;
        this.salary=salary;
        int artıs=0;
        if((2021-hireYear)<10)
        {
            artıs+=(salary*(0.05));
            return artıs;
        }
        if ((2021-hireYear)>9 && (2021-hireYear)<20)
        {
            artıs+=(salary*(0.1));
            return artıs;
        }
        if ((2021-hireYear)>19)
        {
            artıs+=(salary*(0.15));
            return artıs;
        }
        return artıs;
    }
    void tostring()
    {
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çmalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax(this.salary));
        System.out.println("Bonus : "+this.bonus(this.workHours));
        System.out.println("Maaş Artışı : "+this.raiseSalary(this.hireYear,this.salary));
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+(this.salary+this.bonus(this.workHours)-(this.tax(this.salary))));
        System.out.println("Toplam Maaş: "+((this.salary)+this.raiseSalary(this.hireYear,this.salary)));
    }


}
