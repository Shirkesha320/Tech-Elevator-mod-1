package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

	
	private static List<Department> departments = new ArrayList<>();
	private static List<Employee> employees = new ArrayList<>();
    private static  Map<String, Project> project = new HashMap<>();
	
    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
    	
    	
    	

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees 
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        employees.get(1).raiseSalary(10);
        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    
    
   
    departments.add(new Department(001, "Marketing"));
    departments.add(new Department(002, "Sales"));
    departments.add(new Department(003, "Engineering"));
    
    } 
 

    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

        
       for (Department department : departments) {
        	System.out.println(department.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    	Employee deanJohnson = new Employee();
    	deanJohnson.setEmployeeId(001);
    	deanJohnson.setFirstName("Dean");
    	deanJohnson.setLastName("Johnson");
    	deanJohnson.setEmail("djohson@teams.com");
    	deanJohnson.setDepartment(departments.get(2));
    	deanJohnson.setHireDate("08/21/2020");
    	
        employees.add(deanJohnson);
        employees.add(new Employee(002, "Angie", "Smith", "asmith@teams.com",
        		departments.get(1), "08/21/2020"));
        employees.add(new Employee(003, "Margaret", "Thompson", "mthompson@teams.com,",
        		departments.get(0), "08/21/2020"));
     
    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

      for (Employee employee : employees) {
        	System.out.println(employee.getFullName() + " (" + employee.getSalary() + ")"
        	+ employee.getDepartment().getName());
       }
    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
    	
    	Project teamsProject = new Project ("TEam", "Project Management Software",
        		"10/10/2020", "11/10/2020");
        	
        	for (Employee employee : employees) {
        		if (employee.getDepartment().getName()== "Engineering") {
        			teamsProject.getTeamMembers().add(employee);
        		}
        		
        	}
    	
    	
    	

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
    	
    	Project landingPageProject = new Project ("LandingPageProject", "Lead Capture Landing Page for Marketing",
        		"10/10/2020", "10/17/2020");
        	
        	for (Employee employee : employees) {
        		if (employee.getDepartment().getName()== "Engineering") {
        			landingPageProject.getTeamMembers().add(employee);
        		}
        		
        	}
    	
    	project.put("Marketing Landing Page:", landingPageProject);
    	

    	
    
    	

    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        
        for (Map.Entry<String, Project> project : project.entrySet()) {
        System.out.println(project.getKey() + project.getValue().getTeamMembers().size());
        		
    }
    }
}
