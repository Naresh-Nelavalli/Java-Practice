

import javax.script.ScriptException;
public class evalMain {
	public static void main(String args[]) throws ScriptException {
		Num num = new Num(3);
		Plus valuep = new Plus("11+3","5+5");
		Times valuet = new Times("12-9","44+5");
		Division valued = new Division("8+9","14+16");
		Minus valuem = new Minus("11*5","8");
		
		System.out.println("number: "+num.eval());
		System.out.println("Addition of 11+3 and 5+5 is: "+valuep.eval());
		System.out.println("Multiplication of 12-9 and 44+5 is: "+valuet.eval());
		System.out.println("Division of 8+9 and 14+16: "+valued.eval());
		System.out.println("Subraction of 11*5 and 8: "+valuem.eval());
		
	}

}