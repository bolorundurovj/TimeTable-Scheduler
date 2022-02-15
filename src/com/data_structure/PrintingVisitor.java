package com.data_structure;

/**
 * PrintingVisitor.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public class PrintingVisitor extends AbstractVisitor {
    /**
     * 
     * @param object 
     */
	public void visit(Object object) {
		System.out.print(object + "  ");
	}
}
				