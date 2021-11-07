package com.rsk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class meetingss {
    private String title;
    public void addtitle(@NotNull String title){
        this.title= title;

    }
    public @Nullable
    String meetingTitle(){
        return title;
    }
}
