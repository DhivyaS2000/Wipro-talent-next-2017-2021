public class Exp3 {

	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number if array:");
		a=in.nextInt();
		int b[]=new int[a];
		System.out.println("enter the array element:");
		try{
			for (int i=0;i<a; i++)
			{
				b[i]=in.nextInt();
			}
			System.out.println("Enter the index of the array element you want to acess:");
			int ind=in.nextInt();
			System.out.println("The array Element at index "+ind+" = "+b[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundException");
			
		}catch(Exception e) {
			System.out.println("Number Format Exception");
		}

	}

}
