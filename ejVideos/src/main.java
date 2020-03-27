import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String exit = null;

		System.out.println("Insert your name");
		String name = in.next();
		System.out.println("Insert your surname");
		String surname = in.next();
		System.out.println("Insert a password");
		String password = in.next();

		User user = new User(name, surname, password);

		List<Video> videos = new ArrayList<Video>();
		do {
			try {
				videos.add(CreateVideos(in, exit));
			} catch (Exception e) {
				e.printStackTrace();
			}
			user.setVideos(videos);

			System.out.println("Do you want to add another video? (yes/no)");
			exit = in.next();
		} while (exit.equals("yes"));

		System.out.println(user.toString());
	}


	public static Video CreateVideos(Scanner in, String exit) throws Exception {
		List<String> tags = new ArrayList<String>();

		System.out.println("Add a video url");
		String url = in.next();
		System.out.println("Add a video title");
		String title = in.next();

		do {
			System.out.println("Add a video tag");
			String tag = in.next();
			tags.add(tag);
			System.out.println("Do you want to add another video tag? (yes/no)");
			exit = in.next();
		} while (exit.equals("yes"));
		
		Video myVideo = new Video(url, title, tags);

		System.out.println(myVideo.toString());

		return myVideo;
	}
}