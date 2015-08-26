package com.harry;

import android.util.Log;

/**
 * Created by hsingh on 8/26/15.
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }
    public void displayLink() {
        Log.d("test", "{ " + iData + ", " + dData + " } ");
    }

}
