package com.anju.theadPkg;

public class test
{
  Object syncObj = new Object();

  public static void main(String args[])
  {
    new test();
  }

  public test()
  {
    startBackgroundThread();

    System.out.println("Main thread waiting...");
    try
    {
      synchronized(syncObj)
      {
        syncObj.wait();
      }
    }
    catch(InterruptedException ie) { }
    System.out.println("Main thread exiting...");
  }

  public void startBackgroundThread()
  {
    (new Thread(new Runnable()
    {
      @Override
      public void run()
      {
        //Do something big...
        System.out.println("Background Thread doing something big...");
        //THEN HOW TO NOTIFY MAIN THREAD?
        synchronized(syncObj)
        {
          System.out.println("Background Thread notifing...");
      syncObj.notify();
        }
        System.out.println("Background Thread exiting...");
      }
    })).start();
  }
}
