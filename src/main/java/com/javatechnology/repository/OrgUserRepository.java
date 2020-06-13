package com.javatechnology.repository;

import org.springframework.stereotype.Repository;

import com.javatechnology.model.UserOrganization;

@Repository
public interface OrgUserRepository /* extends CrudRepository */{
	public UserOrganization findByUserName(String userName);

}
