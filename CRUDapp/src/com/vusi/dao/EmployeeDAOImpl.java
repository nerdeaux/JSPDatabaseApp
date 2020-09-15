package com.vusi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.vusi.model.Employee;
import com.vusi.util.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
	@Override
	public List<Employee> get() {
		
		List<Employee> list = null;
		Employee employee = null;
		
		try {
			
			list = new ArrayList<Employee>();
			String sql = "SELECT * FROM EmployeeHR";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				employee = new Employee();
				employee.setEmployeeID(resultSet.getInt("EmployeeID"));
				employee.setFull_Name(resultSet.getString("Full_Name"));
				employee.setTelephone_Number(resultSet.getString("Telephone_Number"));
				employee.setHome_Location(resultSet.getString("Home_Location"));
				employee.setBranch_Name(resultSet.getString("Branch_Name"));
				employee.setBranch_Location(resultSet.getString("Branch_Location"));
				list.add(employee);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee get(int id) {
		Employee employee = null;
		try {
			employee = new Employee();
			String sql = "SELECT * FROM EmployeeHR where EmplyeeID="+id;
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				employee.setEmployeeID(resultSet.getInt("EmployeeID"));
				employee.setFull_Name(resultSet.getString("Full_Name"));
				employee.setTelephone_Number(resultSet.getString("Telephone_Number"));
				employee.setHome_Location(resultSet.getString("Home_Location"));
				employee.setBranch_Name(resultSet.getString("Branch_Name"));
				employee.setBranch_Location(resultSet.getString("Branch_Location"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public boolean save(Employee e) {
		boolean flag = false;
		try {
			String sql = "INSERT INTO EmployeeHR(Full_Name, Telephone_Number, Home_Location, Branch_Name, Branch_Location)"
					+ "VALUES"
					+ "('"+e.getFull_Name()+"', '"+e.getTelephone_Number()+"', '"+e.getHome_Location()+"', '"+ e.getBranch_Name()+"', '"+e.getBranch_Location()+"')";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(int id) {
		boolean flag = false;
		try {
			String sql = "DELETE FROM EmployeeHR where EmployeeID="+id;
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(Employee employee) {
		boolean flag = false;
		try {
			String sql = "UPDATE EmployeeHR SET Full_Name = '"+employee.getFull_Name()+"', "
					+ "Branch_Name = '"+employee.getBranch_Name()+"' where EmployeeID="+ employee.getEmployeeID();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
