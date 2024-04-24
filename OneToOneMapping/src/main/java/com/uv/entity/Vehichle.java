package com.uv.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="veh_info")
public class Vehichle {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	@Column(name="veh_Name")
	private String vname;
	@Column(name="veh_model")
	private int model;
}
