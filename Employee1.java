package zuoye1;

public class Employee1 {
	public static int count=10;
   //这个成员变量对子类可见
    public String name;
    //私有变量，仅对该类可见
    private double salary;
    //在构造器中队name赋值
    public Employee1 (String Empname){
    	name=Empname;
    }
    //设定salary的值
    public void printEmp(double empSal){
    	salary=empSal;
    }
    //打印信息
    public void printEmp() {
    	System.out.println("名字："+name);
    	System.out.println("薪水："+salary);
    }
    public static void main(String[] args) {
    	Employee1 empOne=new Employee1("RUNOOB");
    	Logger L=new Logger();
    	L.setFormat("你好");
    	empOne.printEmp();
    	Employee1.count=20;
    	System.out.println(L.getFormat());
    }
}
