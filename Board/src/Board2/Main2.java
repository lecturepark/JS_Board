package Board2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int Autonum = 4;
		ArrayList<Post2> posts2 = new ArrayList<>();
		posts2.add(new Post2("이거좋은건가요?", "10연차 만에 나왔는데 이거 좋은거네요", "비틱", 1));
		posts2.add(new Post2("오늘땡땡이가한게임가요?", "알려주세요", "애청자", 2));
		posts2.add(new Post2("100억버튼누르기", "몰?루", "어그로", 3));
		Scanner sc = new Scanner(System.in);

		xxx: while (true) {
			System.out.println("[1.글 작성, 2.글 리스트,3.글 읽기, 4.글 수정, 5.글 삭제, 6.제목 검색, e.프로그램 종료]");
			String cmd = sc.next();

			switch (cmd) {
			case "1":
				System.out.println("*****글 작성******");
				System.out.println("글 제목을 입력하세요");
				String title = sc.next();
				System.out.println("글 내용을 입력하세요");
				String content = sc.next();
				System.out.println("id를 입력하세요");
				String id = sc.next();
				int num = Autonum++;
				posts2.add(new Post2(title, content, id, num));

				break;
			case "2":
				System.out.println("*****글 리스트******");

				for (int i = 0; i < posts2.size(); i++) {
					System.out.print("글 제목 : ");
					System.out.print(posts2.get(i).title);
					System.out.println("");
					System.out.print("글 넘버 : ");
					System.out.print(posts2.get(i).num);
					System.out.println("");
					System.out.println("//////////////////"); // 공백용

				}

				break;

			case "3":
				System.out.println("*****글 읽기******");
				System.out.println("읽고 싶은 글 번호를 입력하세요");
				for (int i = 0; i < posts2.size(); i++) {
					System.out.print(posts2.get(i).num);
					System.out.println("");
				}
				int readNum = sc.nextInt();
				for (int i = 0; i < posts2.size(); i++) {
					if (posts2.get(i).num == readNum) {
						System.out.print("글 제목 : ");
						System.out.print(posts2.get(i).title);
						System.out.println("");
						System.out.print("내용 : ");
						System.out.print(posts2.get(i).content);
						System.out.println("");
						System.out.print("작성자 id : ");
						System.out.print(posts2.get(i).id);
						System.out.println("");
						System.out.print("글 넘버 : ");
						System.out.print(posts2.get(i).num);
						System.out.println("");
					}
				}

				break;

			case "4":
				System.out.println("*****글 수정******");
				System.out.println("수정하고 싶은 글 번호를 입력하세요");
				for (int i = 0; i < posts2.size(); i++) {
					System.out.print(posts2.get(i).num);
					System.out.println("");
				}
				int edtNum = sc.nextInt();
				for (int i = 0; i < posts2.size(); i++) {
					if (posts2.get(i).num == edtNum) {
						System.out.println(edtNum + "번 글을 수정합니다");
						System.out.println("*****글 작성******");
						System.out.println("글 제목을 입력하세요");
						String title1 = sc.next();
						posts2.get(i).title = title1;
						System.out.println("글 내용을 입력하세요");
						String content1 = sc.next();
						posts2.get(i).content = content1;
						System.out.println("id를 입력하세요");
						String id1 = sc.next();
						posts2.get(i).id = id1;
//						System.out.println("번호를 입력하세요");
//						int num1 = sc.nextInt();
//						posts2.get(i).num = num1;
					}
				}
				break;

			case "5":
				System.out.println("*****글 삭제******");
				System.out.println("삭제하고 싶은 글 번호를 입력하세요");
				for (int i = 0; i < posts2.size(); i++) {
					System.out.print(posts2.get(i).num);
					System.out.println("");
				}
				int dleNum = sc.nextInt();
				for (int i = 0; i < posts2.size(); i++) {
					if (posts2.get(i).num == dleNum) {
						posts2.remove(i);
						System.out.println(dleNum + "번 글이 삭제됐습니다");
						System.out.println("*****현재 글 리스트*****");

					}
				}
				for (int i = 0; i < posts2.size(); i++) {
					System.out.print(posts2.get(i).num);
					System.out.println("");
				}

				break;
				
			case "6":
				System.out.println("*****제목 검색*****");
				System.out.println("제목을 입력하면 일치한 글을 찾습니다.");
				for (int i = 0; i < posts2.size(); i++) {
					System.out.println("");
				}
				String bringtitle = sc.next();
				for (int i = 0; i < posts2.size(); i++) {
					if (posts2.get(i).title.equals(bringtitle)) {
						System.out.print("글 제목 : ");
						System.out.print(posts2.get(i).title);
						System.out.println("");
						System.out.print("내용 : ");
						System.out.print(posts2.get(i).content);
						System.out.println("");
						System.out.print("작성자 id : ");
						System.out.print(posts2.get(i).id);
						System.out.println("");
						System.out.print("글 넘버 : ");
						System.out.print(posts2.get(i).num);
						System.out.println("");
					}
				}

				break;

			case "e":
				System.out.println("*****프로그램을 종료합니다******");

				break xxx;
			}
		}
	}
}
