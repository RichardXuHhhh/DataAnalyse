package api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dataupsh {
	public void updateData(){
		ReturnStr user=new ReturnStr();
		String str=null;
		try{
			str=user.getAnalyseInfo();
		}catch (Exception e){
			e.printStackTrace();
		}

		ConnectDatabase cdb=new ConnectDatabase("longbin");
		Connection conn=cdb.getConnection();
		String sql="insert into shinfo(str) values (?)";
		String sql2="delete from shinfo";
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		try{
			ps1=conn.prepareStatement(sql2);
			ps=conn.prepareStatement(sql);
			ps1.executeUpdate();
			ps.setString(1,str);
			ps.executeUpdate();
		}catch (SQLException e)
		{
			e.printStackTrace();
		}finally {
			try{
				if(ps!=null)
					ps.close();
				if(ps1!=null)
					ps1.close();
				if(conn!=null)
					conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}

		}
	}

	public String getStr(){
		String sql="select * from shinfo";
		String str=new String();
		ResultSet rs=null;
		PreparedStatement ps=null;
		ConnectDatabase cdb=new ConnectDatabase("longbin");
		Connection conn=cdb.getConnection();
		try{
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next())
				str=rs.getString("str");
		}catch (SQLException e)
		{
			e.printStackTrace();
		}finally{
			try{
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return str;
	}
}
