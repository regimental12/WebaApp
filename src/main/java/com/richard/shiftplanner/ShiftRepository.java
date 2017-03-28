package com.richard.shiftplanner;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by richard on 28/03/17.
 */
public interface ShiftRepository extends PagingAndSortingRepository<Shift ,Long> {
}
