public class thread extends Thread{
    public thread(String name)
    {
    super(name);
    }
    public void run()
    {
        try
         {
            for(int x=1;x<=5;x++)
            {
            System.out.println("Thread name ="+ Thread.currentThread().getName());
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}

