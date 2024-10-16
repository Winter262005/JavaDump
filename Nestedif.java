class Nestedif
{
	public static void main(String[] args)
	{
		int a = 17;
		if (a%2==0){
			if (a%3==0){
				System.out.println("Divisible by 6");
			}else{
				System.out.println("Divisible by 2");
			}
		}else{
			System.out.println("Not divisible by 2");
		}
	}
}