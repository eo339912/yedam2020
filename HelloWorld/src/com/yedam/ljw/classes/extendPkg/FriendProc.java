package com.yedam.ljw.classes.extendPkg;

import java.util.Scanner;

public class FriendProc {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	
	public Friend getFriend(String searchName) {
		Friend friend = null;
		for(Friend f : friends) {
			if(f != null && f.getName().equals(searchName)) {
				friend = f;
			}
		}
		return friend;
	}
	
	public void addFriend() {
		System.out.println("입력");
		System.out.println("1. 대학친구 | 2. 회사친구 | 3. 그 외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		
		System.out.print("이름입력: ");
		String name = scn.nextLine();
		System.out.print("번호입력: ");
		String phone = scn.nextLine();
		
		Friend friend = null;
		
		if(subMenu == 1) {
			//1) 대학 친구.			
			System.out.print("학교입력: ");
			String univ = scn.nextLine();
			
			friend = new UnivFriend(name, phone, univ);
			
		}else if(subMenu == 2) {
			//2) 회사 친구.
			System.out.print("회사입력: ");
			String company = scn.nextLine();
			
			friend = new ComFriend(name, phone, company);
			
		}else if(subMenu == 3) {
			//3) 그 외 친구들.		
			friend = new Friend(name, phone);
		}
		for(int i=0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

	}
	public void listFriend() {
		System.out.println("리스트");
		for(Friend friend : friends) {
			if(friend != null)
				friend.showInfo();
		}
	}
	public void updateFriend() {
		System.out.println("수정");
		System.out.print("찾을 이름 입력: ");
		String name = scn.nextLine();
		Friend f = getFriend(name);
		
		if(f == null) {
			System.out.println("조회결과 없음.");
		}else {
			System.out.print("변경할 번호 입력: ");
			String phone = scn.nextLine();
		
			f.setPhone(phone);
			
			System.out.println("변경완료.");
		}
	}
	public void delFriend() {
		System.out.println("삭제");
		System.out.print("삭제할 이름 입력: ");
		String name = scn.nextLine();
//		Friend f = getFriend(name);
//		
//		if(f == null) {
//			System.out.println("조회결과 없음.");
//		}else {
//			for(int i=0; i <friends.length ;i++) {
//				if(friends[0] == f) {
//					friends[0] = null;
//				}
//			}
//			System.out.println("삭제완료.");
//		}
		boolean isExist = false;
		for(int i=0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				isExist = true;
			}
		}
		if(isExist) {
			System.out.println("삭제완료.");
		}else {
			System.out.println("해당 조건의 값이 없습니다.");
		}
	}
	

	public void exec() {
		while(true) {
			System.out.println("========================");
			System.out.println("1. 입력 | 2. 리스트 | 3. 수정 | 4. 삭제 | 9. 종료");
			System.out.println("========================");
			System.out.print("메뉴선택> ");
			
			int menu = scn.nextInt(); 
			scn.nextLine();
			if(menu == 1) {
				//입력
				addFriend();
			}else if(menu == 2) {
				//리스트
				listFriend();
			}else if(menu == 3) {
				//수정
				updateFriend();
			}else if(menu == 4) {
				//삭제
				delFriend();
			}else if(menu == 9) {
				//종료
				break;
			}//end of if
		}//end of while
		System.out.println("프로그램 종료");
		
	}//end of main
}//end of class
