import bean.*;
import java.io.*;
import java.lang.*;
import java.util.*;
public class VideoLauncher
{

	public static void main(String[] args) 
	{
		VideoStore store=new VideoStore();
		Scanner sc= new Scanner(System.in);
		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.println("1.Add Videos:");
		System.out.println("2. Check Out Video :");
		System.out.println("3. Return Video :");
		System.out.println("4. Receive Rating :");
		System.out.println("5. List Inventory :");
		System.out.println("6. Exit :");
		System.out.println("Enter your choice: ");
		int opt=sc.nextInt();
		String name;
		
		switch(opt)
		{
		case 1:
			System.out.println("Enter the name of the video you want to Add: ");
			name = sc.next();
			store.addVideo(name);
			System.out.println("Video " + name + " added out successfully.");
			break;
			
		case 2:
			System.out.println("Enter the name of the video you want to check out: ");
			name=sc.next();
			store.doCheckout(name);
			System.out.println("Video " + name + " checked out successfully.");

			break;
			
		case 3:
			System.out.println("Enter the name of the video you want to Return: ");
			name=sc.next();
			store.doReturn(name);
			System.out.println("Video " + name + " returned successfully.");
			break;
			
		case 4:
			System.out.println("Enter the name of the video you want to Rate: ");
		    name=sc.next();
			System.out.println("Enter the rating for this video: ");
			int rating=sc.nextInt();
			store.receiveRating(name, rating);
			System.out.println("Rating " + rating + " has been mapped to the Video " + name + ".");
			break;		    

		case 5:
			System.out.println("--------------------------------------------------------");
			System.out.println("Video Name	 | 		Checkout Status		 |		 Rating");
			store.listInventory();
			System.out.println("--------------------------------------------------------");
			break;
		case 6:
			System.out.println("Exiting...!! Thanks for using the application.");
			break;

			
		}
		
	}

}
