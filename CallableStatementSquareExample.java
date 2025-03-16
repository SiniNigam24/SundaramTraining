package com.connection;

import java.sql.*;

public class CallableStatementSquareExample {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM"; 
        String password = "SiniNigam"; 

        Connection conn = null;
        CallableStatement cstmt = null;

        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");

           
            conn = DriverManager.getConnection(url, user, password);

            
            String sql = "{ call HR.find_square(?, ?) }";
            cstmt = conn.prepareCall(sql);

            
            int inputNumber = 5;  
            cstmt.setInt(1, inputNumber);

          
            cstmt.registerOutParameter(2, Types.NUMERIC);

        
            cstmt.execute();

           
            int squareResult = cstmt.getInt(2);
            System.out.println("Square of " + inputNumber + " is: " + squareResult);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            try {
                if (cstmt != null) cstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
