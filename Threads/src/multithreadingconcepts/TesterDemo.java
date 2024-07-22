package multithreadingconcepts;

public class TesterDemo {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
//		The main thread is created automatically when our program is started. 
//		To control it we must obtain a reference to it.
//		This can be done by calling the method currentThread( ) which is present in Thread class.
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		thread.setName("Hi Kavya");
		thread.setPriority(10);
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
	}

}
