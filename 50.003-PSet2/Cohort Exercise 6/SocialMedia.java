import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

//Uses the Subject interface to update all Observers

public class SocialMedia implements Post {
	
	// maintains the list of all subscribers to the pricing scheme
	// However, not really aware of what type of subscribers they are (e.g. University/Corporate/Individual)
	
	private String post;
	private String topic;
	private ArrayList<Observer> observers;
	private HashMap<Observer, String> comments;
	private HashMap<Observer, String> initialPost;
	private boolean edited;
	
	public SocialMedia(String topic){
		// Creates an ArrayList to hold all observers
		this.topic =topic;
		edited = false;
		observers = new ArrayList<Observer>();
		initialPost = new HashMap<Observer,String>(1);
		comments = new HashMap<Observer, String>();
	}
	
	public void register(Observer newObserver) {
		
		// Adds a new observer to the ArrayList
		if (!observers.contains(newObserver)){
			observers.add(newObserver);
		}
	}

	public void unregister(Observer deleteObserver) {
		
		// Get the index of the observer to delete
		int observerIndex = observers.indexOf(deleteObserver);
		
		// Print out message (Have to increment index to match)
		
		System.out.println("User " + (observerIndex+1) + " has left");
		
		// Removes observer from the ArrayList
		observers.remove(observerIndex);
		
	}

	public void notifyObserver(int notifyCode, HashMap<Observer, String> newHashMap) {
		
		// Cycle through all observers and notifies them of
		// price changes
		for (Observer observer: observers){
			if (notifyCode==2){
				observer.update(notifyCode, comments);
			}else{
				observer.update(notifyCode, initialPost);
			}
		}
	}

	public String getTopic(){
		return this.topic;
	}
	
	// Change pricing scheme and notifies observers of changes
	
	public void postMessage(Observer observer, String message){
		if (initialPost.size()>0){
			System.out.println("ERROR post has already been done please edit or comment");
		}else{
			initialPost.put(observer, message);
			notifyObserver(0, initialPost);
		}
				
	}

	public void addComment(Observer observer, String newComment){
		comments.put(observer, newComment);

		notifyObserver(2, comments);
	}

	public void editPost(Observer observer, String newPost){
		if (initialPost.containsKey(observer)){
			initialPost.put(observer, newPost);
			edited = true;

			notifyObserver(1, initialPost);
		}else{
			System.out.println("ERROR: Cannot edit post if you are not the author");
		}
	}
}