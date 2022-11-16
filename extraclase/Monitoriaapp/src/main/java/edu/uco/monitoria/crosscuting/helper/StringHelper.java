package edu.uco.monitoria.crosscuting.helper;

import static edu.uco.monitoria.crosscuting.helper.ObjectHelper.getDefault;

public final class StringHelper {
    public static final String EMPTY = "";

    private StringHelper(){
        super();
    }
    public static final String getDefaultString(String value, String defaultValue){
        return getDefault(value,defaultValue);
    }

    public static final String getDefaultString(String value){
        return getDefault(value, EMPTY);
    }

    public static final String applyTrim(String value){
        return getDefaultString(value).trim();
    }
}
