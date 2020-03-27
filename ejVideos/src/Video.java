import java.util.List;

public class Video {
	String url;
	String title;
	List<String> tags;

	public Video(String url, String title, List<String> tags) throws Exception {
		if (url.equals("") || title.equals("")) {
			throw new Exception("empty field");
		} else {
			this.url = url;
			this.title = title;
			this.tags = tags;
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) throws Exception {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Video [url=" + url + ", title=" + title + ", tags=" + tags + "]";
	}

}
