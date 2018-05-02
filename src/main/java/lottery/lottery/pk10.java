package lottery.lottery;

import java.io.IOException;
import unit.geturl;
import unit.pojo;

//pk10平台期数不对
public class pk10 {
	 public static pojo getA() throws IOException{
		 unit.geturl g=new geturl();
		 return g.getbwlc("PK拾","pk10_bg");
	 }
	 
	 public static pojo getB() throws IOException{
		 
		 unit.geturl g=new geturl();
		 return g.getpk104("https://www.pk104.com/draw-pk10-today.html","table-pk10",false);

	}
}
