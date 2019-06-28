package com.mirotic.feign.github;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GitHubController {

    private final GitHubService gitHubService;

    @GetMapping(value = "/repository/{owner}/{repo}")
    public GitHubApiResponse getRepository(@PathVariable String owner, @PathVariable String repo) {
        return gitHubService.getRepository(owner, repo);
    }

}
