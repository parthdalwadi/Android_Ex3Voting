package com.example.assignment3;

import java.util.ArrayList;

public class Vote {

    String voterID;
    String canName;


    public Vote(String voterID, String canName) {
        this.voterID = voterID;
        this.canName = canName;
    }

    static ArrayList<Vote> listVotes = new ArrayList<Vote>();


}
