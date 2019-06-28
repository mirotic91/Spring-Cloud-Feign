package com.mirotic.feign.github;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GitHub", url = "https://api.github.com")
public interface GitHubApiClient {

    @GetMapping(value = "/repos/{owner}/{repo}")
    GitHubApiResponse getRepository(@PathVariable(name = "owner") String owner, @PathVariable(name = "repo") String repo);

}
