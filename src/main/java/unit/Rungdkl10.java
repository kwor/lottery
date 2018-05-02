package unit;

import java.io.IOException;
import java.util.Calendar;

import lottery.lottery.*;

public class Rungdkl10 {
	public static Long issue = (long) 0;
	public Runnable Run() {
		// TODO Auto-generated method stub

		Calendar ncalendar = Calendar.getInstance();

		Integer hour = ncalendar.get(Calendar.HOUR_OF_DAY);
		//Integer mins = ncalendar.get(Calendar.MINUTE);
		// 广东快乐10
		if (24 > hour && hour > 9) {
			pojo p;
			try {
				p = gdkl10.getC();
				if (issue < p.issue) {
				try {
					UpInfo.Insert("g_history", p);
					issue=p.issue;
				} catch (Exception e) {
					// TODO: handle exception
				}
				}else{
				pojo a = gdkl10.getA();
				if (issue<a.issue) {

					try {
						UpInfo.Insert("g_history", a);
						issue=a.issue;
					} catch (Exception e) {
						// TODO: handle exception
					}
				}else{
					pojo b = gdkl10.getB();
					
					if(issue<b.issue){
					try {
						UpInfo.Insert("g_history", b);
						issue=b.issue;
					} catch (Exception e) {
						// TODO: handle exception
					}
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
