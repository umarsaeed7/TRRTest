/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: IDAO.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.framework.dl;

/**
 * General interface for a Data Access Object. All DAOs should implement the 4 CRUD operations at a minimum. If they choose to implement additional "find" methods those should be define in a
 * sub-interface to return Collection. The contract for non-primary key "find" methods is that they should return empty Collections rather than throw Exceptions or return nulls.
 *
 * @author Umar Saeed
 */
public interface IDAO
{
    /**
     * Create a new instance of the business object managed by this DAO.
     *
     * @return new business object instance
     */
    IIdentifiable newInstance() throws Exception;

    /**
     * Insert the given object into the persistence store
     *
     * @param persistentObject The object to be persisted
     */
    void insert(IIdentifiable persistentObject) throws Exception;

    /**
     * Update the given object in the persistence store
     *
     * @param persistentObject The persistent object to be updated
     */
    void update(IIdentifiable persistentObject) throws Exception;

    /**
     * Remove the given object from the persistence store
     *
     * @param id Id of the object to be removed
     */
    void delete(final String id) throws Exception;

    /**
     * Find an object by its id
     *
     * @param objectId Id of the object
     * @return The object
     */
    IIdentifiable find(String objectId) throws Exception;

}
