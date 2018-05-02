package lottery.lottery;

import java.io.IOException;
import unit.geturl;
import unit.pojo;

public class cqssc {
	


	public static pojo getB() throws IOException{ 
		
		unit.geturl g=new geturl();
		return g.get163("/order/cqssc/#from=kjdt", "重庆时时彩");
	} 
	
	
	
public static pojo getC() throws IOException { 
		
	unit.geturl g=new geturl();
	return g.geticaile("http://ssc.icaile.com/cqssc.php",false);
	
		
	
	} 
}
