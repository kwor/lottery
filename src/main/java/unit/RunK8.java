package unit;

import java.io.IOException;
import lottery.lottery.*;

public class RunK8 {

	public Runnable Run() {
		// TODO Auto-generated method stub
		
		pojo p;
		try {
			p = k8.getA();
			UpInfo.Insert("g_history8",p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
		
	  
	}
	
	
}
