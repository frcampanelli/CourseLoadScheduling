package org.dselent.scheduling.server.dao;

import java.util.List;

import org.dselent.scheduling.server.model.RequestTables;
import org.springframework.stereotype.Repository;

/**
 * Interface for getting information from all tables for requests.
 * 
 * @author dselent
 * Modified by Hannah Jauris
 *
 */
@Repository
public interface RequestTablesDao{
	// custom queries here
	public List<RequestTables> getAllRequestsInfo();
}