class CreateArray{
	public int[] anyarray;

	public CreateArray(int[] anyarray){
		this.anyarray = anyarray;
	}
	
	public void getindex(int index){
		try{
			System.out.println("Number is:"+anyarray[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}

class Getarray{
	public static void main(String[] args){
		int[] anyarray = {1,2,3,4,5};
		CreateArray a = new CreateArray(anyarray);
		
		a.getindex(2);
		a.getindex(5);
	}
}