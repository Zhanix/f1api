package com.example.f1api.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class DataItem implements Parcelable {
	protected DataItem(Parcel in) {
		// Ambil data dari Parcel
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// Tulis data ke Parcel
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<DataItem> CREATOR = new Creator<DataItem>() {
		@Override
		public DataItem createFromParcel(Parcel in) {
			return new DataItem(in);
		}

		@Override
		public DataItem[] newArray(int size) {
			return new DataItem[size];
		}
	};

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("logo")
	private String logo;

	@SerializedName("tim")
	private String tim;

	@SerializedName("id")
	private int id;

	@SerializedName("posisi")
	private String posisi;

	@SerializedName("desctim")
	private String desctim;

	@SerializedName("point")
	private String point;

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setLogo(String logo){
		this.logo = logo;
	}

	public String getLogo(){
		return logo;
	}

	public void setTim(String tim){
		this.tim = tim;
	}

	public String getTim(){
		return tim;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPosisi(String posisi){
		this.posisi = posisi;
	}

	public String getPosisi(){
		return posisi;
	}

	public void setDesctim(String desctim){
		this.desctim = desctim;
	}

	public String getDesctim(){
		return desctim;
	}

	public void setPoint(String point){
		this.point = point;
	}

	public String getPoint(){
		return point;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"updated_at = '" + updatedAt + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",logo = '" + logo + '\'' + 
			",tim = '" + tim + '\'' + 
			",id = '" + id + '\'' + 
			",posisi = '" + posisi + '\'' + 
			",desctim = '" + desctim + '\'' + 
			",point = '" + point + '\'' + 
			"}";
		}
}