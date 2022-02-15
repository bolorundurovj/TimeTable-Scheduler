package com.data_structure;

/**
 * MyContainer.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public class MyContainer extends AbstractContainer {
	private final int SIZE = 100; 
	protected Comparable[] array = new Comparable[SIZE];
	
        /**
         * Check If Array Is Full
         * @return boolean
         */
	public boolean isFull() {
		return count == SIZE;
	}
	
        /**
         * Purge Array
         */
	public void purge() {
		for (int i=0; i<count; i++)
			array[i] = null;
		count = 0;
	}
	
        /**
         * Get Array Size
         * @return size
         */
	public int getSize(){
		return SIZE;
	}
	
        /**
         * New Iterator
         * @return iterator
         */
	public Iterator iterator() {
		
		return new Iterator () {
			
			private int pos = 0;
			
			public boolean hasNext() {
				return pos < count;
			}
			
			public Object next() {
				Comparable element = array[pos];
				pos++;
				return element;
			}
		};
	}
	
        /**
         * Insert into Array
         * @param object 
         */
	public void insert(Comparable object) {
		if(isFull())
		  throw new ContainerFullException();
		else{
		  array[count] = object;
		  count++;
	    }
	}
}			