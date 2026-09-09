package lerch.mtthw.application;

import lerch.mtthw.data.Company;

public class CompanyApp {
    static void main(String[] args) {

        Company company = new Company();
        company.setName("Lerch");

        Company.Employee employee = company.new Employee();
        employee.setName("Marchel Manullang");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
