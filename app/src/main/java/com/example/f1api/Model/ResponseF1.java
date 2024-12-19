package com.example.f1api.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseF1{

	@SerializedName("-OEQtNidvnfsfJeoSN5z")
	private OEQtNidvnfsfJeoSN5z oEQtNidvnfsfJeoSN5z;

	public void setOEQtNidvnfsfJeoSN5z(OEQtNidvnfsfJeoSN5z oEQtNidvnfsfJeoSN5z){
		this.oEQtNidvnfsfJeoSN5z = oEQtNidvnfsfJeoSN5z;
	}

	public OEQtNidvnfsfJeoSN5z getOEQtNidvnfsfJeoSN5z(){
		return oEQtNidvnfsfJeoSN5z;
	}

	@Override
 	public String toString(){
		return 
			"ResponseF1{" + 
			"-OEQtNidvnfsfJeoSN5z = '" + oEQtNidvnfsfJeoSN5z + '\'' + 
			"}";
		}
}