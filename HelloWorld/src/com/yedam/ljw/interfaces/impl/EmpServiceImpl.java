package com.yedam.ljw.interfaces.impl;

import java.util.List;

import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;
import com.yedam.ljw.interfaces.model.Employees;

public class EmpServiceImpl implements EmpService{
	//2구현클래스 추가
	@Override
	public void addEmp(Employee emp, Employee[] emps) {
		//System.out.println("추가기능.");
		for(int i =0; i < emps.length; i++) {
			if(emps[i] == null) {
				emps[i] = emp;
				break;
			}
		}
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
		//System.out.println("조회기능.");
		for(Employee emp : emps) {
			if(emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void empList(Employee[] emps) {
		//System.out.println("리스트기능.");
		for(Employee emp : emps) {
			if(emp != null) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
		//System.out.println("삭제기능.");
		for(int i=0; i<emps.length; i++) {
			if(emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}
	}

	@Override
	public void searchEmployees() {
		System.out.println("디비조회");	
		EmpDAO dao = new EmpDAO();
		Employees[] empArray = dao.getEmployees();
		for(Employees emp : empArray) {
			if(emp != null) {
				System.out.println(emp.toString());
			}
		}
		//dao.getEmployees();
		
	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("디비입력기능");
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);
	}
	
	//0206
	
	@Override
	public List<Employees> getDBEmployees() {
		EmpDAO dao = new EmpDAO();
		List<Employees> list = dao.getEmpList();
		return list;
	}

	@Override
	public Employees getDBEmployee(int empId) {
		EmpDAO dao = new EmpDAO();
		return dao.getDBEmployee(empId);
	}

	@Override
	public void insertDBEmp(Employees emp) {
		
	}

	@Override
	public void updateDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.updateEmployees(emp);
	}

	@Override
	public void deleteDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.deleteDBEmp(emp);
	}
	
}
