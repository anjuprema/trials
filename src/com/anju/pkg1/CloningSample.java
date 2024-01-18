package com.anju.pkg1;

class CloningClass implements Cloneable{
	    int i;
	    String s;
	  
	    // A class constructor
	    public CloningClass(int i,String s)
	    {
	        this.i = i;
	        this.s = s;
	    }
	  
	    // Overriding clone() method
	    // by simply calling Object class
	    // clone() method.
	    @Override
	    protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}
	    
	    
	}
	  
	public class CloningSample
	{
	    public static void main(String[] args)
	        throws CloneNotSupportedException
	    {
	    	CloningClass a = new CloningClass(20, "GeeksForGeeks");
	  
	        // cloning 'a' and holding
	        // new cloned object reference in b
	  
	        // down-casting as clone() return type is Object
	    	CloningClass b = (CloningClass)a.clone();
	  
	        System.out.println(b.i);
	        System.out.println(b.s);
	        a.setI(30);
	        System.out.println(a.i);
	        System.out.println(b.i);
	    }
	}
