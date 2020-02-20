package com.yedam.ljw.interfaces.impl;

import java.util.List;

import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;
import com.yedam.ljw.interfaces.model.Employees;

public class EmpServiceImpl2 implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
		System.out.println("더 좋은 추가기능.");
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
		System.out.println("더 좋은 리스트기능.");
	}

	@Override
	public void empList(Employee[] emps) {
		System.out.println("더 좋은 추가기능.");

	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
		System.out.println("더 좋은 삭제기능.");
	}

	@Override
	public void searchEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertEmployees(Employees emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employees> getDBEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employees getDBEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertDBEmp(Employees emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDBEmp(Employees emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDBEmp(Employees emp) {
		// TODO Auto-generated method stub
		
	}

	
}
