package Board;

public class Post {
	String title; // 글 제목
	String content; // 글 본문. 내용
	String id; // 글 작성자 id
	int num; // 글 번호

	// alt + shift + s >> generate 생성자 유징 필드
	public Post(String title, String content, String id, int num) {
		this.title = title;
		this.content = content;
		this.id = id;
		this.num = num;
	}

}
