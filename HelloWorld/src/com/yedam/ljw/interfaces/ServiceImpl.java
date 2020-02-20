package com.yedam.ljw.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.yedam.ljw.interfaces.model.Employees;

public class ServiceImpl implements Service{

	@Override
	public void addMember(Employees emp, List<Employees> list) {
		list.add(emp);
	}

	@Override
	public Employees getMember(int memberId, List<Employees> list) {
		Employees emps = null;
		for(Employees emp : list) {
			if(emp != null && emp.getEmployeeId() == memberId) {
				emps = emp;
			}
		}
		//return null;
		return emps;
	}

	@Override
	public List<Employees> getMemberList(List<Employees> list) {
		List<Employees> destList = new ArrayList<>();
		
		for(Employees emp : list) {
			destList.add(emp);
		}
		
		return destList;
	}

	@Override
	public void updateMember(Employees emp, List<Employees> list) {
		
		//List<Employees> destList = new ArrayList<>();
		for(Employees emp1 : list) {
			if(emp1 != null) {
				System.out.println(emp1.toString());
			}
		}
		
	}

}
