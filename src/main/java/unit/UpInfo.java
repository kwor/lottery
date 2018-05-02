package unit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class UpInfo {

	
	
	/*
	 * 更新数据
	 */
	public static boolean Insert(String dbname,pojo p) throws IOException{ 
		
		if (p.issue != null && !p.issue.equals("")&&!p.issue.equals(0)) {
   	     //do something
			p.setIssue(p.issue) ;
		
		
		List<String> sp=p.lotterynumber;
	   
		String sql="update "+dbname+" set ";
		
		for (int i = 0; i < sp.size(); i++) {
			
			sql+="g_ball_"+(i+1)+"="+sp.get(i);
			if(i<sp.size()-1){
				sql+=",";
			}
		}
			
		sql+= " where g_ball_1 is null and g_qishu="+p.issue;

		
		Connection conn = DBUtil.getConnection();
		PreparedStatement psql = null;
		try {
			psql = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			psql.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//*/
		System.out.println(sql);
		}else{
			System.out.println("no data");
		}
		return true;
	} 
	
	
}
