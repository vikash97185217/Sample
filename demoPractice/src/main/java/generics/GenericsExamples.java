package generics;
//A Simple Java program to show working of user defined 
//Generic classes 

//We use < > to specify Parameter type 
class GenericsExamples<T> 
{ 
	// An object of type T is declared 
	T obj; 
	GenericsExamples(T obj) { 
		this.obj = obj;
	} // constructor 
	public T getObject() {
		return this.obj; 
	} 
} 

//Driver class to test above 
class Main 
{ 
	public static void main (String[] args) 
	{ 
		// instance of Integer type 
		GenericsExamples <Integer> iObj = new GenericsExamples<Integer>(15); 
		System.out.println(iObj.getObject()); 

		// instance of String type 
		GenericsExamples <String> sObj = 
						new GenericsExamples<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
	} 
}