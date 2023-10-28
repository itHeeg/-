package zuoye1;
import java.io.*;

public class EmployeeTest {
     public static void main(String[] args){
    	 /*使用构造器创建两个对象*/
    	 Employee empOne=new Employee("RUNOOB1");
    	 Employee empTwo=new Employee("RUNOOB2");
    	 
    	 //调用这两个对象的成员变量
    	 empOne.empAge(26);
    	 empOne.empDesignation("高级程序员");
    	 empOne.empSalary(1000);
    	 empOne.printlnEmployee();
    	 
    	 empTwo.empAge(21);
    	 empTwo.empDesignation("高级程序员");
    	 empTwo.empSalary(500);
    	 empTwo.printlnEmployee();
     }      
}
