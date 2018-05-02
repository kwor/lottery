package unit;

import java.io.IOException;
import java.util.Calendar;

import lottery.lottery.*;

public class Runpk10 {

	public static Long issue = (long) 0;
	public Runnable Run() {
		// TODO Auto-generated method stub

		
		Calendar ncalendar = Calendar.getInstance();

		Integer hour = ncalendar.get(Calendar.HOUR_OF_DAY);
		Integer mins = ncalendar.get(Calendar.MINUTE);
		// pk10
		if (24 > hour && hour > 9) {

			//8分开始，2分结束
			if (2 > mins%10 || mins%10 > 8) {
				
				pojo p;
				try {
					
					p = pk10.getA();
					if(issue<p.issue){
						
						UpInfo.Insert("g_history6", p);
						issue=p.issue;
						
						
					}else{
						pojo a = pk10.getB();
						if(issue<a.issue){
							UpInfo.Insert("g_history6", a);
							issue=a.issue;
						}
						
					}
					
					
					

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}else{
				//
				//System.out.println("不在时间内");
			}
			
			//System.out.println(issue);
		} else {
			// 收盘时间
			 //System.out.println("收盘时间：" + hour + "-" + mins);
		}
		return null;

	}

}
