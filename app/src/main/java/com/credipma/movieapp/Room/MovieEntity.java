package com.credipma.movieapp.Room;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(primaryKeys = ("id"))
public class MovieEntity implements Parcelable {

    @SerializedName("id")
    @Expose
    private Long id;

    @SerializedName(value = "header", alternate = {"title", "name"})
    @Expose
    private String header;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @SerializedName(value = "description", alternate = {"overview", "synopsis"})
    private String description;

    @SerializedName("release_date")
    @Expose
    private String releaseDate;


    @SerializedName("runtime")
    @Expose
    private Long runtime;

    @SerializedName("status")
    @Expose
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getRuntime() {
        return runtime;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.header);
        dest.writeString(this.status);
        dest.writeString(this.posterPath);
        dest.writeString(this.description);
        dest.writeString(this.releaseDate);
        dest.writeValue(this.id);
        dest.writeValue(this.runtime);
    }

    protected MovieEntity(Parcel in) {
        id = (Long) in.readValue(Long.class.getClassLoader());
        header = in.readString();
        posterPath = in.readString();
        description = in.readString();
        releaseDate = in.readString();
        status = in.readString();
        runtime = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Creator<MovieEntity> CREATOR = new Creator<MovieEntity>() {
        @Override
        public MovieEntity createFromParcel(Parcel in) {
            return new MovieEntity(in);
        }

        @Override
        public MovieEntity[] newArray(int size) {
            return new MovieEntity[size];
        }
    };
}
