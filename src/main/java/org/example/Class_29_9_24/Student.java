package org.example.Class_29_9_24;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Getter
@Setter//prefer not to use.
@ToString

public class Student {
    private int id;

    private  String name;

    private String address;

    public boolean equalsTo(final Student student) {
        return this.id == student.getId() && this.name.equals(student.getName()) && this.address.equals(student.getAddress());
        //or instead of boolean result only return this.id...... works as well
    }
}
