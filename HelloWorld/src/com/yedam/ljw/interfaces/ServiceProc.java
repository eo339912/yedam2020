package com.yedam.ljw.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.ljw.interfaces.model.Employees;

public class ServiceProc {
	List<Employees> list = new ArrayList<>();
	Service service = new ServiceImpl();
	
	Scanner scn = new Scanner(System.in);
	
	//한건입력, 전체 조회, 한건조회, 수정,  삭제
	public void execute() {
		System.out.println("프로그램 시작");
		while(true) {
			System.out.println("==========================");
			System.out.println("1. 한 건 입력 | 2. 전체 조회 | 3. 한 건 조회 | 4. 수정 | 5. 삭제 ");
			System.out.println("==========================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.hasNextLine();
			
			if(menu == 1) {
				System.out.print("id: ");
				int employeeId = scn.nextInt();
				scn.nextLine();
				
				System.out.print("이름: ");
				String firstName = scn.nextLine();
				
				Employees emp = new Employees();
				emp.setEmployeeId(employeeId);
				emp.setFirstName(firstName);
				
				service.addMember(emp, list);
			}else if(menu == 2) {//전체 조회
				List<Employees> lists = service.getMemberList(list);
				
				for(Employees list : lists) {
					System.out.println(list);
				}
				
			}else if(menu == 3) {//한 건 조회
				System.out.print("id: ");
				int memberId = scn.nextInt();
								
				service.getMember(memberId, list);
				
			}else if(menu == 4) {//수정
//				System.out.print("id: ");
//				int employeeId = scn.nextInt();
//				
//				System.out.print("수정할 이름: ");
//				String firstName = scn.nextLine();
//				
//				
//				Employees emp = new Employees();
//				emp.setEmployeeId(employeeId);
//				emp.setFirstName(firstName);
				
				//service.updateMember(emp, list);
			}else if(menu == 5) {
				break;
			}
		}//while end
		System.out.println("프로그램 종료/");
	}
}
