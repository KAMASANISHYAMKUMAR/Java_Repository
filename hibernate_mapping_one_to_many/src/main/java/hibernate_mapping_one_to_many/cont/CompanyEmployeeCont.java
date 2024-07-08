package hibernate_mapping_one_to_many.cont;

import java.util.ArrayList;
import java.util.List;

import hibernate_mapping_one_to_many.dao.CompanyDao;
import hibernate_mapping_one_to_many.dao.EmployeeDao;
import hibernate_mapping_one_to_many.dto.Company;
import hibernate_mapping_one_to_many.dto.Employee;

public class CompanyEmployeeCont {
	public static void main(String[] args) {
		Company company=new Company();
		company.setId(20);
		company.setName("TYSS");
		company.setAddress("bang");
		
		
		Employee employee1=new  Employee();
		employee1.setId(100);
		employee1.setName("poojitha");
		employee1.setAge(20);
		
		Employee employee2=new Employee();
		employee2.setId(200);
	    employee2.setName("mhadev");
	    employee2.setAge(15);
	    
	    Employee employee3=new Employee();
	    employee3.setId(300);
	    employee3.setName("ajay");
	    employee3.setAge(20);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);
		company.setEmployee(employees);
//		
//		
//		EmployeeDao employeeDao=new  EmployeeDao();
//		employeeDao.saveEmployee(employees);
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.saveCompany(company);
		
		
//		find the data
		CompanyDao companyDao=new CompanyDao();
		companyDao.getCompanyById(1);
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.getEmployeeById(100);
	
		
//		DELETE THE DATA
		
		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.deeleteCompany(1);
		
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.deeleteEmployee(200);
		
//		update the company
		
//		Company company=new Company();
//		company.setName("JSP");
//		company.setAddress("Bangalore");
//
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.updateCompany(20, company);
			
	}

}
