package lottery.lottery;

import java.io.IOException;

import unit.geturl;
import unit.pojo;

public class gdkl10 {
	
	
	public static pojo getA() throws IOException {
		
		unit.geturl g=new geturl();
		return g.geticaile("http://gdkl10.icaile.com/",true);
		

	}
	
	public static pojo getB() throws IOException  {
		
		
		unit.geturl g=new geturl();
		return g.getcailele("http://zs.cailele.com/gdklsf/baseTrend.php",true);
		
		

	} 
	
	public static pojo getC() throws IOException  {
		
		
		 unit.geturl g=new geturl();
		 return g.getpk104("https://www.pk104.com/draw-gd_klsf-today.html", "table-gd_klsf",true);

		

	} 
}
