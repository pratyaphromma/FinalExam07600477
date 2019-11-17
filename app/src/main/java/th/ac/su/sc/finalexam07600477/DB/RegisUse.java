package th.ac.su.sc.finalexam07600477.DB;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class RegisUse {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "fullname")
    public String fullname;

    @ColumnInfo(name = "user")
    public String user;

    @ColumnInfo(name = "pass")
    public String pass;

    public RegisUse(int id, String fullname, String user, String pass) {
        this.id = id;
        this.fullname = fullname;
        this.user = user;
        this.pass = pass;

    }
}
