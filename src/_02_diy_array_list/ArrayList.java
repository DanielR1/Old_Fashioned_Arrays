package _02_diy_array_list;

public class ArrayList <T extends Object>{
Object[] a = new Object[0]; 
	public void add(T object) {
		// TODO Auto-generated method stub
		Object[] b=new Object[a.length+1];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		b[a.length]=object;
		a=b;
		
		
	}

	public T get(int i) {
		// TODO Auto-generated method stub
		return (T) a[i];
	}

	public void set(int i, T object) {
		// TODO Auto-generated method stub
		
	}

	public void addAt(int i, T object) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(T object) {
		// TODO Auto-generated method stub
		return false;
	}

}
