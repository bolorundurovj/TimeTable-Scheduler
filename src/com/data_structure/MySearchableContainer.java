package com.data_structure;

/**
 * MySearchableContainer.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public class MySearchableContainer extends MyContainer implements SearchableContainer {
	
    /**
     * Find Index.
     * @param target
     * @return 
     */
	private int findIndex(Comparable target){
		int index = 0;
		while(index < count && !array[index].equals(target)) 
			index++;

		if(index < count)  //then target is found
			return index;
		else
			return -1;
	}
	
        /**
         * Remove from array.
         * @param target 
         */
	public void withdraw(Comparable target){
		int index = findIndex(target);
		if(index != -1) {  //the target exists
			for (int i = index; i<count-1; i++)
				array[i] = array[i+1];        // shift each element from index to count -1 

			count--;
		}
	}
	
        /**
         * Returns the reference to the target if found, null otherwise
         * @param target
         * @return index
         */
	public Comparable find(Comparable target) {
            // to be implemented by students
	    if(isMember(target)){
                int index=findIndex(target);
                return array[index];
            }
            return null;
	}
    
        /**
         * Returns true if target is in the container, false otherwise.
         * @param target
         * @return boolean
         */
	public boolean isMember(Comparable target) {
		// to be implemented by students
		int index=findIndex(target);
                if(index!=-1)
                    return true;
                return false;
	}
}			