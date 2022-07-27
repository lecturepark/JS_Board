package Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Post> posts = new ArrayList<>();

		posts.add(new Post("테스트1", "테스트트1", "테스스스1", 111));
		posts.add(new Post("테스트2", "테수투투2", "테스스스2", 222));
		posts.add(new Post("테스트3", "테스트트3", "테스스스3", 333));

		Scanner sc = new Scanner(System.in);

		zzz: while (true) {
			System.out.println("[1:글 작성, 2:글 리스트, 3:글 읽기, 4:글 삭제, e:프로그램 종료]");
			String cmd = sc.next();

			switch (cmd) {
			case "1": // 글 쓰기. todo
				System.out.println("*****글 쓰기*****");
				System.out.println("제목을 입력해주세요: ");
				String title = sc.next();
				System.out.println("내용을 입력해주세요: ");
				String content = sc.next();
				System.out.println("id를 입력해주세요: ");
				String id = sc.next();
				System.out.println("num을 입력해주세요: ");
				int num = sc.nextInt();
				posts.add(new Post(title, content, id, num));

				break;

			case "2":
				System.out.println("*****글 리스트*****");
				// todo
				// 글 리스트
				for (int i = 0; i < posts.size(); i++) {
					System.out.print(posts.get(i).num);
					System.out.print("");
					System.out.print(posts.get(i).title);
					System.out.print("");
					System.out.print(posts.get(i).content);
					System.out.print("");
					System.out.print(posts.get(i).id);
					System.out.println("");
				}
				break;
			case "3":
				System.out.println("*****글 읽기*****");
				System.out.println("읽을 글 번호 입력: ");
				int readNum = sc.nextInt();
				// todo
				// 글 읽기
//			int readNumIndex = -1;
				for (int i = 0; i < posts.size(); i++) {
					if (posts.get(i).num == readNum) {
						System.out.println("============================");
						System.out.println("작성자 id: " + posts.get(i).title);
						System.out.println("============================");
						System.out.println("글 제목: " + posts.get(i).title);
						System.out.println("============================");
						System.out.println("글 내용: " + posts.get(i).title);
					}
				}
				break;
			case "4":
				System.out.println("*****글 삭제*****");
				System.out.println("삭제할 글 번호 입력: ");
				int dleNum = sc.nextInt();
				// todo
				// 글 읽기
				for (int i = 0; i < posts.size(); i++) {
					if (posts.get(i).num == dleNum)
						System.out.println("글 번호 " + dleNum + "번을 삭제합니다.");
					posts.remove(i);
				}
				System.out.println("현재 작성된 글 리스트");
				for (int i = 0; i < posts.size(); i++) {
					System.out.print(posts.get(i).num);
					System.out.print("");
					System.out.print(posts.get(i).title);
					System.out.print("");
					System.out.print(posts.get(i).content);
					System.out.print("");
					System.out.print(posts.get(i).id);
					System.out.println("");
				}

				break;
			case "e":
				System.out.println("*****프로그램 종료*****");
				break zzz;
			}
		}

	}
}
