package com.mirotic.feign.github;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GitHubService {

    private final GitHubApiClient gitHubApiClient;

    public GitHubApiResponse getRepository(String owner, String repo) {
        return gitHubApiClient.getRepository(owner, repo);
    }

}
