//package Week3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public interface Post {
	public void register(Observer o);
	public void unregister(Observer o);
	public String getTopic();
	public void addComment(Observer observer, String newComment);
	public void notifyObserver(int notifyCode, HashMap<Observer, String> newHashMap);
	public void postMessage(Observer observer, String message);
	public void editPost(Observer observer, String newPost);	
}
