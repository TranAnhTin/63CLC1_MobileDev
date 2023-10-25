package com.trananhtin.a63132691_thigk;

public class Song {
    private String singer;
    private String pic;
    private int viewer;

    public String getSinger() {
        return singer;
    }

    public String getPic() {
        return pic;
    }

    public int getViewer() {
        return viewer;
    }

    public Song(String singer, String pic, int viewer) {
        this.singer = singer;
        this.pic = pic;
        this.viewer = viewer;
    }
}
