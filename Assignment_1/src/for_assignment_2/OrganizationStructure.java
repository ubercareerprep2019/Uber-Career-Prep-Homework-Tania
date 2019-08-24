package for_assignment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrganizationStructure {
    public Employee ceo;
    Queue<Employee> queue= new LinkedList<>();
    
    public static class Employee {
        public String name;
        public String title;
        public List<Employee> reportTo;
        public int level = 0;
        
        public Employee(String name, String title, List<Employee> reportTo) {
        		this.name = name;
        		this.title = title;
        		this.reportTo = reportTo;
        }//Employee Constructor
    }//Inner Employee class
    
    public static void printLevelByLevel() {
    	
    }//printLevelByLevel
    
    
    public void organizationStructure() {
    		Employee K = new Employee("K", "Sales Intern", null);
    		
    		List<Employee> reportToJ = new ArrayList<>(Arrays.asList(K));
    		Employee J = new Employee("J", "Engineer", reportToJ);
    		
    		List<Employee> reportToI = new ArrayList<>(Arrays.asList(J));
    		Employee I = new Employee("I", "Engineer", reportToI);
    		
    		Employee F = new Employee("F", "Manager", null);
    		Employee G = new Employee("G", "Sales Rep.",null);
    		Employee H = new Employee("H", "Enginner",null);
    		
    		Employee E = new Employee("E", "Manager", null);
    		    		
    		List<Employee> reportToD = new ArrayList<>(Arrays.asList(F,G,H));
    		Employee D = new Employee("D", "Director", reportToD);
    		
    		
    		List<Employee> reportToC = new ArrayList<>(Arrays.asList(D,E));
    		Employee C = new Employee("C", "CTO", reportToC);
    		
    		List<Employee> reportToB = new ArrayList<>(Arrays.asList(I));
    		Employee B = new Employee("B", "CFO",reportToB);
    		
    		List<Employee> reportToA = new ArrayList<>(Arrays.asList(B,C));
    		Employee A = new Employee("A", "CEO", reportToA);
    }//OrganizationStructure
    
}//Main Method
    

