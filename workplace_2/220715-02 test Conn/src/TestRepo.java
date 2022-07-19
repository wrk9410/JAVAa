import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BooksRepository repo = new BooksRepository();

		int result;
		
//		try { // booksRepository에서 throws한 예외를 main에서 처리
			/*추가*/
//			result = repo.add(new Book("테스트용 책123", 55000));
//			System.out.println("추가확인 : " + (result == 1));
//		} catch (SQLException e) {
//			System.out.println(e.getErrorCode());
//		}
		
//		try {
			/*목록 전체*/
//			List<Book> list = repo.list();
//			System.out.println(list);
//		} catch (SQLException e) {
//			System.out.println(e.getErrorCode());
//		}
		
//		try {
			/*목록 제목*/
//			Book book = repo.selectByTitle("나의 해방일지");
//			System.out.println(book);
//		} catch (SQLException e) {
//			System.out.println(e.getErrorCode());
//		}
		
		try {
			/*수정*/
			result = repo.update(new Book(10, "자바에서 변경한 새이름", 5000));
			System.out.println(result == 1);
			
			Book book = repo.selectByTitle("자바에서 변경한 새이름");
			System.out.println(book);
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
		}
		
		
	}
}
