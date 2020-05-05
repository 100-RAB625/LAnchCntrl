class StrngCpy{
public static void main(String[] args)
{
	Object o = new Object();
	if(o instanceof Object)
	{
		System.out.println("Object is of o");
	}
	else
		System.out.println("Not quite");
	
}
}
class Object
{
	Object()
	{
		System.out.println("Student is Initialized");
	}
}

