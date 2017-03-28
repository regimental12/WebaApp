/**
 * Created by Richard on 20/02/2017.
 */

package com.richard.shiftplanner;

import lombok.*;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee
{
    private @Id @GeneratedValue Long id;
    @NonNull private String firstName;
    @NonNull private String lastName;
    @NonNull private String description;
    @NonNull private String umm;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Employee Shifts" , joinColumns = @JoinColumn(name = "Employee_id" , referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "Shift_id" , referencedColumnName = "id"))
    private Set<Shift> shifts;




    /*@Override
    public String toString()
    {
        String info = "";
        JSONObject jsonInfo = new JSONObject();
        jsonInfo.put("name", this.firstName);
        JSONArray subArray = new JSONArray();
        this.shifts.forEach(sub -> {
            JSONObject subJson = new JSONObject();
            subJson.put("name", sub.getfirstname());
            subArray.put(subJson);
        });
        jsonInfo.put("subjects", subArray);
        info = jsonInfo.toString();
        return info;
    }*/
}
