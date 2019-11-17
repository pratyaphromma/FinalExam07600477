package th.ac.su.sc.finalexam07600477.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User")
    List<RegisUse> getAll();

    @Insert
    void insert(RegisUse regisUse);
}
