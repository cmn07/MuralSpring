package br.ufscar.dc.dsw.mural_spring.dto;

public record ListedMessage(
        String from,
        String to,
        String message,
        String timestamp
) {}

