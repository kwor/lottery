package lottery.lottery;

import java.io.IOException;
import unit.geturl;
import unit.pojo;

public class cqxync {
	public static pojo getA() throws IOException { 
			unit.geturl g=new geturl();
			return g.geticaile("http://cqkl10.icaile.com/",true);
		
	} 
	
	public static pojo getB() throws IOException { 
		
		unit.geturl g=new geturl();
		return g.getcailele("http://zs.cailele.com/cqklsf/baseTrend.php",true);
		
	} 
	
	public static pojo getC() throws IOException { 
		
		 unit.geturl g=new geturl();
		 return g.getpk104("https://www.pk104.com/draw-xync-today.html", "table-xync",true);
		
	} 
}

