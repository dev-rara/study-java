package basic._class;

public class MemberService {

	boolean login(String id, String password) {
		return id.equals("hong") && password.equals("12345");

//		if (id.equals("hong") && password.equals("12345")) {
//			return true;
//		}
//		return false;
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}


}
