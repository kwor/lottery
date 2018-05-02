package unit;

import java.io.IOException;
import java.util.Calendar;

import lottery.lottery.*;

public class Runxync {
	public static Long issue = (long) 0;

	public Runnable Run() {
		// TODO Auto-generated method stub
		Calendar ncalendar = Calendar.getInstance();

		Integer hour = ncalendar.get(Calendar.HOUR_OF_DAY);
		// Integer mins = ncalendar.get(Calendar.MINUTE);

		// pk10
		if (3 > hour || hour > 10) {

			pojo p;
			try {
				p = cqxync.getB();
				if (issue < p.issue) {

					UpInfo.Insert("g_history9", p);
					issue=p.issue;
				} else {
					pojo a = cqxync.getC();
					if (issue < a.issue) {
						UpInfo.Insert("g_history9", a);
						issue=a.issue;
					} else {
						pojo b = cqxync.getA();
						if (issue < b.issue) {
							UpInfo.Insert("g_history9", b);
							issue=b.issue;
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
