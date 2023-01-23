package com.pandurang.patterns.builder;

import java.util.HashMap;

public class HttpClient {
    private String method;
    private String url;
    private String userName;
    private String password;
    private String header;
    private String body;

    public HttpClient(String method, String url, String userName, String password, String header, String body) {
        this.method = method;
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.header = header;
        this.body = body;
    }

    public HttpClient() {
    }

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
        this.header = httpClientBuilder.header;
        this.body = httpClientBuilder.body;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String userName;
        private String password;
        private String header;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder secure(String userName, String password) {
            this.userName = userName;
            this.password = password;
            return this;
        }
        public HttpClientBuilder headers(String header) {
            this.header = header;
            return this;
        }
        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
