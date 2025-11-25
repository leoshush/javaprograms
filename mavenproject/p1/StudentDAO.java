package com.mavenproject.p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	    public List<StudentDto> getAllStudents() throws Exception{
    	Connection conn = DbConnector.getConnection();
    	PreparedStatement ps = conn.prepareStatement("select * from student");
        ResultSet rs =	ps.executeQuery();
    	List<StudentDto> l1 = new ArrayList<StudentDto>();
    	while(rs.next()) {
    		l1.add(new StudentDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
    	}
        return l1;
    }
	    
    public StudentDto getById(StudentDto ob) throws Exception{
    	Connection conn = DbConnector.getConnection();
    	PreparedStatement ps = conn.prepareStatement("select * from student where sroll= ?");
    	ps.setInt(1, ob.getSroll());
        ResultSet rs =	ps.executeQuery();
        if(rs.next()) {
        	ob.setFirstname(rs.getString(2));
        	ob.setLname(rs.getString(3));
        	ob.setDob(rs.getString(4));
        	ob.setGender(rs.getString(5));
        }
        else {
        	throw new Exception("sroll "+ob.getSroll()+"does not exist");
        }
      return ob;
    }
    public int insertStudent(StudentDto ob) throws Exception{
        
    	Connection conn = DbConnector.getConnection();
    	PreparedStatement ps = conn.prepareStatement("insert into student(sroll,firstname,lname,dob,gender) values(?,?,?,?,?) ");
    	ps.setString(2, ob.getFirstname());
    	ps.setInt(1,ob.getSroll());
    	ps.setString(3, ob.getLname());
    	ps.setString(4, ob.getDob());
    	ps.setString(5,ob.getGender());
    	int rowsinserted = ps.executeUpdate();
    	
    	
    	return rowsinserted;
    }
    
    public Boolean deleteStudentById(StudentDto ob) throws Exception{
    	
    	Connection conn = DbConnector.getConnection();
    	PreparedStatement ps = conn.prepareStatement("delete from student where sroll = ?");
    	ps.setInt(1, ob.getSroll());
    	
    	int val = ps.executeUpdate();
    	return val>0?true:false;
    }
}
// 