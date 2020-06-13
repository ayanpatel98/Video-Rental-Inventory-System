package bean;
public class VideoStore 
{
	private Video[] store=null;
	
	public void addVideo(String name)
	{
		Video video=new Video(name);
		int size;
		
		if(store==null)
			size=0;
		else
		{
			size=store.length;
		}
		Video[] tempStore=new Video[size+1];
		for(int i=0;i<size;i++){
			tempStore[i]=store[i];
		}
		tempStore[size]=video;
		this.store=tempStore;
	}
	public void doCheckout(String name) {
		if (store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		
		for (Video video : store) {
			if (video.getName().equals(name)) {
				video.doCheckout();
			}
		}
	}
	
	public void doReturn(String name)
	{
		if(store==null||store.length==0){
			System.out.println("Store is empty");
			return ;
		}
		
		for(Video video:store)
		{
			if(video.getName().equals(name))
			{
				video.doReturn();
			}
		}
	}
	public void receiveRating(String name,int rating)
	{
		if(store==null||store.length==0){
			System.out.println("Store is empty");
		return;
		}
		
		for(Video video:store)
		{
			if(video.getName().equals(name))
			{
				video.receiveRating(rating);
			}
		}
	}
	public void listInventory()
	{
		for (Video video : store) {
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getRating(), video.getCheckout());
		}
	}
}
