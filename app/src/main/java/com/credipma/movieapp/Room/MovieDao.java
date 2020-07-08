package com.credipma.movieapp.Room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

/**
 * @author francismwaniki
 */
@Dao
public interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertMovies(List<MovieEntity> movieEntities);

    @Query("SELECT * FROM `MovieEntity`")
    List<MovieEntity> getMoviesByPage();
}
