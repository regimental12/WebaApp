package com.richard.shiftplanner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Richard on 20/02/2017.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>
{

}
