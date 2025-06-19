package raccolta.logica;

public class Logica {

	public void conta_5()
	{
		int conta=0;
		for (int i = 27; i <= 55; i++)
			if( i % 2 == 0 )
				conta++;
		System.out.println(conta);	
	}

	public void conta_4()
	{
		for (int i = 20; i <= 40; i++)
			if( i % 2 == 1 )
				System.out.println(i);
	}
	
	public void conta_1()
	{
		for (int i = 1; i <= 10; i++) {
			if(i >= 3 && i < 7 )
				System.out.println(i);
		}
	}
	
	public void conta_2()
	{
		for (int i = 12; i <= 24; i++) {
			if(i >= 22 || i <= 24 )
				System.out.println(i);
		}
	}
	public void conta_3()
	{
		for (int i = 10; i > 1; i--) {
			if( i % 2 == 0)
				System.out.println(i);
		}
	}
	
	
}
