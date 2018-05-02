package unit;

import java.io.IOException;

import lottery.lottery.*;

public class Runjsk3 {

	public Runnable Run() {
		// TODO Auto-generated method stub
		pojo p;
		try {
			p = jsk3.getA();
			try {
				UpInfo.Insert("g_history7", p);
			} catch (Exception e) {
				// TODO: handle exception
			}
			

			pojo a = jsk3.getB();
			if (!p.issue.equals(a.issue)) {

				try {
					UpInfo.Insert("g_history7", a);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				//
				pojo b = jsk3.getC();
				
				try {
					UpInfo.Insert("g_history7", b);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
