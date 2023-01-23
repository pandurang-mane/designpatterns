package com.pandurang.patterns.builder;

public class Test {
    public static void main(String[] args) {
        HttpClient.HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
        HttpClient httpClient = httpClientBuilder.method("POST").url("http://www.test.com").body("{}").build();
        System.out.println(httpClient);
    }
}
