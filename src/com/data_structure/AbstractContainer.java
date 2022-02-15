package com.data_structure;

/**
 * Abstract Container.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public abstract class AbstractContainer implements Container, Comparable {
	protected int count; //Keep records of the items in the container
   
        /**
         * Get Count
         * @return count
         */
	public int getCount () {
		return count;
	}

        /**
         * Is Empty?
         * @return 
         */
	public boolean isEmpty () {
		return (getCount () == 0);
	}

        /**
         * Is Full?
         * @return 
         */
	public boolean isFull () {
		return false;
	}

        /**
         * Accept Visitor.
         * @param visitor 
         */
	public void accept(Visitor visitor) {
		Iterator iterator = iterator();

		while ( iterator.hasNext() && !visitor.isDone())
			visitor.visit(iterator.next());
	}

	public String toString() {
		final StringBuffer buffer = new StringBuffer();

		AbstractVisitor visitor = new AbstractVisitor() {
			private boolean comma;
						
			public void visit(Object obj) {
				if(comma)
					buffer.append(" ");
				buffer.append(obj);
				comma = true;
			}
		};

		accept(visitor);
		return "" + buffer;
	}
	
	public int compareTo(Object object){
		throw new MethodNotImplemented();
	}
	
	public abstract void purge();
	public abstract Iterator iterator(); 
}
