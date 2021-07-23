package com.bancoexterior.app.cce.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class FIToFICstmrCdtTrfInitnObject implements Serializable{
	
	
	@JsonProperty("FIToFICstmrCdtTrfInitn")
	@SerializedName("FIToFICstmrCdtTrfInitn")
	private FIToFICstmrCdtTrfInitnDetalle fIToFICstmrCdtTrfInitn = new FIToFICstmrCdtTrfInitnDetalle() ;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
