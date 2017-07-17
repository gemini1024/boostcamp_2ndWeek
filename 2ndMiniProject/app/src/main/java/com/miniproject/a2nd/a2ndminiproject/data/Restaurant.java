package com.miniproject.a2nd.a2ndminiproject.data;

import java.util.Date;

/**
 * Created by jh on 17. 7. 10.
 * 맛집 데이터
 */

public class Restaurant {
    private String name;            // 이름
    private String content;         // 내용
    private int imageId;            // 이미지 resource id
    private boolean checked;        // 체크박스 체크여부
    private double distance;        // 거리
    private double popularity;      // 인기
    private Date time;              // 작성시간

    public Restaurant(String name, String content, int imageId, boolean checked, double distance, double popularity, Date time) {
        this.name = name;
        this.content = content;
        this.imageId = imageId;
        this.checked = checked;
        this.distance = distance;
        this.popularity = popularity;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public double getDistance() {
        return distance;
    }

    public double getPopularity() {
        return popularity;
    }

    public Date getTime() {
        return time;
    }
}
