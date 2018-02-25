public class SocialMediaTest {
	public static void main(String[] args){
		SocialMedia testPost1 = new SocialMedia("topic1");

		//create soc Media users
		Observer obj1 = new Subscriber(testPost1, "User1");
		Observer obj2 = new Subscriber(testPost1, "User2");
		Observer obj3 = new Subscriber(testPost1, "User3");

		obj1.newPost(testPost1, "hello");
		obj2.comment(testPost1, "Hi there");
		obj3.comment(testPost1, "please no spam");

		obj1.editPost(testPost1, "Hello this post is not for unfriendly people");
		obj3.leave(testPost1);


	}
}