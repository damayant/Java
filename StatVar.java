class Parent
{
	static int variable = 3;
}

class Child extends Parent
{}

class StatVar
{
	public static void main(String[] args)
	{
		Child.variable = 13;
		System.out.println(Child.variable);
		System.out.println(Parent.variable);

		
		//System.out.println(Parent.variable);

		Parent newChild = new Parent();
		newChild.variable = 9;
		System.out.println(newChild.variable);
		System.out.println(Child.variable);
		System.out.println(Parent.variable);
	}
}