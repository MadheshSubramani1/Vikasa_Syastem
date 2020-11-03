package RunnableAndThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadExambleforCollection {

	public static void main(String[] args) throws InterruptedException {

		//List<String> safelist = new CopyOnWriteArrayList<String>();
		 List<String> safelist=Collections.synchronizedList(new ArrayList<String>());

		  safelist.add("madhesh");
		  safelist.add("guna");
		  safelist.add("Revathi");

		System.out.println("Before update the List " + safelist);

		Thread t1 = new Thread(() -> {
			
			Iterator<String> iterator=safelist.iterator();
			
		
				synchronized (safelist) {
					
				while (iterator.hasNext()) {
					System.out.println("first Thread ->" + iterator.next());
					try {Thread.sleep(500);} catch (Exception e) {}

				}}});

		Thread t2 = new Thread(() -> {
			
			Iterator<String> iterator1=safelist.iterator();

			synchronized (safelist) {			
				while (iterator1.hasNext()) {
					/*
					 * if (safelist.size() == 3) { safelist.add("Subramani"); }
					 */
					System.out.println("Second Thread ->" + iterator1.next());
					try {Thread.sleep(500);} catch (Exception e) {}

				

				}}});

		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();

		t1.join();
		t2.join();

		System.out.println("after update the List " + safelist);

	}

}
