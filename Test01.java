package zuoye1;

public class Test01 {
    /*第一个Java程序*/
	
	public static void main(String[] args) {
      /* do {
    	   System.out.print("value 0f x ："+x);
    	   x++;
    	   System.out.print("\n");
       }while(x<20);*/
		/*for(int x=10;x<20;x=x+1) {
			System.out.println("value of x:"+x);
		}*/
		/*int []numbers= {10,20,30,40,50};
		
		for(int x:numbers) {
			//x等于30时跳出循环
			if(x==30) {
				break;
			}
			System.out.print(x);
		}*/
		/*int x=30;
		
		if(x<20) {
			System.out.println("Value of x is 10");
		}else if(x==20) {
			System.out.println("Value of x is 20");
		}else if(x==30){
			System.out.println("Value of x is 30");
		}*/
		
		/*char grade='C';
		
		switch(grade)
		{
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
			System.out.println("好");
		case 'C':
			System.out.println("良");
			
		case 'D':
			System.out.println("你需要再努力努力");
		    break;
		default :
			System.out.println("未知等级");
		}
		System.out.println("你的等级是"+grade);*/
		double [] nums= {1.4,1.5,1.6,-1.4,-1.5,-1.6};
		for (double num:nums) {
			test(num);
		}
	}
	    private static void test(double num) {
	    	System.out.println("Math.floor("+num+")="+Math.floor(num));
	    	System.out.println("Math.round("+num+")="+Math.round(num));
	    	System.out.println("Math.ceil("+num+")="+Math.ceil(num));
	    }
}
