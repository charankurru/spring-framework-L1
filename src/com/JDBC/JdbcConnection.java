package com.JDBC;
import java.sql.*;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnection {

@Value("${mysql.UserName}")
    private String UserName;
@Value("${mysql.Password}")
    private  String Password;
@Value("${mysql.Url}")
    private  String Url;
@Value("${mysql.driver}")
    private  String driver;
private Connection c=null;
private Statement stmt=null;

public void show_details()
{
    System.out.println("UserName"+UserName);
    System.out.println("Password"+Password);
    System.out.println("Url"+Url);
    System.out.println("Driver"+ driver);
}

public void make_connection()
{
    try {
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:test.db");
        stmt = c.createStatement();
    } catch ( Exception e ) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
    System.out.println("Opened database successfully");
}

public void createTable()
{
    try {
        String sqlQ = "Create Table Student(ID INT PRIMARY KEY ,Name VARCHAR(10),Age INT, ADDRESS CHAR(50));";
        stmt.executeUpdate(sqlQ);
        stmt.close();
        c.close();
    }catch (Exception e){
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.exit(0);
    }
    System.out.println("Table Created Successfully");
}

public void InsertData()
{
    try{
        String sql = "INSERT INTO STUDENT VALUES(1232,'CHARAN',20,'VELPULA STREET')";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO STUDENT VALUES(1235,'PRAVEEN',21,'PAPULA STREET')";
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    }
    catch (Exception e)
    {
        System.out.println(e.getClass().getName()+":"+ e.getMessage());
        System.exit(0);
    }
    System.out.println("Data inserted Successfully");
}

public void displayRecords()
{
    try {
        String sql = "Select * from Student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("ID") +" "+ rs.getString("NAME") + " "+ rs.getInt("AGE"));
        }
        rs.close();
        stmt.close();
        c.close();

    }
    catch (Exception e)
    {
        System.out.println(e.getClass().getName()+" :"+e.getMessage());
        System.exit(0);
    }

}


}