package com.yedam.ljw.interfaces;

import java.util.List;

import com.yedam.ljw.interfaces.model.Employees;

public interface Service {
	public void addMember (Employees emp, List<Employees> list);
	public Employees getMember(int memberId, List<Employees> list);
	public List<Employees> getMemberList(List<Employees> list);
	public void updateMember(Employees emp, List<Employees> list);
}
