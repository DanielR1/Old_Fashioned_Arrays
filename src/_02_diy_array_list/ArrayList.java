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
		Object[] b=new Object[a.length];
		for (int j = 0; j < i; j++) {
			b[j]=a[j];
		}
		b[i]=object;
		for (int j = i+1; j < a.length; j++) {
			b[j]=a[j];
		}

		a=b;
		
	}

	public void addAt(int i, T object) {
		// TODO Auto-generated method stub
		Object[] b=new Object[a.length+1];
		for (int j = 0; j < i; j++) {
			b[j]=a[j];
		}
		b[i]=object;
		for (int j = i+1; j < a.length+1; j++) {
			b[j]=a[j-1];
		}

		a=b;
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		Object[] b=new Object[a.length-1];
		for (int j = 0; j < i; j++) {
			b[j]=a[j];
		}
	
		for (int j = i; j < a.length-1; j++) {
			b[j]=a[j+1];
		}

		a=b;
	}

	public boolean contains(T object) {
		// TODO Auto-generated method stub
		boolean x=false;
		for (Object o : a) {
			if(o.equals(object)) {
				x=true;
			}
		}
		return x;
	}

}
