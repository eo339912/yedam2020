package com.yedam.ljw.interfaces.impl;

import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;

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
	public void delEmp(int empNo) {
		System.out.println("더 좋은 삭제기능.");
	}
	
}
