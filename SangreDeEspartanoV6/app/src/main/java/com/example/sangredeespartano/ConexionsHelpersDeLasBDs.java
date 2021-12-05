package com.example.sangredeespartano;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


class ConexionSQLiteHelperHistorial extends SQLiteOpenHelper {



    public ConexionSQLiteHelperHistorial(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_HISTORIAL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_HISTORIAL);
        onCreate(db);
    }
}





class ConexionSQLiteHelperAbP extends SQLiteOpenHelper {



    public ConexionSQLiteHelperAbP(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_ABP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_ABP);
        onCreate(db);
    }
}

class ConexionSQLiteHelperAbI extends SQLiteOpenHelper {



    public ConexionSQLiteHelperAbI(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_ABI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_ABI);
        onCreate(db);
    }
}

class ConexionSQLiteHelperAbA extends SQLiteOpenHelper {



    public ConexionSQLiteHelperAbA(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_ABA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_ABA);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPeP extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPeP(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PEP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PEP);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPeI extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPeI(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PEI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PEI);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPeA extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPeA(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PEA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PEA);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPiP extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPiP(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PIP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PIP);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPiI extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPiI(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PII);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PII);
        onCreate(db);
    }
}

class ConexionSQLiteHelperPiA extends SQLiteOpenHelper {



    public ConexionSQLiteHelperPiA(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_PIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_PIA);
        onCreate(db);
    }
}

class ConexionSQLiteHelperBrP extends SQLiteOpenHelper {



    public ConexionSQLiteHelperBrP(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_BRP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_BRP);
        onCreate(db);
    }
}

class ConexionSQLiteHelperBrI extends SQLiteOpenHelper {



    public ConexionSQLiteHelperBrI(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_BRI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_BRI);
        onCreate(db);
    }
}

class ConexionSQLiteHelperBrA extends SQLiteOpenHelper {



    public ConexionSQLiteHelperBrA(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_BRA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int Vantigua, int vnueva) {
        db.execSQL("DROP TABLE IF EXISTS "+Utilidades.TABLA_BRA);
        onCreate(db);
    }
}