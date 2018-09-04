public class SharedPref {

    public static final String NAME_KEY = "NAME";
    public static final String AGE_KEY = "AGE";
    public static final String STUDENT_KEY = "IS_STUDENT";

    private static SharedPref instance;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private SharedPref() {
    }

    public static SharedPref getInstance(Context context) {
        if(instance == null) {
            synchronized (SharedPref.class) {
                if(instance == null) {
                    instance = new SharedPref();
                    sharedPreferences = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
                    editor = sharedPreferences.edit();
                }
            }
        }
        return instance;
    }

    public void writeString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void writeInt(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public void writeBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public String readString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public int readInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public boolean readBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public void clearPreferences() {
        editor.clear();
        editor.commit();
    }
}
