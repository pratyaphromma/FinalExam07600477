package th.ac.su.sc.finalexam07600477.DB;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

@Database(entities = {RegisUse.class}, exportSchema = false, version = 1)
public abstract class AppDatabase extends RoomDatabase {
   private static final String DB_NAME = "User.db";
   public abstract UserDao UserDao();
   private static AppDatabase mInstance;

    public static synchronized AppDatabase getInstance(final Context context) {
        if (mInstance == null) {
            mInstance = Room
                    .databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            DB_NAME
                    )
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);

                            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                                @Override
                                public void run() {
                                    mInstance.UserDao().insert(
                                            new RegisUse(
                                                    0, "pratya phromma", "hyhygg","2541"
                                            )
                                    );
                                }
                            });
                        }

                        @Override
                        public void onOpen(@NonNull SupportSQLiteDatabase db) {
                            super.onOpen(db);
                        }
                    })
                    .build();
        }
        return mInstance;
    }

}
