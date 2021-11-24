package singleLevelInheritanceWithConstructorChaning;

public class B extends ParentClass{
	
	int j;

	B(int i,int j) {
		super(i); // as we extends parent class through call to super contructor chaning take place
		this.j=j;
	
		
	}

	
	
	

}
