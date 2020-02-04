package com.yedam.ljw.interfaces.control;

import java.util.Scanner;

import com.yedam.ljw.interfaces.impl.EmpServiceImpl;
import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;

public class EmpProc {
	Employee[] employees = new Employee[10]; 
	
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();
	
	public void execute() {
		System.out.println("프로그램 시작.");
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 추가기능 | 2. 조회기능 | 3. 리스트기능 | 4. 삭제기능 | 5. 종료");
			System.out.println("=====================");
			System.out.print("선택> ");
			
			int menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == 1) {
				System.out.print("이름: ");
				String name = scn.nextLine();
				
				System.out.print("사원번호: ");
				int empNo = scn.nextInt();
				
				System.out.println("급여: ");
				int salary = scn.nextInt();
				
				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);
				
			}else if(menu == 2) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.searchEmp(no, employees);
			}else if(menu == 3) {
				service.empList(employees);
			}else if(menu == 4) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				service.delEmp(no, employees);
			}else if(menu == 5) {
				break;
			}
			
		}//end of while
		System.out.println("프로그램 종료/");
	}//end of main
}//end of class
