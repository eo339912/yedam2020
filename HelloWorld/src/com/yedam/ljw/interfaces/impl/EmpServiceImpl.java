package com.yedam.ljw.interfaces.impl;

import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;

public class EmpServiceImpl implements EmpService{

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
	
}
