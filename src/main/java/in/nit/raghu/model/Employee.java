package in.nit.raghu.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Employee {

	private Integer empId;
	private String empName;
	private String dept;
}
