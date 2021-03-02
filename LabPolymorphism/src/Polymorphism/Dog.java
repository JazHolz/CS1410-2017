package Polymorphism;

public class Dog {
	
	    private final String breed;

	    public Dog(String b)
	    {
	        breed = b;
	    }
  @Override
	    public String toString()
  		{
	    	return this.getClass().getSimpleName() + ":" + breed;
	    }
	    public void communicate()
	    {
	        System.out.println("bark bark");
	    }

	    public void move()
	    {
	        System.out.println("run");
	    }

	    public String getBreed()
	    {
	        return breed;
	    }
	  
	    
	    
	}