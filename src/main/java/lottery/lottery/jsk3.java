package lottery.lottery;

import java.io.IOException;

import unit.geturl;
import unit.pojo;
public class jsk3 {

	public static pojo getA() throws IOException { 
		 unit.geturl g=new geturl();
		 return g.get163("/order/jskuai3/#from=kjdt", "江苏快3");
	} 
	
	public static pojo getB() throws IOException { 
		 unit.geturl g=new geturl();
		 return g.getcailele("http://zs.cailele.com/k3/baseTrend.php",false);
	} 
	
	public static pojo getC() throws IOException { 
		 unit.geturl g=new geturl();
		 return g.getpk104("https://www.pk104.com/draw-js_k3-today.html", "table-js_k3",true);
	} 
	

}
