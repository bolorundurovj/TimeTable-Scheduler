package com.data_structure;

/**
 * SearchableContainer.
 *
 * @author Bolorunduro Valiant-Joshua
 * @author Chukwuma Richard
 * @author David Michael
 * @version 1.0.0
 * @since 1.0.0
 */
public interface SearchableContainer extends Container {

    boolean isMember(Comparable object);

    void insert(Comparable object);

    void withdraw(Comparable obj);

    Comparable find(Comparable object);
}
