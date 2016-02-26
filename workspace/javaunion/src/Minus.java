
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Minus extends Expr {
	ScriptEngineManager scr = new ScriptEngineManager();
	ScriptEngine engine = scr.getEngineByName("JavaScript");
	 public final String exp1, exp2;
	 public Minus(String e1, String e2) {
	 exp1 = e1; 
	 exp2 = e2;
	 }
	 public int eval() throws ScriptException{
		 int v1 = (int)engine.eval(exp1);
		    int v2 = (int)engine.eval(exp2);
		    return v1 - v2;
	 }
	 
	} 
