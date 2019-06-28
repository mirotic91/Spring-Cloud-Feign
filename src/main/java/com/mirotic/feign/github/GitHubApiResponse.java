package com.mirotic.feign.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
public class GitHubApiResponse implements Serializable {

    private String name;

    @JsonProperty("private")
    private boolean privateRepository;

    private String description;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("stargazers_count")
    private int stargazersCount;

    private Owner owner;

    @Getter
    private static class Owner {

        private int id;

        private String url;

        @JsonProperty("followers_url")
        private String followersUrl;

        @JsonProperty("following_url")
        private String followingUrl;

        @JsonProperty("site_admin")
        private boolean siteAdmin;

    }

}
