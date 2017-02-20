/**
 * Created by Richard on 20/02/2017.
 */

package com.richard.shiftplanner;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    public Employee(String firstName , String lastName , String description)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
