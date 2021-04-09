package com.portfolio.enumeration;

public enum AssetType {
    CRYPTO(1),
    STOCK(2),
    CSGO(3);

    private final int value;

    private AssetType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
