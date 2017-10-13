class Parent
{
	void print(){System.out.println("Parent class");}
}

class Child extends Parent
{
	void print(){System.out.println("Child class");}
}

abstract class Sample
{
	void printing(){};
}

class TryOut extends Sample
{
	String printing()
	{
		String s = "Abstact class inherited by non-static class";
		return s;
	}
}

class Check
{
	public static void main(String[] args)
	{
		Parent p = new Child ();
		p.print();
		TryOut t = new TryOut();
		t.printing();
		// Child c = new Parent();
		// c.print();
	}
}