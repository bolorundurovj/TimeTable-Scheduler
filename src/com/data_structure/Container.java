package com.data_structure;

/**
 * Container.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */

public interface Container {
    int getCount ();
    boolean isEmpty ();
    boolean isFull ();
    void purge ();
    void accept (Visitor visitor);
    Iterator iterator ();
}