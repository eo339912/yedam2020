package com.yedam.ljw.interfaces.control;

import java.util.List;
import java.util.Scanner;

import com.yedam.ljw.interfaces.impl.EmpServiceImpl;
import com.yedam.ljw.interfaces.model.EmpService;
import com.yedam.ljw.interfaces.model.Employee;
import com.yedam.ljw.interfaces.model.Employees;

public class EmpProc {
	Employee[] employees = new Employee[10]; 
	
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();
	
	public void execute() {
		System.out.println("프로그램 시작.");
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 추가기능 | 2. 조회기능 | 3. 리스트기능 | 4. 삭제기능 | 5. 종료 |8. 전체 조회| 9. 한건 조회| 10. 수정 | 11. 삭제");
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
			}else if(menu == 6) {
				service.searchEmployees();
				
			}else if(menu == 7) {
				System.out.println("last입력");
				String lastName = scn.nextLine();
				System.out.println("이메일입력");
				String email = scn.nextLine();
				System.out.println("업무입력"); //IT_PROG
				String jobId = scn.nextLine();
				
				Employees emp = new Employees();
				
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);
				
				service.insertEmployees(emp);
			}else if(menu == 8) {
				List<Employees> list = service.getDBEmployees();
				for(Employees emp : list) {
					System.out.println(emp);
				}
			}else if(menu == 9) {
				System.out.println("사원번호 입력: ");
				int no = scn.nextInt();
				//service.searchEmp(no, employees);
				Employees emp = service.getDBEmployee(no);
				System.out.println(emp);
				
			}else if(menu == 10) {
								
				System.out.println("조회 사원 입력");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("급여 인상분 입력(엔터 = x)");
				String salNum = scn.nextLine();
				System.out.println(salNum);
				int sal = 0;
				if (salNum != null && !salNum.equals("") ) {
					sal = Integer.parseInt(salNum); //문자를 숫자타입으로 바꿔주세요.
				}
				//int sal = scn.nextInt();
				//scn.nextLine();
				System.out.println("변경할 이메일 입력(엔터 = x)");
				String email = scn.nextLine();
				
				Employees emp = new Employees();
				emp.setSalary(sal);
				emp.setEmail(email);
				emp.setEmployeeId(empId);
				
				
				
				service.updateDBEmp(emp);
			}else if(menu == 11) {
				System.out.println("삭제 사원 입력");
				int empId = scn.nextInt();
				scn.nextLine();
				
				Employees emp = new Employees();
				emp.setEmployeeId(empId);
				
				service.deleteDBEmp(emp);
			}
			
		}//end of while
		System.out.println("프로그램 종료/");
	}//end of main
}//end of class
