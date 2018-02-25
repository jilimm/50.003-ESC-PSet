import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Represents each Observer that is monitoring changes in the subject

public class Subscriber implements Observer {
	
	private String message;
	
	// Static used as a counter
	
	private static int observerIDTracker = 0;
	
	// Used to track the observers
	
	private int observerID;
	private String name;
	private HashMap<Observer, String> comments;
	private HashMap<Observer, String> initialPost;
	private boolean edited; 
	
	// Will hold reference to the StockGrabber object
	
	private ArrayList<Post> postsSubscribedTo;
	
	public Subscriber(Post post, String name){
		
		// Store the reference to the pricingScheme object so
		// I can make calls to its methods
		postsSubscribedTo = new ArrayList<Post>();
		postsSubscribedTo.add(post);
		this.edited = false;
		// Assign an observer ID and increment the static counter
		this.name = name;
		this.observerID = ++observerIDTracker;
		comments = new HashMap<Observer, String>();
		initialPost = new HashMap<Observer, String>();
		// Message notifies user of new observer
		System.out.println("New Subscriber " + this.observerID);
		
		// Add the observer to the Subjects ArrayList
		
		post.register(this);
		
	}

	public void leave(Post post){
		post.unregister(this);
	}
	
	// Called to update all observers
	
	public void update(int notifyCode, HashMap<Observer, String> updatedHashMap) {
		if (notifyCode==0){
			initialPost = updatedHashMap;
		}else if(notifyCode==1){
			initialPost = updatedHashMap;
			edited = false;
		}else{
			comments = updatedHashMap;
		}
		printTheUpdates(notifyCode);
	}
	
	public void printTheUpdates(int notifyCode){
		Object[] poster = initialPost.keySet().toArray();
		Observer postAuthor = (Observer) poster[0];
		Object[] commenters = comments.keySet().toArray();
		if (notifyCode==0){
			System.out.println(name+"'s feed:");
			System.out.println(postAuthor.getName()+"has posted a new message: ");
			System.out.println(initialPost.get(poster[0]));
		} else if(notifyCode==1){
			System.out.println(name+"'s feed:");
			System.out.println(postAuthor.getName()+"has edited their message: ");
			System.out.println(initialPost.get(poster[0])+"edited");
		} else{
			Observer lastCommenter = (Observer) commenters[commenters.length-1];
			System.out.println(name+"'s feed:");
			System.out.println(lastCommenter.getName()+"has just commented: ");
			for (int i=0; i<commenters.length; i++){
				Observer commenter = (Observer) commenters[i];
				System.out.print(commenter.getName()+"commented:");
				System.out.println(comments.get(commenter));
			}
		}
	}

	public void comment(Post post, String comment){
		if (postsSubscribedTo.contains(post)){
			post.addComment(this, comment);
		}else{
			System.out.println(this.name+" is not subscried to the Post "+post.getTopic());
		}
	}

	public void newPost(Post post, String newPost){
		post.postMessage(this, newPost);
	}

	public void editPost(Post post, String edits){
		post.editPost(this, edits);
	}

	public String getName(){
		return this.name;
	}
	
}
