/*public class Puppy{
   public Puppy(String name){
      //这个构造器仅有一个参数：name
      System.out.println("Passed Name is :" + name ); 
   }
   public static void main(String []args){
      // 下面的语句将创建一个Puppy对象
      Puppy myPuppy = new Puppy( "tommy" );
   }
}*/

public class Puppy{
	int puppyAge;
	public Puppy(String name){
		//这个构造函数仅有一个参数：name
		System.out.println("Passed Name is:" + name);
	}
	
	public void setAge( int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("Puppy's age is: " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String []args11){
		// 创建对象
		Puppy myPuppy = new Puppy("Tommy");
		// Use method to set age
		myPuppy.setAge(3);
		// Call another method to get age
		int theAge = myPuppy.getAge();
		System.out.println("Get Puppy's age by class's method: " + theAge);
		
	}
}

