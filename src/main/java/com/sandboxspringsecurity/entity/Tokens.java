package com.sandboxspringsecurity.entity;

public record Tokens(String accessToken, String accessTokenExpiry, String refreshToken, String refreshTokenExpiry) {
}
