package com.bigrichman.android.beatbox;

public class Sound {

    private String mAssertPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssertPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssertPath() {
        return mAssertPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
