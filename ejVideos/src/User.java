import java.util.Date;
import java.util.List;

public class User {
	String name;
	String surname;
	String password;
	Date date;
	List<Video> videos;

	public User() {

	}

	public User(String name, String surname, String password) throws Exception {
		if (name.equals("") || surname.equals("") || password.equals("")) {
			throw new Exception("empty field");
		} else {
			setName(name);
			setSurname(surname);
			setPassword(password);
			this.date = new Date();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public void addVideos(Video video) {
		this.getVideos().add(video);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", password=" + password + ", date=" + date + ", videos="
				+ videos + "]";
	}

}
