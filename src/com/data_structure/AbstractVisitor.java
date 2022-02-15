package com.data_structure;

/**
 * Abstract Visitor.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public abstract class AbstractVisitor implements Visitor {

	public abstract void visit (Object object);

        /**
         * Is Done?
         * @return false
         */
	public boolean isDone () {
		return false;
	}
}