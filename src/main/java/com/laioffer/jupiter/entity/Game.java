package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    @JsonProperty("name")
    private String name;

    @JsonProperty("developer")
    private String developer;

    @JsonProperty("release_time")
    private String releaseTime;

    @JsonProperty("website")
    private String website;

    @JsonProperty("price")
    private double price;

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getWebsite() {
        return website;
    }

    public double getPrice() {
        return price;
    }

    public Game(Builder builder) {
        this.name = builder.name;
        this.developer = builder.developer;
        this.releaseTime = builder.releaseTime;
        this.website = builder.website;
        this.price = builder.price;
    }

    public static class Builder {
        private String name;
        private String developer;
        private String releaseTime;
        private String website;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        public Builder setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
