package com.rsk;

class JavaUser {
    private String First;
    private String Last;

    public JavaUser(String First, String Last){
        this.First = First;
        this.Last = Last;
    }

    public String getFirst(){
        return First;
    }

    public void setFirst(String first){
        First = first;

    }
    public String getLast(){
        return Last;
    }

    public void setLast(String last){
        Last = last;
    }

    @Override
   public String toString(){
        return First + " " + Last;
    }
}
