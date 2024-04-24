package com.uv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="User_Info")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Name")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="veh_id",referencedColumnName = "vid")
	private Vehichle veh;
}
