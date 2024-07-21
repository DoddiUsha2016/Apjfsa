package apjfsa;

class Employee2{
	 int id;
     String name;
     int salary;

    public Employee2(int id, String name, int salary) {
    	this.id=id;
        this.name = name;
        this.salary = salary;
    }

    void totalSalary() {
        System.out.println("Total salary of "+name+":$"+ salary);
    }
}

class TemporaryEmployee extends Employee2 {
    double bonus;

    public TemporaryEmployee(int id,String name, int salary, double bonus) {
        super(id,name, salary);
        this.bonus = bonus;
    }

    @Override
     void totalSalary() {
        System.out.println("Total salary of TemporaryEmployee:"+name+":$"+salary+"bonus:"+bonus);
    }
}

class ContractorEmployee extends Employee2 {
     int contractorDuration; // in months

    public ContractorEmployee(int id,String name, int salary, int contractorDuration) {
        super(id,name, salary);
        this.contractorDuration = contractorDuration;
    }

    @Override
    void totalSalary() {
    	System.out.println("Total salary of ContractorEmployee:"+name+":$"+salary+"contractorDuratoin:"+contractorDuration);
        
    }
}
public class Method_Override {
    public static void main(String[] args) {
        TemporaryEmployee permanentEmp = new TemporaryEmployee(133,"Anusha", 50000, 10000);
        permanentEmp.totalSalary();
        ContractorEmployee contractEmp = new ContractorEmployee(123,"Usha", 40000,6);
        contractEmp.totalSalary();
        

    }
}

	


