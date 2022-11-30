package basic._class;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board("타이틀1", "컨텐츠1");
		Board board2 = new Board("타이틀2", "컨텐츠2", "rara");
		Board board3 = new Board("타이틀3", "컨텐츠3", "rara", "2022-11-30");
		Board board4 = new Board("타이틀4", "컨텐츠4", "rara", "2022-11-30", 10);
	}
}
