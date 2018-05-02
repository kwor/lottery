package unit;

import java.io.IOException;
import java.util.Calendar;

import lottery.lottery.*;

public class Runcqssc {

	public static Long issue = (long) 0;

	public Runnable Run() {
		// TODO Auto-generated method stub
		//
		Calendar ncalendar = Calendar.getInstance();

		Integer hour = ncalendar.get(Calendar.HOUR_OF_DAY);
		//Integer mins = ncalendar.get(Calendar.MINUTE);
		// 重庆时时彩
		if (hour > 9 || hour < 2) {

			
			pojo p = null;
			try {
			
				
				Long issueval=(long) 0;
				p = cqssc.getB();
				if (p.issue==null) {
					 issueval=p.issue;
				}
			
				if (issue < issueval) {
					UpInfo.Insert("g_history2", p);
					issue = p.issue;
					System.out.println("p"+ p.issue);
				} else {

						
						pojo b = cqssc.getC();
						if(b.issue!=null){
						if (issue < b.issue) {

							UpInfo.Insert("g_history2", b);
							issue = b.issue;
							System.out.println("b"+ b.issue);
						}
						}
				

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		} else {
			// 收盘时间
			// System.out.println("收盘时间：" + hour + "-" + mins);
		}
		return null;

	}

}
