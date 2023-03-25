package com.distribuida.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class PruebaConexionJDBC {

	public static void main(String[] args) {
		String jdbcURL="jdbc:sqlserver://localhost:1433;database=DBEventoss;trustServerCertificate=True";
        String user="user";
        String password="1234";

        try {

            System.out.println("Estableciendo conexión..." + jdbcURL);

        Connection connection = DriverManager.getConnection(jdbcURL,user,password);

            System.out.println("Conexión establecida!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
		
}
}