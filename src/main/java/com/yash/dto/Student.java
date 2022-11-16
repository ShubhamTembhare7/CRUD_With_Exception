package com.yash.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
public class Student {

	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private Integer sid;
		@NonNull
		@NotBlank
		private String name;
		private String address;
		private String mobileno;
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Integer sid, String name, String address, String mobileno) {
			super();
			this.sid = sid;
			this.name = name;
			this.address = address;
			this.mobileno = mobileno;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", mobileno=" + mobileno + "]";
		}

		public Integer getSid() {
			return sid;
		}

		public void setSid(Integer sid) {
			this.sid = sid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMobileno() {
			return mobileno;
		}

		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		
		
}
