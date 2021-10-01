package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor //para jpa
@Getter
@Setter
public class Escritorio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //gerador automatico
	Long id;
	String predio;
	String responsavel;
	Integer andar;

}
