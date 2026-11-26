package com.dcl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="student_table")
public class Student {
	
	@Id
	private Integer studentId; //student_id

	private String studentName; //student_name
	
	@Column(name="mobile", unique=true, nullable=false)
	private String phone;
	
	@Column(unique=true, nullable=false)
	private String email;

}
