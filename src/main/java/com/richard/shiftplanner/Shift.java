package com.richard.shiftplanner;

import lombok.*;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by richard on 28/03/17.
 */

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Shift
{
    private @Id @GeneratedValue Long id;
    @NonNull private String day;
    @NonNull private String time;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
    private Set<Employee> employee;

    /*@Override
    public String toString(){
        String info = "";
        JSONObject jsonInfo = new JSONObject();
        jsonInfo.put("name",this.day);
        JSONArray subArray = new JSONArray();
        this.subjects.forEach(sub->{
            JSONObject subJson = new JSONObject();
            subJson.put("name", sub.getday());
            subArray.put(subJson);
        });
        jsonInfo.put("subjects", subArray);
        info = jsonInfo.toString();
        return info;
    }*/

}
