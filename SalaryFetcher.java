package forassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SalaryFetcher implements Runnable{
    private int startId;
    private int endId;
    private double result;

    public SalaryFetcher(int startId,int endId){
        this.startId = startId;
        this.endId = endId;
    }
    public double getResult(){
        return result;
    }
    @Override 
    public void run(){
        result = fetchSalarySum(startId,endId);
        System.out.println(Thread.currentThread().getName() + "fetched sum:"+ result);
    }
    private double fetchSalarySum(int start,int end){
        double sum = 0;
        try{ Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root","Ashish@508"
            );
         PreparedStatement ps = con.prepareStatement(
            "Select salary from employee2 where emp_id between ? and ?"
         );
         ps.setInt(1,start);
         ps.setInt(2,end);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
            sum+=rs.getDouble("salary");
         }
         con.close();
        }catch(Exception e){
          e.printStackTrace();
        }
        return sum;
    }
}
