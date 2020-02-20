package com.yedam.ljw.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.ljw.interfaces.common.DAO;
import com.yedam.ljw.interfaces.model.Employees;

public class EmpDAO {
	//0206
	Connection conn = null; //오라클 디비와 연결
	PreparedStatement pstmt = null; //sql 실행 관련 명령문
	ResultSet rs = null;
	//1. 디비 전체 조회
	public List<Employees> getEmpList(){
		conn = DAO.getConnect(); 
		String sql = "select * from emp_temp";
		List<Employees> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //쿼리 실행
			
			while(rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DAO.close(conn);
		}
		return list;
	}
	//2. 디비 한 건 조회
	public Employees getDBEmployee(int emps) {
		conn = DAO.getConnect();
		String sql = "select * from emp_temp where employee_id = ?";
		Employees emp = new Employees();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emps);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DAO.close(conn);
		}
		
		return emp;
	}
	//3. 디비 입력
	
	//4. 디비 수정
	public void updateEmployees(Employees emp) {
		conn = DAO.getConnect();
//		String sql = "update emp_temp set salary = salary + ?, email = ? where employee_id = ?";
		String sql = "update emp_temp set first_name = first_name";
		
		if(emp.getSalary() != 0) {
			sql = sql + ", salary = salary + ?";
		}
		if(emp.getEmail() != null && !emp.getEmail().equals("")) {
			sql = sql + ", email = ?";
		}
		sql = sql + "where employee_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			int cnt = 0;
			if(emp.getSalary() != 0) 
				pstmt.setInt(++cnt,  emp.getSalary());
			if(emp.getEmail() != null)
				pstmt.setString(++cnt,  emp.getEmail());
			pstmt.setInt(++cnt,  emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DAO.close(conn);
		}
		
	}
	
	public void deleteDBEmp(Employees emp) {
		conn = DAO.getConnect();
		String sql = "delete from emp_temp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  emp.getEmployeeId());
			
			int d = pstmt.executeUpdate();
			System.out.println(d + "건이 삭제되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DAO.close(conn);
		}
	}
	
	
	//3기능추가
	public void insertEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "INSERT INTO emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n" + 
				"values(employees_seq.nextval, ?, ?, sysdate, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate();//실행하겠다. 들어간 건수만큼 값을 반환
			System.out.println(cnt + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public Employees[] getEmployees() { //Employees파일에 변수로 반환하겠다.
		conn = DAO.getConnect();
		String sql = "select * from employees";
		Employees[] emps = new Employees[100]; 
		
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //쿼리문 실행
			while(rs.next()) {//데이터가 있는만큼 반복실행
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				
				emps[cnt++] = emp;
				
				
				
				
				//System.out.println(rs.getInt("employee_id") + "," + rs.getString("first_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emps;	
	}
}
