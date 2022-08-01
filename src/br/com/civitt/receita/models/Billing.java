package br.com.civitt.receita.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Billing {

	@SerializedName("free")
	@Expose
	private Boolean free;
	@SerializedName("database")
	@Expose
	private Boolean database;

	public Boolean getFree() {
		return free;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}

	public Boolean getDatabase() {
		return database;
	}

	public void setDatabase(Boolean database) {
		this.database = database;
	}

}