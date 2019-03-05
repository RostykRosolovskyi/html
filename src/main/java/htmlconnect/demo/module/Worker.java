package htmlconnect.demo.module;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Worker {
    @Id
    private Long ID;
    private String name;
    private double salary;
}
