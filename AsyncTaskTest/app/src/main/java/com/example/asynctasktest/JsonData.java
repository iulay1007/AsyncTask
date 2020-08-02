package com.example.asynctasktest;


import java.util.List;

public class JsonData {
    /**
     * author : VGraupera
     * name : 1on1-questions
     * avatar : https://github.com/VGraupera.png
     * url : https://github.com/VGraupera/1on1-questions
     * description : Mega list of 1 on 1 meeting questions compiled from a variety to sources
     * language : JavaScript
     * languageColor : #f1e05a
     * stars : 4243
     * forks : 264
     * currentPeriodStars : 2231
     * builtBy : [{"username":"VGraupera","href":"https://github.com/VGraupera","avatar":"https://avatars1.githubusercontent.com/u/10377"},{"username":"aallbrig","href":"https://github.com/aallbrig","avatar":"https://avatars2.githubusercontent.com/u/3106250"},{"username":"gergelyke","href":"https://github.com/gergelyke","avatar":"https://avatars3.githubusercontent.com/u/2174968"}]
     */

    private String author;
    private String name;
    private String avatar;
    private String url;
    private String description;
    private String language;
    private String languageColor;
    private int stars;
    private int forks;
    private int currentPeriodStars;
    private List<BuiltByBean> builtBy;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageColor() {
        return languageColor;
    }

    public void setLanguageColor(String languageColor) {
        this.languageColor = languageColor;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getCurrentPeriodStars() {
        return currentPeriodStars;
    }

    public void setCurrentPeriodStars(int currentPeriodStars) {
        this.currentPeriodStars = currentPeriodStars;
    }

    public List<BuiltByBean> getBuiltBy() {
        return builtBy;
    }

    public void setBuiltBy(List<BuiltByBean> builtBy) {
        this.builtBy = builtBy;
    }

    public static class BuiltByBean {
        /**
         * username : VGraupera
         * href : https://github.com/VGraupera
         * avatar : https://avatars1.githubusercontent.com/u/10377
         */

        private String username;
        private String href;
        private String avatar;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}