package com.oldmen.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class employee {
	private int id;
	private String name;
	private String address;
	private String tel;
	private int zipcode;
}
