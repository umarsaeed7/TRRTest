/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.framework.DAO;

import com.assignment.framework.Entities.IIdentifiable;

/**
 * General interface for a Data Access Object. All DAOs should implement the 4 CRUD operations at a minimum. If they choose to implement additional "find" methods those should be define in a
 * sub-interface to return Collection. The contract for non-primary key "find" methods is that they should return empty Collections rather than throw Exceptions or return nulls.
 *
 * @author Umar Saeed
 */
public interface IDAO
{

    /**
     * Insert the given object into the persistence store
     *
     * @param persistentObject The object to be persisted
     * @throws java.lang.Exception
     */
    void insert(IIdentifiable persistentObject) throws Exception;

    /**
     * Update the given object in the persistence store
     *
     * @param persistentObject The persistent object to be updated
     * @throws java.lang.Exception
     */
    void update(IIdentifiable persistentObject) throws Exception;

    /**
     * Remove the given object from the persistence store
     *
     * @param id Id of the object to be removed
     * @throws java.lang.Exception
     */
    void delete(final long id) throws Exception;

    /**
     * Find an object by its id
     *
     * @param id Id of the object
     * @return The object
     * @throws java.lang.Exception
     */
    IIdentifiable find(long id) throws Exception;
}
