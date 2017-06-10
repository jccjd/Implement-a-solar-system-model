package Thread;

/**
 * Created by lenovo on 2017/6/1.
 */
public class myThread extends Thread {
    public myThread(String name)
    {

        setName(name);
    }
    public void voice(){
        
        System.out.println("voice");
        
    }
    public void run()
    {
        int i=0;
        while (i++<5)
        {
            try
            {
                System.out.println(getName()+"执行步骤"+i);
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        myThread thread1=new myThread("thread1");
        myThread thread2=new myThread("thread2");
        myThread thread3= new my Thread("thread3");
        thread1.start();
        thread2.start();
        thread3.start();

    }


}
