public class MthException {

	public static void main(String[] args) {
		int avg;
		int a=args.length;
		for(int i=0;i<a;i++)
		{
			if(args[i].charAt(args[i].length()-1)==',')
			{
				args[i]=args[i].replace(",","");
			}
		}
		int b[]=new int[a];
		int res=0;
		try
		{
			for(int i=0;i<a;i++)
			{
				b[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<a;i++)
			{
				res+=b[i];
			}
			avg=res/a;
			System.out.println("sum= "+res+" average= "+avg);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}

	}

}
