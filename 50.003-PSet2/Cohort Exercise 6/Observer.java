//package Week3;

//The Observers update method is called when the Subject changes
import java.util.Arrays;
import java.util.HashMap;
public interface Observer {
	public void update(int notifyCode, HashMap<Observer,String> postOrComments);
	public String getName();
	public void newPost(Post post, String newPost);
	public void editPost(Post post, String newPost);
	public void comment(Post post, String comment);
	public void leave(Post post);
}
